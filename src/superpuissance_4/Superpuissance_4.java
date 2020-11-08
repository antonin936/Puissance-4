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
            
            System.out.println("Veuillez choisir le nom du joueur 1 :");
            String nomJoueur1 = sc.next();
            
            System.out.println("Veuillez choisir le nom du joueur 2 :");
            String nomJoueur2 = sc.next();
            
            Joueur(nomJoueur1);
            Joueur(nomJoueur2);
            
            System.out.println("Veuillez chosir votre couleur :"+"\n"+"1.Rouge"+"\n"+"2.Noir");
            
            attribuerCouleursAuxJoueurs();
            affecterCouleur();
            
           
            
    }
}
            


