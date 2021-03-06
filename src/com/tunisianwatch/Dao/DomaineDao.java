package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Domaine;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DomaineDao {

    /**
     *
     * @param d
     */
    public int insertDomaine(Domaine d) {
        String requete = "insert into domaine (nom) values (?)";
        int id = -1;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            if (d.getNom() != null) {
                ps.setString(1, d.getNom());
            } else {
                ps.setNull(1, java.sql.Types.VARCHAR);
            }
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
        } catch (SQLException ex) {
        }
        return id;
    }

    /**
     *
     * @param id
     * @param d
     */
    public void updateDomaine(int id, Domaine d) {
        String requete = "update domaine set nom=? where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            if (d.getNom() != null) {
                ps.setString(1, d.getNom());
            } else {
                ps.setNull(1, java.sql.Types.VARCHAR);
            }
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
    }
    
    public List<Domaine> selectDomaines() {
        List<Domaine> listeDomaines = new ArrayList<Domaine>();
        
        String requete = "select * from domaine";
        try {
            Statement statement = ResourceManager.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Domaine d = new Domaine();
                d.setId(resultat.getInt("id"));
                d.setNom(resultat.getString("nom"));
                
                
                listeDomaines.add(d);
            }
            return listeDomaines;
        } catch (SQLException ex) {
            
            return null;
        }
    }

    /**
     *
     * @param id
     */
    public Domaine selectDomaineById(int id) {
        Domaine d = new Domaine();
        String requete = "select * from domaine where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                d.setId(resultat.getInt("id"));
                d.setNom(resultat.getString("nom"));
                
            }
            return d;
            
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du reclamation " + ex.getMessage());
            return null;
        }
    }
    
    public Domaine selectDomaineByNom(String nom) {
        Domaine d = new Domaine();
        String requete = "select * from domaine where nom=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                d.setId(resultat.getInt("id"));
                d.setNom(resultat.getString("nom"));
                
            }
            return d;
            
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du reclamation " + ex.getMessage());
            return null;
        }
    }

    /**
     *
     * @param id
     */
    public void deleteDomaine(int id) {
        String requete = "delete from domaine where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("reclamation supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
}