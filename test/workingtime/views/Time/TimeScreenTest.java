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
public class TimeScreenTest {
    
    public TimeScreenTest() {
    }

    /**
     * Test of getTimeOfDay method, of class TimeScreen.
     */
    @Test
    public void testGetTimeOfDay() {
        System.out.println("getTimeOfDay");
        TimeScreen instance = new TimeScreen();
        int expResult = 0;
        int result = instance.getTimeOfDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimeOfReason method, of class TimeScreen.
     */
    @Test
    public void testGetTimeOfReason() {
        System.out.println("getTimeOfReason");
        TimeScreen instance = new TimeScreen();
        int expResult = 0;
        int result = instance.getTimeOfReason();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class TimeScreen.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        JCalendar day = null;
        TimeScreen instance = new TimeScreen();
        instance.getDay(day);
    }

    /**
     * Test of calculateHours method, of class TimeScreen.
     */
    @Test
    public void testCalculateHours() {
        System.out.println("calculateHours");
        TimeScreen instance = new TimeScreen();
        int expResult = 0;
        int result = instance.calculateHours();
        assertEquals(expResult, result);
    }

    /**
     * Test of saveTimeWorkingDay method, of class TimeScreen.
     */
    @Test
    public void testSaveTimeWorkingDay() {
        System.out.println("saveTimeWorkingDay");
        TimeScreen instance = new TimeScreen();
        instance.saveTimeWorkingDay();
    }

    /**
     * Test of cleanData method, of class TimeScreen.
     */
    @Test
    public void testCleanData() {
        System.out.println("cleanData");
        TimeScreen instance = new TimeScreen();
        instance.cleanData();
        fail("The test case is a prototype.");
    }

    /**
     * Test of existDate method, of class TimeScreen.
     */
    @Test
    public void testExistDate() {
        System.out.println("existDate");
        TimeScreen instance = new TimeScreen();
        instance.existDate();
    }

    /**
     * Test of otherReasons method, of class TimeScreen.
     */
    @Test
    public void testOtherReasons() {
        System.out.println("otherReasons");
        TimeScreen instance = new TimeScreen();
        instance.otherReasons();
    }

    /**
     * Test of getIconImage method, of class TimeScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        TimeScreen instance = new TimeScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class TimeScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TimeScreen.main(args);
    }
    
}
