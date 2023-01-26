package org.centrale.tp_note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ligne {

    private List<String> LIGNE_JEU;
    private List<String> validElements = Arrays.asList("Y", "N", "R", "G", "W", "B");


    private void LigneJeu(){

        List<String> ligne=new ArrayList<String>(List.of(new String[]{" ", " ", " ", " "}));
    }

    public boolean VerifLigneJeu(List<String> list) {
        if (list.size() != 4) {
            System.out.println("Error: List must contain exactly 4 elements.");
            return false;
        }
        for (String element : list) {
            if (!(validElements.contains(element))) {
                System.out.println("Error: List elements must be B, G, N, R, W, Y.");
                return false;
            }
        }
        System.out.println("List is valid.");
        return true;
    }







}
