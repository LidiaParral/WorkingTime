/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.views.Time;

import com.toedter.calendar.JCalendar;
import java.awt.Image;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class AbsencesScreenTest {
    
    public AbsencesScreenTest() {
    }

    /**
     * Test of saveAbsence method, of class AbsencesScreen.
     */
    @Test
    public void testSaveAbsence() {
        System.out.println("saveAbsence");
        AbsencesScreen instance = new AbsencesScreen();
        instance.saveAbsence();
    }

    /**
     * Test of cleanData method, of class AbsencesScreen.
     */
    @Test
    public void testCleanData() {
        System.out.println("cleanData");
        AbsencesScreen instance = new AbsencesScreen();
        instance.cleanData();
    }

    /**
     * Test of updateAbsence method, of class AbsencesScreen.
     */
    @Test
    public void testUpdateAbsence() {
        System.out.println("updateAbsence");
        AbsencesScreen instance = new AbsencesScreen();
        instance.updateAbsence();
    }

    /**
     * Test of deleteAbsence method, of class AbsencesScreen.
     */
    @Test
    public void testDeleteAbsence() {
        System.out.println("deleteAbsence");
        AbsencesScreen instance = new AbsencesScreen();
        instance.deleteAbsence();
    }

    /**
     * Test of consult method, of class AbsencesScreen.
     */
    @Test
    public void testConsult() {
        System.out.println("consult");
        AbsencesScreen instance = new AbsencesScreen();
        instance.consult();
    }

    /**
     * Test of existDate method, of class AbsencesScreen.
     */
    @Test
    public void testExistDate() {
        System.out.println("existDate");
        AbsencesScreen instance = new AbsencesScreen();
        instance.existDate();
    }

    /**
     * Test of getDay method, of class AbsencesScreen.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        JCalendar day = null;
        AbsencesScreen instance = new AbsencesScreen();
        instance.getDay(day);
    }

    /**
     * Test of typeRequest method, of class AbsencesScreen.
     */
    @Test
    public void testTypeRequest() {
        System.out.println("typeRequest");
        AbsencesScreen instance = new AbsencesScreen();
        instance.typeRequest();
    }

    /**
     * Test of getIconImage method, of class AbsencesScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        AbsencesScreen instance = new AbsencesScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class AbsencesScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AbsencesScreen.main(args);
    }
    
}
