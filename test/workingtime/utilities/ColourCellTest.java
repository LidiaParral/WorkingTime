/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.utilities;

import java.awt.Component;
import javax.swing.table.TableCellRenderer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class ColourCellTest {
    
    public ColourCellTest() {
    }

    /**
     * Test of prepareRenderer method, of class ColourCell.
     */
    @Test
    public void testPrepareRenderer() {
        System.out.println("prepareRenderer");
        TableCellRenderer renderer = null;
        int row = 0;
        int column = 0;
        ColourCell instance = new ColourCell();
        Component expResult = null;
        Component result = instance.prepareRenderer(renderer, row, column);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
