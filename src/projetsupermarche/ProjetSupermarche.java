/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsupermarche;

import java.util.Scanner;

/**
 *
 * @author ANTHONY
 */
public class ProjetSupermarche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
        
        
                Scanner sc = new Scanner(System.in);
        int choix = 0;
        do
        {
            do
            {
                System.out.println("1 : Afficher toutes les informations");
                System.out.println("2 : Temps total pour un employé");
                System.out.println("3 : Temps moyen travaillé par l'ensemble des employés");
                System.out.println("0 : Quitter le programme");
                choix = sc.nextInt();

            }while(choix < 0 || choix > 3);

            switch(choix)
            {
                case 1 : 
                     // A vous de jouer
                    

                    break;
                case 2 :
                    
                    // A vous de jouer
                    
                    
                    break;
                case 3 : 

                    // A vous de jouer
                    
                    
                    break;    
                case 0 : 
                    System.out.println("FIN DU PROGRAME");
                    break;
            }
        }while(choix!=0);
    }
    
}
