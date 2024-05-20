/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.views.Document;

import java.awt.Image;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class AllDocumentsScreenTest {
    
    public AllDocumentsScreenTest() {
    }

    /**
     * Test of existDoc method, of class AllDocumentsScreen.
     */
    @Test
    public void testExistDoc() {
        System.out.println("existDoc");
        AllDocumentsScreen instance = new AllDocumentsScreen();
        instance.existDoc();
    }

    /**
     * Test of consult method, of class AllDocumentsScreen.
     */
    @Test
    public void testConsult() {
        System.out.println("consult");
        AllDocumentsScreen instance = new AllDocumentsScreen();
        instance.consult();
    }

    /**
     * Test of updateDocument method, of class AllDocumentsScreen.
     */
    @Test
    public void testUpdateDocument() {
        System.out.println("updateDocument");
        AllDocumentsScreen instance = new AllDocumentsScreen();
        instance.updateDocument();
    }

    /**
     * Test of deleteDocument method, of class AllDocumentsScreen.
     */
    @Test
    public void testDeleteDocument() {
        System.out.println("deleteDocument");
        AllDocumentsScreen instance = new AllDocumentsScreen();
        instance.deleteDocument();
    }

    /**
     * Test of getIconImage method, of class AllDocumentsScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        AllDocumentsScreen instance = new AllDocumentsScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class AllDocumentsScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AllDocumentsScreen.main(args);
    }

    /**
     * Test of downloadFile method, of class AllDocumentsScreen.
     */
    @Test
    public void testDownloadFile() throws Exception {
        System.out.println("downloadFile");
        AllDocumentsScreen instance = new AllDocumentsScreen();
        instance.downloadFile();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExtension method, of class AllDocumentsScreen.
     */
    @Test
    public void testGetExtension() {
        System.out.println("getExtension");
        String filename = "";
        String expResult = "";
        String result = AllDocumentsScreen.getExtension(filename);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
