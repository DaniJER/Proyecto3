/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author El Rey
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listarButton = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(195, 195, 195));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 600));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogoUnivalle.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(190, 270));
        jLabel1.setMinimumSize(new java.awt.Dimension(190, 270));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(190, 270));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(720, 30, 190, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogoUnivalle.jpeg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jLabel2.setMaximumSize(new java.awt.Dimension(190, 270));
        jLabel2.setMinimumSize(new java.awt.Dimension(190, 270));
        jLabel2.setName(""); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(190, 270));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(31, 30, 190, 270);

        listarButton.setBackground(new java.awt.Color(131, 131, 131));
        listarButton.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        listarButton.setForeground(new java.awt.Color(0, 0, 0));
        listarButton.setText("Listar");
        listarButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), java.awt.Color.black));
        listarButton.setMaximumSize(new java.awt.Dimension(170, 75));
        listarButton.setMinimumSize(new java.awt.Dimension(170, 75));
        listarButton.setPreferredSize(new java.awt.Dimension(170, 75));
        listarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(listarButton);
        listarButton.setBounds(480, 340, 170, 75);

        Agregar.setBackground(new java.awt.Color(131, 131, 131));
        Agregar.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        Agregar.setForeground(new java.awt.Color(0, 0, 0));
        Agregar.setText("Agregar");
        Agregar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        Agregar.setMaximumSize(new java.awt.Dimension(170, 75));
        Agregar.setMinimumSize(new java.awt.Dimension(170, 75));
        Agregar.setPreferredSize(new java.awt.Dimension(170, 75));
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(Agregar);
        Agregar.setBounds(270, 230, 170, 75);

        actualizar.setBackground(new java.awt.Color(131, 131, 131));
        actualizar.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        actualizar.setForeground(new java.awt.Color(0, 0, 0));
        actualizar.setText("Actualizar");
        actualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        actualizar.setMaximumSize(new java.awt.Dimension(170, 75));
        actualizar.setMinimumSize(new java.awt.Dimension(170, 75));
        actualizar.setPreferredSize(new java.awt.Dimension(170, 75));
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar);
        actualizar.setBounds(480, 230, 170, 75);

        jButton4.setBackground(new java.awt.Color(131, 131, 131));
        jButton4.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Eliminar");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        jButton4.setMaximumSize(new java.awt.Dimension(170, 75));
        jButton4.setMinimumSize(new java.awt.Dimension(170, 75));
        jButton4.setPreferredSize(new java.awt.Dimension(170, 75));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(270, 340, 170, 75);

        jTextField3.setBackground(new java.awt.Color(196, 196, 196));
        jTextField3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Developed by jviedman dev - enriquez dev");
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(211, 540, 520, 19);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bienvenido");
        jLabel3.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel3.setPreferredSize(new java.awt.Dimension(195, 90));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 120, 195, 82);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Universidad del Valle");
        jLabel4.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setPreferredSize(new java.awt.Dimension(435, 90));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 30, 435, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarButtonActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Agregar;
    public javax.swing.JButton actualizar;
    public javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    public javax.swing.JButton listarButton;
    // End of variables declaration//GEN-END:variables
}
