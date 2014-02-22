/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Gui;

import java.awt.Dimension;

/**
 *
 * @author asd
 */
public class AcceuilPanel extends javax.swing.JPanel {

    /**
     * Creates new form Acceul
     */
    private Dimension dimension;
    
    public AcceuilPanel() {
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

        bodyPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        etablissementButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 204));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(870, 500));

        bodyPanel.setBackground(new java.awt.Color(153, 0, 0));

        etablissementButton.setBackground(new java.awt.Color(204, 0, 0));
        etablissementButton.setForeground(new java.awt.Color(255, 255, 255));
        etablissementButton.setText("Gestion des Etablissements");
        etablissementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etablissementButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etablissementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(etablissementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        contentPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void etablissementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etablissementButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new EtablissementPanel());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_etablissementButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton etablissementButton;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}