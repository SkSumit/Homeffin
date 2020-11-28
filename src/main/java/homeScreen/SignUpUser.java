/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeScreen;

import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;
import java.io.File;
import java.util.Map;
import javax.swing.JFileChooser;

/**
 *
 * @author Sumit Kolpekwar
 */
public class SignUpUser extends javax.swing.JFrame {

    /**
     * Creates new form SignUpUser
     */
    private Backend backend;
    private Cloudinary cloudinary;
    private Map config;
    private Map uploaderMap;
    private File selectedFile;

    public SignUpUser() {
        initComponents();
        backend = new Backend();
        config = ObjectUtils.asMap(
                "cloud_name", "dpwspeuft",
                "api_key", "653775661217294",
                "api_secret", "HIXWv-ESOifGXQHgx6skUvmLdv0");
        cloudinary = new Cloudinary(config);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        HomeffinsText = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        signInText = new javax.swing.JLabel();
        emailText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emailInput1 = new javax.swing.JTextPane();
        passwordInput1 = new javax.swing.JPasswordField();
        userSignInButton = new javax.swing.JButton();
        dhaaText = new javax.swing.JLabel();
        userSignUpButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        adminSignInButton = new javax.swing.JButton();
        HomeffinsSubtext = new javax.swing.JLabel();
        emailText2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        emailInput2 = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        HomeffinsText2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        signUpText = new javax.swing.JLabel();
        firstNameText = new javax.swing.JLabel();
        passwordText1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        firstNameInput = new javax.swing.JTextPane();
        passwordInput = new javax.swing.JPasswordField();
        userSignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lastNameInput = new javax.swing.JTextPane();
        lastNameText = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        mobileInput = new javax.swing.JTextPane();
        mobileText = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        genderText = new javax.swing.JLabel();
        emailText6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        emailInput = new javax.swing.JTextPane();
        confirmedPasswordText = new javax.swing.JLabel();
        confirmedPasswordInput = new javax.swing.JPasswordField();
        confirmedPasswordText1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        HomeffinsSubtext2 = new javax.swing.JLabel();
        goBackBtn = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("Homeffins");
        jFrame1.setBackground(new java.awt.Color(23, 23, 29));
        jFrame1.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(23, 23, 29));

        HomeffinsText.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        HomeffinsText.setForeground(new java.awt.Color(255, 255, 255));
        HomeffinsText.setText("Homeffins");

        jPanel4.setBackground(new java.awt.Color(51, 142, 218));

        signInText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signInText.setForeground(new java.awt.Color(255, 255, 255));
        signInText.setText("Sign In");

        emailText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        emailText.setText("Email");

        passwordText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setText("Password");

        emailInput1.setBackground(new java.awt.Color(255, 255, 255));
        emailInput1.setForeground(new java.awt.Color(23, 23, 29));
        jScrollPane1.setViewportView(emailInput1);

        passwordInput1.setBackground(new java.awt.Color(255, 255, 255));
        passwordInput1.setForeground(new java.awt.Color(23, 23, 29));
        passwordInput1.setText("jPasswordField1");
        passwordInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInput1ActionPerformed(evt);
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel9FocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signInText)
                .addGap(107, 107, 107))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userSignInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordText)
                    .addComponent(emailText)
                    .addComponent(jScrollPane1)
                    .addComponent(passwordInput1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(dhaaText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userSignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(signInText)
                .addGap(51, 51, 51)
                .addComponent(emailText)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(passwordText)
                .addGap(18, 18, 18)
                .addComponent(passwordInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(userSignInButton)
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(HomeffinsText)
                    .addComponent(HomeffinsSubtext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminSignInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(321, 321, 321))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(HomeffinsSubtext))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(HomeffinsText)))
                .addGap(403, 403, 403)
                .addComponent(adminSignInButton)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jFrame1.getContentPane().add(jPanel2);

        emailText2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailText2.setForeground(new java.awt.Color(255, 255, 255));
        emailText2.setText("First Name");

        emailInput2.setBackground(new java.awt.Color(255, 255, 255));
        emailInput2.setForeground(new java.awt.Color(23, 23, 29));
        jScrollPane3.setViewportView(emailInput2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(23, 23, 29));

        HomeffinsText2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        HomeffinsText2.setForeground(new java.awt.Color(255, 255, 255));
        HomeffinsText2.setText("Homeffins");

        jPanel7.setBackground(new java.awt.Color(51, 142, 218));

        signUpText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signUpText.setForeground(new java.awt.Color(255, 255, 255));
        signUpText.setText("Sign Up");

        firstNameText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstNameText.setForeground(new java.awt.Color(255, 255, 255));
        firstNameText.setText("First Name");

        passwordText1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordText1.setForeground(new java.awt.Color(255, 255, 255));
        passwordText1.setText("Password");

        firstNameInput.setBackground(new java.awt.Color(255, 255, 255));
        firstNameInput.setForeground(new java.awt.Color(23, 23, 29));
        jScrollPane2.setViewportView(firstNameInput);

        passwordInput.setBackground(new java.awt.Color(255, 255, 255));
        passwordInput.setForeground(new java.awt.Color(23, 23, 29));
        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });

        userSignUp.setBackground(new java.awt.Color(23, 23, 29));
        userSignUp.setForeground(new java.awt.Color(255, 255, 255));
        userSignUp.setText("Sign Up");
        userSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userSignUpMouseClicked(evt);
            }
        });
        userSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSignUpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });

        lastNameInput.setBackground(new java.awt.Color(255, 255, 255));
        lastNameInput.setForeground(new java.awt.Color(23, 23, 29));
        jScrollPane4.setViewportView(lastNameInput);

        lastNameText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastNameText.setForeground(new java.awt.Color(255, 255, 255));
        lastNameText.setText("Last Name");

        mobileInput.setBackground(new java.awt.Color(255, 255, 255));
        mobileInput.setForeground(new java.awt.Color(23, 23, 29));
        jScrollPane5.setViewportView(mobileInput);

        mobileText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mobileText.setForeground(new java.awt.Color(255, 255, 255));
        mobileText.setText("Mobile Number");

        genderComboBox.setBackground(new java.awt.Color(23, 23, 29));
        genderComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genderComboBox.setForeground(java.awt.Color.white);
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });

        genderText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genderText.setForeground(new java.awt.Color(255, 255, 255));
        genderText.setText("Gender");

        emailText6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailText6.setForeground(new java.awt.Color(255, 255, 255));
        emailText6.setText("Email");

        emailInput.setBackground(new java.awt.Color(255, 255, 255));
        emailInput.setForeground(new java.awt.Color(23, 23, 29));
        jScrollPane6.setViewportView(emailInput);

        confirmedPasswordText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmedPasswordText.setForeground(new java.awt.Color(255, 255, 255));
        confirmedPasswordText.setText("Confirm Password");

        confirmedPasswordInput.setBackground(new java.awt.Color(255, 255, 255));
        confirmedPasswordInput.setForeground(new java.awt.Color(23, 23, 29));
        confirmedPasswordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmedPasswordInputActionPerformed(evt);
            }
        });

        confirmedPasswordText1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmedPasswordText1.setForeground(new java.awt.Color(255, 255, 255));
        confirmedPasswordText1.setText("Upload Profile Pic:-");

        jButton1.setText("Choose File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordText1)
                            .addComponent(genderText)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailText6)
                                .addComponent(firstNameText)
                                .addComponent(jScrollPane2)
                                .addComponent(passwordInput)
                                .addComponent(jScrollPane4)
                                .addComponent(lastNameText)
                                .addComponent(jScrollPane5)
                                .addComponent(mobileText)
                                .addComponent(genderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6)
                                .addComponent(confirmedPasswordText)
                                .addComponent(confirmedPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(signUpText))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(confirmedPasswordText1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(signUpText)
                .addGap(18, 18, 18)
                .addComponent(firstNameText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(lastNameText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(mobileText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailText6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmedPasswordText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmedPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmedPasswordText1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userSignUp)
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        HomeffinsSubtext2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HomeffinsSubtext2.setForeground(new java.awt.Color(255, 255, 255));
        HomeffinsSubtext2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeffinsSubtext2.setText("Taste of Home in Tiffin");
        HomeffinsSubtext2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        goBackBtn.setBackground(new java.awt.Color(255, 255, 255));
        goBackBtn.setForeground(new java.awt.Color(23, 23, 29));
        goBackBtn.setText("Go Back");
        goBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(HomeffinsText2)
                    .addComponent(HomeffinsSubtext2)
                    .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(HomeffinsSubtext2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(HomeffinsText2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goBackBtn)
                .addGap(136, 136, 136))
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInput1ActionPerformed

    private void userSignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSignInButtonMouseClicked

    }//GEN-LAST:event_userSignInButtonMouseClicked

    private void userSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSignInButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userSignInButtonActionPerformed

    private void userSignUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSignUpButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userSignUpButtonMouseClicked

    private void userSignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSignUpButtonActionPerformed
        new SignUpUser().setVisible(true);
    }//GEN-LAST:event_userSignUpButtonActionPerformed

    private void jLabel9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel9FocusGained
//        jLabel1.setVisible(false);
    }//GEN-LAST:event_jLabel9FocusGained

    private void adminSignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminSignInButtonMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_adminSignInButtonMouseClicked

    private void adminSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSignInButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_adminSignInButtonActionPerformed

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed

    private void userSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSignUpMouseClicked

    }//GEN-LAST:event_userSignUpMouseClicked

    private void userSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSignUpActionPerformed
        // TODO add your handling code here:
        String Dp = null;
        try {
            uploaderMap = cloudinary.uploader().upload(selectedFile.getAbsoluteFile(), ObjectUtils.emptyMap());
            Dp = (String) uploaderMap.get("url");
        } catch (Exception e) {
            System.out.println(e);
        }
        int result = backend.Register(firstNameInput.getText(),
                lastNameInput.getText(), mobileInput.getText(),
                genderComboBox.getSelectedItem().toString(), emailInput.getText(),
                passwordInput.getText(), confirmedPasswordInput.getText(), Dp
        );
    }//GEN-LAST:event_userSignUpActionPerformed

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
        jLabel1.setVisible(false);
    }//GEN-LAST:event_jLabel1FocusGained

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void confirmedPasswordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmedPasswordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmedPasswordInputActionPerformed

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomeScreen().setVisible(true);
    }//GEN-LAST:event_goBackBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
        }
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
            java.util.logging.Logger.getLogger(SignUpUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeffinsSubtext;
    private javax.swing.JLabel HomeffinsSubtext2;
    private javax.swing.JLabel HomeffinsText;
    private javax.swing.JLabel HomeffinsText2;
    private javax.swing.JButton adminSignInButton;
    private javax.swing.JPasswordField confirmedPasswordInput;
    private javax.swing.JLabel confirmedPasswordText;
    private javax.swing.JLabel confirmedPasswordText1;
    private javax.swing.JLabel dhaaText;
    private javax.swing.JTextPane emailInput;
    private javax.swing.JTextPane emailInput1;
    private javax.swing.JTextPane emailInput2;
    private javax.swing.JLabel emailText;
    private javax.swing.JLabel emailText2;
    private javax.swing.JLabel emailText6;
    private javax.swing.JTextPane firstNameInput;
    private javax.swing.JLabel firstNameText;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderText;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane lastNameInput;
    private javax.swing.JLabel lastNameText;
    private javax.swing.JTextPane mobileInput;
    private javax.swing.JLabel mobileText;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JPasswordField passwordInput1;
    private javax.swing.JLabel passwordText;
    private javax.swing.JLabel passwordText1;
    private javax.swing.JLabel signInText;
    private javax.swing.JLabel signUpText;
    private javax.swing.JButton userSignInButton;
    private javax.swing.JButton userSignUp;
    private javax.swing.JButton userSignUpButton;
    // End of variables declaration//GEN-END:variables
}
