package org.centrale.tp_note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ligne {

    private List<String> LIGNE_JEU;
    private static final List<String> validElements = Arrays.asList("Y", "N", "R", "G", "W", "B");


    private void ligneJeu(){
        List<String> ligne=new ArrayList<String>(List.of(new String[]{" ", " ", " ", " "}));
    }

    private void ligneJeu(List<String> list){
        if (verifLigneJeu(list)) {
            this.LIGNE_JEU = list;
        } else {
            System.out.println("row not created");
            verifLigneJeu(list);
        }

    }

    public boolean verifLigneJeu(List<String> list) {
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


    public List<String> getLIGNE_JEU() {
        return LIGNE_JEU;
    }

    public void setLIGNE_JEU(List<String> LIGNE_JEU) {
        this.LIGNE_JEU = LIGNE_JEU;
    }

    public List<String> getValidElements() {
        return validElements;
    }
}
