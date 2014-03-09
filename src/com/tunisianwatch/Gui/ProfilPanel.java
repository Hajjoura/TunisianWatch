/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;


import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Utilisateur;
import com.tunisianwatch.Util.FieldVerifier;
import com.tunisianwatch.Util.ImageFilter;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author MekniAymen
 */
public class ProfilPanel extends javax.swing.JPanel {

    //String PathImage = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\TunisianWatch\\src\\com\\tunisianwatch\\Images\\avatar.png";
    String PathImage = null;
    Utilisateur logger = MainFrame.getMe();
    Boolean modif = null;

    /**
     * Creates new form ProfilPanel
     */
    public ProfilPanel() {
        initComponents();
        nameErrorLabel.setVisible(false);
        mailErrorLabel.setVisible(false);
        prenomErrorLabel.setVisible(false);
        loginErrorLabel.setVisible(false);
        mdpErrorLabel.setVisible(false);
        mailErrorLabel.setVisible(false);
        dateErrorLabel.setVisible(false);
        contentPanel.setName("Profil " + logger.getNom() + " " + logger.getPrenom());
        nomTextfield.setText(logger.getNom());
        prenomTextfield.setText(logger.getPrenom());
        pseudoTextfield.setText(logger.getLogin());
        mailTextfield.setText(logger.getMail());
        if (logger.getSexe() == 'H') {
            sexeCombox.setSelectedIndex(0);
        } else {
            sexeCombox.setSelectedIndex(1);
        }

        adrTextfield.setText(logger.getAdress());
        dateTextfield.setDate(logger.getDateNaissance());

        lblImage.setBounds(lblImage.getX(), lblImage.getY(), 250, 250);                 //affecter la width,heigth
        //JOptionPane.showConfirmDialog(null, lblImage.getWidth()+" "+ lblImage.getHeight());//test unitaire
        lblImage.removeAll();
        if (logger.getPhoto() != null) {
            ImageIcon icon = new ImageIcon(logger.getPhoto().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_FAST));
            lblImage.setIcon(icon);
        } else {
            lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tunisianwatch/Images/avatar.png")));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        personalPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomTextfield = new javax.swing.JTextField();
        btnModifier = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        prenomTextfield = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        btnModifphoto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        pseudoTextfield = new javax.swing.JTextField();
        mailTextfield = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sexeCombox = new javax.swing.JComboBox();
        dateTextfield = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adrTextfield = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        msgLabel = new javax.swing.JLabel();
        mdpPasswordField = new javax.swing.JPasswordField();
        nameErrorLabel = new javax.swing.JLabel();
        prenomErrorLabel = new javax.swing.JLabel();
        loginErrorLabel = new javax.swing.JLabel();
        mailErrorLabel = new javax.swing.JLabel();
        dateErrorLabel = new javax.swing.JLabel();
        mdpErrorLabel = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        contentPanel.setAutoscrolls(true);
        contentPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contentPanel.setPreferredSize(new java.awt.Dimension(870, 500));
        contentPanel.setLayout(new java.awt.CardLayout());

        personalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Informations Personelles"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nom ");

        nomTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nomTextfieldMouseExited(evt);
            }
        });
        nomTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomTextfieldKeyReleased(evt);
            }
        });

        btnModifier.setBackground(new java.awt.Color(204, 0, 0));
        btnModifier.setForeground(new java.awt.Color(255, 255, 255));
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Prenom");

        prenomTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prenomTextfieldMouseExited(evt);
            }
        });
        prenomTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prenomTextfieldKeyReleased(evt);
            }
        });

        lblImage.setBackground(new java.awt.Color(0, 0, 0));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnModifphoto.setBackground(new java.awt.Color(204, 0, 0));
        btnModifphoto.setForeground(new java.awt.Color(255, 255, 255));
        btnModifphoto.setText("Modif Photo");
        btnModifphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifphotoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Login");

        pseudoTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pseudoTextfieldMouseExited(evt);
            }
        });
        pseudoTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pseudoTextfieldKeyReleased(evt);
            }
        });

        mailTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mailTextfieldMouseExited(evt);
            }
        });
        mailTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailTextfieldKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("E-Mail");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Sexe");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Date de Naissance");

        sexeCombox.setBackground(new java.awt.Color(204, 0, 0));
        sexeCombox.setForeground(new java.awt.Color(255, 255, 255));
        sexeCombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Homme", "Femme" }));
        sexeCombox.setSelectedIndex(-1);

        dateTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateTextfieldKeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Adresse");

        adrTextfield.setColumns(20);
        adrTextfield.setLineWrap(true);
        adrTextfield.setRows(5);
        adrTextfield.setAutoscrolls(false);
        jScrollPane1.setViewportView(adrTextfield);

        msgLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        msgLabel.setText("Vous devez saisir votre mot de passe avant d'enregistrer les modifications");

        nameErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        nameErrorLabel.setText("Ce champ est obligatoire");

        prenomErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        prenomErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        prenomErrorLabel.setText("Ce champ est obligatoire");

        loginErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        loginErrorLabel.setText("Ce champ est obligatoire");

        mailErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mailErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        mailErrorLabel.setText("Ce champ est obligatoire");

        dateErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dateErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        dateErrorLabel.setText("Ce champ est obligatoire");

        mdpErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mdpErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        mdpErrorLabel.setText("Ce champ est obligatoire");

        javax.swing.GroupLayout personalPanelLayout = new javax.swing.GroupLayout(personalPanel);
        personalPanel.setLayout(personalPanelLayout);
        personalPanelLayout.setHorizontalGroup(
            personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalPanelLayout.createSequentialGroup()
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prenomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pseudoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexeCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenomErrorLabel)
                            .addComponent(nameErrorLabel)
                            .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mailErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dateErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(loginErrorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModifphoto, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(personalPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(msgLabel))
                    .addGroup(personalPanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mdpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mdpErrorLabel)))
                .addGap(37, 37, 37))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        personalPanelLayout.setVerticalGroup(
            personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalPanelLayout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModifphoto))
                    .addGroup(personalPanelLayout.createSequentialGroup()
                        .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(personalPanelLayout.createSequentialGroup()
                                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameErrorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(prenomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(prenomErrorLabel))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pseudoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginErrorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sexeCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mailErrorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(dateErrorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mdpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mdpErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModifier))
        );

        contentPanel.add(personalPanel, "card2");

        add(contentPanel, "card2");
        contentPanel.getAccessibleContext().setAccessibleName(""); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void nomTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomTextfieldMouseExited
    }//GEN-LAST:event_nomTextfieldMouseExited

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        if (isValidNom() & isValidPrenom() & isValidMail() & isValidDate() & isValidPseudo() & isValidPseudo() & isValidPass()) {

            int var = JOptionPane.showConfirmDialog(null, "Voulez-vous Enregister Tes Modifications ?", "Confimation d'Enregistrement ", JOptionPane.YES_NO_OPTION);
            if (var == 0) {
                UtilisateurDao userDao = new UtilisateurDao();

                logger.setNom(nomTextfield.getText());
                logger.setPrenom(prenomTextfield.getText());
                logger.setLogin(pseudoTextfield.getText());
                logger.setSexe(sexeCombox.getSelectedItem().toString().charAt(0));
                logger.setAdress(adrTextfield.getText());
                logger.setMail(mailTextfield.getText());

                logger.setDateNaissance(dateTextfield.getDate());
                /////////////////////////////////////////
                //user.setPhoto(Path);
                /////////////////////////////////////////
                logger.setType('A');
                try {
                    if (PathImage == null) {
                        if (!userDao.updateUser(logger.getId(), logger)) {
                            JOptionPane.showMessageDialog(null, "Erreur lors de la mise à jour ", "Erreur", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {

                        if (!userDao.updateUser(logger.getId(), logger, PathImage)) {
                            JOptionPane.showMessageDialog(null, "Erreur lors de la mise à jour ", "Erreur", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ProfilPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.repaint();
            }
        }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void prenomTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prenomTextfieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomTextfieldMouseExited

    private void btnModifphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifphotoActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser shooser = new JFileChooser();
            FileFilter filtre = new ImageFilter();
            shooser.setFileFilter(filtre);
            shooser.setAcceptAllFileFilterUsed(false);
            shooser.showOpenDialog(null);
            File f = shooser.getSelectedFile();
            PathImage = f.getAbsolutePath();

            Image Image1 = Toolkit.getDefaultToolkit().getImage(PathImage);
            ImageIcon icon = new ImageIcon(Image1.getScaledInstance(250, 250, Image.SCALE_FAST));
            lblImage.setIcon(icon);
            lblImage.repaint();

        } catch (Exception e) {
            System.out.println("format de la photo invalide");
        }


    }//GEN-LAST:event_btnModifphotoActionPerformed

    private boolean isValidPass() {
        //if (mdpPasswordField.getText().length() > 0) {
        if (FieldVerifier.VerifOrdinaryField(mdpPasswordField.getText())) {
            UtilisateurDao userDao = new UtilisateurDao();
            if (userDao.Authentification(logger.getLogin(), mdpPasswordField.getText()) != null) {
                mdpErrorLabel.setVisible(false);
                return true;
            } else {
                mdpErrorLabel.setText("Le mot de passe est incorrect");
                mdpErrorLabel.setVisible(true);
                return false;
            }
        } else {
            mdpErrorLabel.setText(FieldVerifier.getErrorMsg());
            mdpErrorLabel.setVisible(true);
            return false;
        }
    }

    private boolean isValidDate() {
        if (FieldVerifier.isNotNull((dateTextfield.getDate()))) {
            dateErrorLabel.setVisible(false);
            return true;
        } else {
            dateErrorLabel.setVisible(true);
            return false;
        }
    }

    
    private boolean isValidPseudo() {
        if (FieldVerifier.VerifComplexField(pseudoTextfield.getText(), logger.getLogin(), 1)) {
            loginErrorLabel.setVisible(false);
            return true;
        } else {
            loginErrorLabel.setText(FieldVerifier.getErrorMsg());
            loginErrorLabel.setVisible(true);
            return false;
        }

    }

   private boolean isValidNom() {
        if (FieldVerifier.VerifOrdinaryField(nomTextfield.getText(), "^([a-zA-Zéè0çôêâ' ]+)")) {
            nameErrorLabel.setVisible(false);
            return true;
        } else {
            nameErrorLabel.setText(FieldVerifier.getErrorMsg());
            nameErrorLabel.setVisible(true);
            return false;
        }
    }

    private boolean isValidPrenom() {
        if (FieldVerifier.VerifOrdinaryField(prenomTextfield.getText(), "^([a-zA-Zéè0çôêâ' ]+)")) {
            prenomErrorLabel.setVisible(false);
            return true;
        } else {
            prenomErrorLabel.setText(FieldVerifier.getErrorMsg());
            prenomErrorLabel.setVisible(true);
            return false;
        }
    }

    
    private boolean isValidMail() {
        if (FieldVerifier.VerifOrdinaryField(mailTextfield.getText())) { //mailTextfield.getText().length() >
            if (FieldVerifier.VerifComplexField(mailTextfield.getText(), logger.getMail(), 2)) {
                mailErrorLabel.setVisible(false);
                return true;
            } else {
                mailErrorLabel.setText(FieldVerifier.getErrorMsg());
                mailErrorLabel.setVisible(true);
                return false;
            }
        } else {
            mailErrorLabel.setText(FieldVerifier.getErrorMsg());
            mailErrorLabel.setVisible(true);
            return false;
        }
    }

   

    private void pseudoTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pseudoTextfieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pseudoTextfieldMouseExited

    private void mailTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailTextfieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextfieldMouseExited

    private void nomTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomTextfieldKeyReleased
        isValidNom();
    }//GEN-LAST:event_nomTextfieldKeyReleased

    private void prenomTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomTextfieldKeyReleased
        isValidPrenom();
    }//GEN-LAST:event_prenomTextfieldKeyReleased

    private void pseudoTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pseudoTextfieldKeyReleased
        isValidPseudo();
    }//GEN-LAST:event_pseudoTextfieldKeyReleased

    private void mailTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailTextfieldKeyReleased
        isValidMail();
    }//GEN-LAST:event_mailTextfieldKeyReleased

    private void dateTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateTextfieldKeyReleased
        isValidDate();
    }//GEN-LAST:event_dateTextfieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adrTextfield;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnModifphoto;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel dateErrorLabel;
    private com.toedter.calendar.JDateChooser dateTextfield;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel loginErrorLabel;
    private javax.swing.JLabel mailErrorLabel;
    private javax.swing.JTextField mailTextfield;
    private javax.swing.JLabel mdpErrorLabel;
    private javax.swing.JPasswordField mdpPasswordField;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JLabel nameErrorLabel;
    private javax.swing.JTextField nomTextfield;
    private javax.swing.JPanel personalPanel;
    private javax.swing.JLabel prenomErrorLabel;
    private javax.swing.JTextField prenomTextfield;
    private javax.swing.JTextField pseudoTextfield;
    private javax.swing.JComboBox sexeCombox;
    // End of variables declaration//GEN-END:variables
}
