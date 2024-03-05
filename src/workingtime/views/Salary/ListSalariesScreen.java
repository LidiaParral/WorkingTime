/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package workingtime.views.Salary;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import workingtime.database.Conexion;
import workingtime.utilities.ExportExcel;
import workingtime.utilities.CleanTable;
import workingtime.utilities.ResetFields;

/**
 * Class ListSalariesScreen
 * @author Lidia Parral
 * @version 1.0.0
 */
public final class ListSalariesScreen extends javax.swing.JFrame {

    /**
     *
     */
    public ResetFields reset = new ResetFields();

    /**
     *
     */
    public ExportExcel export = new ExportExcel();

    /**
     *
     */
    public CleanTable lmp = new CleanTable();

    Conexion conn = new Conexion();
    Connection conect;

    DefaultTableModel model;

    PreparedStatement ps;
    Statement st;

    ResultSet rs;

    String sql;
    String idUser;
    String date;
    String search;
    String dev;
    String ded;
    String liqTotal;

    int selectedRow;

    /**
     * Creates new form SalariesScreen
     */
    public ListSalariesScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        lblIdUser.setVisible(false);
        lblName.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblSurnames.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblNumSSEmp1.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblGrupoCotizEmp1.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblGrupoProfEmp1.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblDNIEmp1.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblDateSearch.setFont(new Font("Century Gothic", Font.BOLD, 14));
        btnUpdateNomina.setFont(new Font("Century Gothic", Font.BOLD, 12));
        btnReturn.setFont(new Font("Century Gothic", Font.PLAIN, 12));
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
        lblNombreEmp = new javax.swing.JLabel();
        lblApellidosEmp = new javax.swing.JLabel();
        lblDNIEmp = new javax.swing.JLabel();
        lblNumSSEmp = new javax.swing.JLabel();
        lblGrupoCotizEmp = new javax.swing.JLabel();
        lblGrupoProfEmp = new javax.swing.JLabel();
        lblIdUser = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSurnames = new javax.swing.JLabel();
        lblDNIEmp1 = new javax.swing.JLabel();
        lblNumSSEmp1 = new javax.swing.JLabel();
        lblGrupoCotizEmp1 = new javax.swing.JLabel();
        lblGrupoProfEmp1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSalaries = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnUpdateNomina = new javax.swing.JButton();
        btnSearchNomina = new javax.swing.JButton();
        btnDownloadNomina = new javax.swing.JButton();
        dtDateSalaries = new com.toedter.calendar.JDateChooser();
        lblDateSearch = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblName.setText("Nombre:");

        lblSurnames.setText("Apellidos:");

        lblDNIEmp1.setText("DNI:");

        lblNumSSEmp1.setText("Numero Seguridad Social:");

        lblGrupoCotizEmp1.setText("Grupo de Cotización:");

        lblGrupoProfEmp1.setText("Grupo Profesional:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/factura.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblIdUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblSurnames)
                    .addComponent(lblNombreEmp)
                    .addComponent(lblApellidosEmp))
                .addGap(145, 145, 145)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumSSEmp1)
                    .addComponent(lblNumSSEmp)
                    .addComponent(lblDNIEmp1)
                    .addComponent(lblDNIEmp))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGrupoProfEmp)
                    .addComponent(lblGrupoCotizEmp)
                    .addComponent(lblGrupoCotizEmp1)
                    .addComponent(lblGrupoProfEmp1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblIdUser)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(lblNumSSEmp1)
                            .addComponent(lblGrupoCotizEmp1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreEmp)
                            .addComponent(lblNumSSEmp)
                            .addComponent(lblGrupoCotizEmp))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSurnames)
                            .addComponent(lblGrupoProfEmp1)
                            .addComponent(lblDNIEmp1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidosEmp)
                            .addComponent(lblGrupoProfEmp)
                            .addComponent(lblDNIEmp)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TableSalaries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salario Base", "Total Devengado", "Total Deducido", "Liquido Total", "Dias Trabajados", "Fecha Inicio", "Fecha Fin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableSalaries);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnUpdateNomina.setBackground(new java.awt.Color(38, 70, 166));
        btnUpdateNomina.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateNomina.setText("ACTUALIZAR");
        btnUpdateNomina.setToolTipText("Este botón permite actualizar ls nómina seleccionada.");
        btnUpdateNomina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateNominaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(btnUpdateNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnUpdateNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnSearchNomina.setBackground(new java.awt.Color(38, 70, 166));
        btnSearchNomina.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchNomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnSearchNomina.setToolTipText("Este botón permite buscar la nómina del empleado por fecha");
        btnSearchNomina.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchNomina.setMaximumSize(new java.awt.Dimension(28, 28));
        btnSearchNomina.setMinimumSize(new java.awt.Dimension(28, 28));
        btnSearchNomina.setPreferredSize(new java.awt.Dimension(28, 28));
        btnSearchNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNominaActionPerformed(evt);
            }
        });

        btnDownloadNomina.setForeground(new java.awt.Color(255, 255, 255));
        btnDownloadNomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download.png"))); // NOI18N
        btnDownloadNomina.setToolTipText("Este botón permite descargar el documento de la nómina seleccionada.");
        btnDownloadNomina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDownloadNomina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDownloadNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadNominaActionPerformed(evt);
            }
        });

        dtDateSalaries.setBackground(new java.awt.Color(255, 255, 255));
        dtDateSalaries.setToolTipText("MM-dd-yyyy");
        dtDateSalaries.setDateFormatString("MM-dd-yyyy");
        dtDateSalaries.setMaxSelectableDate(new Date());

        lblDateSearch.setText("Fecha de búsqueda:");

        btnReturn.setBackground(new java.awt.Color(204, 204, 204));
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("CANCELAR");
        btnReturn.setToolTipText("Este botón permite volver a la página anterior.");
        btnReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDateSearch)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dtDateSalaries, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(517, 517, 517)
                        .addComponent(btnDownloadNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDateSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtDateSalaries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearchNomina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDownloadNomina, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    /**
     * Botón Cancelar: Este botón permite retornar a la pantalla HomeScreen.
     *
     * @param evt
     */
    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    /**
     * Botón Download: Este botón permite al usuario descargarse la nómina
     * seleccionada.
     *
     * @param evt
     */
    private void btnDownloadNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadNominaActionPerformed
        selectedRow = TableSalaries.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún registro para descargar", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                JOptionPane.showMessageDialog(null, "Se va a descargar el documento en Excel", "EXPORTAR DOCUMENTO", JOptionPane.PLAIN_MESSAGE);
                export.exportExcel(TableSalaries);
            } catch (IOException ex) {
                Logger.getLogger(ListSalariesScreen.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error interno en el sistema.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDownloadNominaActionPerformed

    /**
     * Botón Buscar: Este botón permite al usuario buscar por una fecha concreta
     * el registro de una nómina.
     *
     * @param evt
     */
    private void btnSearchNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNominaActionPerformed
        search = dtDateSalaries.getDateFormatString();
        if (search.equals("")) {
            JOptionPane.showMessageDialog(null, "No puede estar vacío este campo.", "TODOS LOS EMPLEADOS", JOptionPane.ERROR_MESSAGE);
        } else {
            if (TableSalaries.getRowCount() == 0) {
                searchNomina();
            } else {
                lmp.tableCleaning(model);
                searchNomina();
            }
        }
    }//GEN-LAST:event_btnSearchNominaActionPerformed

    /**
     * Botón Actualizar: Este botón permite actualizar los datos de la nómina de un empleado.
     * @param evt
     */
    private void btnUpdateNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateNominaActionPerformed
        selectedRow = TableSalaries.getSelectedRow();
        btnUpdateNomina.setBackground(new Color(252, 201, 131));
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún registro para actualizar", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            updateNomina();
            existSalary();
        }
        btnUpdateNomina.setBackground(new Color(38, 70, 166));
    }//GEN-LAST:event_btnUpdateNominaActionPerformed

    /**
     * Método existSalary: Este método permite comprobar si existe algun registro de la nómina de un empleado en concreto.
     */
    public void existSalary() {
        idUser = lblIdUser.getText();
        try {
            sql = "SELECT * FROM nominas WHERE IdEmpleado='" + idUser + "'";

            conect = conn.getConexion();
            ps = conect.prepareStatement(sql);
            rs = ps.executeQuery(sql);

            Object[] nomina = new Object[7];
            model = (DefaultTableModel) TableSalaries.getModel();
            while (rs.next()) {
                nomina[0] = rs.getString("SalarioBase");
                nomina[1] = rs.getString("TotalDevengado");
                nomina[2] = rs.getString("TotalDeducciones");
                nomina[3] = rs.getString("LiquidoTotal");
                nomina[4] = rs.getString("DiasTrabajados");
                nomina[5] = rs.getDate("FechaInicio");
                nomina[6] = rs.getDate("FechaFin");
                model.addRow(nomina);
            }
            TableSalaries.setModel(model);
        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
            JOptionPane.showMessageDialog(null, "Error interno en el sistema.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método searchNomina: Este método permite buscar un registro de una nómina en la base de datos.
     */
    public void searchNomina() {       
        date = new SimpleDateFormat("yyyy-MM-dd").format(dtDateSalaries.getDate());
        try {
            sql = "SELECT * FROM nominas WHERE FechaInicio='" + date + "' AND IdEmpleado='" + lblIdUser.getText() + "'";

            conect = conn.getConexion();
            ps = conect.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            Object[] nomina = new Object[7];
            model = (DefaultTableModel) TableSalaries.getModel();
            while (rs.next()) {
                nomina[0] = rs.getString("SalarioBase");
                nomina[1] = rs.getString("TotalDevengado");
                nomina[2] = rs.getString("TotalDeducciones");
                nomina[3] = rs.getString("LiquidoTotal");
                nomina[4] = rs.getString("DiasTrabajados");
                nomina[5] = rs.getDate("FechaInicio");
                nomina[6] = rs.getDate("FechaFin");
                model.addRow(nomina);
            }
            TableSalaries.setModel(model);
        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
            JOptionPane.showMessageDialog(null, "Error interno en el sistema.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método updateNomina: Este método permite actualizar los datos de los datos de una nómina en la base de datos.
     */
    public void updateNomina() {
        idUser = lblIdUser.getText();
        dev = String.valueOf(model.getValueAt(TableSalaries.getSelectedRow(), 1));
        ded = String.valueOf(model.getValueAt(TableSalaries.getSelectedRow(), 2));
        liqTotal = String.valueOf(model.getValueAt(TableSalaries.getSelectedRow(), 3));
        try {

            sql = "UPDATE nominas SET TotalDevengado='" + dev + "', TotalDeducciones='" + ded + "', LiquidoTotal='" + liqTotal
                    + "' WHERE IdEmpleado ='" + idUser + "'";

            conect = conn.getConexion();
            st = conect.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
            JOptionPane.showMessageDialog(null, "Error interno en el sistema.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        lmp.tableCleaning(model);
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
            java.util.logging.Logger.getLogger(ListSalariesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListSalariesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListSalariesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListSalariesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ListSalariesScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableSalaries;
    private javax.swing.JButton btnDownloadNomina;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearchNomina;
    public javax.swing.JButton btnUpdateNomina;
    public com.toedter.calendar.JDateChooser dtDateSalaries;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblApellidosEmp;
    public javax.swing.JLabel lblDNIEmp;
    public javax.swing.JLabel lblDNIEmp1;
    private javax.swing.JLabel lblDateSearch;
    public javax.swing.JLabel lblGrupoCotizEmp;
    public javax.swing.JLabel lblGrupoCotizEmp1;
    public javax.swing.JLabel lblGrupoProfEmp;
    public javax.swing.JLabel lblGrupoProfEmp1;
    public javax.swing.JLabel lblIdUser;
    public javax.swing.JLabel lblName;
    public javax.swing.JLabel lblNombreEmp;
    public javax.swing.JLabel lblNumSSEmp;
    public javax.swing.JLabel lblNumSSEmp1;
    public javax.swing.JLabel lblSurnames;
    // End of variables declaration//GEN-END:variables
}
