/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import userinterface.LoginScreen;
import javax.swing.border.Border;
import Business.DB4OUtil.DB4OUtil;
import java.awt.Color;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.account = account;
        ecosystem = dB4OUtil.retrieveSystem();
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
        btnLogout = new javax.swing.JButton();
        lblSelectedNode = new javax.swing.JLabel();
        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnManageSuppliers1 = new javax.swing.JButton();
        btnManageSuppliers2 = new javax.swing.JButton();
        btnAnalytics = new javax.swing.JButton();
        innerContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setAlignmentX(0.5F);
        btnLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hoveredlogin.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblSelectedNode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectedNode.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedNode.setText("Welcome User");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnManageSuppliers1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnManageSuppliers1.setForeground(new java.awt.Color(255, 255, 255));
        btnManageSuppliers1.setText("Manage Enterprises");
        btnManageSuppliers1.setBorder(null);
        btnManageSuppliers1.setContentAreaFilled(false);
        btnManageSuppliers1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageSuppliers1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnManageSuppliers1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageSuppliers1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageSuppliers1MouseExited(evt);
            }
        });
        btnManageSuppliers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliers1ActionPerformed(evt);
            }
        });

        btnManageSuppliers2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnManageSuppliers2.setForeground(new java.awt.Color(255, 255, 255));
        btnManageSuppliers2.setText("Manage Patients");
        btnManageSuppliers2.setBorder(null);
        btnManageSuppliers2.setContentAreaFilled(false);
        btnManageSuppliers2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageSuppliers2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnManageSuppliers2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageSuppliers2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageSuppliers2MouseExited(evt);
            }
        });
        btnManageSuppliers2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliers2ActionPerformed(evt);
            }
        });

        btnAnalytics.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAnalytics.setForeground(new java.awt.Color(255, 255, 255));
        btnAnalytics.setText("Analytics");
        btnAnalytics.setBorder(null);
        btnAnalytics.setContentAreaFilled(false);
        btnAnalytics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnalytics.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAnalytics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnalyticsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnalyticsMouseExited(evt);
            }
        });
        btnAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyticsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnManageSuppliers2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageSuppliers1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalytics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnManageSuppliers1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageSuppliers2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        innerContainer.setBackground(new java.awt.Color(255, 255, 255));
        innerContainer.setLayout(new java.awt.CardLayout());
        jSplitPane.setRightComponent(innerContainer);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        LoginScreen ls = new LoginScreen(userProcessContainer, ecosystem);
        userProcessContainer.add("blank", ls);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManageSuppliers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliers1ActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel actionPanel = new ManageEnterpriseJPanel(innerContainer, ecosystem);
        innerContainer.add("manageEnterpriseJPanel", actionPanel);
        CardLayout layout=(CardLayout)innerContainer.getLayout();
        layout.next(innerContainer);
    }//GEN-LAST:event_btnManageSuppliers1ActionPerformed

    private void btnManageSuppliers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliers2ActionPerformed
        // TODO add your handling code here:
        ManagePatientsJPanel actionPanel = new ManagePatientsJPanel(innerContainer, ecosystem);
        innerContainer.add("managePatientsJPanel", actionPanel);
        CardLayout layout = (CardLayout)innerContainer.getLayout();
        layout.next(innerContainer);
    }//GEN-LAST:event_btnManageSuppliers2ActionPerformed

    private void btnManageSuppliers1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageSuppliers1MouseEntered
        // TODO add your handling code here:
        btnManageSuppliers1.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btnManageSuppliers1MouseEntered

    private void btnManageSuppliers1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageSuppliers1MouseExited
        // TODO add your handling code here:
        btnManageSuppliers1.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_btnManageSuppliers1MouseExited

    private void btnManageSuppliers2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageSuppliers2MouseEntered
        // TODO add your handling code here:
        btnManageSuppliers2.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btnManageSuppliers2MouseEntered

    private void btnManageSuppliers2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageSuppliers2MouseExited
        // TODO add your handling code here:
        btnManageSuppliers2.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_btnManageSuppliers2MouseExited

    private void btnAnalyticsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalyticsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalyticsMouseEntered

    private void btnAnalyticsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalyticsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalyticsMouseExited

    private void btnAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyticsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalyticsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalytics;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageSuppliers1;
    private javax.swing.JButton btnManageSuppliers2;
    private javax.swing.JPanel innerContainer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
