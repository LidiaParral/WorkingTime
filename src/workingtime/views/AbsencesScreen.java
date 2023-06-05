/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package workingtime.views;

import com.toedter.calendar.JCalendar;
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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import workingtime.database.Conexion;
import workingtime.model.CleanTable;
import workingtime.model.ResetFields;

/**
 *
 * @author Lidia Parral
 */
public final class AbsencesScreen extends javax.swing.JFrame {

    public ResetFields reset = new ResetFields();
    public CleanTable lmp = new CleanTable();

    Conexion conn = new Conexion();
    Connection conect;

    DefaultTableModel model;

    PreparedStatement ps;
    Statement st;

    ResultSet rs;

    String sql;
    String idUser;
    String dpto;
    String manager;
    String dateFin;
    String dateStart;
    String typeRequest;
    String reason;
    String dayOfWeek;
    String idAbsence;

    int selectedRow;
    Object[] options = {"Aceptar", "Cancelar"};
    int election;

    /**
     * Creates new form AusenciasScreen
     */
    public AbsencesScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        lblIdEmp.setVisible(false);
        lblDepartment.setVisible(false);
        lblIdAbs.setVisible(true);
        lblManager.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblDateStart.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblDateFin.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblTypeRequest.setFont(new Font("Century Gothic", Font.BOLD, 14));
        lblReason.setFont(new Font("Century Gothic", Font.BOLD, 14));
        btnUpdateAusencia.setFont(new Font("Century Gothic", Font.BOLD, 12));
        btnDeleteAusencia.setFont(new Font("Century Gothic", Font.BOLD, 12));
        btnSaveAusencia.setFont(new Font("Century Gothic", Font.BOLD, 12));
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
        lblIdEmp = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblManager = new javax.swing.JLabel();
        lblDateStart = new javax.swing.JLabel();
        lblDateFin = new javax.swing.JLabel();
        txtManager = new javax.swing.JTextField();
        dtDateStartAb = new com.toedter.calendar.JDateChooser();
        dtDateFinAb = new com.toedter.calendar.JDateChooser();
        lblTypeRequest = new javax.swing.JLabel();
        cmbTypeRequestVacation = new javax.swing.JComboBox<>();
        lblReason = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaReasonAb = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableAbsence = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblIdAbs = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSaveAusencia = new javax.swing.JButton();
        btnUpdateAusencia = new javax.swing.JButton();
        btnDeleteAusencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblIdEmp.setEnabled(false);
        lblIdEmp.setFocusable(false);

        lblManager.setText("Responsable");

        lblDateStart.setText("Fecha de inicio:");

        lblDateFin.setText("Fecha de fin:");

        txtManager.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        dtDateStartAb.setBackground(new java.awt.Color(255, 255, 255));
        dtDateStartAb.setDateFormatString("dd-MM-yyyy");
        dtDateStartAb.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        dtDateStartAb.setMinSelectableDate(new Date());

        dtDateFinAb.setBackground(new java.awt.Color(255, 255, 255));
        dtDateFinAb.setDateFormatString("dd-MM-yyyy");
        dtDateFinAb.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        dtDateFinAb.setMinSelectableDate(new Date());

        lblTypeRequest.setText("Tipo de solicitud");

        cmbTypeRequestVacation.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbTypeRequestVacation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VACACIONES", "PERMISO RETRIBUIDO", "PERMISO NO RETRIBUIDO", "DÍA LIBRE", "DÍA FESTIVO", "CITA MEDICA" }));

        lblReason.setText("Motivo de ausencia:");

        txtaReasonAb.setColumns(20);
        txtaReasonAb.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtaReasonAb.setRows(5);
        jScrollPane1.setViewportView(txtaReasonAb);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tiempo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dtDateStartAb, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDepartment))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReason)
                    .addComponent(lblDateFin)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblManager)
                            .addComponent(dtDateFinAb, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDateStart)
                            .addComponent(cmbTypeRequestVacation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTypeRequest)
                            .addComponent(txtManager, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdEmp)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdEmp)
                            .addComponent(lblManager))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTypeRequest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTypeRequestVacation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDateStart))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDepartment)
                    .addComponent(dtDateStartAb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDateFin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtDateFinAb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblReason)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TableAbsence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Responsable", "Fecha Inicio", "Fecha Fin", "Tipo de Solicitud", "Motivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableAbsence);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N

        lblIdAbs.setEnabled(false);
        lblIdAbs.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblIdAbs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdAbs)
                        .addGap(39, 39, 39))))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnSaveAusencia.setBackground(new java.awt.Color(38, 70, 166));
        btnSaveAusencia.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveAusencia.setText("GUARDAR");
        btnSaveAusencia.setToolTipText("Este botón permite guarda la ausencia.");
        btnSaveAusencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveAusencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAusenciaActionPerformed(evt);
            }
        });

        btnUpdateAusencia.setBackground(new java.awt.Color(38, 70, 166));
        btnUpdateAusencia.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateAusencia.setText("ACTUALIZAR");
        btnUpdateAusencia.setToolTipText("Este botón permite actualizar la ausencia seleccionada.");
        btnUpdateAusencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateAusencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAusenciaActionPerformed(evt);
            }
        });

        btnDeleteAusencia.setBackground(new java.awt.Color(255, 126, 60));
        btnDeleteAusencia.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteAusencia.setText("ELIMINAR");
        btnDeleteAusencia.setToolTipText("Este botón permite eliminar la asusencia seleccionada");
        btnDeleteAusencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAusenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnSaveAusencia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnUpdateAusencia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnDeleteAusencia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveAusencia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateAusencia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteAusencia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveAusenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAusenciaActionPerformed
        btnSaveAusencia.setBackground(new Color(252, 201, 131));
        existDate();
        consult();
        btnSaveAusencia.setBackground(new Color(38, 70, 166));
    }//GEN-LAST:event_btnSaveAusenciaActionPerformed

    private void btnUpdateAusenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAusenciaActionPerformed
        selectedRow = TableAbsence.getSelectedRow();
        election = JOptionPane.showOptionDialog(rootPane, "En realidad desea actualizar los datos del empleado permanentemente", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, "Aceptar");
        btnUpdateAusencia.setBackground(new Color(252, 201, 131));
        if (election == JOptionPane.YES_OPTION) {
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún registro para actualizar", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {
                updateAbsence();
                consult();
            }
        } else if (election == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "No se ha actualizado el empleado de la base de datos", "EMPLEADO", JOptionPane.PLAIN_MESSAGE);
        }
        btnUpdateAusencia.setBackground(new Color(38, 70, 166));
    }//GEN-LAST:event_btnUpdateAusenciaActionPerformed

    private void btnDeleteAusenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAusenciaActionPerformed
        selectedRow = TableAbsence.getSelectedRow();
        election = JOptionPane.showOptionDialog(rootPane, "En realidad desea eliminar los datos del empleado permanentemente", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, "Aceptar");
        btnDeleteAusencia.setBackground(new Color(145, 150, 255));
        if (election == JOptionPane.YES_OPTION) {
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún registro para eliminar", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {
                deleteAbsence();
                consult();
            }
        } else if (election == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "No se ha actualizado el empleado de la base de datos", "EMPLEADO", JOptionPane.PLAIN_MESSAGE);
        }
        btnDeleteAusencia.setBackground(new Color(255, 126, 60));
    }//GEN-LAST:event_btnDeleteAusenciaActionPerformed

    public void saveAbsence() {
        idUser = lblIdEmp.getText();
        dpto = lblDepartment.getText();
        manager = txtManager.getText();
        dateStart = new SimpleDateFormat("dd-MM-yyyy").format(dtDateStartAb.getDate());
        dateFin = new SimpleDateFormat("dd-MM-yyyy").format(dtDateFinAb.getDate());
        reason = txtaReasonAb.getText();

        getDay(dtDateStartAb.getJCalendar());
        getDay(dtDateFinAb.getJCalendar());

        if (dpto.isEmpty() || manager.isEmpty() || dateStart.isEmpty() || dateFin.isEmpty() || reason.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (dayOfWeek.equalsIgnoreCase("SATURDAY") || dayOfWeek.equalsIgnoreCase("SUNDAY")) {
            JOptionPane.showMessageDialog(null, "No se puede agregar el día seleccionado.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if(dtDateFinAb.getDate().before(dtDateStartAb.getDate())){
            JOptionPane.showMessageDialog(null, "El campo de la fecha de fin no puede ser anterior a la fecha de inicio.", "VALIDACIÓN DE CAMPOS", JOptionPane.ERROR_MESSAGE);
        } else if(dtDateStartAb.getDate().after(dtDateFinAb.getDate())){
            JOptionPane.showMessageDialog(null, "El campo de la fecha de inicio no puede ser posterior a la fecha de fin.", "VALIDACIÓN DE CAMPOS", JOptionPane.ERROR_MESSAGE);
        }else {
            try {
                typeRequest();
                sql = "INSERT INTO registro_ausencia(IdEmpleado,Departamento,Responsable,FechaInicio,FechaFin,TipoSolicitud,MotivoAusencia) VALUES"
                        + "('" + idUser + "','" + dpto + "','" + manager + "',STR_TO_DATE('" + dateStart + "','%d-%m-%Y')"
                        + ",STR_TO_DATE('" + dateFin + "','%d-%m-%Y'),'" + typeRequest + "','" + reason + "')";

                conect = conn.getConexion();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "El registro se realizó correctamente.", "REGISTRO AUSENCIA", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                System.err.println("Error:" + ex);
            }
        }
        cleanData();
        lmp.tableCleaning(model);
    }

    public void cleanData() {
        reset.ResetPanel(jPanel1);
        dtDateStartAb.setCalendar(null);
        dtDateFinAb.setCalendar(null);
        cmbTypeRequestVacation.setSelectedIndex(0);
        txtaReasonAb.setText("");
    }

    public void updateAbsence() {
        idUser = lblIdEmp.getText();
        dateStart = String.valueOf(model.getValueAt(TableAbsence.getSelectedRow(), 1));
        dateFin = String.valueOf(model.getValueAt(TableAbsence.getSelectedRow(), 2));
        typeRequest = String.valueOf(model.getValueAt(TableAbsence.getSelectedRow(), 3));
        reason = String.valueOf(model.getValueAt(TableAbsence.getSelectedRow(), 4));
        try {
            sql = "UPDATE registro_ausencia SET TipoSolicitud='" + typeRequest + "', MotivoAusencia='" + reason + "' WHERE IdEmpleado='" + idUser + "'"
                    + "AND FechaInicio='" + dateStart + "' AND FechaFin='" + dateFin + "'";
            
            System.out.println(sql);
            conect = conn.getConexion();
            st = conect.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "El registro se actualizó correctamente.", "ACTUALIZACIÓN AUSENCIA", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException ex) {
            System.err.println("Error:" + ex);
        }
        lmp.tableCleaning(model);
    }

    public void deleteAbsence() {
        idUser = lblIdEmp.getText();
        dateStart = String.valueOf(model.getValueAt(TableAbsence.getSelectedRow(), 1));
        dateFin = String.valueOf(model.getValueAt(TableAbsence.getSelectedRow(), 2));
        typeRequest = String.valueOf(model.getValueAt(TableAbsence.getSelectedRow(), 3));
        try {
            sql = "DELETE FROM registro_ausencia WHERE IdEmpleado='" + idUser + "'"
                    + " AND FechaInicio='" + dateStart + "' AND FechaFin='" + dateFin + "' AND"
                    + " TipoSolicitud='" + typeRequest + "'";

            conect = conn.getConexion();
            st = conect.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
        }
        lmp.tableCleaning(model);
    }

    public void consult() {
        sql = "SELECT * FROM registro_ausencia";

        try {
            conect = conn.getConexion();
            st = conect.createStatement();
            rs = st.executeQuery(sql);

            Object[] absence = new Object[5];
            model = (DefaultTableModel) TableAbsence.getModel();
            while (rs.next()) {
                absence[0] = rs.getString("Responsable");
                absence[1] = rs.getDate("FechaInicio");
                absence[2] = rs.getDate("FechaFin");
                absence[3] = rs.getString("TipoSolicitud");
                absence[4] = rs.getString("MotivoAusencia");

                model.addRow(absence);
            }
            TableAbsence.setModel(model);
        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
        }
    }

    void typeRequest() {
        switch (cmbTypeRequestVacation.getSelectedIndex()) {
            case 0:
                typeRequest = "VACACIONES";
                break;
            case 1:
                typeRequest = "PERMISO RETRIBUIDO";
                break;
            case 2:
                typeRequest = "PERMISO NO RETRIBUIDO";
                break;
            case 3:
                typeRequest = "DIA LIBRE";
                break;
            case 4:
                typeRequest = "DIA FESTIVO";
                break;
            case 5:
                typeRequest = "CITA MEDICA";
                break;
            default:
                throw new AssertionError();
        }

    }

      public void existDate() {
        idUser = lblIdEmp.getText();
        dateStart = dtDateStartAb.getDateFormatString();
        dateFin = dtDateFinAb.getDateFormatString();
        try {
            sql = "SELECT * FROM registro_horas WHERE IdEmpleado='" + idUser + "' AND FechaInicio='" + dateStart + "' AND "
                    + "FechaFin='" + dateFin + "'";
            conect = conn.getConexion();
            ps = conect.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Este usuario ya tiene un registro\n para esa fecha:"
                        + dateStart, "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                saveAbsence();
            }
        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
        }
    }
      
      
    public void getDay(JCalendar day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(day.getDate());
        dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ROOT).toUpperCase();
//        System.out.println(dayOfWeek);  
    }

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
            java.util.logging.Logger.getLogger(AbsencesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbsencesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbsencesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbsencesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AbsencesScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAbsence;
    private javax.swing.JButton btnDeleteAusencia;
    private javax.swing.JButton btnSaveAusencia;
    private javax.swing.JButton btnUpdateAusencia;
    public javax.swing.JComboBox<String> cmbTypeRequestVacation;
    public com.toedter.calendar.JDateChooser dtDateFinAb;
    public com.toedter.calendar.JDateChooser dtDateStartAb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDateFin;
    private javax.swing.JLabel lblDateStart;
    public javax.swing.JLabel lblDepartment;
    public javax.swing.JLabel lblIdAbs;
    public javax.swing.JLabel lblIdEmp;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblTypeRequest;
    public javax.swing.JTextField txtManager;
    public javax.swing.JTextArea txtaReasonAb;
    // End of variables declaration//GEN-END:variables
}
