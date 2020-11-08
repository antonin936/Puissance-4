/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apetit
 */
public class Jetons {
    String Couleur;// attribut
    
    public Jetons (String couleurchoisie) {
        Couleur=couleurchoisie;// initialise la couleur du jeton avec le paramètre
   }
    
    /**
     *
     * @return
     */
    public String lireCouleur() {
        if (JetonCourant!=null){ // ne peut retourner une couleur uniquement s'il y a un jeton
        return Couleur;// renvoie la couleur du jeton
        }
        return "";
        
    }
}
