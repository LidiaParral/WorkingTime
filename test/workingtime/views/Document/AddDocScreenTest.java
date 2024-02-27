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
     * Test of addFile method, of class AddDocScreen.
     */
    @Test
    public void testAddFile() throws Exception {
        System.out.println("addFile");
        File file = null;
        AddDocScreen instance = new AddDocScreen();
        byte[] expResult = null;
        byte[] result = instance.addFile(file);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of saveFile method, of class AddDocScreen.
     */
    @Test
    public void testSaveFile() {
        System.out.println("saveFile");
        File file = null;
        byte[] content = null;
        AddDocScreen instance = new AddDocScreen();
        String expResult = "";
        String result = instance.saveFile(file, content);
        assertEquals(expResult, result);
    }

    /**
     * Test of saveDocument method, of class AddDocScreen.
     */
    @Test
    public void testSaveDocument() {
        System.out.println("saveDocument");
        AddDocScreen instance = new AddDocScreen();
        instance.saveDocument();
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
    
}
