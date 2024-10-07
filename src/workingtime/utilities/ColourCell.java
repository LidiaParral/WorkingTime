/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingtime.utilities;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Lidia Parral
 */
public class ColourCell extends JTable{

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
       
        Component comp = super.prepareRenderer(renderer, row, column);
        
        if(getValueAt(row, column).getClass().equals(String.class)){
            String valor = (String) this.getValueAt(row, column);
            
            if(valor.equalsIgnoreCase("APROBADO")){
                comp.setBackground(Color.GREEN);
                comp.setForeground(Color.WHITE);
            } else if(valor.equalsIgnoreCase("RECHAZADO")){
                comp.setBackground(Color.RED);
                comp.setForeground(Color.WHITE);
            } else {
                comp.setBackground(Color.GRAY);
                comp.setForeground(Color.WHITE);
            }
        }
        return comp;
    }
    
}
