/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author apetit
 */
public class Partie {
    String listeJoueur []= new String[2];// tableau de 2 lignes
    Joueur joueurCourant;// attributs
    Grille laGrille=new Grille();// initialisation de la grille
    Scanner sc = new Scanner(System.in);// crétion de l 'objet de la classe scanner
    
    public Joueur attribuerCouleursAuxJoueurs() {
            
            System.out.println("Veuillez choisir votre couleur : Rouge ou Noir");
            String CouleurJoueur1= sc.next();// stock la couleur rentré par le joueur dans la variable CouleurJoueur1
            
            if (CouleurJoueur1=="Rouge") {
                System.out.println("Le joueur 1 est de la couleur Rouge"+"\n"+"Le joueur 2 est de la couleur Noir");
            } else if (CouleurJoueur1=="Noir"){
                System.out.println("Le joueur 1 est de la couleur Noir"+"\n"+"Le joueur 2 est de la couleur Rouge");
            } 
        return null;    
    }
            
    
    public void initialiserPartie(){
            laGrille.viderGrille();// vide la grille
            for (int i=0;i<=5;i++){// place les 5 trous noirs
                Random coordo1 = new Random();// coordonnees aux hasards pour placer les Trous noirs
                Random coordo2 = new Random();
                laGrille.placerTrouNoir(coordo1,coordo2);// les place sur la grille
            }
            for (int j=0;j<=3;j++){// place les 3 desintegrateurs 
                Random coordon1 = new Random();// au hasard
                Random coordon2 = new Random();
                laGrille.placerDesintegrateur(coordon1,coordon2);// sur la grille
            }
            for (int e=0;e<=1;e++){// place 2 desintegrateurs aux mêmes endroits que deux trous noirs
            laGrille.Cellules[coordo1][coordo2].placerDesintegrateur();
            }
            listeJoueur[0].ajouterJeton(listeJoueur[0].lireCouleur());// ajoute les  jetons de la bonne couleur au joueur 1
            listeJoueur[1].ajouterJeton(listeJoueur[1].lireCouleur());// ajoute les  jetons de la bonne couleur au joueur 2
            
            
            }
        
        
        
            public void debuterPartie(){
                System.out.println("Voulez vous jouer ? : "+"\n"+"Oui"+"\n"+"Non");
                String reponseJoueur = sc.next();
                
                if (reponseJoueur=="Oui"){
                    Grille laGrille= new Grille();// on initialie la grille
                    while (etreGagnantePourJoueur()!=true && etreRemplie()!=true) {// on fait une boule while qui lance lma partie tant que celle ci n'est pas terminer, c'est à dire que la grille n'est pas remplie 
                    // ou bien qu'un joueur n'a pas gagné
                        for (int i =0;i>=0;i++) {// on fait une boucle corresondant aux nombres de coup qui est varaible
                            System.out.println("Au joueur 1 de jouer : veuillez choisir la colonne dans laquelle déposer votre jeton :");
                            int colonne1 = sc.nextInt();// permet au jouuer de rentrer la colonne dans laquelle jouer
                            ajouterJetonDansColonne(joueurCourant.lireCouleur(),colonne1);// place l jeton dans la bonne colonne
                            System.out.println("Au joueur 2 de jouer : veuillez choisir la colonne dans laquelle déposer votre jeton :");
                            int colonne2 = sc.nextInt();// de même pour le joueur 2 
                            ajouterJetonDansColonne(joueurCourant.lireCouleur(),colonne2);
                        
                        }  
                    }
                } else {
                    System.out.println("Merci d'avoir jouer, à bientot j'espère pour de nouvelles aventures");
                }
                
            }
    }
        
    

