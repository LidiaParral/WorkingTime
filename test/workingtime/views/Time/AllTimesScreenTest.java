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
public class AllTimesScreenTest {
    
    public AllTimesScreenTest() {
    }

    /**
     * Test of existWorkingDay method, of class AllTimesScreen.
     */
    @Test
    public void testExistWorkingDay() throws ClassNotFoundException {
        System.out.println("existWorkingDay");
        AllTimesScreen instance = new AllTimesScreen();
        instance.existWorkingDay();
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteWorkingDay method, of class AllTimesScreen.
     */
    @Test
    public void testDeleteWorkingDay() throws ClassNotFoundException {
        System.out.println("deleteWorkingDay");
        AllTimesScreen instance = new AllTimesScreen();
        instance.deleteWorkingDay();
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorkingDay method, of class AllTimesScreen.
     */
    @Test
    public void testUpdateWorkingDay() throws ClassNotFoundException {
        System.out.println("updateWorkingDay");
        AllTimesScreen instance = new AllTimesScreen();
        instance.updateWorkingDay();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIconImage method, of class AllTimesScreen.
     */
    @Test
    public void testGetIconImage() throws ClassNotFoundException {
        System.out.println("getIconImage");
        AllTimesScreen instance = new AllTimesScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AllTimesScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AllTimesScreen.main(args);
        fail("The test case is a prototype.");
    }
    
}
