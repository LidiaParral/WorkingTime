/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.views.Home;

import java.awt.Image;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class HomeScreenTest {
    
    public HomeScreenTest() {
    }

    /**
     * Test of getIconImage method, of class HomeScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        HomeScreen instance = new HomeScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class HomeScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HomeScreen.main(args);
    }
    
}
