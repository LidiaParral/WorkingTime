/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.utilities;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class ResetFieldsTest {
    
    public ResetFieldsTest() {
    }

    /**
     * Test of ResetPanel method, of class ResetFields.
     */
    @Test
    public void testResetPanel() {
        System.out.println("ResetPanel");
        JPanel panel = null;
        ResetFields instance = new ResetFields();
        instance.ResetPanel(panel);
        fail("The test case is a prototype.");
    }

    /**
     * Test of ResetFrame method, of class ResetFields.
     */
    @Test
    public void testResetFrame() {
        System.out.println("ResetFrame");
        JFrame frame = null;
        ResetFields instance = new ResetFields();
        instance.ResetFrame(frame);
        fail("The test case is a prototype.");
    }
    
}
