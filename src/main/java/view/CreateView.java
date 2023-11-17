/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author El Rey
 */
public class CreateView extends javax.swing.JFrame {

    /**
     * Creates new form Create
     */
    public CreateView() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        campoTipoUsuario = new javax.swing.JComboBox<>();
        jTextField9 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        botonEnviar = new javax.swing.JButton();
        campoApellido = new javax.swing.JTextField();
        campoId = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoTipoTel = new javax.swing.JComboBox<>();
        campoCelular = new javax.swing.JTextField();
        campoNacimiento = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(196, 196, 196));
        jPanel1.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(196, 196, 196));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextField1.setText("Digite los siguientes datos");
        jTextField1.setBorder(null);
        jTextField1.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField1.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(260, 50, 470, 100);

        jTextField7.setBackground(new java.awt.Color(196, 196, 196));
        jTextField7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Fecha de nacimiento");
        jTextField7.setAlignmentX(0.0F);
        jTextField7.setBorder(null);
        jTextField7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField7.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField7.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField7.setName(""); // NOI18N
        jTextField7.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jTextField7);
        jTextField7.setBounds(60, 380, 190, 54);

        jTextField4.setBackground(new java.awt.Color(196, 196, 196));
        jTextField4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Nombre");
        jTextField4.setAlignmentX(0.0F);
        jTextField4.setBorder(null);
        jTextField4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField4.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField4.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField4.setName(""); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(0, 0));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(60, 260, 100, 40);

        jTextField5.setBackground(new java.awt.Color(196, 196, 196));
        jTextField5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Telefono");
        jTextField5.setAlignmentX(0.0F);
        jTextField5.setBorder(null);
        jTextField5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField5.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField5.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField5.setName(""); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(0, 0));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(510, 260, 110, 40);

        jTextField8.setBackground(new java.awt.Color(196, 196, 196));
        jTextField8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Tipo de telefono");
        jTextField8.setAlignmentX(0.0F);
        jTextField8.setBorder(null);
        jTextField8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField8.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField8.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField8.setName(""); // NOI18N
        jTextField8.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jTextField8);
        jTextField8.setBounds(500, 190, 200, 54);

        campoTipoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "profesor", "empleado" }));
        campoTipoUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        campoTipoUsuario.setMaximumSize(new java.awt.Dimension(0, 0));
        campoTipoUsuario.setMinimumSize(new java.awt.Dimension(0, 0));
        campoTipoUsuario.setPreferredSize(new java.awt.Dimension(0, 0));
        campoTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(campoTipoUsuario);
        campoTipoUsuario.setBounds(280, 200, 175, 40);

        jTextField9.setBackground(new java.awt.Color(196, 196, 196));
        jTextField9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Tipo de usuario");
        jTextField9.setAlignmentX(0.0F);
        jTextField9.setBorder(null);
        jTextField9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField9.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField9.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField9.setName(""); // NOI18N
        jTextField9.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jTextField9);
        jTextField9.setBounds(60, 190, 180, 54);

        jTextField14.setBackground(new java.awt.Color(196, 196, 196));
        jTextField14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Direccion");
        jTextField14.setAlignmentX(0.0F);
        jTextField14.setBorder(null);
        jTextField14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField14.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField14.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField14.setName(""); // NOI18N
        jTextField14.setPreferredSize(new java.awt.Dimension(0, 0));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField14);
        jTextField14.setBounds(510, 320, 120, 40);

        jTextField15.setBackground(new java.awt.Color(196, 196, 196));
        jTextField15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("Numero de identificacion");
        jTextField15.setAlignmentX(0.0F);
        jTextField15.setBorder(null);
        jTextField15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField15.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField15.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField15.setName(""); // NOI18N
        jTextField15.setPreferredSize(new java.awt.Dimension(0, 0));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField15);
        jTextField15.setBounds(500, 380, 190, 40);

        jTextField16.setBackground(new java.awt.Color(196, 196, 196));
        jTextField16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("Apellido");
        jTextField16.setAlignmentX(0.0F);
        jTextField16.setBorder(null);
        jTextField16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField16.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField16.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField16.setName(""); // NOI18N
        jTextField16.setPreferredSize(new java.awt.Dimension(0, 0));
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField16);
        jTextField16.setBounds(60, 320, 100, 40);

        jTextField17.setBackground(new java.awt.Color(196, 196, 196));
        jTextField17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Developed by jviedman dev - enriquez dev");
        jTextField17.setBorder(null);
        jPanel1.add(jTextField17);
        jTextField17.setBounds(211, 540, 520, 19);

        botonEnviar.setBackground(new java.awt.Color(131, 131, 131));
        botonEnviar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEnviar.setText("Enviar");
        botonEnviar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEnviar);
        botonEnviar.setBounds(400, 460, 170, 60);

        campoApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        campoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(campoApellido);
        campoApellido.setBounds(280, 320, 180, 40);

        campoId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(campoId);
        campoId.setBounds(720, 380, 180, 40);

        campoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        jPanel1.add(campoNombre);
        campoNombre.setBounds(280, 260, 180, 40);

        campoTipoTel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        campoTipoTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(campoTipoTel);
        campoTipoTel.setBounds(720, 200, 180, 40);

        campoCelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        campoCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCelularActionPerformed(evt);
            }
        });
        jPanel1.add(campoCelular);
        campoCelular.setBounds(720, 260, 180, 40);

        campoNacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        campoNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNacimientoActionPerformed(evt);
            }
        });
        jPanel1.add(campoNacimiento);
        campoNacimiento.setBounds(280, 390, 180, 40);

        campoDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        campoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(campoDireccion);
        campoDireccion.setBounds(720, 320, 180, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void campoTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTipoUsuarioActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEnviarActionPerformed

    private void campoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApellidoActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCelularActionPerformed

    private void campoNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNacimientoActionPerformed

    private void campoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDireccionActionPerformed

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
            java.util.logging.Logger.getLogger(CreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* CreateView and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonEnviar;
    public javax.swing.JTextField campoApellido;
    public javax.swing.JTextField campoCelular;
    public javax.swing.JTextField campoDireccion;
    public javax.swing.JTextField campoId;
    public javax.swing.JTextField campoNacimiento;
    public javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox<String> campoTipoTel;
    public javax.swing.JComboBox<String> campoTipoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
