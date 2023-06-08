/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package workingtime.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import workingtime.database.Conexion;
import workingtime.model.ResetFields;

/**
 * Class AddSalaryScreen
 * @author Lidia Parral
 * @version 1.0.0
 */
public class AddSalaryScreen extends javax.swing.JFrame {

    public ResetFields reset = new ResetFields();
    
    Conexion conn = new Conexion();
    Connection conect;

    PreparedStatement ps;
    Statement st;

    ResultSet rs;

    String sql;
    String idUser;
    String dateS;
    String dateF;
    String salary;
    String totalDev;
    String totalDed;
    String liqTotal;
    String days;
    String job;
    String month;
    
    int ded;
    int dev;
    int total;
    /**
     * Creates new form AddSalaryScreen
     */
    public AddSalaryScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        lblIdEmp.setVisible(false);
        lblPuesto.setVisible(false);
        lblMes.setFont(new Font("Century Gothic",Font.BOLD,14));
        lblDateF.setFont(new Font("Century Gothic",Font.BOLD,14));
        lblDateS.setFont(new Font("Century Gothic",Font.BOLD,14));
        lblSalaryBase.setFont(new Font("Century Gothic",Font.BOLD,14));
        lblTotalDed.setFont(new Font("Century Gothic",Font.BOLD,14));
        lblTotalDev.setFont(new Font("Century Gothic",Font.BOLD,14));
        lblLiquidoTotal.setFont(new Font("Century Gothic",Font.BOLD,14));
        lblWorkingDays.setFont(new Font("Century Gothic",Font.BOLD,14));
        btnSaveSalary.setFont(new Font("Century Gothic",Font.BOLD,12));
        btnReturn.setFont(new Font("Century Gothic",Font.PLAIN,12));
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
        lblMes = new javax.swing.JLabel();
        lblDateS = new javax.swing.JLabel();
        lblDateF = new javax.swing.JLabel();
        lblSalaryBase = new javax.swing.JLabel();
        lblTotalDed = new javax.swing.JLabel();
        lblTotalDev = new javax.swing.JLabel();
        lblLiquidoTotal = new javax.swing.JLabel();
        lblWorkingDays = new javax.swing.JLabel();
        txtSalaryB = new javax.swing.JTextField();
        txtTotalDed = new javax.swing.JTextField();
        txtTotalDev = new javax.swing.JTextField();
        txtLiqTotal = new javax.swing.JTextField();
        txtWorkDays = new javax.swing.JTextField();
        dtDateS = new com.toedter.calendar.JDateChooser();
        dtDateF = new com.toedter.calendar.JDateChooser();
        lblIdEmp = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        cmbMonths = new javax.swing.JComboBox<>();
        btnSaveSalary = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMes.setText("Mes:");

        lblDateS.setText("Fecha de inicio:");

        lblDateF.setText("Fecha de fin:");

        lblSalaryBase.setText("Salario Base:");

        lblTotalDed.setText("Total Deducciones:");

        lblTotalDev.setText("Total Devengado:");

        lblLiquidoTotal.setText("Liquido Total:");

        lblWorkingDays.setText("Dias Trabajados:");

        txtSalaryB.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtTotalDed.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtTotalDev.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtLiqTotal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtLiqTotal.setEnabled(false);
        txtLiqTotal.setFocusable(false);

        txtWorkDays.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        dtDateS.setBackground(new java.awt.Color(255, 255, 255));
        dtDateS.setToolTipText("Seleccione una fecha inicial");
        dtDateS.setDateFormatString("dd-MM-yyyy");
        dtDateS.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        dtDateF.setBackground(new java.awt.Color(255, 255, 255));
        dtDateF.setDateFormatString("dd-MM-yyyy");
        dtDateF.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblIdEmp.setEnabled(false);
        lblIdEmp.setFocusable(false);

        lblPuesto.setEnabled(false);
        lblPuesto.setFocusable(false);

        cmbMonths.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbMonths.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        cmbMonths.setToolTipText("Seleccione un mes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbMonths, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDateS)
                            .addComponent(lblDateF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtDateF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtDateS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSalaryBase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSalaryB, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalDed)
                            .addComponent(lblWorkingDays))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalDed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWorkDays, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLiquidoTotal)
                            .addComponent(lblTotalDev))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalDev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLiqTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPuesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIdEmp)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEmp)
                    .addComponent(lblPuesto))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMes)
                    .addComponent(cmbMonths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDateS)
                            .addComponent(dtDateS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(lblDateF))
                    .addComponent(dtDateF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalaryBase)
                    .addComponent(txtSalaryB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalDed)
                    .addComponent(txtTotalDed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalDev))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLiqTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLiquidoTotal))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWorkDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWorkingDays))
                .addGap(27, 27, 27))
        );

        btnSaveSalary.setBackground(new java.awt.Color(38, 70, 166));
        btnSaveSalary.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveSalary.setText("GUARDAR");
        btnSaveSalary.setToolTipText("Este botón permite guardar los datos de la nómina del empleado");
        btnSaveSalary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSalaryActionPerformed(evt);
            }
        });

        btnReturn.setBackground(new java.awt.Color(204, 204, 204));
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("CANCELAR");
        btnReturn.setToolTipText("Este botón permite volver a la página anterior.");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logotipo2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnSaveSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón Cancelar: Este botón permite retornar a la pantalla HomeScreen.
     * @param evt 
     */
    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    /**
     * Botón Guardar: Este botón permite guardar los datos de la nómina de un empleado.
     * @param evt 
     */
    private void btnSaveSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSalaryActionPerformed
        searchNomina();
    }//GEN-LAST:event_btnSaveSalaryActionPerformed

    /**
     * Método addSalary: Este método permite añadir los datos de la nómina en la base de datos.
     */
    public void addSalary(){
        idUser = lblIdEmp.getText();
        job = lblPuesto.getText();
        month = cmbMonths.getSelectedItem().toString();
        dateS = new SimpleDateFormat("dd-MM-yyyy").format(dtDateS.getDate());
        dateF = new SimpleDateFormat("dd-MM-yyyy").format(dtDateF.getDate());
        salary = txtSalaryB.getText();
        totalDed = txtTotalDed.getText();
        totalDev = txtTotalDev.getText();
        days = txtWorkDays.getText();        
        liqTotal = Integer.toString(calculateLiquidoTotal());
      
        if (idUser.isEmpty() || dateS.isEmpty() || dateF.isEmpty() || salary.isEmpty() || totalDed.isEmpty()
                || totalDev.isEmpty() || liqTotal.isEmpty() || days.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos.", "VALIDACIÓN DE CAMPOS", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                sql = "INSERT INTO nominas(IdEmpleado,PuestoTrabajo,Mes,FechaInicio,FechaFin,SalarioBase,TotalDevengado,TotalDeducciones,LiquidoTotal,DiasTrabajados) VALUES "
                        + "('" + idUser + "','" + job + "','" +  month + "', STR_TO_DATE('" + dateS + "','%d-%m-%Y')"
                        + ", STR_TO_DATE('" + dateF + "','%d-%m-%Y'),'" + salary + "','" + totalDev + "','" + totalDed
                        + "','"+ liqTotal + "','" + days + "')";

                conect = conn.getConexion();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "El registro se realizó correctamente.", "REGISTRO NÓMINA", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException | SQLException ex) {
                System.err.println("Error:" + ex);
            }
        }
        dtDateS.setCalendar(null);
        dtDateF.setCalendar(null);
        cmbMonths.setSelectedIndex(0);
        reset.ResetPanel(jPanel1);
    }
    
    /**
     * Método searchNomina: Este método permite comprobar si existe un registro de nómina en la base de datos buscando a través del mes y del id del empleado.
     */
    public void searchNomina() {
        month = cmbMonths.getSelectedItem().toString();
        idUser = lblIdEmp.getText();
        try {
            sql = "SELECT * FROM nominas WHERE Mes='" + month + "' AND IdEmpleado='" + idUser + "'";

            conect = conn.getConexion();
            ps = conect.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            if (rs.next()) {
                 JOptionPane.showMessageDialog(null, "Ya existe un registro para el usuario con la fecha introducida", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {
                addSalary();
            }
        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
        }
    }
     
    /**
     * Método calculateLiquidoTotal: Este método permite calcular el valor del liquido total.
     * @return total
     */
    public int calculateLiquidoTotal(){
      ded = Integer.parseInt (totalDed);
      dev = Integer.parseInt (totalDev);
      total = dev - ded;      
      
      return total;
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
            java.util.logging.Logger.getLogger(AddSalaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSalaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSalaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSalaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddSalaryScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSaveSalary;
    private javax.swing.JComboBox<String> cmbMonths;
    private com.toedter.calendar.JDateChooser dtDateF;
    private com.toedter.calendar.JDateChooser dtDateS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDateF;
    private javax.swing.JLabel lblDateS;
    public javax.swing.JLabel lblIdEmp;
    private javax.swing.JLabel lblLiquidoTotal;
    private javax.swing.JLabel lblMes;
    public javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSalaryBase;
    private javax.swing.JLabel lblTotalDed;
    private javax.swing.JLabel lblTotalDev;
    private javax.swing.JLabel lblWorkingDays;
    private javax.swing.JTextField txtLiqTotal;
    private javax.swing.JTextField txtSalaryB;
    private javax.swing.JTextField txtTotalDed;
    private javax.swing.JTextField txtTotalDev;
    private javax.swing.JTextField txtWorkDays;
    // End of variables declaration//GEN-END:variables
}
