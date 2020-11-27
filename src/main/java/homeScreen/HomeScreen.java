/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeScreen;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kolsu
 */
public class HomeScreen extends javax.swing.JFrame {

    private Databaseconn databaseconn;

    /**
     * Creates new form login
     */
    public HomeScreen() {
        initComponents();
        databaseconn = new Databaseconn();//Calling Constructor (creating object)
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        HomeffinsText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        signInText = new javax.swing.JLabel();
        emailText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emailInput = new javax.swing.JTextPane();
        passwordInput = new javax.swing.JPasswordField();
        userSignInButton = new javax.swing.JButton();
        dhaaText = new javax.swing.JLabel();
        userSignUpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        adminSignInButton = new javax.swing.JButton();
        HomeffinsSubtext = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Homeffins");
        setBackground(new java.awt.Color(23, 23, 29));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(23, 23, 29));

        HomeffinsText.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        HomeffinsText.setForeground(new java.awt.Color(255, 255, 255));
        HomeffinsText.setText("Homeffins");

        jPanel3.setBackground(new java.awt.Color(51, 142, 218));

        signInText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signInText.setForeground(new java.awt.Color(255, 255, 255));
        signInText.setText("Sign In");

        emailText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        emailText.setText("Email");

        passwordText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setText("Password");

        emailInput.setBackground(new java.awt.Color(255, 255, 255));
        emailInput.setForeground(new java.awt.Color(23, 23, 29));
        jScrollPane1.setViewportView(emailInput);

        passwordInput.setBackground(new java.awt.Color(255, 255, 255));
        passwordInput.setForeground(new java.awt.Color(23, 23, 29));
        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });

        userSignInButton.setBackground(new java.awt.Color(23, 23, 29));
        userSignInButton.setForeground(new java.awt.Color(255, 255, 255));
        userSignInButton.setText("Sign In");
        userSignInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userSignInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userSignInButtonMouseClicked(evt);
            }
        });
        userSignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSignInButtonActionPerformed(evt);
            }
        });

        dhaaText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dhaaText.setForeground(new java.awt.Color(255, 255, 255));
        dhaaText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dhaaText.setText("Don't have an account?");
        dhaaText.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        userSignUpButton.setBackground(new java.awt.Color(23, 23, 29));
        userSignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        userSignUpButton.setText("Sign Up");
        userSignUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userSignUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userSignUpButtonMouseClicked(evt);
            }
        });
        userSignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSignUpButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signInText)
                .addGap(107, 107, 107))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userSignInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordText)
                    .addComponent(emailText)
                    .addComponent(jScrollPane1)
                    .addComponent(passwordInput)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dhaaText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userSignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(signInText)
                .addGap(51, 51, 51)
                .addComponent(emailText)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(passwordText)
                .addGap(18, 18, 18)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(userSignInButton)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dhaaText)
                    .addComponent(userSignUpButton))
                .addContainerGap())
        );

        adminSignInButton.setBackground(new java.awt.Color(23, 23, 29));
        adminSignInButton.setForeground(new java.awt.Color(255, 255, 255));
        adminSignInButton.setText("Admin Sign In");
        adminSignInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        adminSignInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminSignInButtonMouseClicked(evt);
            }
        });
        adminSignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSignInButtonActionPerformed(evt);
            }
        });

        HomeffinsSubtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HomeffinsSubtext.setForeground(new java.awt.Color(255, 255, 255));
        HomeffinsSubtext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeffinsSubtext.setText("Taste of Home in Tiffin");
        HomeffinsSubtext.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(HomeffinsText)
                    .addComponent(HomeffinsSubtext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminSignInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(321, 321, 321))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(HomeffinsSubtext))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(HomeffinsText)))
                .addGap(403, 403, 403)
                .addComponent(adminSignInButton)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSignInButtonActionPerformed
        // TODO add your handling code here:
        System.out.println(emailInput.getText() + passwordInput.getText());

        ArrayList<String> result = databaseconn.getSignInUser(emailInput.getText(), passwordInput.getText());

        System.out.println("HOMESCREEN" + result);
        if (result.size() > 0) {
            setVisible(false);
            String id = result.get(0);
            String name = result.get(1);
            String Dp = result.get(2);
            System.out.println(name);
            new Menu(name.toString() , Dp.toString() , id.toString()).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Login Information is Incorrect.");
        }

    }//GEN-LAST:event_userSignInButtonActionPerformed

    private void userSignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSignUpButtonActionPerformed
        setVisible(false);
        new SignUpUser().setVisible(true);
    }//GEN-LAST:event_userSignUpButtonActionPerformed

    private void adminSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSignInButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_adminSignInButtonActionPerformed

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed

    private void adminSignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminSignInButtonMouseClicked
        // TODO add your handling code here:

        setVisible(false);
        new adminLogin().setVisible(true);

    }//GEN-LAST:event_adminSignInButtonMouseClicked

    private void userSignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSignInButtonMouseClicked

    }//GEN-LAST:event_userSignInButtonMouseClicked

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained

    }//GEN-LAST:event_jLabel1FocusGained

    private void userSignUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSignUpButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userSignUpButtonMouseClicked

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeffinsSubtext;
    private javax.swing.JLabel HomeffinsText;
    private javax.swing.JButton adminSignInButton;
    private javax.swing.JLabel dhaaText;
    private javax.swing.JTextPane emailInput;
    private javax.swing.JLabel emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordText;
    private javax.swing.JLabel signInText;
    private javax.swing.JButton userSignInButton;
    private javax.swing.JButton userSignUpButton;
    // End of variables declaration//GEN-END:variables
}
