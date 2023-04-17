/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package workingtime.views;

/**
 *
 * @author Lidia Parral
 */
public class HomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        mnbHome = new javax.swing.JMenuBar();
        mnHorario = new javax.swing.JMenu();
        mnRegistroJornada = new javax.swing.JMenuItem();
        mnRegistroAusencias = new javax.swing.JMenuItem();
        mnPago = new javax.swing.JMenu();
        mnNomina = new javax.swing.JMenuItem();
        mnDocumentos = new javax.swing.JMenu();
        mnAddDoc = new javax.swing.JMenuItem();
        mnTodosDocumentos = new javax.swing.JMenuItem();
        mnPerfil = new javax.swing.JMenu();
        mnPerfilUser = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        mnHorario.setText("Horario");

        mnRegistroJornada.setText("Registro jornada");
        mnRegistroJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegistroJornadaActionPerformed(evt);
            }
        });
        mnHorario.add(mnRegistroJornada);

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

        setJMenuBar(mnbHome);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnRegistroJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegistroJornadaActionPerformed
        HorarioScreen horario = new HorarioScreen();
        horario.setVisible(true);
    }//GEN-LAST:event_mnRegistroJornadaActionPerformed

    private void mnNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNominaActionPerformed
        NominaScreen nomina = new NominaScreen();
        nomina.setVisible(true);
    }//GEN-LAST:event_mnNominaActionPerformed

    private void mnTodosDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTodosDocumentosActionPerformed
        DocumentosScreen doc = new DocumentosScreen();
        doc.setVisible(true);
    }//GEN-LAST:event_mnTodosDocumentosActionPerformed

    private void mnRegistroAusenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegistroAusenciasActionPerformed
        AusenciasScreen aus = new AusenciasScreen();
        aus.setVisible(true);
    }//GEN-LAST:event_mnRegistroAusenciasActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem mnAddDoc;
    private javax.swing.JMenu mnDocumentos;
    private javax.swing.JMenu mnHorario;
    public javax.swing.JMenuItem mnNomina;
    private javax.swing.JMenu mnPago;
    private javax.swing.JMenu mnPerfil;
    public javax.swing.JMenuItem mnPerfilUser;
    private javax.swing.JMenuItem mnRegistroAusencias;
    private javax.swing.JMenuItem mnRegistroJornada;
    public javax.swing.JMenuItem mnTodosDocumentos;
    private javax.swing.JMenuBar mnbHome;
    // End of variables declaration//GEN-END:variables
}
