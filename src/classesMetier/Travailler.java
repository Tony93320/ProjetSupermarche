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
public class Travailler {
    private Employe unEmploye;
    private int tempsPasse;
    
    public Travailler(Employe unEmploye, int unTemps)
    {
    this.unEmploye= unEmploye;
    tempsPasse= unTemps;
    }

    /**
     * @return the unEmploye
     */
    public Employe getUnEmploye() {
        return unEmploye;
    }

    /**
     * @return the tempsPasse
     */
    public int getTempsPasse() {
        return tempsPasse;
    }

}
