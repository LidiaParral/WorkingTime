/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingtime.model;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Class ResetFields
 * @author Lidia Parral
 * @version 1.0.0
 */
public class ResetFields {
    
    /**
     * Método que permite resetear los componentes del JPanel.
     * @param panel JPanel
     */
    public void ResetPanel(JPanel panel){
        for(Object obj: panel.getComponents()){
            if (obj instanceof JTextField){
                ((JTextField) obj).setText("");
            } else if(obj instanceof JComboBox){
                ((JComboBox)obj).setSelectedIndex(0);
            } else if(obj instanceof JRadioButton){
                ((JRadioButton)obj).setSelected(false);               
            } else if(obj instanceof JCheckBox){
                ((JCheckBox)obj).setSelected(false);  
            } else if(obj instanceof JTextArea){
                ((JTextArea) obj).setText("");
            } else if(obj instanceof JPasswordField){
                ((JPasswordField) obj).setText("");
            }
        }
    }
    
    /**
     * Método que permite resetear los componentes del JFrame.
     * @param frame JFrame
     */
    public void ResetFrame(JFrame frame){
        for(Object obj: frame.getComponents()){
            if (obj instanceof JTextField){
                ((JTextField) obj).setText("");
            } else if(obj instanceof JComboBox){
                ((JComboBox)obj).setSelectedIndex(0);
            } else if(obj instanceof JRadioButton){
                ((JRadioButton)obj).setSelected(false);               
            } else if(obj instanceof JCheckBox){
                ((JCheckBox)obj).setSelected(false);  
            } else if(obj instanceof JTextArea){
                ((JTextArea) obj).setText("");
            } else if(obj instanceof JPasswordField){
                ((JPasswordField) obj).setText("");
            }
        }
    }
}
