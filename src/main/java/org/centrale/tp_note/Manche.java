/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.tp_note;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bryan & rafael
 */
public class Manche {
    
    private String codeur;
    private String decodeur;
    private Ligne code;
    private List<Ligne> jeu;
    
    public Manche(String codeur, String decodeur){
        this.codeur = codeur;
        this.decodeur = decodeur;
        this.code = new Ligne();
        this.jeu = new ArrayList<>();
    }
    
}
