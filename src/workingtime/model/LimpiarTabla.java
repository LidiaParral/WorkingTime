/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingtime.model;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lidia Parral
 */
public class LimpiarTabla {
    
      public void limpiarTabla(DefaultTableModel modelo) {
        int rowCount = modelo.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}
