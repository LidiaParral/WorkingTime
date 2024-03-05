/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.model;

import workingtime.utilities.ExportExcel;
import javax.swing.JTable;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class ExportExcelTest {
    
    public ExportExcelTest() {
    }

    /**
     * Test of exportExcel method, of class ExportExcel.
     */
    @Test
    public void testExportExcel() throws Exception {
        System.out.println("exportExcel");
        JTable t = null;
        ExportExcel instance = new ExportExcel();
        instance.exportExcel(t);
    }
    
}
