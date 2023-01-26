/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.tp_note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bryan & rafael
 */
public class Manche {
    
    private String codeur;
    private String decodeur;
    private Ligne code;
    private List<String> jeu;
    private static int TOURMAX = 12;
    
    public Manche(String codeur, String decodeur){
        this.codeur = codeur;
        this.decodeur = decodeur;
        this.code = new Ligne();
        this.jeu = new ArrayList<>();
    }
    
    public void init(Scanner scan){
        boolean valide = false;
        while (!valide){
            System.out.println(codeur + ", à vous de choisir un code.");
            String str = scan.nextLine();
            List<String> liste= new ArrayList<String>(Arrays.asList(str.split("")));
            valide = code.verifLigneJeu(liste);
            if (valide){
                code.setLigneJeu(liste);
            }
        }
    }
    
    private void afficheJeu(List<String> jeu){
        for (int i=0 ; i<12 ; i++){
            if (i<jeu.size()){
                System.out.println(jeu.get(i));
            }
            else {
                System.out.println("----");
            }
        }
    }
    
    public int Jeu(){
        Scanner scan = new Scanner(System.in);
        init(scan);
        int tour = 0;
        boolean finJeu = false;
        String str = "";
        while(tour<TOURMAX && !finJeu){
            Ligne ligne = new Ligne();
            int[] resultat;
            boolean valide = false;
            while (!valide){
                System.out.println("Essai " + (tour+1) );
                str = scan.nextLine();
                List<String> liste= new ArrayList<String>(Arrays.asList(str.split("")));
                valide = ligne.verifLigneJeu(liste);
                if (valide){
                    ligne.setLigneJeu(liste);
                }
            }
            resultat = this.code.compareListsAndCount(ligne);
            String affiche;
            affiche = str + "  " + "Bien placé : " + resultat[0] + " ; " + "Bonne couleur : " + resultat[1];
            this.jeu.add(affiche);
            
            // vérification de fin de jeu
            if (resultat[0] == 4){
                finJeu = true;
                return tour;
            }
            
            tour++;
            
        }
        return 12;
    } 
    
}
