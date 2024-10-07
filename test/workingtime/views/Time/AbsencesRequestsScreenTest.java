/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.views.Time;

import java.awt.Image;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class AbsencesRequestsScreenTest {
    
    public AbsencesRequestsScreenTest() {
    }

    /**
     * Test of approvedAbsence method, of class AbsencesRequestsScreen.
     */
    @Test
    public void testApprovedAbsence() {
        System.out.println("approvedAbsence");
        AbsencesRequestsScreen instance = new AbsencesRequestsScreen();
        instance.approvedAbsence();
        fail("The test case is a prototype.");
    }

    /**
     * Test of rejectedAbsence method, of class AbsencesRequestsScreen.
     */
    @Test
    public void testRejectedAbsence() {
        System.out.println("rejectedAbsence");
        AbsencesRequestsScreen instance = new AbsencesRequestsScreen();
        instance.rejectedAbsence();
        fail("The test case is a prototype.");
    }

    /**
     * Test of cleanData method, of class AbsencesRequestsScreen.
     */
    @Test
    public void testCleanData() {
        System.out.println("cleanData");
        AbsencesRequestsScreen instance = new AbsencesRequestsScreen();
        instance.cleanData();
        fail("The test case is a prototype.");
    }

    /**
     * Test of consult method, of class AbsencesRequestsScreen.
     */
    @Test
    public void testConsult() {
        System.out.println("consult");
        AbsencesRequestsScreen instance = new AbsencesRequestsScreen();
        instance.consult();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIconImage method, of class AbsencesRequestsScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        AbsencesRequestsScreen instance = new AbsencesRequestsScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AbsencesRequestsScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AbsencesRequestsScreen.main(args);
        fail("The test case is a prototype.");
    }
    
}
