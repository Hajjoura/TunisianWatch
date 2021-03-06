/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Geolocalisation;
import com.tunisianwatch.Entities.Lieu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asd
 */
public class GeolocalisationDao {

    public int insertGeo(Geolocalisation G) {
        int id = 0;
        String requete = "insert into geolocalisation (lat,lon,idreclamation) values (?,?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setDouble(1, G.getLat());
            ps.setDouble(2, G.getLon());
            ps.setInt(3, G.getReclamation().getId());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();     
            return id;
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        return id;
    }

    public void updateGeo(int id, Geolocalisation G) {
        String requete = "update geolocalisation set lat=?,lon=? where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setDouble(1, G.getLat());
            ps.setDouble(2, G.getLon());
            ps.setInt(3, G.getId());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public List<Geolocalisation> selectGeo() {
        List<Geolocalisation> geolocalisations = new ArrayList<Geolocalisation>();
        LieuDao lieuDao = new LieuDao();
        ReclamationDao reclamationDao = new ReclamationDao();
        String requete = "select * from geolocalisation";
        Statement statement;
        try {
            statement = ResourceManager.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Geolocalisation geo = new Geolocalisation();
                geo.setId(resultat.getInt("id"));
                geo.setLat(resultat.getDouble("lat"));
                geo.setLon(resultat.getDouble("lon"));
                geo.setReclamation(reclamationDao.selectReclamationById(resultat.getInt("idreclamation")));
                geolocalisations.add(geo);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return geolocalisations;
    }
    
    public List<Geolocalisation> selectGeoByidLieu(int idlieu) {
        List<Geolocalisation> geolocalisations = new ArrayList<Geolocalisation>();
        LieuDao lieuDao = new LieuDao();
        ReclamationDao reclamationDao = new ReclamationDao();
        String requete = "select * from geolocalisation where idlieu=?";
        PreparedStatement ps;
        try {
            ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idlieu);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Geolocalisation geo = new Geolocalisation();
                geo.setId(resultat.getInt("id"));
                geo.setLat(resultat.getDouble("lat"));
                geo.setLon(resultat.getDouble("lon"));
                geo.setReclamation(reclamationDao.selectReclamationById(resultat.getInt("idreclamation")));
                geolocalisations.add(geo);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return geolocalisations;
    }

    /**
     *
     * @param id
     */
    public Geolocalisation selectGeoById(int id) {
        String requete = "select * from geolocalisation where id=?";
        Geolocalisation geo = null;
        LieuDao lieuDao = new LieuDao();
        ReclamationDao reclamationDao = new ReclamationDao();
        try {
            geo = new Geolocalisation();
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                geo.setId(resultat.getInt("id"));
                geo.setLat(resultat.getDouble("lat"));
                geo.setLon(resultat.getDouble("lon"));
                geo.setReclamation(reclamationDao.selectReclamationById(resultat.getInt("idreclamation")));
            }
        } catch (SQLException ex) {

        }
        return geo;

    }
    
        public Geolocalisation selectGeoByIdReclamation(int idreclamation) {
        String requete = "select * from geolocalisation where idreclamation=?";
        Geolocalisation geo = null;
        ReclamationDao reclamationDao = new ReclamationDao();
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idreclamation);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                geo = new Geolocalisation();
                geo.setId(resultat.getInt("id"));
                geo.setLat(resultat.getDouble("lat"));
                geo.setLon(resultat.getDouble("lon"));
                geo.setReclamation(reclamationDao.selectReclamationById(resultat.getInt("idreclamation")));
            }
        } catch (SQLException ex) {

        }
        return geo;
    }

}
