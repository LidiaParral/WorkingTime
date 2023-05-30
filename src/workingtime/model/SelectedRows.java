/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingtime.model;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lidia Parral
 */
public class SelectedRows extends DefaultTableCellRenderer {
    
@Override
public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,boolean hasFocus, int row, int column) 
    {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    switch (table.getValueAt(row, 6).toString()) {
        case "0":            
            setBackground(Color.red);
            setForeground(Color.white);
            break;
        case "1":
            setBackground(Color.red);
            setForeground(Color.white);
            break;
        case "2":
            setBackground(Color.red);
            setForeground(Color.white);
            break;
        case "3":
            setBackground(Color.red);
            setForeground(Color.white);
            break;
        case "4":
            setBackground(Color.red);
            setForeground(Color.white);
            break;
        case "5":
            setBackground(Color.red);
            setForeground(Color.white);
            break;
        case "6":
            setBackground(Color.red);
            setForeground(Color.white); 
            break;
        case "7":
            setBackground(Color.red);
            setForeground(Color.white);
            break;
        default:
            setBackground(Color.white);
            setForeground(Color.black);
            break;
    }
        
        return this;
    }
}
