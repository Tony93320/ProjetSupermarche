/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesMetier;

import java.util.ArrayList;

/**
 *
 * @author ANTHONY
 */
public class Rayon {
    private int idRayon;
    private  String nomRayon;
    private ArrayList<Travailler> lesTravailler;
    
    public Rayon(int unId, String unNom)
    {
    idRayon= unId;
    nomRayon= unNom;
    lesTravailler = new ArrayList<>();
    }

    /**
     * @return the idRayon
     */
    public int getIdRayon() {
        return idRayon;
    }

    /**
     * @return the nomRayon
     */
    public String getNomRayon() {
        return nomRayon;
    }

    /**
     * @return the lesTravailler
     */
    public ArrayList<Travailler> getLesTravailler() {
        return lesTravailler;
    }
}
