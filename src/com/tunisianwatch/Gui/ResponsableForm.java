/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.EtablissementDao;
import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Etablissement;
import com.tunisianwatch.Entities.Utilisateur;
import com.tunisianwatch.Util.FieldVerifier;
import com.tunisianwatch.Util.ImageFilter;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Skan
 */
public class ResponsableForm extends javax.swing.JFrame {

    private boolean modif = false;
    private Utilisateur user;
    private String PathImage;
    EtablissementDao etabblissementDao = new EtablissementDao();
    DefaultComboBoxModel<Etablissement> etablissementModel = new DefaultComboBoxModel<Etablissement>();

    public ResponsableForm(Object obj) {
        modif = true;
        this.user = (Utilisateur) obj;
        initComponents();
        List lE = new ArrayList();
        lE = etabblissementDao.selectEtablissements();
        for (Object e : lE) {
            etablissementModel.addElement((Etablissement) e);

        }
        etablissementComboBox.setModel(etablissementModel);
        etablissementComboBox.setSelectedItem(user.getEtablissement());

        nameErrorLabel.setVisible(false);
        mailErrorLabel.setVisible(false);
        prenomErrorLabel.setVisible(false);
        loginErrorLabel.setVisible(false);
        mdpErrorLabel.setVisible(false);
        mailErrorLabel.setVisible(false);
        dateErrorLabel.setVisible(false);
        etablissmentErrorLabel.setVisible(false);
        setLocationRelativeTo(null);
        //  setTitle("Modification - " + user.getNom() + "  " + user.getPrenom());
        prenomTextfield.setText(user.getNom());
        nomTextfield.setText(user.getPrenom());
        pseudoTextfield.setText(user.getLogin());
        if (user.getSexe() == 'H') {
            sexeCombox.setSelectedIndex(0);
        } else {
            sexeCombox.setSelectedIndex(1);
        }
        adrTextfield1.setText(user.getAdress());
        mailTextfield.setText(user.getMail());
        mdpPasswordField.setText(user.getMdp());
        dateTextfield.setDate(user.getDateNaissance());

        lblImage.setBounds(lblImage.getX(), lblImage.getY(), 200, 200);
        lblImage.removeAll();
        if (user.getPhoto() != null) {
            ImageIcon icon = new ImageIcon(user.getPhoto().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_FAST));
            lblImage.setIcon(icon);
        } else {
            lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tunisianwatch/Images/avatar.png")));
        }
        submitButton.setText("Modifier");

    }

    public ResponsableForm() {
        initComponents();

        etablissementComboBox.setModel(etablissementModel);
        nameErrorLabel.setVisible(false);
        mailErrorLabel.setVisible(false);
        prenomErrorLabel.setVisible(false);
        loginErrorLabel.setVisible(false);
        mdpErrorLabel.setVisible(false);
        mailErrorLabel.setVisible(false);
        dateErrorLabel.setVisible(false);
        etablissmentErrorLabel.setVisible(false);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tunisianwatch/Images/avatar.png")));
        setLocationRelativeTo(null);
        List lE = new ArrayList();
        lE = etabblissementDao.selectEtablissements();
        for (Object e : lE) {
            etablissementModel.addElement((Etablissement) e);

        }
        etablissementComboBox.setModel(etablissementModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        adrTextfield1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        prenomTextfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nomTextfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sexeCombox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        mailTextfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mdpPasswordField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dateTextfield = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pseudoTextfield = new javax.swing.JTextField();
        nameErrorLabel = new javax.swing.JLabel();
        prenomErrorLabel = new javax.swing.JLabel();
        loginErrorLabel = new javax.swing.JLabel();
        mdpErrorLabel = new javax.swing.JLabel();
        mailErrorLabel = new javax.swing.JLabel();
        dateErrorLabel = new javax.swing.JLabel();
        btnModifphoto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adrTextfield = new javax.swing.JTextArea();
        etablissementComboBox = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        etablissmentErrorLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Adresse :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Résponsable - Form");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulaire Responsable"));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 500));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nom :");

        prenomTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomTextfieldActionPerformed(evt);
            }
        });
        prenomTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prenomTextfieldKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Prénom :");

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sexe :");

        sexeCombox.setBackground(new java.awt.Color(204, 0, 0));
        sexeCombox.setForeground(new java.awt.Color(255, 255, 255));
        sexeCombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Homme", "Femme" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Email :");

        mailTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailTextfieldKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Mot de passe :");

        mdpPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpPasswordFieldActionPerformed(evt);
            }
        });
        mdpPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mdpPasswordFieldKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Date de naissance :");

        dateTextfield.setDateFormatString("yyyy-MM-d");
        dateTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateTextfieldMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Adresse :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Pseudo :");

        pseudoTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pseudoTextfieldKeyReleased(evt);
            }
        });

        nameErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        nameErrorLabel.setText("Ce champ est obligatoire");

        prenomErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        prenomErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        prenomErrorLabel.setText("Ce champ est obligatoire");

        loginErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        loginErrorLabel.setText("Ce champ est obligatoire");

        mdpErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mdpErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        mdpErrorLabel.setText("Ce champ est obligatoire");

        mailErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mailErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        mailErrorLabel.setText("Ce champ est obligatoire");

        dateErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dateErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        dateErrorLabel.setText("Ce champ est obligatoire");

        btnModifphoto.setBackground(new java.awt.Color(204, 0, 0));
        btnModifphoto.setForeground(new java.awt.Color(255, 255, 255));
        btnModifphoto.setText("Joindre Photo");
        btnModifphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifphotoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setMinimumSize(new java.awt.Dimension(176, 207));

        lblImage.setBackground(new java.awt.Color(0, 0, 0));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tunisianwatch/Images/avatar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImage)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        adrTextfield.setColumns(20);
        adrTextfield.setLineWrap(true);
        adrTextfield.setRows(5);
        adrTextfield.setAutoscrolls(false);
        jScrollPane1.setViewportView(adrTextfield);

        etablissementComboBox.setBackground(new java.awt.Color(204, 0, 0));
        etablissementComboBox.setForeground(new java.awt.Color(255, 255, 255));
        etablissementComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etablissementComboBoxActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Etablissement :");

        etablissmentErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etablissmentErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        etablissmentErrorLabel.setText("Ce champ est obligatoire");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sexeCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mdpPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pseudoTextfield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenomTextfield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomTextfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prenomErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mdpErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(etablissementComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateTextfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mailErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etablissmentErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModifphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnModifphoto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameErrorLabel))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prenomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prenomErrorLabel))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pseudoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginErrorLabel))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mdpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mdpErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexeCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mailErrorLabel))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateErrorLabel)
                                .addComponent(dateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etablissementComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etablissmentErrorLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        submitButton.setBackground(new java.awt.Color(204, 0, 0));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Ajouter");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Fermer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addContainerGap())))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Ajout Responsable");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prenomTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomTextfieldActionPerformed

    private void prenomTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomTextfieldKeyReleased
        isValidPrenom();
    }//GEN-LAST:event_prenomTextfieldKeyReleased

    private void nomTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomTextfieldMouseExited
    }//GEN-LAST:event_nomTextfieldMouseExited

    private void nomTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomTextfieldKeyReleased
        isValidNom();
    }//GEN-LAST:event_nomTextfieldKeyReleased

    private void mailTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailTextfieldKeyReleased
        isValidMail();
    }//GEN-LAST:event_mailTextfieldKeyReleased

    private void mdpPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mdpPasswordFieldKeyReleased
        isValidPass();
    }//GEN-LAST:event_mdpPasswordFieldKeyReleased

    private void dateTextfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateTextfieldMouseClicked
        isValidDate();
    }//GEN-LAST:event_dateTextfieldMouseClicked

    private void pseudoTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pseudoTextfieldKeyReleased
        isValidPseudo();
    }//GEN-LAST:event_pseudoTextfieldKeyReleased

    private void btnModifphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifphotoActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser shooser = new JFileChooser();
            //FileFilter filtre = new FileNameExtensionFilter("Fichier Image", "jpg", "jpeg", "png" ,"gif") ;
            FileFilter filtre = new ImageFilter();
            shooser.setFileFilter(filtre);
            shooser.setAcceptAllFileFilterUsed(false);
            shooser.showOpenDialog(null);
            File f = shooser.getSelectedFile();
            PathImage = f.getAbsolutePath();
            Image Image1 = Toolkit.getDefaultToolkit().getImage(PathImage);
            ImageIcon icon = new ImageIcon(Image1.getScaledInstance(200, 200, Image.SCALE_FAST));
            lblImage.setIcon(icon);
            lblImage.repaint();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnModifphotoActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        //   if (nomTextfield.getText().length() != 0 & prenomTextfield.getText().length() != 0 & pseudoTextfield.getText().length() != 0 & mdpTextfield.getText().length() != 0 & dateTextfield.getDate() != null) {
        if (isValidNom() & isValidPrenom() & isValidMail() & isValidPass() & isValidDate() & isValidPseudo() & isValidEtablissement()) {
            if (!modif) {
                user = new Utilisateur();
            }
            UtilisateurDao userDao = new UtilisateurDao();

            user.setNom(nomTextfield.getText());
            user.setPrenom(prenomTextfield.getText());
            user.setLogin(pseudoTextfield.getText());
            user.setSexe(sexeCombox.getSelectedItem().toString().charAt(0));
            user.setAdress(adrTextfield.getText());
            user.setMail(mailTextfield.getText());
            user.setMdp(mdpPasswordField.getText());
            user.setDateNaissance(dateTextfield.getDate());
            user.setEtablissement((Etablissement) etablissementComboBox.getSelectedItem());
            user.setPath(PathImage);
            user.setType('R');
            if (modif) {
                if (userDao.updateResponsable(user.getId(), user)) {
                    JOptionPane.showMessageDialog(null, "Mise à jour effectuée avec succès");
                    this.dispose();
                    ConsultationPanel.tableModel.refresh();
                    ConsultationPanel.tableModel.fireTableDataChanged();
                } else {
                    JOptionPane.showMessageDialog(null, "Erreur lors de la mise à jour ", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            } else {

                if (userDao.insertResponsable(user) > 0) {
                    JOptionPane.showMessageDialog(null, "Ajout effectuée avec succès");
                    this.dispose();
                    ConsultationPanel.tableModel.refresh();
                    ConsultationPanel.tableModel.fireTableDataChanged();
                } else {
                    JOptionPane.showMessageDialog(null, "erreur lors de l'insertion ", "Erreur", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
        //        else {
        //            JOptionPane.showMessageDialog(null, "Vous devez remplir tous les champs !!", "Message d'avertissement", JOptionPane.WARNING_MESSAGE);
        //        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mdpPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdpPasswordFieldActionPerformed

    private void etablissementComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etablissementComboBoxActionPerformed
    }//GEN-LAST:event_etablissementComboBoxActionPerformed

    private boolean isValidEtablissement() {
        if (FieldVerifier.isNotNull((etablissementComboBox.getSelectedItem()))) {
            etablissmentErrorLabel.setVisible(false);
            return true;
        } else {
            etablissmentErrorLabel.setVisible(true);
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

    private boolean isValidNom() {
        if (FieldVerifier.VerifOrdinaryField(nomTextfield.getText(), "^([a-zA-Zéè0çôêâ']+)")) {
            nameErrorLabel.setVisible(false);
            return true;
        } else {
            nameErrorLabel.setText(FieldVerifier.getErrorMsg());
            nameErrorLabel.setVisible(true);
            return false;
        }
    }

    private boolean isValidPrenom() {
        if (FieldVerifier.VerifOrdinaryField(prenomTextfield.getText(), "^([a-zA-Zéè0çôêâ']+)")) {
            prenomErrorLabel.setVisible(false);
            return true;
        } else {
            prenomErrorLabel.setText(FieldVerifier.getErrorMsg());
            prenomErrorLabel.setVisible(true);
            return false;
        }
    }

    private boolean isValidPseudo() {
        if (!modif) {
            if (FieldVerifier.VerifComplexField(pseudoTextfield.getText(), 1)) {
                loginErrorLabel.setVisible(false);
                return true;
            } else {
                loginErrorLabel.setText(FieldVerifier.getErrorMsg());
                loginErrorLabel.setVisible(true);
                return false;
            }
        } else {
            if (FieldVerifier.VerifComplexField(pseudoTextfield.getText(), user.getLogin(), 1)) {
                loginErrorLabel.setVisible(false);
                return true;
            } else {
                loginErrorLabel.setText(FieldVerifier.getErrorMsg());
                loginErrorLabel.setVisible(true);
                return false;
            }
        }
    }

    private boolean isValidPass() {
        if (FieldVerifier.VerifComplexField(mdpPasswordField.getText(), 3)) {
            mdpErrorLabel.setVisible(false);
            return true;
        } else {
            mdpErrorLabel.setText(FieldVerifier.getErrorMsg());
            mdpErrorLabel.setVisible(true);
            return false;
        }
    }

    private boolean isValidMail() {
        if (!modif) {
            if (FieldVerifier.VerifOrdinaryField(mailTextfield.getText())) { //mailTextfield.getText().length() >
                if (FieldVerifier.VerifComplexField(mailTextfield.getText(), 2)) {
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
        else{
            if (FieldVerifier.VerifOrdinaryField(mailTextfield.getText())) { //mailTextfield.getText().length() >
                if (FieldVerifier.VerifComplexField(mailTextfield.getText(),user.getMail(), 2)) {
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
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adrTextfield;
    private javax.swing.JTextField adrTextfield1;
    private javax.swing.JButton btnModifphoto;
    private javax.swing.JLabel dateErrorLabel;
    private com.toedter.calendar.JDateChooser dateTextfield;
    private javax.swing.JComboBox etablissementComboBox;
    private javax.swing.JLabel etablissmentErrorLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel loginErrorLabel;
    private javax.swing.JLabel mailErrorLabel;
    private javax.swing.JTextField mailTextfield;
    private javax.swing.JLabel mdpErrorLabel;
    private javax.swing.JTextField mdpPasswordField;
    private javax.swing.JLabel nameErrorLabel;
    private javax.swing.JTextField nomTextfield;
    private javax.swing.JLabel prenomErrorLabel;
    private javax.swing.JTextField prenomTextfield;
    private javax.swing.JTextField pseudoTextfield;
    private javax.swing.JComboBox sexeCombox;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
