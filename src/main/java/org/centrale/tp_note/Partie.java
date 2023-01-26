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
     * The current turn of the game.
     */
    private int tour;
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
        this.tour = 0;
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
     * @return true if the game is still in progress, false otherwise
     */
    public boolean jeu(){
        return true;
    }
}
