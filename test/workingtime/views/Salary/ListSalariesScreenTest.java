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
public class ListSalariesScreenTest {
    
    public ListSalariesScreenTest() {
    }

    /**
     * Test of existSalary method, of class ListSalariesScreen.
     */
    @Test
    public void testExistSalary() {
        System.out.println("existSalary");
        ListSalariesScreen instance = new ListSalariesScreen();
        instance.existSalary();
    }

    /**
     * Test of searchPayroll method, of class ListSalariesScreen.
     */
    @Test
    public void testSearchNomina() {
        System.out.println("searchNomina");
        ListSalariesScreen instance = new ListSalariesScreen();
        instance.searchPayroll();
    }

    /**
     * Test of deleteSalary method, of class ListSalariesScreen.
     */
    @Test
    public void testUpdateNomina() {
        System.out.println("updateNomina");
        ListSalariesScreen instance = new ListSalariesScreen();
        instance.deleteSalary();
    }

    /**
     * Test of getIconImage method, of class ListSalariesScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        ListSalariesScreen instance = new ListSalariesScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class ListSalariesScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ListSalariesScreen.main(args);
    }

    /**
     * Test of deleteSalary method, of class ListSalariesScreen.
     */
    @Test
    public void testDeleteSalary() {
        System.out.println("deleteSalary");
        ListSalariesScreen instance = new ListSalariesScreen();
        instance.deleteSalary();
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchPayroll method, of class ListSalariesScreen.
     */
    @Test
    public void testSearchPayroll() {
        System.out.println("searchPayroll");
        ListSalariesScreen instance = new ListSalariesScreen();
        instance.searchPayroll();
        fail("The test case is a prototype.");
    }
    
}
