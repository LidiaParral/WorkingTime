/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package workingtime.database;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lidia Parral
 */
public class ConexionTest {

    /**
     * Test of getConexion method, of class Conexion.
     */
    @Test
    public void testGetConexion() {
        System.out.println("getConexion");
        Conexion instance = new Conexion();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertEquals(expResult, result);
    }
    
}
