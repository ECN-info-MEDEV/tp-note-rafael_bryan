/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.tp_note;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bryan
 */
public class TP_noteTest {
    
    public TP_noteTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class TP_note.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TP_note.main(args);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,1);
    }
    
}
