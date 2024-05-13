/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingtime.database;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Class Conexion
 * @author Lidia Parral
 * @version 1.0.0
 */
public class Conexion {
    
    /**
     *
     */
    public static final String URL = "jdbc:mysql://localhost:3306/workingtime";
    //Añadir el usuario de PhpMyAdmin

    /**
     *
     */
    public static final String USER = "root";
    //Añadir la contraseña de PhpMyAdmin

    /**
     *
     */
    public static final String CLAVE = "";

    /**
     * Establece la conexion con la base de datos.
     * @return retorna la conexion.
     */
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL,USER,CLAVE);           
            //JOptionPane.showMessageDialog(null, "Conexión establecida con éxito","Conexion",JOptionPane.INFORMATION_MESSAGE);
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Conexión establecida errónea","Conexion",JOptionPane.ERROR_MESSAGE);

        }
        return con;
    }    
}
