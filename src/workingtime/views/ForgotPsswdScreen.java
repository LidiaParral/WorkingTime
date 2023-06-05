/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package workingtime.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import workingtime.database.Conexion;
import workingtime.model.ResetFields;

/**
 *
 * @author Lidia Parral
 */
public class ForgotPsswdScreen extends javax.swing.JFrame {

    public ResetFields reset = new ResetFields();

    Conexion conn = new Conexion();
    Connection conect;

    PreparedStatement ps;
    Statement st;

    ResultSet rs;

    String sql;
    String passOld;
    String passNew;
    String confiPassNew;
    String idUser;
    String user;
    /**
     * Creates new form ForgotPasswordScreen
     */
    public ForgotPsswdScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        lblIdEmp.setVisible(false);
        lblPassOld.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblPassNew.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblUsername.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblConfPassNew.setFont(new Font("Century Gothic", Font.BOLD, 14));
        btnSavePsswd.setFont(new Font("Century Gothic", Font.BOLD, 12));
        btnCancelar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPassOld = new javax.swing.JLabel();
        lblPassNew = new javax.swing.JLabel();
        lblConfPassNew = new javax.swing.JLabel();
        btnSavePsswd = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblIdEmp = new javax.swing.JLabel();
        txtOldPass = new javax.swing.JPasswordField();
        txtPassNew = new javax.swing.JPasswordField();
        txtConfPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setUndecorated(true);

        lblPassOld.setText("Contraseña actual:");

        lblPassNew.setText("Contraseña nueva:");

        lblConfPassNew.setText("Confirmación contraseña:");

        btnSavePsswd.setBackground(new java.awt.Color(255, 126, 60));
        btnSavePsswd.setForeground(new java.awt.Color(255, 255, 255));
        btnSavePsswd.setText("GUARDAR");
        btnSavePsswd.setToolTipText("Este botón permite guardar la nueva contraseña del empleado.");
        btnSavePsswd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSavePsswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePsswdActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setToolTipText("Este botón permite volver a la página anterior.");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblIdEmp.setEnabled(false);
        lblIdEmp.setFocusable(false);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bloquear.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bloquear.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/candado.png"))); // NOI18N

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Nombre de usuario:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnSavePsswd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIdEmp)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassNew)
                    .addComponent(lblConfPassNew)
                    .addComponent(lblPassOld)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOldPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPassNew, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtConfPass)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdEmp)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUsername)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassOld)
                            .addComponent(txtOldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPassNew)
                        .addComponent(txtPassNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtConfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblConfPassNew))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSavePsswd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        LoginScreen login = new LoginScreen();
        login.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSavePsswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePsswdActionPerformed
        btnSavePsswd.setBackground(new Color(145, 150, 255));
        consultar();
        btnSavePsswd.setBackground(new Color(255,126,60));
    }//GEN-LAST:event_btnSavePsswdActionPerformed

    public void consultar() {
        passOld = txtOldPass.getText();
        user = txtUsername.getText();
        try {
            sql = "SELECT * FROM empleados WHERE Password='" + passOld + "' AND Usuario='" + user + "'";

            conect = conn.getConexion();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                lblIdEmp.setText(rs.getString("IdEmpleado"));
                changePassword();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el empleado en la base de datos.", "EMPLEADO", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
        }
        txtOldPass.setText("");
        txtConfPass.setText("");
        txtPassNew.setText("");
    }

    public void changePassword() {
        idUser = lblIdEmp.getText();
        passNew = txtPassNew.getText();
        confiPassNew = txtConfPass.getText();

        if (passNew.equalsIgnoreCase(confiPassNew)) {
            try {
                sql = "UPDATE empleados SET Password='" + passNew + "' WHERE IdEmpleado='" + idUser + "'";
                conect = conn.getConexion();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "La contraseña se actualizó correctamente.", "ACTUALIZACIÓN CONTRASEÑA", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException | SQLException ex) {
                System.err.println("Error:" + ex);
            }
        } else if(passNew.equals("") || confiPassNew.equals("") || passOld.equals("") || user.equals("")) {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "VALIDACIÓN DE CAMPOS", JOptionPane.ERROR_MESSAGE); 
        } else if((passNew.length() > 12) || (passNew.length() < 12) || (passOld.length() > 12) || (passOld.length() < 12)
                    || (confiPassNew.length() > 12) || (confiPassNew.length() < 12)){
            JOptionPane.showMessageDialog(null, "El campo debe contener 12 caracteres.", "VALIDACIÓN DE CAMPOS", JOptionPane.ERROR_MESSAGE); 
        } else {
            JOptionPane.showMessageDialog(null, "Debe de coincidir ambas contraseñas.", "ERROR", JOptionPane.ERROR_MESSAGE); 
        }
        reset.ResetFrame(this);
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
            java.util.logging.Logger.getLogger(ForgotPsswdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPsswdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPsswdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPsswdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ForgotPsswdScreen().setVisible(true);
        });
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/logotipo.png"));
        return retValue;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnSavePsswd;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblConfPassNew;
    public javax.swing.JLabel lblIdEmp;
    private javax.swing.JLabel lblPassNew;
    private javax.swing.JLabel lblPassOld;
    private javax.swing.JLabel lblUsername;
    public javax.swing.JPasswordField txtConfPass;
    public javax.swing.JPasswordField txtOldPass;
    public javax.swing.JPasswordField txtPassNew;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
