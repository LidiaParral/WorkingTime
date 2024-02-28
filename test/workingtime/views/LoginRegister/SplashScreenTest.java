/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.views.LoginRegister;

import workingtime.views.LoginForgotPsswd.SplashScreen;
import java.awt.Image;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class SplashScreenTest {
    
    public SplashScreenTest() {
    }

    /**
     * Test of getIconImage method, of class SplashScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        SplashScreen instance = new SplashScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class SplashScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SplashScreen.main(args);
    }
    
}
