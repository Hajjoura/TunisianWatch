/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.*;
import com.tunisianwatch.Entities.Geolocalisation;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;

/**
 *
 * @author DELL
 */
public class geoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form geoJFrame
     */
    public static String ville = null;
    public static Geolocalisation geo = null;
    private boolean tag = false;

    public geoJFrame() {
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

        jMapViewer1 = new org.openstreetmap.gui.jmapviewer.JMapViewer();
        Map = new org.openstreetmap.gui.jmapviewer.JMapViewer();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Map.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Map, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MapMouseClicked

        double maplat = Map.getPosition(evt.getPoint()).getLat();
        double maplon = Map.getPosition(evt.getPoint()).getLon();
        geo = new Geolocalisation();

        if (MouseEvent.BUTTON1 == evt.getButton()) {
            try {
                URL url = new URL("https://maps.googleapis.com/maps/api/geocode/json?latlng=" + maplat + "," + maplon + "&sensor=false");
                ObjectMapper parserMap = new ObjectMapper();
                Geoloc geoloc = null;
                geoloc = parserMap.readValue(url, Geoloc.class);

                ville = "";
                for (Results rs : geoloc.getResults()) {
                    for (Address_components ac : rs.getAddress_components()) {
                        for (Types ty : ac.getTypes()) {
                            if (ty == Types.administrative_area_level_2) {
                                ville = ac.getLong_name() + ",";
                            }
                            if (ty == Types.administrative_area_level_1) {
                                ville += ac.getLong_name();
                            }
                            break;
                        }
                        break;

                    }
                }
                MapMarkerDot map = new MapMarkerDot(ville, new Coordinate(maplat, maplon));

                Map.removeAllMapMarkers();
                Map.addMapMarker(map);
                geo.setLat(maplat);
                geo.setLon(maplon);

            } catch (MalformedURLException ex) {
                Logger.getLogger(geoJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(geoJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_MapMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openstreetmap.gui.jmapviewer.JMapViewer Map;
    private org.openstreetmap.gui.jmapviewer.JMapViewer jMapViewer1;
    // End of variables declaration//GEN-END:variables
}
