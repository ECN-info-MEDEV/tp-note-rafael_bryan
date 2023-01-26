/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.tp_note;

import java.util.Scanner;

/**
 *
 * @author bryan & rafael
 */
public class Partie {
    
    private int tour;
    private Joueur j1;
    private Joueur j2;
    
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
    
    public boolean jeu(){
        return true;
    }
}
