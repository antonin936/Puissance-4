/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apetit
 */
public class Joueur {
    String Nom;// attributs
    String Couleur;
    Jetons ListeJetons [] = new Jetons[21];// tableau de 21 lignes
    int nombreDesintegrateur;
    int nombreJetonsRestants;
    
    public Joueur (String NomJoueur) {
        Nom=NomJoueur;// initalise le nom du joueur avec son paramètre
          
    }
    
    public void affecterCouleur(String couleur1){
        Couleur=couleur1;// affecte la couleur en paramètre du joueur
    }
    
    public void ajouterJeton(Jetons jeton1){
        if (nombreJetonsRestants<=20){// on ne peut ajouter de jetons si le jouueur ôssède déjà tous ses jetons
            int i=0;
            while (ListeJetons[i]!=null){// trouve la bonne place pour l'ajouter c'est à dire lorsqu'il n'y a pas de jeton déjà stocké
                i+=1;
                
            }
            ListeJetons[i]=jeton1;// ajoute le jeton
        
        }
    }
    
    
    
    public void obtenirDesintegrateur(int nombreDesintegrateur1){
        nombreDesintegrateur+=nombreDesintegrateur1;// incrémente le nombre de desintegrateur du joueur
        
    }
   
    
    
    
    
    
    
    
    public boolean utiliserDesintegrateur(int nombreDesintegrateur2){
        if (nombreDesintegrateur>1){// si le joueur possède des desintegrateurs
        nombreDesintegrateur-=nombreDesintegrateur2;// décrémente le nombre de désintegrateur
        System.out.println("Desintegrateur utilisée, il t'en reste "+nombreDesintegrateur);// confirme son utilisation
        return true;
        } 
        return false;// s'il ne reste plus de desintegrateur
        }
}
