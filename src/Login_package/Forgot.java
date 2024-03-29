/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_package;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Himanshu
 */
public class Forgot extends javax.swing.JFrame {

    /**
     * Creates new form Forgot
     */
    public Forgot() {
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

        jPanel2 = new javax.swing.JPanel();
        jlLogin = new javax.swing.JLabel();
        jlCLose = new javax.swing.JLabel();
        jlMinimize = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlUsername = new javax.swing.JLabel();
        jlMobile = new javax.swing.JLabel();
        jtUsername = new javax.swing.JTextField();
        jtMobile = new javax.swing.JTextField();
        jbForgot = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlLogin.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jlLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlLogin.setText("Forgot Password");
        jPanel2.add(jlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 36));

        jlCLose.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jlCLose.setForeground(new java.awt.Color(255, 255, 255));
        jlCLose.setText("X");
        jlCLose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCLoseMouseClicked(evt);
            }
        });
        jPanel2.add(jlCLose, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 50));

        jlMinimize.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jlMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jlMinimize.setText("-");
        jlMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimizeMouseClicked(evt);
            }
        });
        jPanel2.add(jlMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 20, 50));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jlUsername.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlUsername.setText("Username");

        jlMobile.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlMobile.setText("Mobile no.");

        jtUsername.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUsernameActionPerformed(evt);
            }
        });
        jtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtUsernameKeyTyped(evt);
            }
        });

        jtMobile.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMobileActionPerformed(evt);
            }
        });
        jtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMobileKeyTyped(evt);
            }
        });

        jbForgot.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbForgot.setText("Continue");
        jbForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbForgotActionPerformed(evt);
            }
        });

        jbCancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbCancel.setText("Cancel");
        jbCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCancelMouseClicked(evt);
            }
        });
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlUsername)
                            .addComponent(jlMobile)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jbForgot)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton1)
                        .addGap(96, 96, 96)
                        .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUsername)
                    .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMobile)
                    .addComponent(jtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbForgot)
                    .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlCLoseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCLoseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlCLoseMouseClicked

    private void jlMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jlMinimizeMouseClicked

    private void jtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsernameActionPerformed

    private void jtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtUsernameKeyTyped
        //////////////////////////to restrict entering characters
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtUsernameKeyTyped

    private void jtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMobileActionPerformed

    private void jtMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMobileKeyTyped
        //////////////////////////to restrict entering characters
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtMobileKeyTyped

    private void jbForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbForgotActionPerformed
            try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/xyz?autoReconnect=true&useSSL=false";
            ///////////////////////////?autoReconnect=true&useSSL=false to remove ssl error
            String username="root";
            String password="zxcv";
            Connection con=DriverManager.getConnection(url,username,password);
            String query="select * from student where uname=? and mobile=?";//////////////////////////if you dont know how to concatenate
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,jtUsername.getText());
            pst.setString(2,String.valueOf(jtMobile.getText()));
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                this.dispose();
                JOptionPane.showMessageDialog(null,"Password is sent to your mobile no.");
                Login login=new Login();
                login.setVisible(true);
                login.pack();
                login.setLocationRelativeTo(null);
                login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Username or Mobile no.","Unsuccessful!",JOptionPane.ERROR_MESSAGE);
                jtUsername.setText("");
                jtMobile.setText("");
            }
            pst.close();
            con.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jbForgotActionPerformed

    private void jbCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jbCancelMouseClicked

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbCancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbForgot;
    private javax.swing.JLabel jlCLose;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlMinimize;
    private javax.swing.JLabel jlMobile;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JTextField jtMobile;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables
}
