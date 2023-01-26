package org.centrale.tp_note;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PartieTest {

    @Test
    public void testJeu() {
        Partie game = new Partie();
        boolean result = game.jeu();
        assertTrue(result);
    }

}
