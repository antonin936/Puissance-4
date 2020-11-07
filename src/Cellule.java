/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apetit
 */
public class Cellule {
    Jetons JetonCourant;//attributs  initialisées
    boolean TrouNoir;
    boolean desintegrateur;
    
    
    public Cellule(Jetons jeton1,boolean trounoir1,boolean desintegrateur1) {// constructeur nommée Cellule initalisant les attributs avec des valeurs par dfault
        JetonCourant = jeton1;
        TrouNoir = trounoir1;
        desintegrateur = desintegrateur1;
        
        }
    public boolean affecterJeton(Jetons unJeton){
        if (JetonCourant == null){// regarde si le joueur ne possède pas de jeton 
            JetonCourant = unJeton;// et ajoute le jeton en paramètre de la cellule
            return true;// retourne vrai si cela s'est bien passé
        }
        else{
            return false;// faux sinon
        }
    }   
    public String lireCouleurDuJeton() {
            return  JetonCourant.Couleur;//inique la couleur du jeton de la cellule
    }
            
    public Jetons recupérerJeton(){
       return JetonCourant;//renvoie une référence vers le jeton de la cellule
           
       }
    
    public boolean placerTrouNoir(){
       if (presenceTrouNoir()==false){ // regarde s'il n'y a pas déjà de TrouNoir
        TrouNoir=true;// si non il en ajoute un
        return true;// et indique que tout s'est bien passé
       } 
        return false;// retourne faux si il  y en a déjà un
   }
    public boolean placerDesintegrateur(){
       if (presenceDesintegrateur()==false){ // regarde s'il n'y a pas déjà de desintegrateur
        desintegrateur=true;// si non il en ajoute un
        return true;// et retourne vrai si tout s'est bien passé
       }
       return false;// faux s'il y en a déjà un
   }
    
    public boolean suprimerJeton(){
       if (JetonCourant!=null){// test s'il y a un jeton occupant la cellule
        JetonCourant=null;// le supprime s'il y en a un
        return true;// renvoie vrai si tout est ok
       }
           return false;// faux s'il n'y en avait pas
       }
   
   public boolean presenceTrouNoir(){
       if (TrouNoir==true){//regarde s'il y a un trou noir
           return true;// indique qu'il y en a un si c'est le cas
       }
       return false;// ou s'il y n'y en a pas
   }
   
   public boolean presenceDesintegrateur(){
       if (desintegrateur=true){//test s'il y a un desintegrateur
           return true;// indique qu'il y en a un
       }
       return false;// ou retourne faux s'il n'y en a pas
   }
   
   public boolean recupererDesintegrateur(){
       if (presenceDesintegrateur()==true){//regarde s'il y a un desintegrateur
           desintegrateur=false;// le supprime
           return true;// tout s'est bien passé
       }
       return false;// il n'y en avait pas
   }
   
   public boolean activerTrouNoir(){
       if (presenceTrouNoir()==true){//regarde s'il y a un TrouNoir
           suprimerJeton();// si oui le TrouNoir engloutit le jeton de la cellule 
           TrouNoir=false;// et le trou noir disparaît
           return true;// si tout s'est bien passé
       }
       return false;// s'il n'y avait pas de TrouNoir
   }
}
