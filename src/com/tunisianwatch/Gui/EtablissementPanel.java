/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Gui;

import com.tunisianwatch.Entities.Etablissement;
import com.tunisianwatch.Model.EtablissementTableModel;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author asd
 */
public class EtablissementPanel extends javax.swing.JPanel {
   private EtablissementTableModel tableModel;
   private ListSelectionModel lsm;
    /**
     * Creates new form EtablissementPanel
     */
    public EtablissementPanel() {
        tableModel = new EtablissementTableModel();
        initComponents();
        EtablissementTable.getSelectionModel().addListSelectionListener(new EtablissementTableListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        corePanel = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        CategComboBox = new javax.swing.JComboBox();
        rechercheTextField = new javax.swing.JTextField();
        rechercheLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        EtablissementTable = new javax.swing.JTable();
        ajoutButton = new javax.swing.JButton();
        modifierButton = new javax.swing.JButton();
        supprimerButton = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        CategComboBox.setBackground(new java.awt.Color(204, 0, 0));
        CategComboBox.setForeground(new java.awt.Color(255, 255, 255));
        CategComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nom", "Lieu", "Responsable", "Domaine" }));

        rechercheTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechercheTextFieldKeyReleased(evt);
            }
        });

        rechercheLabel.setText("Recherche par");

        refreshButton.setBackground(new java.awt.Color(204, 0, 0));
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("rafraichir");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        EtablissementTable.setModel(tableModel);
        jScrollPane.setViewportView(EtablissementTable);

        ajoutButton.setBackground(new java.awt.Color(204, 0, 0));
        ajoutButton.setForeground(new java.awt.Color(255, 255, 255));
        ajoutButton.setText("ajouter");

        modifierButton.setBackground(new java.awt.Color(204, 0, 0));
        modifierButton.setForeground(new java.awt.Color(255, 255, 255));
        modifierButton.setText("modifier");

        supprimerButton.setBackground(new java.awt.Color(204, 0, 0));
        supprimerButton.setForeground(new java.awt.Color(255, 255, 255));
        supprimerButton.setText("supprimer");
        supprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(ajoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supprimerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(rechercheLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rechercheTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CategComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechercheTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechercheLabel)
                    .addComponent(refreshButton))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supprimerButton)
                    .addComponent(modifierButton)
                    .addComponent(ajoutButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout corePanelLayout = new javax.swing.GroupLayout(corePanel);
        corePanel.setLayout(corePanelLayout);
        corePanelLayout.setHorizontalGroup(
            corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(corePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        corePanelLayout.setVerticalGroup(
            corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(corePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(corePanel, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void rechercheTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechercheTextFieldKeyReleased
        tableModel.initSearch(rechercheTextField.getText(), CategComboBox.getSelectedIndex());
        tableModel.fireTableDataChanged();
    }//GEN-LAST:event_rechercheTextFieldKeyReleased

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        tableModel.refresh();
        tableModel.fireTableDataChanged();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void supprimerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerButtonActionPerformed
        if (lsm == null) {
            JOptionPane.showMessageDialog(null, "Selectionner au moin une ligne", "Erreur de Selection", JOptionPane.ERROR_MESSAGE);
        } else {
            // Find out which indexes are selected.
            int minIndex = lsm.getMinSelectionIndex();
            int maxIndex = lsm.getMaxSelectionIndex();
            List<Etablissement> listEtabtmp = new ArrayList<Etablissement>();
            for (int i = minIndex; i <= maxIndex; i++) {
                if (lsm.isSelectedIndex(i)) {
                    Etablissement etabTmp = tableModel.getEtablissementAt(i);
                    listEtabtmp.add(etabTmp);
                    //new EtablissementDao().deleteEtablissement(etabTmp.getId());
                }
            }
            tableModel.removeRows(listEtabtmp);
            tableModel.fireTableDataChanged();
        }
    }//GEN-LAST:event_supprimerButtonActionPerformed

public class EtablissementTableListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            lsm = (ListSelectionModel) e.getSource();
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CategComboBox;
    private javax.swing.JTable EtablissementTable;
    private javax.swing.JButton ajoutButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel corePanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton modifierButton;
    private javax.swing.JLabel rechercheLabel;
    private javax.swing.JTextField rechercheTextField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton supprimerButton;
    // End of variables declaration//GEN-END:variables
}
