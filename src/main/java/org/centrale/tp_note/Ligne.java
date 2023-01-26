/**

 This class represents a line of the game, consisting of a list of strings that represent the elements of the line.
 There are two constructors, one that creates an empty line with four spaces and another that takes a list of strings
 as an argument and verifies that it contains exactly four elements and that they are valid elements.
 The class also includes a method to verify the line of the game, a getter and a setter for the line of the game, and a
 getter for the valid elements.
 @author Bryan & Rafael
 @version 1.0
 @since 26.01.2023
 */
package org.centrale.tp_note;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ligne {private List<String> LIGNE_JEU;
    private static final List<String> validElements = Arrays.asList("Y", "N", "R", "G", "W", "B");


    /**
     * This constructor creates a line of the game with four spaces
     */
    private void ligneJeu(){
        List<String> ligne=new ArrayList<String>(List.of(new String[]{" ", " ", " ", " "}));
    }

    /**
     * This constructor takes a list of strings as an argument and verifies that it contains exactly four elements and that they are valid elements.
     * @param list The list of elements to be verified and set as the line of the game
     */
    private void ligneJeu(List<String> list){
        if (verifLigneJeu(list)) {
            this.LIGNE_JEU = list;
        } else {
            System.out.println("row not created");
            verifLigneJeu(list);
        }

    }

    /**
     * This method verifies that the given list contains exactly four elements and that they are valid elements.
     * @param list The list of elements to be verified
     * @return true if the list is valid, false otherwise
     */
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


    /**
     * This method returns the line of the game.
     * @return line of the game.
     */
    public List<String> getLIGNE_JEU() {
        return LIGNE_JEU;
    }

    /**
     * This method sets the line of the game.
     * @param LIGNE_JEU the line of the game to set
     */
    public void setLIGNE_JEU(List<String> LIGNE_JEU) {
        this.LIGNE_JEU = LIGNE_JEU;
    }

    /**
     * This method returns the valid elements that can be used in the line of the game.
     * @return valid elements that can be used in the line of the game.
     */
    public List<String> getValidElements() {
        return validElements;
    }
}
