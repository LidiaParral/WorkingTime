/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package workingtime.views;

import java.awt.Color;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import workingtime.database.Conexion;
import workingtime.model.ResetarCampos;

/**
 *
 * @author Lidia Parral
 */
public class AddDocScreen extends javax.swing.JFrame {

    public ResetarCampos reset = new ResetarCampos();

    Conexion conn = new Conexion();
    Connection conect;

    DefaultTableModel modelo;

    PreparedStatement ps;
    Statement st;

    ResultSet rs;

    String sql;
    String nombre;
    String fecha;
    String tipoDoc;
    String idEmp;
    
    
    JFileChooser seleccionado = new JFileChooser();
    byte[] img;
    
    FileInputStream input;
    FileOutputStream out;
    File file;
    
    
    /**
     * Creates new form AddDocumentoScreen
     */
    public AddDocScreen() {
        initComponents();      
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        txtIdDoc.setVisible(false);
        txtPathDoc.setVisible(false);
        lblIdDoc.setVisible(false);
        lblIdEmp.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblIdDoc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdDoc = new javax.swing.JTextField();
        txtNomDoc = new javax.swing.JTextField();
        dtFechaSubDoc = new com.toedter.calendar.JDateChooser();
        cmbTipoDoc = new javax.swing.JComboBox<>();
        btnAddDoc = new javax.swing.JButton();
        btnSaveDoc = new javax.swing.JButton();
        lblIdEmp = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtPathDoc = new javax.swing.JTextField();
        lblDocumento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(470, 340));
        setMinimumSize(new java.awt.Dimension(470, 340));
        setPreferredSize(new java.awt.Dimension(470, 340));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblIdDoc.setText("Id:");
        lblIdDoc.setEnabled(false);
        lblIdDoc.setFocusable(false);

        jLabel2.setText("Tipo de documento:");

        jLabel3.setText("Nombre del documento:");

        jLabel4.setText("Fecha de subida:");

        txtIdDoc.setEnabled(false);
        txtIdDoc.setFocusable(false);

        cmbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PDF", "Excel", "Word", "JPG", "PNG", " " }));

        btnAddDoc.setBackground(new java.awt.Color(255, 126, 60));
        btnAddDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDoc.setText("AÑADIR");
        btnAddDoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDocActionPerformed(evt);
            }
        });

        btnSaveDoc.setBackground(new java.awt.Color(38, 70, 166));
        btnSaveDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveDoc.setText("GUARDAR");
        btnSaveDoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(lblIdDoc)
                    .addComponent(txtNomDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtFechaSubDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(btnSaveDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIdEmp)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblIdEmp)
                .addGap(18, 18, 18)
                .addComponent(lblIdDoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(cmbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(txtNomDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtFechaSubDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtPathDoc.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPathDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txtPathDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDocActionPerformed
        if(seleccionado.showDialog(this, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION){
            file = seleccionado.getSelectedFile();
            if(file.canRead()){
                if(file.getName().endsWith(".pdf")){
                    try {
                        img = añadirFile(file);
                        lblDocumento.setIcon(new ImageIcon(img));
                        txtNomDoc.setText(file.getName());
                    } catch (IOException ex) {
                        Logger.getLogger(AddDocScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAddDocActionPerformed

    private void btnSaveDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDocActionPerformed
        if(seleccionado.showDialog(this, "GUARDAR ARCHIVO") == JFileChooser.APPROVE_OPTION){
            file = seleccionado.getSelectedFile();
            if(file.getName().endsWith(".pdf")){
                String respuesta = guardarFile(file, img);
                save();
                if(respuesta != null){
                    JOptionPane.showMessageDialog(null, respuesta);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "DOCUMENTOS", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnSaveDocActionPerformed

    public byte[] añadirFile(File archivo) throws IOException{
        byte[] contenido = new byte[1024*1000];
        try{
            input = new FileInputStream(archivo);
            input.read(contenido);
        } catch(FileNotFoundException e){
            
        }    
        return contenido;
    }
    
    
    public String guardarFile(File archivo, byte[] contenido){
        String resp = null;       
        try{
            out = new FileOutputStream(archivo);
            out.write(contenido);
            resp = "Se guardo el archivo correctamente.";
        }catch(IOException e){
            
        } 
        return resp;   
    }
    
    
    public void save(){
        idEmp = lblIdEmp.getText();
        nombre = txtNomDoc.getText();
        fecha = new SimpleDateFormat("dd-MM-yyyy").format(dtFechaSubDoc.getDate());

        try {
            tipoDocumentos();
            if (nombre.equals("") || fecha.equals("")) {
                JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos.", "Validación campos", JOptionPane.ERROR_MESSAGE);
            } else {
                sql = "INSERT INTO documentos_empleado(IdEmpleado,TipoDocumento,NombreDoc,Archivo,FechaSubida) VALUES "
                        + "('" + idEmp + "','" + tipoDoc + "','" + nombre + "','" + Arrays.toString(img) + "'," 
                        + "',STR_TO_DATE('" + fecha + "','%d-%m-%Y')";

                conect = conn.getConexion();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Registro con éxito", "DOCUMENTOS", JOptionPane.INFORMATION_MESSAGE);               
            }
        } catch (HeadlessException | SQLException ex) {
            System.err.println("Error:" + ex);
        }
    }
    
     void tipoDocumentos() {
        switch (cmbTipoDoc.getSelectedIndex()) {
            case 0:
                tipoDoc = "PDF";
                break;
            case 1:
                tipoDoc = "WORD";
                break;
            case 2:
                tipoDoc = "EXCEL";
                break;
            default:
                throw new AssertionError();
        }

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDocScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDocScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDocScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDocScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddDocScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddDoc;
    public javax.swing.JButton btnSaveDoc;
    public javax.swing.JComboBox<String> cmbTipoDoc;
    public com.toedter.calendar.JDateChooser dtFechaSubDoc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblIdDoc;
    public javax.swing.JLabel lblIdEmp;
    public javax.swing.JTextField txtIdDoc;
    public javax.swing.JTextField txtNomDoc;
    public javax.swing.JTextField txtPathDoc;
    // End of variables declaration//GEN-END:variables
}
