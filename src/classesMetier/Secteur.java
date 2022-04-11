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
public class Secteur 
{
    private int unSecteur;
    private String nomSecteur;
    private ArrayList<Rayon>lesRayons;
    
    public Secteur( int unId, String unNom)
    {
        unSecteur= unId;
        nomSecteur= unNom;
        lesRayons = new ArrayList<>();
    }

    /**
     * @return the unSecteur
     */
    public int getUnSecteur() {
        return unSecteur;
    }

    /**
     * @return the nomSecteur
     */
    public String getNomSecteur() {
        return nomSecteur;
    }

    /**
     * @return the lesRayons
     */
    public ArrayList<Rayon> getLesRayons() {
        return lesRayons;
    }

    /**
     * @param lesRayons the lesRayons to set
     */
    public void setLesRayons(ArrayList<Rayon> lesRayons) {
        this.lesRayons = lesRayons;
    }
}
