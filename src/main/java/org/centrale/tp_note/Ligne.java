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

public class Ligne {

    private List<String> ligneJeu;
    private static final List<String> VALIDELEMENTS = Arrays.asList("Y", "N", "R", "G", "W", "B");


    /**
     * This constructor creates a line of the game with four spaces
     */
    public Ligne(){
        this.ligneJeu = new ArrayList<String>();
    }

    /**
     * This constructor takes a list of strings as an argument and verifies that it contains exactly four elements and that they are valid elements.
     * @param list The list of elements to be verified and set as the line of the game
     */
    public Ligne(List<String> list){
        if (verifLigneJeu(list)) {
            this.ligneJeu = list;
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
            if (!(VALIDELEMENTS.contains(element))) {
                System.out.println("Error: List elements must be B, G, N, R, W, Y.");
                return false;
            }
        }
        return true;
    }

    /**
     * This method compares two lists and verifies if the elements are the same and in also verifies if the position is the same
     * @param list1 The first list to be compared
     * @return An int array with two elements, the first element represents the number of elements that are in the same position and the second element represents the number of elements that are in the same value but not the same position
     */
    public int[] compareListsAndCount(Ligne list1) {
        if (list1.getLigneJeu().size() != this.ligneJeu.size()) {
            return new int[] {0,0};
        }
        int samePosition = 0;
        int sameValue = 0;
        for (int i = 0; i < 4; i++) {
            if (list1.getLigneJeu().get(i).equals(this.getLigneJeu().get(i))) {
                samePosition++;
            } else if (this.getLigneJeu().contains(list1.getLigneJeu().get(i))) {
                sameValue++;
            }
        }
        return new int[] {samePosition, sameValue};
    }



    /**
     * This method returns the line of the game.
     * @return line of the game.
     */
    public List<String> getLigneJeu() {
        return ligneJeu;
    }

    public void setLigneJeu(List<String> ligneJeu) {
        this.ligneJeu = ligneJeu;
    }


    /**
     * This method returns the valid elements that can be used in the line of the game.
     * @return valid elements that can be used in the line of the game.
     */
    public List<String> getVALIDELEMENTS() {
        return VALIDELEMENTS;
    }
}
