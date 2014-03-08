/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Model;

import com.tunisianwatch.Dao.LieuDao;
import com.tunisianwatch.Dao.ReclamationDao;
import com.tunisianwatch.Entities.Reclamation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asd
 */
public class ReclamationTableModel extends ConsultationTableModel {

    private ReclamationDao reclamationtDao = new ReclamationDao();
    private LieuDao lieuDao = new LieuDao();
    private String title[] = {"Titre", "Description", "Lieu", "Date", "Heure", "Domaines", "Citoyen", "Etat"};
    private List<Reclamation> listReclamation = new ArrayList<Reclamation>();
    private List<Reclamation> listResultSearch = new ArrayList<Reclamation>();
    private boolean searching = false;
    private int me;

    private void selectReclamation() {
        if (me == 0) {
            this.listReclamation = reclamationtDao.selectReclamations();
        } else {
            this.listReclamation = reclamationtDao.selectReclamationByIdCitoyen(me);
        }
    }

    public ReclamationTableModel() {
        selectReclamation();
    }

    public ReclamationTableModel(int me) {
        this.me = me;
        selectReclamation();
    }

    @Override
    public int getRowCount() {
        if (searching && listResultSearch.size() > 0) {
            return listResultSearch.size();
        } else if (searching && listResultSearch.size() == 0) {
            return 0;
        } else {
            return listReclamation.size();
        }
    }

    @Override
    public int getColumnCount() {
        return title.length;
    }

    //bloc de methodes personalisées
    public void refresh() {
        listResultSearch = new ArrayList<Reclamation>();
        selectReclamation();
    }

    public Reclamation getElementAt(int row) {
        return listReclamation.get(row);
    }

    public boolean removeRows(List elements) {
        boolean done = true;
        List<Reclamation> lRec = (List<Reclamation>) elements;
        for (int i = 0; i < lRec.size(); i++) {
            if (!reclamationtDao.deleteReclamation(lRec.get(i).getId())) {
                done = false;
            } else {
                listReclamation.remove(lRec.get(i));
            }
        }
        return done;
    }

    public void initSearch(String searchString, int searchIndex) {
        listResultSearch = new ArrayList<Reclamation>();
        if (searchString.length() > 0) {
            searching = true;
            for (Reclamation reclamation : listReclamation) {
                if (searchIndex == 0) {
                    if (reclamation.getTitre() != null) {
                        if (reclamation.getTitre().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(reclamation);
                        }
                    }
                } else if (searchIndex == 1) {
                    if (reclamation.getDescription() != null) {
                        if (reclamation.getDescription().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(reclamation);
                        }
                    }
                } else if (searchIndex == 2) {
                    if (reclamation.getLieu() != null) {
                        if (reclamation.getLieu().getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(reclamation);
                        }
                    } else if (reclamation.getGeolocalisation() != null) {
                        if (reclamation.getGeolocalisation().getLieu().getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(reclamation);
                        }
                    }
                } else if (searchIndex == 3) {
                    if (reclamation.getDate() != null) {
                        if (reclamation.getDate().toString().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(reclamation);
                        }
                    }
                } else if (searchIndex == 4) {
                    if (reclamation.getHeure() != null) {
                        if (reclamation.getHeure().toString().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(reclamation);
                        }
                    }
                } else if (searchIndex == 5) {
                    if (reclamation.getDomaine() != null) {
                        if (reclamation.getDomaine().getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(reclamation);
                        }
                    }
                } else if (searchIndex == 6) {
                    if (reclamation.getCitoyen() != null) {
                        if (reclamation.getCitoyen().getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(reclamation);
                        }
                    }
                } else if (searchIndex == 7) {
                    String Etat = null;
                    if (reclamation.getEtat() == 0) {
                        Etat = "Pas encore Réglée";
                    } else if (reclamation.getEtat() == 1) {
                        Etat = "Réglée";
                    } else if (reclamation.getEtat() == 2) {
                        Etat = "Fausse";
                    }
                    if (Etat.toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(reclamation);
                    }
                }
            }
        } else {
            searching = false;
        }
    }

//fin du bloc de methodes personalisées
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reclamation reclamation = null;
        if (listResultSearch.size() > 0) {
            reclamation = listResultSearch.get(rowIndex);
        } else {
            reclamation = listReclamation.get(rowIndex);
        }
        if (columnIndex == 0) {
            return reclamation.getTitre();
        } else if (columnIndex == 1) {
            return reclamation.getDescription();
        } else if (columnIndex == 2) {
            if (reclamation.getLieu() != null) {
                return reclamation.getLieu();
            } else if (reclamation.getGeolocalisation() != null) {
                return reclamation.getGeolocalisation().getLieu().getId();
            } else {
                return null;
            }
        } else if (columnIndex == 3) {
            return reclamation.getDate();
        } else if (columnIndex == 4) {
            return reclamation.getHeure();
        } else if (columnIndex == 5) {
            return reclamation.getDomaine().getNom();
        } else if (columnIndex == 6) {
            return reclamation.getCitoyen();
        } else if (columnIndex == 7) {
            if (reclamation.getEtat() == 0) {
                return "Pas encore Réglée";
            } else if (reclamation.getEtat() == 1) {
                return "Réglée";
            } else if (reclamation.getEtat() == 2) {
                return "Fausse";
            }
        }
        return null;
    }

    public String getColumnName(int col) {
        return this.title[col];
    }
}
