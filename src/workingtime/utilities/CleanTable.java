/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingtime.utilities;

import javax.swing.table.DefaultTableModel;

/**
 * Class CleanTable
 * @author Lidia Parral
 * @version 1.0.0
 */
public class CleanTable {

    
    /**
     * Método tableCleaning: Este método permite limpiar todos los registros de la tabla.
     * @param model 
     */
    public void tableCleaning(DefaultTableModel model) {
        int rowCount = model.getRowCount();
        
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
}
