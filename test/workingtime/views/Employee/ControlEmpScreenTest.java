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
public class ControlEmpScreenTest {
    
    public ControlEmpScreenTest() {
    }

    /**
     * Test of addEmployee method, of class ControlEmpScreen.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        ControlEmpScreen instance = new ControlEmpScreen();
        instance.addEmployee();
    }

    /**
     * Test of cleanData method, of class ControlEmpScreen.
     */
    @Test
    public void testCleanData() {
        System.out.println("cleanData");
        ControlEmpScreen instance = new ControlEmpScreen();
        instance.cleanData();
    }

    /**
     * Test of getAdultsAge method, of class ControlEmpScreen.
     */
    @Test
    public void testGetAdultsAge() {
        System.out.println("getAdultsAge");
        ControlEmpScreen instance = new ControlEmpScreen();
        int expResult = 0;
        int result = instance.getAdultsAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of saveCredentials method, of class ControlEmpScreen.
     */
    @Test
    public void testSaveCredentials() {
        System.out.println("saveCredentials");
        ControlEmpScreen instance = new ControlEmpScreen();
        instance.saveCredentials();
    }

    /**
     * Test of getEmpJob method, of class ControlEmpScreen.
     */
    @Test
    public void testGetEmpJob() {
        System.out.println("getEmpJob");
        ControlEmpScreen instance = new ControlEmpScreen();
        instance.getEmpJob();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpCapital method, of class ControlEmpScreen.
     */
    @Test
    public void testGetEmpCapital() {
        System.out.println("getEmpCapital");
        ControlEmpScreen instance = new ControlEmpScreen();
        instance.getEmpCapital();
    }

    /**
     * Test of getCountry method, of class ControlEmpScreen.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        ControlEmpScreen instance = new ControlEmpScreen();
        instance.getCountry();
    }

    /**
     * Test of generateRandomPassword method, of class ControlEmpScreen.
     */
    @Test
    public void testGenerateRandomPassword() {
        System.out.println("generateRandomPassword");
        int len = 0;
        int randNumOrigin = 0;
        int randNumBound = 0;
        String expResult = "";
        String result = ControlEmpScreen.generateRandomPassword(len, randNumOrigin, randNumBound);
        assertEquals(expResult, result);
    }

    /**
     * Test of groupProfesional method, of class ControlEmpScreen.
     */
    @Test
    public void testGroupProfesional() {
        System.out.println("groupProfesional");
        ControlEmpScreen instance = new ControlEmpScreen();
        instance.groupProfesional();
    }

    /**
     * Test of getIconImage method, of class ControlEmpScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        ControlEmpScreen instance = new ControlEmpScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class ControlEmpScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ControlEmpScreen.main(args);
    }
    
}
