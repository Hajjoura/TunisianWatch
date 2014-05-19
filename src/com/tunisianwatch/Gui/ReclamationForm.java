/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.DocumentDao;
import com.tunisianwatch.Dao.DomaineDao;
import com.tunisianwatch.Dao.GeolocalisationDao;
import com.tunisianwatch.Dao.LieuDao;
import com.tunisianwatch.Dao.ReclamationDao;
import com.tunisianwatch.Entities.Document;
import com.tunisianwatch.Entities.Domaine;
import com.tunisianwatch.Entities.Lieu;
import com.tunisianwatch.Entities.Reclamation;
import com.tunisianwatch.Util.FieldVerifier;
import com.tunisianwatch.Util.ImageFilter;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author asd
 */
public class ReclamationForm extends javax.swing.JPanel {

    /**
     * Creates new form ReclamationForm
     */
    private List<File> listFile = new ArrayList<File>();

    public ReclamationForm() {
        initComponents();
        titreErrorLabel.setVisible(false);
        lieuErrorLabel.setVisible(false);
        domaineErrorLabel.setVisible(false);
        dateErrorLabel.setVisible(false);
        heureErrorLabel.setVisible(false);
        listRadioButton.setSelected(true);

        DefaultComboBoxModel<Lieu> lieuModel = new DefaultComboBoxModel();
        DefaultComboBoxModel<Domaine> domaineModel = new DefaultComboBoxModel();
        List<Lieu> listLieu = new LieuDao().selectLieux();
        for (Lieu L : listLieu) {
            lieuModel.addElement(L);
        }
        lieuComboBox.setModel(lieuModel);

        List<Domaine> listDomaine = new DomaineDao().selectDomaines();
        for (Domaine D : listDomaine) {
            domaineModel.addElement(D);
        }
        domaineComboBox.setModel(domaineModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        titreTextfield = new javax.swing.JTextField();
        titreLabel = new javax.swing.JLabel();
        lieuLabel = new javax.swing.JLabel();
        lieuComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        domaineComboBox = new javax.swing.JComboBox();
        fileToggleButton = new javax.swing.JToggleButton();
        photoLabel = new javax.swing.JLabel();
        pathTextfield = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        mapButton = new javax.swing.JButton();
        descriptionLabel = new javax.swing.JLabel();
        fileLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dateTextfield = new com.toedter.calendar.JDateChooser();
        submitButton = new javax.swing.JButton();
        titreErrorLabel = new javax.swing.JLabel();
        lieuErrorLabel = new javax.swing.JLabel();
        domaineErrorLabel = new javax.swing.JLabel();
        dateErrorLabel = new javax.swing.JLabel();
        heureErrorLabel = new javax.swing.JLabel();
        heureLabel = new javax.swing.JLabel();
        timeTimeChooser = new lu.tudor.santec.jtimechooser.JTimeChooser();
        listRadioButton = new javax.swing.JRadioButton();
        mapRadioButton = new javax.swing.JRadioButton();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nouvelle Reclamation"));

        titreTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titreTextfieldMouseExited(evt);
            }
        });
        titreTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                titreTextfieldKeyReleased(evt);
            }
        });

        titreLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titreLabel.setText("Titre:");

        lieuLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lieuLabel.setText("Lieu par liste:");

        lieuComboBox.setBackground(new java.awt.Color(204, 0, 0));
        lieuComboBox.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Domaine:");

        domaineComboBox.setBackground(new java.awt.Color(204, 0, 0));
        domaineComboBox.setForeground(new java.awt.Color(255, 255, 255));

        fileToggleButton.setBackground(new java.awt.Color(204, 0, 0));
        fileToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        fileToggleButton.setText("Parcourir");
        fileToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileToggleButtonActionPerformed(evt);
            }
        });

        photoLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        photoLabel.setText("Joindre photo :");

        pathTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathTextfieldActionPerformed(evt);
            }
        });

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane2.setViewportView(descriptionTextArea);

        mapButton.setBackground(new java.awt.Color(204, 0, 0));
        mapButton.setForeground(new java.awt.Color(255, 255, 255));
        mapButton.setText("Lieu par Map");
        mapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapButtonActionPerformed(evt);
            }
        });

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionLabel.setText("Description");

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dateLabel.setText("Date de l'incident");

        dateTextfield.setDateFormatString("yyyy-MM-d");
        dateTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dateTextfieldMouseReleased(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(204, 0, 0));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Ajouter");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        titreErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        titreErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        titreErrorLabel.setText("Ce champ est obligatoire");

        lieuErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lieuErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        lieuErrorLabel.setText("Vous devez préciser le lieu");

        domaineErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        domaineErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        domaineErrorLabel.setText("Vous devez séléctionnez le domaine");

        dateErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dateErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        dateErrorLabel.setText("Vous devez saisir la date");

        heureErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        heureErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        heureErrorLabel.setText("Vous devez saisir l'heure");

        heureLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        heureLabel.setText("Heure de l'incident");

        timeTimeChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                timeTimeChooserMouseReleased(evt);
            }
        });

        buttonGroup.add(listRadioButton);
        listRadioButton.setText("par liste");
        listRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(mapRadioButton);
        mapRadioButton.setText("par map");
        mapRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(photoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lieuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(heureLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(165, 165, 165))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(titreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pathTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fileToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mapRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mapButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(listRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lieuComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lieuErrorLabel)
                                    .addComponent(domaineErrorLabel)
                                    .addComponent(titreErrorLabel)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(domaineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dateTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                            .addComponent(timeTimeChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dateErrorLabel)
                                            .addComponent(heureErrorLabel))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titreErrorLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lieuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listRadioButton)
                            .addComponent(lieuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lieuErrorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mapRadioButton)
                            .addComponent(mapButton))
                        .addGap(30, 30, 30)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domaineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domaineErrorLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileToggleButton))
                .addGap(0, 0, 0)
                .addComponent(fileLabel)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dateErrorLabel)
                                .addComponent(dateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(heureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(timeTimeChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(heureErrorLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void titreTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titreTextfieldMouseExited

    }//GEN-LAST:event_titreTextfieldMouseExited

    private void fileToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileToggleButtonActionPerformed

        JFileChooser shooser = new JFileChooser();
        FileFilter filtre = new ImageFilter();
        shooser.setFileFilter(filtre);
        shooser.setAcceptAllFileFilterUsed(false);
        int res = shooser.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            fileLabel.setText(fileLabel.getText() + " " + shooser.getSelectedFile().getName());
            listFile.add(shooser.getSelectedFile());
        }
    }//GEN-LAST:event_fileToggleButtonActionPerformed

    private void pathTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathTextfieldActionPerformed

    private void mapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapButtonActionPerformed
        new geoJFrame().setVisible(true);
    }//GEN-LAST:event_mapButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        boolean ok = true;
        if (isValidDate() & isValidHeure() & isValidTitre() & isValidLieu()) {
            Reclamation reclamation = new Reclamation();
            LieuDao lieuDao = new LieuDao();
            int idgeo = 0;
            int idlieu = 0;
            Lieu lieu = null;
            if (mapRadioButton.isSelected() && geoJFrame.geo != null) {
                lieu = lieuDao.selectLieuByNom(geoJFrame.ville);
                if (lieu == null) {
                    ok = false;
                    lieu = new Lieu(geoJFrame.ville);
                    idlieu = lieuDao.insertLieu(lieu);
                    if (idlieu > 0) {
                        ok = true;
                        lieu.setId(idlieu);
                    }
                }
            } else if (listRadioButton.isSelected()) {
                lieu = (Lieu) lieuComboBox.getSelectedItem();
            }
            System.out.println(lieu);
            reclamation.setTitre(titreTextfield.getText());
            reclamation.setCitoyen(MainFrame.getMe());
            reclamation.setDate(dateTextfield.getDate());
            reclamation.setHeure(timeTimeChooser.getTimeField().getText());
            reclamation.setDomaine((Domaine) domaineComboBox.getSelectedItem());
            reclamation.setEtat(0);
            reclamation.setLieu(lieu);
            reclamation.setDescription(descriptionTextArea.getText());
            if (ok) {
                ReclamationDao reclamationDao = new ReclamationDao();
                int idreclamation = reclamationDao.insertReclamation(reclamation);
                if (idreclamation > 0) {
                    reclamation.setId(idreclamation);
                    if (mapRadioButton.isSelected()) {
                        System.out.println(idreclamation);
                        geoJFrame.geo.setReclamation(reclamation);
                        idgeo = new GeolocalisationDao().insertGeo(geoJFrame.geo);
                        geoJFrame.geo.setId(idgeo);
                        reclamation.setGeolocalisation(geoJFrame.geo);
                        reclamationDao.updateReclamation(idreclamation, reclamation);
                    }
                    if (listFile.size() > 0) {
                        DocumentDao docDao = new DocumentDao();
                        for (File file : listFile) {
                            Document document = new Document();
                            document.setIdReclamation(idreclamation);
                            document.setNom(file.getName());
                            document.setType(1);
                            document.setImage(file);
                            docDao.insertDocument(document);
                            document.moveFile();
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Réclamation Ajoutée", "La réclamation a été ajoutée avec succèes", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void listRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listRadioButtonActionPerformed

    }//GEN-LAST:event_listRadioButtonActionPerformed

    private void mapRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapRadioButtonActionPerformed

    }//GEN-LAST:event_mapRadioButtonActionPerformed

    private void dateTextfieldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateTextfieldMouseReleased
        isValidDate();
    }//GEN-LAST:event_dateTextfieldMouseReleased

    private void titreTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titreTextfieldKeyReleased
        isValidTitre();
    }//GEN-LAST:event_titreTextfieldKeyReleased

    private void timeTimeChooserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeTimeChooserMouseReleased
        isValidHeure();
    }//GEN-LAST:event_timeTimeChooserMouseReleased

    private boolean isValidTitre() {
        if (FieldVerifier.VerifOrdinaryField(titreTextfield.getText())) {
            titreErrorLabel.setVisible(false);
            return true;
        } else {
            titreErrorLabel.setText(FieldVerifier.getErrorMsg());
            titreErrorLabel.setVisible(true);
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

    private boolean isValidHeure() {
        if (FieldVerifier.isNotNull((timeTimeChooser.getTimeField()))) {
            heureErrorLabel.setVisible(false);
            return true;
        } else {
            heureErrorLabel.setVisible(true);
            return false;
        }
    }

    private boolean isValidLieu() {
        if (listRadioButton.isSelected()) {
            if (FieldVerifier.isNotNull((lieuComboBox.getSelectedItem()))) {
                lieuErrorLabel.setVisible(false);
                return true;
            } else {
                lieuErrorLabel.setVisible(true);
                return false;
            }
        } else if (mapRadioButton.isSelected()) {
            if (FieldVerifier.isNotNull((geoJFrame.geo))) {
                lieuErrorLabel.setVisible(false);
                return true;
            } else {
                lieuErrorLabel.setVisible(true);
                return false;
            }
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel dateErrorLabel;
    private javax.swing.JLabel dateLabel;
    private com.toedter.calendar.JDateChooser dateTextfield;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JComboBox domaineComboBox;
    private javax.swing.JLabel domaineErrorLabel;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JToggleButton fileToggleButton;
    private javax.swing.JLabel heureErrorLabel;
    private javax.swing.JLabel heureLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox lieuComboBox;
    private javax.swing.JLabel lieuErrorLabel;
    private javax.swing.JLabel lieuLabel;
    private javax.swing.JRadioButton listRadioButton;
    private javax.swing.JButton mapButton;
    private javax.swing.JRadioButton mapRadioButton;
    private javax.swing.JTextField pathTextfield;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton submitButton;
    private lu.tudor.santec.jtimechooser.JTimeChooser timeTimeChooser;
    private javax.swing.JLabel titreErrorLabel;
    private javax.swing.JLabel titreLabel;
    private javax.swing.JTextField titreTextfield;
    // End of variables declaration//GEN-END:variables
}
