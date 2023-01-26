/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.tp_note;

/**
 *
 * @author bryan
 */
public class Joueur {
    
    private int points;
    private String nom;
    
    public Joueur(String nom){
        this.nom = nom;
        this.points = 0;
    }

    public int getPoints() {
        return points;
    }

    public String getNom() {
        return nom;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void ajoutPoint(int pts){
        this.points = this.points + pts;
    }
}
