/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package workingtime.views;

import java.awt.Color;

/**
 *
 * @author Lidia Parral
 */
public class HomeScreen extends javax.swing.JFrame {

    private LoginScreen login = new LoginScreen();
    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        lblIdEmp.setVisible(false);
        lblNomEmp.setVisible(false);
        lblApellidosEmp.setVisible(false);
        lblDNIEmp.setVisible(false);
        lblEmailEmp.setVisible(false);
        lblGrupoCot.setVisible(false);
        lblGrupoProf.setVisible(false);
        lblNumSS.setVisible(false);
        lblPuestoEmp.setVisible(false);
        lblDepartamento.setVisible(false);
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
        lblNomEmp = new javax.swing.JLabel();
        lblIdEmp = new javax.swing.JLabel();
        lblEmailEmp = new javax.swing.JLabel();
        lblApellidosEmp = new javax.swing.JLabel();
        lblPuestoEmp = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        lblNumSS = new javax.swing.JLabel();
        lblGrupoCot = new javax.swing.JLabel();
        lblGrupoProf = new javax.swing.JLabel();
        lblDNIEmp = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        mnbHome = new javax.swing.JMenuBar();
        mnHorario = new javax.swing.JMenu();
        mnRegistroJornada = new javax.swing.JMenuItem();
        mnTodosHorarios = new javax.swing.JMenuItem();
        mnRegistroAusencias = new javax.swing.JMenuItem();
        mnPago = new javax.swing.JMenu();
        mnNomina = new javax.swing.JMenuItem();
        mnDocumentos = new javax.swing.JMenu();
        mnAddDoc = new javax.swing.JMenuItem();
        mnTodosDocumentos = new javax.swing.JMenuItem();
        mnPerfil = new javax.swing.JMenu();
        mnPerfilUser = new javax.swing.JMenuItem();
        mnEmple = new javax.swing.JMenu();
        mnControlEmp = new javax.swing.JMenuItem();
        mnAllEmp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNomEmp.setEnabled(false);
        lblNomEmp.setFocusable(false);

        lblIdEmp.setEnabled(false);
        lblIdEmp.setFocusable(false);

        lblEmailEmp.setEnabled(false);
        lblEmailEmp.setFocusable(false);

        lblApellidosEmp.setEnabled(false);
        lblApellidosEmp.setFocusable(false);

        lblPuestoEmp.setEnabled(false);
        lblPuestoEmp.setFocusable(false);

        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\parra\\Downloads\\workingtime_home.png")); // NOI18N

        btnLogout.setBackground(new java.awt.Color(38, 70, 166));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumSS)
                        .addGap(46, 46, 46)
                        .addComponent(lblGrupoCot)
                        .addGap(58, 58, 58)
                        .addComponent(lblGrupoProf)
                        .addGap(98, 98, 98))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellidosEmp)
                            .addComponent(lblPuestoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblDNIEmp)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(lblIdEmp))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(lblDepartamento)))
                            .addGap(113, 113, 113))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblEmailEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(283, 283, 283)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblEmailEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblApellidosEmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPuestoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumSS)
                            .addComponent(lblGrupoCot)
                            .addComponent(lblGrupoProf))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lblIdEmp))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lblDepartamento)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDNIEmp))
                        .addGap(17, 17, 17))))
        );

        mnHorario.setText("Horario");

        mnRegistroJornada.setText("Registro jornada");
        mnRegistroJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegistroJornadaActionPerformed(evt);
            }
        });
        mnHorario.add(mnRegistroJornada);

        mnTodosHorarios.setText("Todos los registros");
        mnTodosHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTodosHorariosActionPerformed(evt);
            }
        });
        mnHorario.add(mnTodosHorarios);

        mnRegistroAusencias.setText("Registro ausencias");
        mnRegistroAusencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegistroAusenciasActionPerformed(evt);
            }
        });
        mnHorario.add(mnRegistroAusencias);

        mnbHome.add(mnHorario);

        mnPago.setText("Pago");

        mnNomina.setText("Nómina");
        mnNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNominaActionPerformed(evt);
            }
        });
        mnPago.add(mnNomina);

        mnbHome.add(mnPago);

        mnDocumentos.setText("Documentos");

        mnAddDoc.setText("Añadir documento");
        mnAddDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAddDocActionPerformed(evt);
            }
        });
        mnDocumentos.add(mnAddDoc);

        mnTodosDocumentos.setText("Todos los documentos");
        mnTodosDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTodosDocumentosActionPerformed(evt);
            }
        });
        mnDocumentos.add(mnTodosDocumentos);

        mnbHome.add(mnDocumentos);

        mnPerfil.setText("Perfil");
        mnPerfil.setBorderPainted(false);

        mnPerfilUser.setText("Perfil del usuario");
        mnPerfil.add(mnPerfilUser);

        mnbHome.add(mnPerfil);

        mnEmple.setText("Empleados");

        mnControlEmp.setText("Control empleados");
        mnControlEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnControlEmpActionPerformed(evt);
            }
        });
        mnEmple.add(mnControlEmp);

        mnAllEmp.setText("Todos los empleados");
        mnAllEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAllEmpActionPerformed(evt);
            }
        });
        mnEmple.add(mnAllEmp);

        mnbHome.add(mnEmple);

        setJMenuBar(mnbHome);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnRegistroJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegistroJornadaActionPerformed
        HorarioScreen horario = new HorarioScreen();
        horario.lblIdEmp.setText(lblIdEmp.getText());
        horario.setVisible(true);
    }//GEN-LAST:event_mnRegistroJornadaActionPerformed

    private void mnNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNominaActionPerformed
        NominaScreen nomina = new NominaScreen();
        nomina.lblIdUser.setText(lblIdEmp.getText());
        nomina.lblNombreEmp.setText(lblNomEmp.getText().toUpperCase());
        nomina.lblApellidosEmp.setText(lblApellidosEmp.getText().toUpperCase());
        nomina.lblDNIEmp.setText(lblDNIEmp.getText());
        nomina.lblGrupoCotizEmp.setText(lblGrupoCot.getText());
        nomina.lblGrupoProfEmp.setText(lblGrupoProf.getText().toUpperCase());
        nomina.lblNumSSEmp.setText(lblNumSS.getText());
        nomina.lblPuestoEmp.setText(lblPuestoEmp.getText().toUpperCase());
        nomina.existNominas();
        nomina.setVisible(true);
    }//GEN-LAST:event_mnNominaActionPerformed

    private void mnTodosDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTodosDocumentosActionPerformed
        TodosDocumentosScreen doc = new TodosDocumentosScreen();
        doc.setVisible(true);
    }//GEN-LAST:event_mnTodosDocumentosActionPerformed

    private void mnRegistroAusenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegistroAusenciasActionPerformed
        AusenciasScreen aus = new AusenciasScreen();
        aus.lblIdEmp.setText(lblIdEmp.getText());
        aus.lblDepartamento.setText(lblDepartamento.getText());
        aus.consultar();
        aus.setVisible(true);
    }//GEN-LAST:event_mnRegistroAusenciasActionPerformed

    private void mnControlEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnControlEmpActionPerformed
        ControlEmpScreen control = new ControlEmpScreen();
        control.setVisible(true);
    }//GEN-LAST:event_mnControlEmpActionPerformed

    private void mnAddDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAddDocActionPerformed
        AddDocScreen addDoc = new AddDocScreen();
        addDoc.lblIdEmp.setText(lblIdEmp.getText());
        addDoc.setVisible(true);
    }//GEN-LAST:event_mnAddDocActionPerformed

    private void mnAllEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAllEmpActionPerformed
        TodosEmpScreen todos = new TodosEmpScreen();
        todos.setVisible(true);
    }//GEN-LAST:event_mnAllEmpActionPerformed

    private void mnTodosHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTodosHorariosActionPerformed
        TodosHorariosScreen todosHora = new TodosHorariosScreen();
        todosHora.lblIdEmp.setText(lblIdEmp.getText());
        todosHora.existJornada();
        todosHora.setVisible(true);        
    }//GEN-LAST:event_mnTodosHorariosActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomeScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblApellidosEmp;
    public javax.swing.JLabel lblDNIEmp;
    public javax.swing.JLabel lblDepartamento;
    public javax.swing.JLabel lblEmailEmp;
    public javax.swing.JLabel lblGrupoCot;
    public javax.swing.JLabel lblGrupoProf;
    public javax.swing.JLabel lblIdEmp;
    public javax.swing.JLabel lblNomEmp;
    public javax.swing.JLabel lblNumSS;
    public javax.swing.JLabel lblPuestoEmp;
    private javax.swing.JMenuItem mnAddDoc;
    public javax.swing.JMenuItem mnAllEmp;
    public javax.swing.JMenuItem mnControlEmp;
    private javax.swing.JMenu mnDocumentos;
    public javax.swing.JMenu mnEmple;
    private javax.swing.JMenu mnHorario;
    public javax.swing.JMenuItem mnNomina;
    private javax.swing.JMenu mnPago;
    private javax.swing.JMenu mnPerfil;
    public javax.swing.JMenuItem mnPerfilUser;
    private javax.swing.JMenuItem mnRegistroAusencias;
    private javax.swing.JMenuItem mnRegistroJornada;
    public javax.swing.JMenuItem mnTodosDocumentos;
    public javax.swing.JMenuItem mnTodosHorarios;
    private javax.swing.JMenuBar mnbHome;
    // End of variables declaration//GEN-END:variables
}
