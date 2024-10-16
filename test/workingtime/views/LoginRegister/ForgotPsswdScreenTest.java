/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.views.LoginRegister;

import workingtime.views.Login.ForgotPsswdScreen;
import java.awt.Image;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class ForgotPsswdScreenTest {
    
    public ForgotPsswdScreenTest() {
    }

    /**
     * Test of consult method, of class ForgotPsswdScreen.
     */
    @Test
    public void testConsult() {
        System.out.println("consult");
        ForgotPsswdScreen instance = new ForgotPsswdScreen();
        instance.consult();
    }

    /**
     * Test of changePassword method, of class ForgotPsswdScreen.
     */
    @Test
    public void testChangePassword() {
        System.out.println("changePassword");
        ForgotPsswdScreen instance = new ForgotPsswdScreen();
        instance.changePassword();
    }

    /**
     * Test of getIconImage method, of class ForgotPsswdScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        ForgotPsswdScreen instance = new ForgotPsswdScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class ForgotPsswdScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ForgotPsswdScreen.main(args);
    }
    
}
