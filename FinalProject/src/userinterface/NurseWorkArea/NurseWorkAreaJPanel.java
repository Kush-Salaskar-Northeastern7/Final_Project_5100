/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.LoginScreen;

/**
 *
 * @author rolwy
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NurseWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    public NurseWorkAreaJPanel(JPanel container, UserAccount account, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.system = system;
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
        btnGiveInsulin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

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
        lblSelectedNode.setText("Welcome Nurse");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnGiveInsulin.setBackground(new java.awt.Color(0, 153, 153));
        btnGiveInsulin.setForeground(new java.awt.Color(255, 255, 255));
        btnGiveInsulin.setText("Give Insulin");
        btnGiveInsulin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveInsulinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnGiveInsulin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGiveInsulin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 273, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        JPanel blankJP = new JPanel();
        LoginScreen ls = new LoginScreen(container, system);
        container.add("blank", ls);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnGiveInsulinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveInsulinActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        NurseAdministerInsulinJPanel na = new NurseAdministerInsulinJPanel(container, account, system);
        container.add("nursearea", na);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
    }//GEN-LAST:event_btnGiveInsulinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiveInsulin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}