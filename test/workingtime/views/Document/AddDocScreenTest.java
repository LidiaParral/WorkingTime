/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.views.Document;

import java.awt.Image;
import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class AddDocScreenTest {
    
    public AddDocScreenTest() {
    }

   
    /**
     * Test of typeDocuments method, of class AddDocScreen.
     */
    @Test
    public void testTypeDocuments() {
        System.out.println("typeDocuments");
        AddDocScreen instance = new AddDocScreen();
        instance.typeDocuments();
    }

    /**
     * Test of getIconImage method, of class AddDocScreen.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        AddDocScreen instance = new AddDocScreen();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class AddDocScreen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AddDocScreen.main(args);
    }

    /**
     * Test of saveDocument method, of class AddDocScreen.
     */
    @Test
    public void testSaveDocument_File() throws Exception {
        System.out.println("saveDocument");
        File fileSave = null;
        AddDocScreen instance = new AddDocScreen();
        instance.saveDocument(fileSave);
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveDocument method, of class AddDocScreen.
     */
    @Test
    public void testSaveDocument_0args() {
        System.out.println("saveDocument");
        AddDocScreen instance = new AddDocScreen();
        instance.saveDocument();
        fail("The test case is a prototype.");
    }
    
}
