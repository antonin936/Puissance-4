/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance_4;
import java.util.Scanner;
/**
 *
 * @author apetit
 */
public class Superpuissance_4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Veuillez choisir le nom du joueur 1 :");// message de début
            String nomJoueur1 = sc.next();// stock le nom rentré dans nomJoueur1
            
            System.out.println("Veuillez choisir le nom du joueur 2 :");
            String nomJoueur2 = sc.next();// stock le nom rentré dans nomJoueur2
            
            Joueur(nomJoueur1);// rentre les noms des joueurs dans les paramètres
            Joueur(nomJoueur2);
            
            attribuerCouleursAuxJoueurs();// attribue les couleurs aux joueurs
            initialiserPartie();// initialise la partie
            debuterPartie();// commence la partie
            
           
            
    }
}
            


