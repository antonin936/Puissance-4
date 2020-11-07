/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apetit
 */
public class Grille {
    String Cellules[][]=new String[6][7];// attribut : tableau nommée Cellules de 6 lignes et 7 colonnes
   
    
    public boolean ajouterJetonDansColonne (Jetons unJeton,int colonne){
        for (int i=0;i<6;){
            if (Cellules[i][colonne]!=null){// si la cellule de coordonnées données possède un jeton
                i++;// alors on passe à la ligne suivante pour placr le jeton
            } else {
                Cellules[i][colonne]+=unJeton;// sinon on ajoute le jeton
            }
            if (Cellules[5][colonne]!=null){// si toute la colonne est remplie
                return false;// on retourne faux, impossible d'ajouter de jeton
            }
        
        }
        return false;
    }
    
    
    public boolean etreRemplie(){
        for (int i=0;i<7;i++){// parcourt les colonnes
            int a=0;
            if (Cellules[6][i]!=null){// si la dernière case de la colonne est remplie
                a+=1;// on indique que une colonne en plus est remplie
            } else {
                a=0;// sinon on réinitialise le comptage
            }
            return a==7;// sinon faux
        }
    }

    
    public void viderGrille(){
        for (int i=0;i<6;i++){//parcourt lignes
            for (int j=0;j<7;j++){// parcourt colonnes
               Cellules[i][j]=null; 
                // on vide toutes les cases
               
            }
        }
      
    }
   
   public afficherGrilleSurConsole(){
       

   
   }
   public boolean celluleOccupée(int coordonneeLigne,int coordonneeColonne){
       if (Cellules[coordonneeLigne][coordonneeColonne]!=null){// regade si la cellule de coordonées indiquées est remplie
           return true;// si oui on retourne vrai
       } else {
           return false;// sinon faux
       }
   
   }
   
   
 
   
  
  
   
   public String lireCouleurDuJeton(int coordonneeLigne,int coordonneeColonne){
       if (Cellules[coordonneeLigne][coordonneeColonne]!=null){// regarde si la cellule de coordonnées rentrées est remplie
        return Cellules[coordonneeLigne][coordonneeColonne].JetonCourant.lireCouleur();// si oui on retourne sa couleur
       } else {
           return "Opération impossible, la cellule ne posséde pas de jeton";// sinon on retourne que c'est impossible
       }
        
   } 
           
       
   public boolean etreGagnantePourJoueur(Joueur Joueur1){
       
       for (int i=0;i<6;i++){// pour changer de ligne une fois toute la colonne essayée
           //sert de test pour savoir s'il y a bien 4 jetons
          int jetonsAlignesCo=0; //de même couleur alignés
           for (int j=0;j<7;j++){//permet de tester toute la colonne
               
               if (Cellules[i][j]==Joueur1.lireCouleur()){// test pour savoir si la couleur qu'on test
                   //correspond à la couleur du joueur
                   jetonsAlignesCo=jetonsAlignesCo+1;// si la couleur est la même on ajoute un au compteur
                   // ce qui signifie q'un jeton est aligné et ainsi de suite
               }else {
                   jetonsAlignesCo=0;// si on ne truove pas de jeton de la bonne couleur ou pas de jeton du tout
                   //on annule le compte qui reprend à 0
               }
            if (jetonsAlignesCo==4){
                return true;// si les 4 jetons sont alignés ont renvoies vrai
                
            }
               
           }
       }
       
       for (int i=0;i<7;i++){// même chose que précédemment sauf qu'on inverse les boucles for pour tester d'abord les lignes avant les colonnes
            int jetonsAlignesLi=0;
           for (int j=0;j<6;j++){
               if (Cellules[j][i]!=Joueur1.lireCouleur()){
                   jetonsAlignesLi+=1;
               } else {
                   jetonsAlignesLi=0;
               }
               
           }
           
           if (jetonsAlignesLi==4){
               return true;
           }
       }
       
       for (int i=0;i<6;){
           int jetonsAlignesDi=0;
       
           for (int j=0;j<7;j++){
               if (Cellules[i][j]==Joueur1.lireCouleur()){ //&& Cellules[i+1][j+1]==Joueur1.lireCouleur() && Cellules[i+2][j+2]==Joueur1.lireCouleur() && Cellules[i+3][j+3]==Joueur1.lireCouleur()){
                   // on test si la couleur du jeton correspond à celle du joueur
                   jetonsAlignesDi+=1;// si oui on indente le compteur de jetons en diagonales
                   i++;// on augemnte en même temps i et j pour se déplacer en diagonale
               } else {
                   jetonsAlignesDi=0;// sinon on le remet à 0 pour recommencer
               }
               
               if (jetonsAlignesDi==4){
                   return true; 
                        
                        // si 4 jetons de même couleur sont alignés on retourne vrai
               }
            }
           
       }
       return false;
       
    }
       
   
   
   public void tasserGrille(Jetons jetonCourant ){
       for (int i=0;i<6;i++){
           for (int j=0;j<7;j++){
               if (jetonCourant.suprimerJeton(i,j)==true || jetonCourant.recupererJeton()==true){
                   
               }
           }
       }
   }
   
   public boolean colonneRemplie(){
       
           
       
           for (int i=0;i<7;i++){// parcourt les colonnes
            if (Cellules[6][i]!=null){// si la derniére case de chaque colonne possède un jeton
                return true;
            }
            
           }
           return false;//aucune colonne remplie
        }
    
   
   public boolean placerTrouNoir(int coLigne, int coColonne){
       if (Cellules[coLigne][coColonne].presenceTrouNoir()==false){//on regarde si la ne contient pas déjà un trouNoir
        Cellules[coLigne][coColonne].placerTrouNoir();// si non on y place un trouNoir
        return true;// vrai si tout s'est bien passé
       } 
        return false;// faux s'il y avait déja un trou noir
   }
   
   public boolean placerDesintegrateur(int corLigne, int corColonne){
       if (Cellules[corLigne][corColonne].presenceDesintegrateur()==false){// la cellule ne contient elle pas déjà un desintegrateur ?
        Cellules[corLigne][corColonne].placerDesintegrateur();//si non on en ajoute un 
        return true;// tout s'est bien passé
       }
       return false;// si il y en a déjà un
   }
   
   
   public boolean suuprimerJeton(int coordLigne, int coordColonne){
       if (Cellules[coordLigne][coordColonne]!=null){// regarde si la cellule de coordonnées données est remplie
       Cellules[coordLigne][coordColonne]=null;// si uoi on la vide
       return true;// et on indique que cela s'est bien passé avec vrai
       }
           return false;// sinon, la cellule est vide donc on ne peut rien suppiremer, on indique alors false
       }
   
   public void recupérerJeton(int coordoLigne, int coordoColonne){
       if (Cellules[coordoLigne][coordoColonne]!=null){//on regarde si la cellule ne quesetion est pleine
           String a=Cellules[coordoLigne][coordoColonne];// si oui alors on renvoie une referecne vers le jeton de la cellule
           Cellules[coordoLigne][coordoColonne]=null;// on vide alors la cellule
           
       }
       
       
   }
}
       

