/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Model;

import com.tunisianwatch.Dao.EtablissementDao;
import com.tunisianwatch.Dao.LieuDao;
import com.tunisianwatch.Dao.ReclamationDao;
import com.tunisianwatch.Entities.Domaine;
import com.tunisianwatch.Entities.Etablissement;
import com.tunisianwatch.Entities.Reclamation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author asd
 */
public class ReclamationTableModel extends AbstractTableModel {

    private ReclamationDao reclamationtDao = new ReclamationDao();
    private LieuDao lieuDao = new LieuDao();
    private String title[] = {"Titre", "Description", "Lieu", "Date", "Heure", "Domaines", "Citoyen", "Etat"};
    private List<Reclamation> listReclamation = new ArrayList<Reclamation>();
    private List<Reclamation> listResultSearch = new ArrayList<Reclamation>();
    private boolean searching = false;

    public ReclamationTableModel() {
        this.listReclamation = reclamationtDao.selectReclamations();
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
        this.listReclamation = reclamationtDao.selectReclamations();
    }

    public Reclamation getReclamationAt(int row) {
        return listReclamation.get(row);
    }

    public void removeRows(List<Reclamation> lEtab) {
        for (int i = 0; i < lEtab.size(); i++) {
            listReclamation.remove(lEtab.get(i));
        }
    }

    public void initSearch(String searchString, int searchIndex) {
        listResultSearch = new ArrayList<Reclamation>();
        if (searchString.length() > 0) {
            searching = true;
            System.out.println(searchString.length());
            for (Reclamation reclamation : listReclamation) {
                if (searchIndex == 0) {
                    if (reclamation.getTitre().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(reclamation);
                    }
                } else if (searchIndex == 1) {
                    if (reclamation.getDescription().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(reclamation);
                    }
                } else if (searchIndex == 2) {
                    if (reclamation.getLieu().getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(reclamation);
                    }
                } else if (searchIndex == 3) {
                    if (reclamation.getDate().toString().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(reclamation);
                    }
                } else if (searchIndex == 4) {
                    if (reclamation.getHeure().toString().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(reclamation);
                    }
                } else if (searchIndex == 5) {
                    if (reclamation.getDomaine().getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(reclamation);
                    }
                } else if (searchIndex == 6) {
                    if (reclamation.getCitoyen().getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(reclamation);
                    }
                } else if (searchIndex == 7) {
                    String Etat = null;
                    if (reclamation.getEtat() == 0) {
                        Etat = "Nouvelle";
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
            return reclamation.getLieu();
        } else if (columnIndex == 3) {
            return reclamation.getDate();
        } else if (columnIndex == 4) {
            return reclamation.getHeure();
        } else if (columnIndex == 5) {
            return reclamation.getDomaine().getNom();
        } else if (columnIndex == 6) {
            return reclamation.getCitoyen().getPrenom()+" "+reclamation.getCitoyen().getNom();
        } else if (columnIndex == 7) {
            if (reclamation.getEtat() == 0) {
                return "Nouvelle";
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
