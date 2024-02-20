/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package workingtime.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.System.console;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import workingtime.database.Conexion;
import workingtime.model.ResetFields;

/**
 * Class LoginScreen
 *
 * @author Lidia Parral
 * @version 1.0.0
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     *
     */
    public ResetFields reset = new ResetFields();

    Conexion conn = new Conexion();
    Connection conect;

    DefaultTableModel modelo;

    PreparedStatement ps;
    Statement st;

    ResultSet rs;

    String sql;
    String pass;
    String user;
    String name;
    String idUser;
    String dpto;

    int count = 0;

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        lblIdEmp.setVisible(false);
        lblUser.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 14));
        btnLogin.setFont(new Font("Century Gothic", Font.BOLD, 12));
        lblForgotPss.setFont(new Font("Century Gothic", Font.PLAIN, 10));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUser = new javax.swing.JLabel();
        lblForgotPss = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserLogin = new javax.swing.JTextField();
        txtPswLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblIconoUser = new javax.swing.JLabel();
        lblIconoPass = new javax.swing.JLabel();
        lblIdEmp = new javax.swing.JLabel();
        lblDpto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(506, 279));
        setMinimumSize(new java.awt.Dimension(506, 279));
        setResizable(false);

        lblUser.setBackground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Nombre de usuario:");

        lblForgotPss.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        lblForgotPss.setText("¿Olvidaste la contraseña?");
        lblForgotPss.setToolTipText("Este enlace permite cambiar la contraseña.");
        lblForgotPss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPssMouseClicked(evt);
            }
        });

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña:");

        btnLogin.setBackground(new java.awt.Color(38, 70, 166));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setToolTipText("Este botón permite acceder al usuario a la aplicación.");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblIconoUser.setBackground(new java.awt.Color(255, 255, 255));
        lblIconoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        lblIconoPass.setBackground(new java.awt.Color(255, 255, 255));
        lblIconoPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unlocked.png"))); // NOI18N

        lblIdEmp.setBackground(new java.awt.Color(255, 255, 255));
        lblIdEmp.setEnabled(false);
        lblIdEmp.setFocusable(false);

        lblDpto.setEnabled(false);
        lblDpto.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblForgotPss)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUser)
                                    .addComponent(lblPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPswLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconoUser)
                            .addComponent(lblIconoPass))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 494, Short.MAX_VALUE)
                                .addComponent(lblIdEmp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDpto)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblIdEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDpto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUser))
                    .addComponent(lblIconoUser, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPswLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPassword))
                    .addComponent(lblIconoPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblForgotPss)
                .addGap(35, 35, 35)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón Login: Este botón permite al usuario ingresar a la aplicación con
     * sus credenciales.
     *
     * @param evt
     */
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        btnLogin.setBackground(new Color(252, 201, 131));
        try {
            existEmployee();
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnLogin.setBackground(new Color(38, 70, 166));
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * Label ¿Olvidaste la contraseña?: A partir de hacer click en este texto se
     * abre la pantalla ForgotPsswdScreen.
     *
     * @param evt
     */
    private void lblForgotPssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPssMouseClicked
        ForgotPsswdScreen forgot = new ForgotPsswdScreen();
        forgot.setVisible(true);
        this.hide();
    }//GEN-LAST:event_lblForgotPssMouseClicked

    /**
     * Método existEmployee: Este método permite comprobar si existe el usuario
     * en la base de datos según el usuario y contraseña introducidos
     * previamente.
     *
     * @throws InterruptedException
     */
    public void existEmployee() throws InterruptedException {
        pass = txtPswLogin.getText();
        user = txtUserLogin.getText();
        try {

            if (user.equals("") || pass.equals("")) {
                JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos.", "Validación campos", JOptionPane.ERROR_MESSAGE);
                reset.ResetFrame(this);
            } else {

                sql = "SELECT * FROM usuarios WHERE Usuario= '" + user + "' AND Password='" + pass + "'";

                conect = conn.getConexion();
                ps = conect.prepareStatement(sql);
                rs = ps.executeQuery(sql);
                if (rs.next() && count < 2) {
                    this.hide();
                    Thread.sleep(200);
                    lblIdEmp.setText(rs.getString("IdEmpleado"));
                    idUser = lblIdEmp.getText();
                    dpto = lblDpto.getText();
                    user = lblUser.getText();
                    HomeScreen home = new HomeScreen();
                    if (idUser.equals("1") || user.equalsIgnoreCase("ADMIN") || dpto.equalsIgnoreCase("RRHH") || dpto.equalsIgnoreCase("DIRECTOR")) {
                        home.mnControlEmp.setVisible(true);
                        home.mnAllEmp.setVisible(true);
                        home.mnEmple.setVisible(true);
                        home.mnAddSalary.setVisible(true);
                    } else {
                        home.mnControlEmp.setVisible(false);
                        home.mnAllEmp.setVisible(false);
                        home.mnEmple.setVisible(false);
                        home.mnAddSalary.setVisible(false);
                    }
                    home.lblIdEmp.setText(rs.getString("IdEmpleado"));
                    home.lblNamEmp.setText(rs.getString("Nombre"));
                    home.lblSurnamesEmp.setText(rs.getString("Apellidos"));
                    home.lblEmailEmp.setText(rs.getString("Email"));
                    home.lblDNIEmp.setText(rs.getString("DNI"));
                    home.lblGroupCot.setText(rs.getString("GrupoCotizacion"));
                    home.lblCatProf.setText(rs.getString("CategoriaProfesional"));
                    home.lblNumSS.setText(rs.getString("NumeroSeguridadSocial"));
                    home.lblPosEmp.setText(rs.getString("Posicion"));
                    home.lblDepartmentEmp.setText(rs.getString("Departamento"));
                    home.setVisible(true);
                    reset.ResetFrame(this);
                    JOptionPane.showMessageDialog(null, "Bienvenido " + rs.getString("Nombre") + " a WorkingTime", "WELCOME A WORKING TIME", JOptionPane.PLAIN_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario incorrecto. Tiene 3 intentos.\n"
                            + "Intento " + (1 + count) + " de 3 intentos.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    txtPswLogin.setText("");
                    txtUserLogin.setText("");
                    count++;
                    if (count == 3) {
                        JOptionPane.showMessageDialog(null, "Usuario bloqueado. Total: " + count + " intentos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        this.dispose();
                        System.exit(0);
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
            JOptionPane.showMessageDialog(null, "Error interno en el sistema.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método getIconImage: Este método permite obtener el icono de la
     * aplicación.
     *
     * @return icon
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/logotipo.png"));
        return retValue;
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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLogin;
    public javax.swing.JLabel lblDpto;
    public javax.swing.JLabel lblForgotPss;
    private javax.swing.JLabel lblIconoPass;
    private javax.swing.JLabel lblIconoUser;
    public javax.swing.JLabel lblIdEmp;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    public javax.swing.JPasswordField txtPswLogin;
    public javax.swing.JTextField txtUserLogin;
    // End of variables declaration//GEN-END:variables
}
