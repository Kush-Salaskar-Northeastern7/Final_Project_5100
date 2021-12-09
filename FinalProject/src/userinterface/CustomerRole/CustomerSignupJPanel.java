/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.LabSupervisor.LabSupervisor;
import Business.LabTechnician.LabTechnician;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabApprovalWorkRequest;
import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginScreen;

/**
 *
 * @author anushka
 */
public class CustomerSignupJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSignupJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private Customer customer;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public CustomerSignupJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;        
        this.userAccount = new UserAccount();
        this.ecosystem = ecosystem;
        ecosystem = dB4OUtil.retrieveSystem();
        populateLabsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnBackBtn = new javax.swing.JButton();
        lblSelectedNode = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtPtnUsername = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLabs = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtPtnCommunity = new javax.swing.JTextField();
        txtPtnAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCreatePtn = new javax.swing.JButton();
        txtPtnPassword = new javax.swing.JPasswordField();
        txtPtnDiabetesType = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPtnPhoneNum = new javax.swing.JTextField();
        txtPtnAge = new javax.swing.JTextField();
        txtPtnName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPtnZip = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPtnGlucoseLvl = new javax.swing.JTextField();
        btnProfileImage = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        viewProfileImage = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnPrescriptionImg = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        viewPrescriptionImage = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setPreferredSize(new java.awt.Dimension(923, 59));

        btnBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBackBtn.setAlignmentX(0.5F);
        btnBackBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBackBtn.setBorderPainted(false);
        btnBackBtn.setContentAreaFilled(false);
        btnBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackBtnActionPerformed(evt);
            }
        });

        lblSelectedNode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectedNode.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedNode.setText("Sign Up");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackBtn)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtPtnUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPtnUsernameActionPerformed(evt);
            }
        });

        tblLabs.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tblLabs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lab Name", "Lab Address"
            }
        ));
        tblLabs.setGridColor(new java.awt.Color(0, 153, 153));
        tblLabs.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblLabs.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tblLabs);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Age");

        txtPtnAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPtnAddressActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        btnCreatePtn.setBackground(new java.awt.Color(0, 153, 153));
        btnCreatePtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreatePtn.setForeground(new java.awt.Color(255, 255, 255));
        btnCreatePtn.setText("Signup");
        btnCreatePtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Glucose Level");

        txtPtnName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPtnNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Address");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Password");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Phone Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Community");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Zip");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Diabetes Type");

        btnProfileImage.setBackground(new java.awt.Color(0, 153, 153));
        btnProfileImage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProfileImage.setForeground(new java.awt.Color(255, 255, 255));
        btnProfileImage.setText("Upload");
        btnProfileImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileImageActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Profile");

        viewProfileImage.setText("Profile Preview");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Prescription");

        btnPrescriptionImg.setBackground(new java.awt.Color(0, 153, 153));
        btnPrescriptionImg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrescriptionImg.setForeground(new java.awt.Color(255, 255, 255));
        btnPrescriptionImg.setText("Upload");
        btnPrescriptionImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescriptionImgActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel14.setText("( if any )");

        viewPrescriptionImage.setText("Prescription Preview");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnPrescriptionImg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(txtPtnDiabetesType, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtPtnPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(56, 56, 56))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(viewPrescriptionImage, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(btnProfileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))
                                    .addComponent(viewProfileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(47, 47, 47)
                                .addComponent(txtPtnGlucoseLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreatePtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)
                                .addComponent(txtPtnAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtPtnZip, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtPtnUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPtnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPtnAge, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPtnName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPtnCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPtnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtPtnName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPtnUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPtnAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPtnZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtPtnCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtPtnDiabetesType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPtnAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPtnGlucoseLvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPtnPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(btnPrescriptionImg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(btnProfileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewProfileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewPrescriptionImage, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreatePtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, txtPtnAddress, txtPtnAge, txtPtnCommunity, txtPtnDiabetesType, txtPtnGlucoseLvl, txtPtnName, txtPtnPassword, txtPtnPhoneNum, txtPtnUsername, txtPtnZip});

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4419187_adobespark.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1823, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPtnNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPtnNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPtnNameActionPerformed

    private void txtPtnUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPtnUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPtnUsernameActionPerformed

    private void btnCreatePtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePtnActionPerformed
        // TODO add your handling code here:
        if(txtPtnName.getText().isEmpty() || txtPtnPhoneNum.getText().isEmpty() || txtPtnAddress.getText().isEmpty() || 
           txtPtnUsername.getText().isEmpty() || txtPtnPassword.getText().isEmpty() ||
                txtPtnAge.getText().isEmpty() || txtPtnCommunity.getText().isEmpty() ||
                txtPtnDiabetesType.getText().isEmpty() || txtPtnGlucoseLvl.getText().isEmpty() ||
                txtPtnZip.getText().isEmpty()
                ) {
            JOptionPane.showMessageDialog(this, "Please fill all details.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int selectedRow = tblLabs.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        LabSupervisor ls = (LabSupervisor) tblLabs.getValueAt(selectedRow, 0);
        
        
        String name = txtPtnName.getText();
        long phonenumber = Long.parseLong(txtPtnPhoneNum.getText());
        String address = txtPtnAddress.getText();        
        String username = txtPtnUsername.getText();
        String password = String.valueOf(txtPtnPassword.getPassword());
        String community = txtPtnCommunity.getText();
        String diabetestype = txtPtnDiabetesType.getText();
        String glucoselvl = txtPtnGlucoseLvl.getText();
        String zip = txtPtnZip.getText();
        int age = Integer.parseInt(txtPtnAge.getText());
        
        
        
        
        if(!ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists, select a new username", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
//        
//        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(name);       
//        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(username, password, employee, new CustomerRole());        
        Customer c = ecosystem.getCustomerDirectory().addCustomer(name, age, address, 
                                                            community, zip, "sk", phonenumber, null);
        
        LabApprovalWorkRequest req = new LabApprovalWorkRequest();
        req.setCustomer(c);
        req.setMessage("Request to be reviewed");
        req.setReceiver(ls.getUserAccount());
        req.setStatus("PENDING");
        ls.getUserAccount().getWorkQueue().getWorkRequestList().add(req);
        
        JOptionPane.showMessageDialog(null, "Your Req is sent to your Lab for review.");
        
                
        txtPtnAddress.setText("");
        txtPtnAge.setText("");
        txtPtnCommunity.setText("");
        txtPtnDiabetesType.setText("");
        txtPtnGlucoseLvl.setText("");
        txtPtnName.setText("");
        txtPtnPassword.setText("");
        txtPtnPhoneNum.setText("");
        txtPtnUsername.setText("");
        txtPtnZip.setText("");
        populateLabsTable();
        dB4OUtil.storeSystem(ecosystem);
        JOptionPane.showMessageDialog(null, "Customer Created");
        
        
    }//GEN-LAST:event_btnCreatePtnActionPerformed

    private void btnBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        LoginScreen ls = new LoginScreen(userProcessContainer, ecosystem);
        userProcessContainer.add("blank", ls);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_btnBackBtnActionPerformed

    private void txtPtnAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPtnAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPtnAddressActionPerformed

    private void btnProfileImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileImageActionPerformed
        // select Image and add path to label field
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        // set directory to home directory.
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        // Add File Name extension filter
        FileNameExtensionFilter fileExtension = new FileNameExtensionFilter("*Images", "jpg", "jpeg", "png");
        // Add the extension to the file chooser
        fileChooser.addChoosableFileFilter(fileExtension);
        // set file status as null
        int fileChosenStatus = fileChooser.showSaveDialog(null);
        if (fileChosenStatus == fileChooser.APPROVE_OPTION) {
            File selectedProImg = fileChooser.getSelectedFile();
            String img_path = selectedProImg.getAbsolutePath();
//            lblImgPath.setText(img_path);
//            profile.setBiometricIdentifier(selectedBioImg);
//            biometricErrMsg.setVisible(false); // file is selected, no error

            //setting it in profile as well
//            profile.setBiometricImgPath(lblImgPath.getText());
            try {
                BufferedImage profilePhoto = ImageIO.read(new File(img_path));
                viewProfileImage.setIcon(new ImageIcon(profilePhoto.getScaledInstance(150, 110, java.awt.Image.SCALE_SMOOTH)));
            } catch (IOException ex) {
                Logger.getLogger(CustomerSignupJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (fileChosenStatus == fileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(this, "Please select a file");
            fileChooser.setSelectedFile(new File(""));
            File selectedBioImg = fileChooser.getSelectedFile();
//            biometricErrMsg.setText("Please Enter Biometric Identifier");
//            biometricErrMsg.setVisible(true);
//            lblImgPath.setText("");
        }

    }//GEN-LAST:event_btnProfileImageActionPerformed

    private void btnPrescriptionImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescriptionImgActionPerformed

        // select Image and add path to label field
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        // set directory to home directory.
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        // Add File Name extension filter
        FileNameExtensionFilter fileExtension = new FileNameExtensionFilter("*Images", "jpg", "jpeg", "png");
        // Add the extension to the file chooser
        fileChooser.addChoosableFileFilter(fileExtension);
        // set file status as null
        int fileChosenStatus = fileChooser.showSaveDialog(null);
        if (fileChosenStatus == fileChooser.APPROVE_OPTION) {
            File selectedPresImg = fileChooser.getSelectedFile();
            String img_path = selectedPresImg.getAbsolutePath();
//            lblImgPath.setText(img_path);
//            profile.setBiometricIdentifier(selectedBioImg);
//            biometricErrMsg.setVisible(false); // file is selected, no error

            //setting it in profile as well
//            profile.setBiometricImgPath(lblImgPath.getText());
            try {
                BufferedImage prescriptionPhoto = ImageIO.read(new File(img_path));
                viewPrescriptionImage.setIcon(new ImageIcon(prescriptionPhoto.getScaledInstance(313, 216, java.awt.Image.SCALE_SMOOTH)));
            } catch (IOException ex) {
                Logger.getLogger(CustomerSignupJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (fileChosenStatus == fileChooser.CANCEL_OPTION){
            fileChooser.setSelectedFile(new File(""));
//          lblImgPath.setText("");
        }
    }//GEN-LAST:event_btnPrescriptionImgActionPerformed


    public void populateLabsTable(){
        DefaultTableModel model = (DefaultTableModel) tblLabs.getModel();
        model.setRowCount(0);
        if(ecosystem.getLabSupervisorDirectory().getLabSupervisorList().size() == 0) return;
        for (LabSupervisor ls : ecosystem.getLabSupervisorDirectory().getLabSupervisorList()) {
            Object[] row = new Object[2];
            row[0] = ls;
            row[1] = ls.getUserAccount().getUsername();
            
            model.addRow(row);       
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackBtn;
    private javax.swing.JButton btnCreatePtn;
    private javax.swing.JButton btnPrescriptionImg;
    private javax.swing.JButton btnProfileImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JTable tblLabs;
    private javax.swing.JTextField txtPtnAddress;
    private javax.swing.JTextField txtPtnAge;
    private javax.swing.JTextField txtPtnCommunity;
    private javax.swing.JTextField txtPtnDiabetesType;
    private javax.swing.JTextField txtPtnGlucoseLvl;
    private javax.swing.JTextField txtPtnName;
    private javax.swing.JPasswordField txtPtnPassword;
    private javax.swing.JTextField txtPtnPhoneNum;
    private javax.swing.JTextField txtPtnUsername;
    private javax.swing.JTextField txtPtnZip;
    private javax.swing.JLabel viewPrescriptionImage;
    private javax.swing.JLabel viewProfileImage;
    // End of variables declaration//GEN-END:variables
}
