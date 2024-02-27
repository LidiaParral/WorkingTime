/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.views.LoginRegister;

import java.awt.Image;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class LoginScreenTest {
    
    public LoginScreenTest() {
    }

    /**
     * Test of existEmployee method, of class LoginScreen.
     */
    @Test
    public void testExistEmployee() throws Exception {
        System.out.println("existEmployee");
        LoginScreen instance = new LoginScreen();
        instance.existEmployee();
    }

    /**
     * Test of getIconImage method, of class LoginScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        LoginScreen instance = new LoginScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class LoginScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LoginScreen.main(args);
    }
    
}
