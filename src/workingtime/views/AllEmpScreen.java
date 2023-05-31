/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package workingtime.views;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import workingtime.database.Conexion;
import workingtime.model.CleanTable;
import workingtime.model.ResetFields;

/**
 *
 * @author Lidia Parral
 */
public final class AllEmpScreen extends javax.swing.JFrame {

    public ResetFields reset = new ResetFields();
    public CleanTable lmp = new CleanTable();

    Conexion conn = new Conexion();
    Connection conect;

    DefaultTableModel modelo = new DefaultTableModel();

    PreparedStatement ps;
    Statement st;

    ResultSet rs;

    String sql;
    String search;
    String email;
    String dpto;
    String tlf;
    String idUser;

    int selectedRow;
    Object[] options = {"Aceptar", "Cancelar"};
    int election;

    /**
     * Creates new form TodosEmpScreen
     */
    public AllEmpScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        lblNamSearch.setFont(new Font("Montserrat",Font.BOLD,12));
        btnUpdateEmp.setFont(new Font("Montserrat",Font.BOLD,12));
        btnDeleteEmp.setFont(new Font("Montserrat",Font.BOLD,12));
        btnReturn.setFont(new Font("Montserrat",Font.PLAIN,12));
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
        txtSearchEmp = new javax.swing.JTextField();
        btnSearchEmp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmp = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnUpdateEmp = new javax.swing.JButton();
        btnDeleteEmp = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        lblNamSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSearchEmp.setBackground(new java.awt.Color(38, 70, 166));
        btnSearchEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchEmp.setIcon(new javax.swing.ImageIcon("C:\\Users\\parra\\Downloads\\lupa (2).png")); // NOI18N
        btnSearchEmp.setToolTipText("Este botón permite buscar al usuario por nombre o apellido");
        btnSearchEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmpActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TablaEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellidos", "Fecha de Nacimiento", "DNI", "Email", "Telefono", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaEmp.setColumnSelectionAllowed(true);
        TablaEmp.setSelectionBackground(new java.awt.Color(255, 204, 153));
        jScrollPane1.setViewportView(TablaEmp);
        TablaEmp.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TablaEmp.getColumnModel().getColumnCount() > 0) {
            TablaEmp.getColumnModel().getColumn(0).setResizable(false);
            TablaEmp.getColumnModel().getColumn(3).setResizable(false);
            TablaEmp.getColumnModel().getColumn(4).setResizable(false);
            TablaEmp.getColumnModel().getColumn(5).setResizable(false);
            TablaEmp.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnUpdateEmp.setBackground(new java.awt.Color(38, 70, 166));
        btnUpdateEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateEmp.setText("ACTUALIZAR");
        btnUpdateEmp.setToolTipText("Este botón permite actualizar los datos del empleado seleccionado");
        btnUpdateEmp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmpActionPerformed(evt);
            }
        });

        btnDeleteEmp.setBackground(new java.awt.Color(255, 126, 60));
        btnDeleteEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEmp.setText("ELIMINAR");
        btnDeleteEmp.setToolTipText("Este botón permite eliminar al empleado seleccionado");
        btnDeleteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmpActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 470, Short.MAX_VALUE)
                .addComponent(btnUpdateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnDeleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblNamSearch.setText("Nombre o Apellidos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblNamSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNamSearch))
                    .addComponent(btnSearchEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmpActionPerformed
        search = txtSearchEmp.getText();
        if (search.equals("")) {
            JOptionPane.showMessageDialog(null, "No puede estar vacío este campo.", "TODOS LOS EMPLEADOS", JOptionPane.ERROR_MESSAGE);
        } else {
            if (TablaEmp.getRowCount() == 0) {
                existEmp();
            } else {
                lmp.tableCleaning(modelo);
                existEmp();
            }
        }
    }//GEN-LAST:event_btnSearchEmpActionPerformed

    private void btnUpdateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmpActionPerformed
        selectedRow = TablaEmp.getSelectedRow();
        election = JOptionPane.showOptionDialog(rootPane, "En realidad desea actualizar los datos del empleado permanentemente", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, "Aceptar");
        btnUpdateEmp.setBackground(new Color(252, 201, 131));
        if (election == JOptionPane.YES_OPTION) {
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún registro para actualizar", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {
                updateEmp();
                consultar();
            }
        } else if (election == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "No se ha actualizado el empleado de la base de datos", "EMPLEADO", JOptionPane.PLAIN_MESSAGE);
        }
        btnUpdateEmp.setBackground(new Color(38, 70, 166));
    }//GEN-LAST:event_btnUpdateEmpActionPerformed

    private void btnDeleteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmpActionPerformed
        selectedRow = TablaEmp.getSelectedRow();
        election = JOptionPane.showOptionDialog(rootPane, "En realidad desea eliminar los datos del empleado permanentemente", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, "Aceptar");
        btnDeleteEmp.setBackground(new Color(145, 150, 255));
        if (election == JOptionPane.YES_OPTION) {
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún registro para eliminar", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {
                deleteEmp();
                consultar();
            }
        } else if (election == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "No se ha actualizado el empleado de la base de datos", "EMPLEADO", JOptionPane.PLAIN_MESSAGE);
        }
        btnDeleteEmp.setBackground(new Color(255, 126, 60));
    }//GEN-LAST:event_btnDeleteEmpActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    public void consultar() {
        sql = "SELECT IdEmpleado,Nombre,Apellidos,DNI,FechaNac,Departamento,Email,Telefono FROM empleados";

        try {
            conect = conn.getConexion();
            st = conect.createStatement();
            rs = st.executeQuery(sql);

            Object[] empleado = new Object[8];
            modelo = (DefaultTableModel) TablaEmp.getModel();
            while (rs.next()) {
                empleado[0] = rs.getInt("IdEmpleado");
                empleado[1] = rs.getString("Nombre");
                empleado[2] = rs.getString("Apellidos");
                empleado[3] = rs.getString("DNI");
                empleado[4] = rs.getDate("FechaNac");
                empleado[5] = rs.getString("Email");
                empleado[6] = rs.getString("Telefono");
                empleado[7] = rs.getString("Departamento");

                modelo.addRow(empleado);
            }
            TablaEmp.setModel(modelo);
        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
        }
    }

    public void updateEmp() {
        idUser = String.valueOf(modelo.getValueAt(TablaEmp.getSelectedRow(), 0));
        email = String.valueOf(modelo.getValueAt(TablaEmp.getSelectedRow(), 5));
        tlf = String.valueOf(modelo.getValueAt(TablaEmp.getSelectedRow(), 6));
        dpto = String.valueOf(modelo.getValueAt(TablaEmp.getSelectedRow(), 7));
        try {

            sql = "UPDATE empleados SET Email='" + email + "', Telefono='" + tlf + "', Departamento='" + dpto
                    + "' WHERE IdEmpleado ='" + idUser + "'";

            conect = conn.getConexion();
            st = conect.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
        }
        lmp.tableCleaning(modelo);
    }

    public void deleteEmp() {
        idUser = String.valueOf(modelo.getValueAt(TablaEmp.getSelectedRow(), 0));
        try {
            sql = "DELETE FROM empleados WHERE IdEmpleado='" + idUser + "'";

            conect = conn.getConexion();
            st = conect.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
        }
        lmp.tableCleaning(modelo);
    }

    /**
     * Método que permite comprobar si existe un cliente con ese nombre en la
     * tabla Clientes de la base de datos.
     */
    public void existEmp() {
        sql = "SELECT * FROM empleados WHERE Nombre LIKE'%" + txtSearchEmp.getText() + "%' OR Apellidos LIKE'%"
                + txtSearchEmp.getText() + "%'";

        try {
            conect = conn.getConexion();
            ps = conect.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            Object[] empleado = new Object[8];
            modelo = (DefaultTableModel) TablaEmp.getModel();
            if (rs.next()) {
                empleado[0] = rs.getInt("IdEmpleado");
                empleado[1] = rs.getString("Nombre");
                empleado[2] = rs.getString("Apellidos");
                empleado[3] = rs.getString("DNI");
                empleado[4] = rs.getDate("FechaNac");
                empleado[5] = rs.getString("Email");
                empleado[6] = rs.getString("Telefono");
                empleado[7] = rs.getString("Departamento");

                modelo.addRow(empleado);
            }
            TablaEmp.setModel(modelo);

        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
        }

        reset.ResetPanel(jPanel2);
        reset.ResetPanel(jPanel1);

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
            java.util.logging.Logger.getLogger(AllEmpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllEmpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllEmpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllEmpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AllEmpScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEmp;
    public javax.swing.JButton btnDeleteEmp;
    private javax.swing.JButton btnReturn;
    public javax.swing.JButton btnSearchEmp;
    public javax.swing.JButton btnUpdateEmp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNamSearch;
    public javax.swing.JTextField txtSearchEmp;
    // End of variables declaration//GEN-END:variables
}
