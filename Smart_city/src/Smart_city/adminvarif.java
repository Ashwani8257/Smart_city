/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demo;

/**
 *
 * @author ASHWANI KUMAR
 */
import  javax.swing.*;
public class adminvarif extends javax.swing.JFrame {
   JFrame f;
    /**
     * Creates new form adminvarif
     */
    public adminvarif() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        textField2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(78, 105, 93, 26);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(78, 166, 67, 26);

        textField1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField1TextValueChanged(evt);
            }
        });
        getContentPane().add(textField1);
        textField1.setBounds(230, 111, 95, 20);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(117, 210, 134, 34);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("ADMIN AUTHENTICATION PAGE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 45, 204, 20);

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(316, 20, 72, 45);
        getContentPane().add(textField2);
        textField2.setBounds(230, 169, 95, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/add.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 20, 440, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String userValue = textField1.getText();          
        String passValue = textField2.getText();                  
        if (userValue.equals("Ashwani") && passValue.equals("exam")) {  
            setVisible(false);
            admin page = new admin();   
            page.setVisible(true);  
            page.setSize(800,800);
               
           // JLabel wel_label = new JLabel("Welcome: "+userValue);  
           // page.getContentPane().add(wel_label); 
            JOptionPane.showMessageDialog(f,"Hello! Admin, Welcome to Smart city.");  
        }  
        else{  
         
           // String s=JOptionPane.showMessageDialog(userValue,"Hello, Welcome to Javatpoint.");
           JOptionPane.showMessageDialog(f,"Please Enter Correct UserName Password");  
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textField1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField1TextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1TextValueChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        NewJFrame n1=new NewJFrame();
        n1.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        adminvarif a1=new adminvarif();
        a1.setVisible(true);
        a1.setSize(500,500);
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
            java.util.logging.Logger.getLogger(adminvarif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminvarif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminvarif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminvarif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminvarif().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.TextField textField1;
    private javax.swing.JPasswordField textField2;
    // End of variables declaration//GEN-END:variables
}
