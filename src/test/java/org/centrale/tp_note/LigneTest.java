package org.centrale.tp_note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LigneTest {
    @Test
    public void testValidLine() {
        List<String> validLine = new ArrayList<>(Arrays.asList("Y", "N", "R", "G"));
        Ligne ligne = new Ligne();
        assertTrue(ligne.verifLigneJeu(validLine));
    }

    @Test
    public void testInvalidLine() {
        List<String> invalidLine = new ArrayList<>(Arrays.asList("Y", "N", "R", "X"));
        Ligne ligne = new Ligne();
        assertFalse(ligne.verifLigneJeu(invalidLine));
    }

    @Test
    public void testCompareListsAndCount() {
        Ligne ligne = new Ligne(new ArrayList<>(Arrays.asList("Y", "N", "G", "R")));
        List<String> validLine1 = new ArrayList<>(Arrays.asList("Y", "N", "R", "G"));
        Ligne ligne1 = new Ligne(validLine1);
        int[] expected = {2, 2};
        int[] actual = ligne.compareListsAndCount(ligne1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetLIGNE_JEU() {
        List<String> validLine = new ArrayList<>(Arrays.asList("Y", "N", "R", "G"));
        Ligne ligne = new Ligne(validLine);
        ligne.verifLigneJeu(validLine);
        assertEquals(validLine, ligne.getLigneJeu());
    }

    @Test
    public void testGetVALID_ELEMENTS() {
        Ligne ligne = new Ligne();
        List<String> expected = Arrays.asList("Y", "N", "R", "G", "W", "B");
        assertEquals(expected, ligne.getVALID_ELEMENTS());
    }
}
