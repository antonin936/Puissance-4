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
    
    public void Jetons (String couleurchoisie) {
        Couleur=couleurchoisie;// initialise la couleur du jeton avec le paramètre
   }
    
    /**
     *
     * @return
     */
    public String lireCouleur() {
        return Couleur;// renvoie la couleur du jeton
    }
}
