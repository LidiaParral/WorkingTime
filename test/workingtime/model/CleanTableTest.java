/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.model;

import javax.swing.table.DefaultTableModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class CleanTableTest {
    
    public CleanTableTest() {
    }

    /**
     * Test of tableCleaning method, of class CleanTable.
     */
    @Test
    public void testTableCleaning() {
        System.out.println("tableCleaning");
        DefaultTableModel model = null;
        CleanTable instance = new CleanTable();
        instance.tableCleaning(model);
        fail("The test case is a prototype.");
    }
    
}
