/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shanu
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    String data2[] = new String[7];
    public Login() {
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

        T_phone = new javax.swing.JTextField();
        Label_phone = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        T_pass = new javax.swing.JTextField();
        Btn_sign = new javax.swing.JButton();
        Btn_Register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        T_phone.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        T_phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Label_phone.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        Label_phone.setText("Phone :");

        jLabel1.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        jLabel1.setText("Password : ");

        T_pass.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        T_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_passActionPerformed(evt);
            }
        });

        Btn_sign.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        Btn_sign.setText("Sign In");
        Btn_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_signActionPerformed(evt);
            }
        });

        Btn_Register.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        Btn_Register.setText("Register");
        Btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_sign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(T_phone)
                    .addComponent(T_pass)
                    .addComponent(Btn_Register, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_passActionPerformed

    private void Btn_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_signActionPerformed
        // TODO add your handling code here:
        if(T_phone.getText().equals(data2[0]) && T_pass.getText().equals(data2[1])){
            System.out.println("yess");
        }
        else if (!T_pass.getText().equals(data2[1])){
            JOptionPane.showMessageDialog(new JFrame(), "Wrong Password", "Dialog",JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(new JFrame(), "Wrong Phone number", "Dialog",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Btn_signActionPerformed

    private void Btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegisterActionPerformed
        // TODO add your handling code here:
        //❤️❤️❤️❤️❤️❤️❤️
    }//GEN-LAST:event_Btn_RegisterActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Register;
    private javax.swing.JButton Btn_sign;
    private javax.swing.JLabel Label_phone;
    private javax.swing.JTextField T_pass;
    private javax.swing.JTextField T_phone;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
