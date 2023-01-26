/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.tp_note;

import java.util.Scanner;
/**
 * The Partie class represents a game between two players.
 *
 * @author bryan & rafael
 */
public class Partie {

    /**
     * The first player in the game.
     */
    private Joueur j1;
    /**
     * The second player in the game.
     */
    private Joueur j2;

    /**
     * Constructs a new Partie object, asking for the names of the two players and creating new Joueur objects for them.
     */
    public Partie(){
        System.out.println("Nom Joueur 1 :");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        this.j1 = new Joueur(str);
        System.out.println("Nom Joueur 2 :");
        str = scan.nextLine();
        this.j2 = new Joueur(str);
    }

    /**
     * Runs the game.
     *
     */
    public void jeu(){
        boolean enJeu = true;
        int score;
        Manche manche;
        while (enJeu){
            manche = new Manche(j1.getNom(),j2.getNom());
            score = manche.Jeu();
            j1.ajoutPoint(score);
            manche = new Manche(j2.getNom(),j1.getNom());
            score = manche.Jeu();
            j2.ajoutPoint(score);
            
            //affichage des scores
            System.out.println("Scores actuels");
            System.out.println(j1.getNom() + " a " + j1.getPoints() + " points.");
            System.out.println(j2.getNom() + " a " + j2.getPoints() + " points.");
            
            // Continuation du jeu
            boolean choisi = false;
            while (!choisi){
                System.out.println("Voulez-vous continuer ? (y/n)");
                Scanner scan = new Scanner(System.in);
                String str = scan.nextLine();
                if (str.equals("y")){
                    choisi = true;
                } else if (str.equals("n")){
                    choisi = true;
                    enJeu = false;
                }
            }
        }
        
        //affichage du résultat
        System.out.println("Résultat : ...");
        if (j1.getPoints()>j2.getPoints()){
            System.out.println(j1.getNom() + " a gagné !");
        } else if (j2.getPoints()>j1.getPoints()){
            System.out.println(j2.getNom() + " a gagné !");
        } else {
            System.out.println("Égalité !!");
        }
    }
}
