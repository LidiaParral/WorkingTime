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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import workingtime.database.Conexion;
import workingtime.model.ResetFields;

/**
 * Class TimeScreen
 * @author Lidia Parral
 * @version 1.0.0
 */
public final class TimeScreen extends javax.swing.JFrame {

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
    String idUser;
    String dateNow;
    String reason;
    String timeStart;
    String timeFin;
    String timeReasonStart;
    String timeReasonFin;
    String date;
    String dateActual;
    String finR;
    String startR;
    String start;
    String fin;
    String dayOfWeek;

    int diferencia;
    int horas = 0;
    int minutos = 0;
    int dias = 0;
    int totalHours;
    int total;

    Date horaInicio;
    Date horaFinal;

    SimpleDateFormat dateFormat;

    /**
     * Creates new form TimeScreen
     */
    public TimeScreen() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        lblIdEmp.setVisible(false);
        lblTimeStart.setFont(new Font("Century Gothic", Font.BOLD, 12));
        lblTimeFin.setFont(new Font("Century Gothic", Font.BOLD, 12));
        lblOtherReasons.setFont(new Font("Century Gothic", Font.BOLD, 12));
        lblTimeStartR.setFont(new Font("Century Gothic", Font.BOLD, 12));
        lblTimeFinR.setFont(new Font("Century Gothic", Font.BOLD, 12));
        lblDateNow.setFont(new Font("Century Gothic", Font.BOLD, 12));
        lblDateActual.setFont(new Font("Century Gothic", Font.BOLD, 12));
        btnSaveTime.setFont(new Font("Century Gothic", Font.BOLD, 12));
        btnReturn.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        dateAct.setTodayButtonVisible(true);
        dateAct.setTodayButtonText("Hoy");
        dateAct.setWeekOfYearVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTimeStart = new javax.swing.JLabel();
        dtTimeStart = new com.toedter.calendar.JDateChooser();
        dateAct = new com.toedter.calendar.JCalendar();
        lblTimeFin = new javax.swing.JLabel();
        dtTimeFin = new com.toedter.calendar.JDateChooser();
        btnReturn = new javax.swing.JButton();
        cmbOtherReasons = new javax.swing.JComboBox<>();
        dtReasonStart = new com.toedter.calendar.JDateChooser();
        btnSaveTime = new javax.swing.JButton();
        lblOtherReasons = new javax.swing.JLabel();
        lblDateActual = new javax.swing.JLabel();
        lblIdEmp = new javax.swing.JLabel();
        lblDateNow = new javax.swing.JLabel();
        dtReasonFin = new com.toedter.calendar.JDateChooser();
        lblTimeStartR = new javax.swing.JLabel();
        lblTimeFinR = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setUndecorated(true);

        lblTimeStart.setText("Inicio:");

        dtTimeStart.setBackground(new java.awt.Color(255, 255, 255));
        dtTimeStart.setToolTipText("HH:mm:ss");
        dtTimeStart.setDateFormatString("HH:mm:ss");
        dtTimeStart.setMinSelectableDate(new Date());

        dateAct.setBackground(new java.awt.Color(255, 255, 255));
        dateAct.setMinSelectableDate(new Date());
        dateAct.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateActPropertyChange(evt);
            }
        });

        lblTimeFin.setText("Fin:");

        dtTimeFin.setBackground(new java.awt.Color(255, 255, 255));
        dtTimeFin.setToolTipText("HH:mm:ss");
        dtTimeFin.setDateFormatString("HH:mm:ss");
        dtTimeFin.setMinSelectableDate(new Date());

        btnReturn.setBackground(new java.awt.Color(204, 204, 204));
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("CANCELAR");
        btnReturn.setToolTipText("Este botón permite volver a la página anterior.");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        cmbOtherReasons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DESCANSO", "TRABAJO EXTERIOR", "FORMACION" }));

        dtReasonStart.setBackground(new java.awt.Color(255, 255, 255));
        dtReasonStart.setToolTipText("HH:mm:ss");
        dtReasonStart.setDateFormatString("HH:mm:ss");
        dtReasonStart.setMinSelectableDate(new Date());

        btnSaveTime.setBackground(new java.awt.Color(38, 70, 166));
        btnSaveTime.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveTime.setText("GUARDAR");
        btnSaveTime.setToolTipText("Este botón permite guardar el horario del empleado.");
        btnSaveTime.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveTimeActionPerformed(evt);
            }
        });

        lblOtherReasons.setText("Otras razones:");

        lblIdEmp.setEnabled(false);
        lblIdEmp.setFocusable(false);

        lblDateNow.setText("Fecha de hoy:");

        dtReasonFin.setBackground(new java.awt.Color(255, 255, 255));
        dtReasonFin.setToolTipText("HH:mm:ss");
        dtReasonFin.setDateFormatString("HH:mm:ss");
        dtReasonFin.setMinSelectableDate(new Date());

        lblTimeStartR.setText("Inicio:");

        lblTimeFinR.setText("Fin:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\parra\\Downloads\\eficiencia - copia.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTimeStart)
                                    .addComponent(lblTimeFin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtTimeFin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtTimeStart, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(98, 98, 98)
                                .addComponent(lblIdEmp))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbOtherReasons, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOtherReasons))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDateNow)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDateActual, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTimeStartR)
                                    .addComponent(lblTimeFinR))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtReasonFin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtReasonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSaveTime, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIdEmp)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTimeStart)
                    .addComponent(dtTimeStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateNow)
                    .addComponent(lblDateActual, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateAct, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtTimeFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimeFin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(lblOtherReasons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOtherReasons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTimeStartR)
                            .addComponent(dtReasonStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTimeFinR)
                            .addComponent(dtReasonFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveTime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón Guardar: Este botón permite guardar el horario laboral del empleado.
     * 
     * @param evt 
     */
    private void btnSaveTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTimeActionPerformed
        btnSaveTime.setBackground(new Color(252, 201, 131));
        existDate();
        btnSaveTime.setBackground(new Color(38, 70, 166));
    }//GEN-LAST:event_btnSaveTimeActionPerformed

    /**
     * DateChooser dateActPropertyChange: Este método permite añadir la fecha seleccionada en el Label.
     * @param evt 
     */
    private void dateActPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateActPropertyChange
        if (evt.getOldValue() != null) {
            Date fecha = dateAct.getDate();
            DateFormat f = new SimpleDateFormat("dd-MM-yyyy");
            dateActual = f.format(fecha);
            lblDateActual.setText(dateActual);
        }
    }//GEN-LAST:event_dateActPropertyChange

    /**
     * Botón Cancelar: Este botón permite retornar a la pantalla HomeScreen.
     * 
     * @param evt 
     */
    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    /**
     * Método getTimeOfDay: Este método permite obtener las horas mediante la diferencia entre dos fechas seleccionadas.
     * @return hours
     */
    public int getTimeOfDay() {
        dateFormat = new SimpleDateFormat("HH:mm:ss");
        start = new SimpleDateFormat("HH:mm:ss").format(dtTimeStart.getDate());
        fin = new SimpleDateFormat("HH:mm:ss").format(dtTimeFin.getDate());
        try {
            horaFinal = dateFormat.parse(fin);
            horaInicio = dateFormat.parse(start);
            diferencia = (int) ((horaFinal.getTime() - horaInicio.getTime()) / 1000);

            if (diferencia > 86400) {
                dias = (int) Math.floor(diferencia / 86400);
                diferencia = diferencia - (dias * 86400);
            }
            if (diferencia > 3600) {
                horas = (int) Math.floor(diferencia / 3600);
                diferencia = diferencia - (horas * 3600);
            }
            if (diferencia > 60) {
                minutos = (int) Math.floor(diferencia / 60);
                diferencia = diferencia - (minutos * 60);
            }
        } catch (ParseException ex) {
            Logger.getLogger(TimeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return horas;
    }

    /**
     * Método getTimeOfReason: Este método permite obtener las horas mediante la diferencia entre dos fechas seleccionadas.
     * @return hours
     */
    public int getTimeOfReason() {
        dateFormat = new SimpleDateFormat("HH:mm:ss");
        startR = new SimpleDateFormat("HH:mm:ss").format(dtReasonStart.getDate());
        finR = new SimpleDateFormat("HH:mm:ss").format(dtReasonFin.getDate());
        try {
            horaFinal = dateFormat.parse(finR);
            horaInicio = dateFormat.parse(startR);
            diferencia = (int) ((horaFinal.getTime() - horaInicio.getTime()) / 1000);

            if (diferencia > 86400) {
                dias = (int) Math.floor(diferencia / 86400);
                diferencia = diferencia - (dias * 86400);
            }
            if (diferencia > 3600) {
                horas = (int) Math.floor(diferencia / 3600);
                diferencia = diferencia - (horas * 3600);
            }
            if (diferencia > 60) {
                minutos = (int) Math.floor(diferencia / 60);
                diferencia = diferencia - (minutos * 60);
            }
        } catch (ParseException ex) {
            Logger.getLogger(TimeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return horas;
    }

    /**
     * Método getDay: Este método permite obtener el día de la semana de la fecha seleccionada.
     * @param day 
     */
    public void getDay(JCalendar day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(day.getDate());
        dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ROOT).toUpperCase();
    }

    /**
     * Método calculateHours: Este método permite calcular las horas.
     * @return totalHours
     */
    public int calculateHours() {
        int hoursDay = getTimeOfDay();
        int hoursReason = getTimeOfReason();

        totalHours = hoursDay - hoursReason;

        return totalHours;
    }

    /**
     * Método saveTimeWorkingDay: Este método permite guardar los datos de la jornada laboral en la base de datos.
     */
    public void saveTimeWorkingDay() {
        idUser = lblIdEmp.getText();
        timeStart = new SimpleDateFormat("HH:mm:ss").format(dtTimeStart.getDate());
        timeFin = new SimpleDateFormat("HH:mm:ss").format(dtTimeFin.getDate());
        timeReasonFin = new SimpleDateFormat("HH:mm:ss").format(dtReasonFin.getDate());
        timeReasonStart = new SimpleDateFormat("HH:mm:ss").format(dtReasonStart.getDate());

        total = calculateHours();
        getDay(dateAct);
        getDay(dtTimeStart.getJCalendar());
        getDay(dtTimeFin.getJCalendar());
        getDay(dtReasonStart.getJCalendar());
        getDay(dtReasonFin.getJCalendar());
        otherReasons();
        if (idUser.isEmpty() || dateActual.isEmpty() || timeStart.isEmpty() || timeFin.isEmpty() || timeReasonStart.isEmpty()
                || timeReasonFin.isEmpty() || reason.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            cleanData();
        } else if (dayOfWeek.equalsIgnoreCase("SATURDAY") || dayOfWeek.equalsIgnoreCase("SUNDAY")) {
            JOptionPane.showMessageDialog(null, "No se puede agregar el día seleccionado.", "ERROR", JOptionPane.ERROR_MESSAGE);
            cleanData();
        } else if((dtTimeFin.getDate().before(dtTimeStart.getDate())) || (dtReasonFin.getDate().before(dtReasonStart.getDate()))){
            JOptionPane.showMessageDialog(null, "El campo de la hora de fin no puede ser anterior a la hora de inicio .", "ERROR", JOptionPane.ERROR_MESSAGE);
            cleanData();
        } else {
            try {
                sql = "INSERT INTO registro_horas(IdEmpleado,FechaActual,HoraInicio,HoraFin,OtrasRazones,HoraInicioRazones,HoraFinRazones,HorasImputadas) VALUES "
                        + "('" + idUser + "','" + dateActual + "', STR_TO_DATE('" + timeStart + "','%H:%i:%s')"
                        + ", STR_TO_DATE('" + timeFin + "','%H:%i:%s'),'" + reason + "', STR_TO_DATE('" + timeReasonStart + "','%H:%i:%s')"
                        + ", STR_TO_DATE('" + timeReasonFin + "','%H:%i:%s'),'" + total + "')";

                conect = conn.getConexion();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "El registro se realizó correctamente.", "REGISTRO JORNADA", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException | SQLException ex) {
                System.err.println("Error:" + ex);
            }
        }
        cleanData();
    }
    
    /**
     * Método cleanData: Este método permite limpiar los campos del formulario.
     */
    public void cleanData(){     
        dtTimeStart.setCalendar(null);
        dtTimeFin.setCalendar(null);
        dtReasonStart.setCalendar(null);
        dtReasonFin.setCalendar(null);      
        lblDateActual.setText(""); 
    }

    /**
     * Método existDate: Este método permite comprobar si existe un registro con la fecha previamente seleccionada
     * en la base de datos.
     */
    public void existDate() {
        idUser = lblIdEmp.getText();
        dateNow = lblDateActual.getText();
        try {
            sql = "SELECT * FROM registro_horas WHERE IdEmpleado='" + idUser + "' AND FechaActual='" + dateNow + "'";
            conect = conn.getConexion();
            ps = conect.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Este usuario ya tiene un registro\n para esa fecha:"
                        + dateNow, "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                saveTimeWorkingDay();
            }
        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
        }
    }

    /**
     * Método otherReasons:  Este método permite añadir el valor del tipo de razón del horario laboral, según se seleccione en el campo del comboBox.
     */
    void otherReasons() {
        switch (cmbOtherReasons.getSelectedIndex()) {
            case 0:
                reason = "DESCANSO";
                break;
            case 1:
                reason = "TRABAJO EXTERIOR";
                break;
            case 2:
                reason = "FORMACION";
                break;
            default:
                throw new AssertionError();
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
            java.util.logging.Logger.getLogger(TimeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TimeScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    public javax.swing.JButton btnSaveTime;
    private javax.swing.JComboBox<String> cmbOtherReasons;
    private com.toedter.calendar.JCalendar dateAct;
    private com.toedter.calendar.JDateChooser dtReasonFin;
    private com.toedter.calendar.JDateChooser dtReasonStart;
    private com.toedter.calendar.JDateChooser dtTimeFin;
    private com.toedter.calendar.JDateChooser dtTimeStart;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDateActual;
    private javax.swing.JLabel lblDateNow;
    public javax.swing.JLabel lblIdEmp;
    private javax.swing.JLabel lblOtherReasons;
    private javax.swing.JLabel lblTimeFin;
    private javax.swing.JLabel lblTimeFinR;
    private javax.swing.JLabel lblTimeStart;
    private javax.swing.JLabel lblTimeStartR;
    // End of variables declaration//GEN-END:variables
}
