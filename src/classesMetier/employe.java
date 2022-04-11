/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesMetier;

/**
 *
 * @author ANTHONY
 */
public class employe 
{
    private int idEmploye;
    private String nomEmploye;
    
    public employe(int unId, String unNom)
    {
    idEmploye= unId;
    nomEmploye= unNom;
    }

    /**
     * @return the idEmploye
     */
    public int getIdEmploye() {
        return idEmploye;
    }

    /**
     * @return the nomEmploye
     */
    public String getNomEmploye() {
        return nomEmploye;
    }
}

