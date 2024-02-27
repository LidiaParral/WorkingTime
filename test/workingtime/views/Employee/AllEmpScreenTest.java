/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.views.Employee;

import java.awt.Image;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class AllEmpScreenTest {
    
    public AllEmpScreenTest() {
    }

    /**
     * Test of consult method, of class AllEmpScreen.
     */
    @Test
    public void testConsult() {
        System.out.println("consult");
        AllEmpScreen instance = new AllEmpScreen();
        instance.consult();
    }

    /**
     * Test of updateEmp method, of class AllEmpScreen.
     */
    @Test
    public void testUpdateEmp() {
        System.out.println("updateEmp");
        AllEmpScreen instance = new AllEmpScreen();
        instance.updateEmp();
    }

    /**
     * Test of deleteEmp method, of class AllEmpScreen.
     */
    @Test
    public void testDeleteEmp() {
        System.out.println("deleteEmp");
        AllEmpScreen instance = new AllEmpScreen();
        instance.deleteEmp();
    }

    /**
     * Test of searchEmp method, of class AllEmpScreen.
     */
    @Test
    public void testSearchEmp() {
        System.out.println("searchEmp");
        AllEmpScreen instance = new AllEmpScreen();
        instance.searchEmp();
    }

    /**
     * Test of getIconImage method, of class AllEmpScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        AllEmpScreen instance = new AllEmpScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class AllEmpScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AllEmpScreen.main(args);
    }
    
}
