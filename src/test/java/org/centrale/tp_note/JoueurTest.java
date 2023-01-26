package org.centrale.tp_note;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JoueurTest {

    @Test
    public void testConstructor() {
        Joueur player = new Joueur("John");
        assertEquals("John", player.getNom());
        assertEquals(0, player.getPoints());
    }

    @Test
    public void testSetPoints() {
        Joueur player = new Joueur("John");
        player.setPoints(5);
        assertEquals(5, player.getPoints());
    }

    @Test
    public void testSetNom() {
        Joueur player = new Joueur("John");
        player.setNom("Jane");
        assertEquals("Jane", player.getNom());
    }

    @Test
    public void testAjoutPoint() {
        Joueur player = new Joueur("John");
        player.ajoutPoint(5);
        assertEquals(5, player.getPoints());
    }
}
