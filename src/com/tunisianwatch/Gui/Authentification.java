/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Utilisateur;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author asd
 */
public class Authentification extends javax.swing.JFrame {

    /**
     * Creates new form Authentification
     */
    public Authentification() {
        initComponents();
        setLocationRelativeTo(null);
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
        loginLabel = new javax.swing.JLabel();
        mdpLabel = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        mdpPasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Authentification - Tunisianwatch");
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        loginLabel.setText("Login");

        mdpLabel.setText("Mot de passe");

        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });

        mdpPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpPasswordFieldActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(204, 0, 0));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tunisianwatch/Images/tw_logo_small.png"))); // NOI18N

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout corePanelLayout = new javax.swing.GroupLayout(corePanel);
        corePanel.setLayout(corePanelLayout);
        corePanelLayout.setHorizontalGroup(
            corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corePanelLayout.createSequentialGroup()
                .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(corePanelLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                    .addGroup(corePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mdpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(loginTextField)
                    .addComponent(mdpPasswordField))
                .addGap(247, 247, 247))
            .addGroup(corePanelLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        corePanelLayout.setVerticalGroup(
            corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginTextField)
                    .addComponent(loginLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mdpPasswordField)
                    .addComponent(mdpLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addGap(180, 180, 180))
        );

        getContentPane().add(corePanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        Utilisateur user = new UtilisateurDao().Authentification(loginTextField.getText(), mdpPasswordField.getText());
        if (user != null) {
            JOptionPane.showMessageDialog(null, "Connexion établie");
            this.dispose();
            new MainFrame().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erreur d'authentification", "Message d'avertissement", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
        Utilisateur user = new UtilisateurDao().Authentification(loginTextField.getText(), mdpPasswordField.getText());
        if (user != null) {
            this.dispose();
            new MainFrame().setVisible(true);
        }
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void mdpPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpPasswordFieldActionPerformed
        // TODO add your handling code here:
        Utilisateur user = new UtilisateurDao().Authentification(loginTextField.getText(), mdpPasswordField.getText());
        if (user != null) {
            this.dispose();
            new MainFrame().setVisible(true);
        }
    }//GEN-LAST:event_mdpPasswordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel corePanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel mdpLabel;
    private javax.swing.JPasswordField mdpPasswordField;
    // End of variables declaration//GEN-END:variables
}
