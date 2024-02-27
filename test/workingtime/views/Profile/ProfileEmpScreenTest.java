/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.views.Profile;

import java.awt.Image;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class ProfileEmpScreenTest {
    
    public ProfileEmpScreenTest() {
    }

    /**
     * Test of consult method, of class ProfileEmpScreen.
     */
    @Test
    public void testConsult() {
        System.out.println("consult");
        ProfileEmpScreen instance = new ProfileEmpScreen();
        instance.consult();
    }

    /**
     * Test of updateProfile method, of class ProfileEmpScreen.
     */
    @Test
    public void testUpdateProfile() {
        System.out.println("updateProfile");
        ProfileEmpScreen instance = new ProfileEmpScreen();
        instance.updateProfile();
    }

    /**
     * Test of getIconImage method, of class ProfileEmpScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        ProfileEmpScreen instance = new ProfileEmpScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class ProfileEmpScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ProfileEmpScreen.main(args);
    }
    
}
