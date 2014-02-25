/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Model;

import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Utilisateur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Khadija
 */
public class UtilisateurTableModel extends AbstractTableModel {

    private UtilisateurDao utilisateurDao = new UtilisateurDao();
    private String title[] = {"Nom", "Prénom","login", "sexe","Age"};
    private List<Utilisateur> listUtilisateur = new ArrayList<Utilisateur>();
    private List<Utilisateur> listResultSearch = new ArrayList<Utilisateur>();
    private boolean searching = false;

    public UtilisateurTableModel() {
        this.listUtilisateur = utilisateurDao.selectUsers();
    }

    @Override
    public int getRowCount() {
        if (searching && listResultSearch.size() > 0) {
            return listResultSearch.size();
        } else if (searching && listResultSearch.size() == 0) {
            return 0;
        } else {
            return listUtilisateur.size();
        }
    }

    @Override
    public int getColumnCount() {
        return title.length;
    }

    //bloc de methodes personalisées
    public void refresh() {
        listResultSearch = new ArrayList<Utilisateur>();
        this.listUtilisateur = utilisateurDao.selectUsers();
    }

    public Utilisateur getUtilisateutAt(int row) {
        return listUtilisateur.get(row);
    }

    public void removeRows(List<Utilisateur> lUtab) {
        for (int i = 0; i < lUtab.size(); i++) {
            listUtilisateur.remove(lUtab.get(i));
        }
    }

    public void initSearch(String searchString, int searchIndex) {
        listResultSearch = new ArrayList<Utilisateur>();
        if (searchString.length() > 0) {
            searching = true;
            for (Utilisateur utilisateur : listUtilisateur) {
                if (searchIndex == 0) {
                    if (utilisateur.getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(utilisateur);
                    }
                } else if (searchIndex == 1) {
                    if (utilisateur.getPrenom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(utilisateur);
                    }
                } else if (searchIndex == 2) {
                    if (utilisateur.getLogin().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(utilisateur);
                    }
                } else if (searchIndex == 3) {
                    if (utilisateur.getLogin().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(utilisateur);
                        
                    } else if (searchIndex == 4) {
                        if ((utilisateur.getAge()+"").matches("(.*)" + searchString + "(.*)")) {
                            listResultSearch.add(utilisateur);
                        }
                        else if (searchIndex == 5) {
                     if ((utilisateur.getSexe()+"").toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(utilisateur);
                    }

                    }

                }
            }else {
            searching = false;
        }

        }
        }
       
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
}
}