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
public class secteur 
{
    // Ton erreur est ici
    private int unSecteur;
    private String nomSecteur;
    
    public secteur( int unId, String unNom)
    {
        unSecteur= unId;
        nomSecteur= unNom;
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
}
