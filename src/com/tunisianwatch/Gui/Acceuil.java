/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Gui;

/**
 *
 * @author asd
 */
public class Acceuil extends javax.swing.JFrame {

    /**
     * Creates new form Acceuil
     */
    public Acceuil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTabbedPane = new javax.swing.JTabbedPane();
        menuReclamation = new javax.swing.JPanel();
        reclamationPanel = new javax.swing.JPanel();
        CitoyenPanel = new javax.swing.JPanel();
        responsablePanel = new javax.swing.JPanel();
        EtablissementPanel = new javax.swing.JPanel();
        etablissementPanel = new javax.swing.JPanel();
        StatPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceuil");

        menuTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        menuTabbedPane.setToolTipText("");

        menuReclamation.setToolTipText("");

        javax.swing.GroupLayout reclamationPanelLayout = new javax.swing.GroupLayout(reclamationPanel);
        reclamationPanel.setLayout(reclamationPanelLayout);
        reclamationPanelLayout.setHorizontalGroup(
            reclamationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
        );
        reclamationPanelLayout.setVerticalGroup(
            reclamationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuReclamationLayout = new javax.swing.GroupLayout(menuReclamation);
        menuReclamation.setLayout(menuReclamationLayout);
        menuReclamationLayout.setHorizontalGroup(
            menuReclamationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reclamationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuReclamationLayout.setVerticalGroup(
            menuReclamationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reclamationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuTabbedPane.addTab("Gestion des Reclamations", menuReclamation);

        javax.swing.GroupLayout CitoyenPanelLayout = new javax.swing.GroupLayout(CitoyenPanel);
        CitoyenPanel.setLayout(CitoyenPanelLayout);
        CitoyenPanelLayout.setHorizontalGroup(
            CitoyenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
        );
        CitoyenPanelLayout.setVerticalGroup(
            CitoyenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        menuTabbedPane.addTab("Gestion des Citoyens", CitoyenPanel);

        javax.swing.GroupLayout responsablePanelLayout = new javax.swing.GroupLayout(responsablePanel);
        responsablePanel.setLayout(responsablePanelLayout);
        responsablePanelLayout.setHorizontalGroup(
            responsablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
        );
        responsablePanelLayout.setVerticalGroup(
            responsablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        menuTabbedPane.addTab("Gestion des Responsables", responsablePanel);

        javax.swing.GroupLayout etablissementPanelLayout = new javax.swing.GroupLayout(etablissementPanel);
        etablissementPanel.setLayout(etablissementPanelLayout);
        etablissementPanelLayout.setHorizontalGroup(
            etablissementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
        );
        etablissementPanelLayout.setVerticalGroup(
            etablissementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout EtablissementPanelLayout = new javax.swing.GroupLayout(EtablissementPanel);
        EtablissementPanel.setLayout(EtablissementPanelLayout);
        EtablissementPanelLayout.setHorizontalGroup(
            EtablissementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etablissementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EtablissementPanelLayout.setVerticalGroup(
            EtablissementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etablissementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuTabbedPane.addTab("Gestion des Etablissements", EtablissementPanel);

        javax.swing.GroupLayout StatPanelLayout = new javax.swing.GroupLayout(StatPanel);
        StatPanel.setLayout(StatPanelLayout);
        StatPanelLayout.setHorizontalGroup(
            StatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
        );
        StatPanelLayout.setVerticalGroup(
            StatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        menuTabbedPane.addTab("Génerer les Statistiques", StatPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CitoyenPanel;
    private javax.swing.JPanel EtablissementPanel;
    private javax.swing.JPanel StatPanel;
    private javax.swing.JPanel etablissementPanel;
    private javax.swing.JPanel menuReclamation;
    private javax.swing.JTabbedPane menuTabbedPane;
    private javax.swing.JPanel reclamationPanel;
    private javax.swing.JPanel responsablePanel;
    // End of variables declaration//GEN-END:variables
}
