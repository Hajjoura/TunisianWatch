package com.tunisianwatch.Entities;

public class EtablissementDomaine {

    private int idEtablissement;
    private int idDomaine;

    
    /**
     *
     * @param idEtablissement
     * @param idDomaine
     */
    public EtablissementDomaine(int idEtablissement, int idDomaine) {
        this.idEtablissement = idEtablissement;
        this.idDomaine = idDomaine;
    }

    

    @Override
    public String toString() {
        return "EtablissementDomaine{" + "idEtablissement=" + idEtablissement + ", idDomaine=" + idDomaine + '}';
    }
    
    

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public void setIdDomaine(int idDomaine) {
        this.idDomaine = idDomaine;
    }


    public int getIdEtablissement() {
        return idEtablissement;
    }

    public int getIdDomaine() {
        return idDomaine;
    }

    
    
    
}
