/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.tp_note;
/**
 * The Joueur class represents a player in a game, with a name and a number of points.
 *
 * @author bryan & rafael
 */
public class Joueur {
    /**
     * The number of points the player has.
     */
    private int points;
    /**
     * The name of the player.
     */
    private String nom;

    /**
     * Constructs a new Joueur object with the given name and initializes their points to 0.
     * @param nom the name of the player
     */
    public Joueur(String nom){
        this.nom = nom;
        this.points = 0;
    }

    /**
     * Returns the player's current number of points.
     * @return the player's current number of points
     */
    public int getPoints() {
        return points;
    }

    /**
     * Returns the player's name.
     * @return the player's name
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the player's number of points.
     * @param points the new number of points for the player
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * Sets the player's name.
     * @param nom the new name for the player
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Adds a given number of points to the player's current points.
     * @param pts the number of points to add to the player's current points
     */
    public void ajoutPoint(int pts){
        this.points = this.points + pts;
    }
}
