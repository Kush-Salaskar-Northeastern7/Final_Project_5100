/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplyManagerWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.LoginScreen;

/**
 *
 * @author anushka
 */
public class SupplyManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplyManagerWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    
    public SupplyManagerWorkAreaJPanel(JPanel container, UserAccount account, EcoSystem system) {
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
        btnManageDeliveryMen = new java.awt.Button();
        buttonWorkRqst = new java.awt.Button();

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
        lblSelectedNode.setText("Supply Manager Work Area");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnManageDeliveryMen.setLabel("Manage Delivery Men");
        btnManageDeliveryMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryMenActionPerformed(evt);
            }
        });

        buttonWorkRqst.setLabel("Assign Work to Delivery Men");
        buttonWorkRqst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWorkRqstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnManageDeliveryMen, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(buttonWorkRqst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageDeliveryMen, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(buttonWorkRqst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(191, 191, 191))
        );

        btnManageDeliveryMen.getAccessibleContext().setAccessibleName("Manage Delivery Men");
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        LoginScreen ls = new LoginScreen(userProcessContainer, system);
        userProcessContainer.add("blank", ls);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManageDeliveryMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryMenActionPerformed
       container.removeAll();
        SupplyManagerCreateDeliveryManJPanel ls = new SupplyManagerCreateDeliveryManJPanel(container, system);
        container.add("signup", ls);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
    }//GEN-LAST:event_btnManageDeliveryMenActionPerformed

    private void buttonWorkRqstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWorkRqstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonWorkRqstActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private java.awt.Button btnManageDeliveryMen;
    private java.awt.Button buttonWorkRqst;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
