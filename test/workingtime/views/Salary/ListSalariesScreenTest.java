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
     * Test of searchNomina method, of class ListSalariesScreen.
     */
    @Test
    public void testSearchNomina() {
        System.out.println("searchNomina");
        ListSalariesScreen instance = new ListSalariesScreen();
        instance.searchNomina();
    }

    /**
     * Test of updateNomina method, of class ListSalariesScreen.
     */
    @Test
    public void testUpdateNomina() {
        System.out.println("updateNomina");
        ListSalariesScreen instance = new ListSalariesScreen();
        instance.updateNomina();
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
    
}
