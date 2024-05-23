/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.views.Salary;

import java.awt.Image;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class AddSalaryScreenTest {
    
    public AddSalaryScreenTest() {
    }

    /**
     * Test of addSalary method, of class AddSalaryScreen.
     */
    @Test
    public void testAddSalary() {
        System.out.println("addSalary");
        AddSalaryScreen instance = new AddSalaryScreen();
        instance.addSalary();
    }

    /**
     * Test of daysWorkingMonth method, of class AddSalaryScreen.
     */
    @Test
    public void testDaysWorkingMonth() {
        System.out.println("daysWorkingMonth");
        AddSalaryScreen instance = new AddSalaryScreen();
        int expResult = 0;
        int result = instance.daysWorkingMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of searchPayroll method, of class AddSalaryScreen.
     */
    @Test
    public void testSearchNomina() {
        System.out.println("searchNomina");
        AddSalaryScreen instance = new AddSalaryScreen();
        instance.searchPayroll();
    }

    /**
     * Test of calculateTotalLiquid method, of class AddSalaryScreen.
     */
    @Test
    public void testCalculateLiquidoTotal() {
        System.out.println("calculateLiquidoTotal");
        AddSalaryScreen instance = new AddSalaryScreen();
        int expResult = 0;
        int result = instance.calculateTotalLiquid();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIconImage method, of class AddSalaryScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        AddSalaryScreen instance = new AddSalaryScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class AddSalaryScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AddSalaryScreen.main(args);
    }
    
}
