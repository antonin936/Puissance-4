/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apetit
 */
public class Partie {
    String listeJoueur []= new String[2];// tableau de 2 lignes
    Joueur joueurCourant;// attributs
    Grille laGrille=new Grille();

    public void attribuerCouleursAuxJoueurs() {
        String CouleurJoueur1="Noir";// le joueur1 prend la couleur noir
        String CouleurJoueur2="Rouge";// le joueur2 prend la couleur rouge

    }
    
    public void initialiserPartie(){
            laGrille.viderGrille();// vide la grille
            laGrille.placerTrouNoir(2, 5);//place le trouNoir
            laGrille.placerDesintegrateur(5, 3);// place de desintegrateur
            
            }
        
        
        
            
        
    
}
