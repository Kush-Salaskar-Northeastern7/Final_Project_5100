/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginScreen;
import Business.DB4OUtil.DB4OUtil;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private UserAccount userAccount;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
      
        this.userAccount = account;
        this.system = system;
        //valueLabel.setText(enterprise.getName());
        populateRequestTable();
        lblAccountName.setText(account.getUsername().toUpperCase());
    }
    
    public void populateRequestTable(){
        
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
        lblSelectedNode = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblAccountName = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnAppointment = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnRecentOrders = new javax.swing.JButton();
        btnRecentAppointments = new javax.swing.JButton();
        btnTopCharts = new javax.swing.JButton();
        innercontainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setPreferredSize(new java.awt.Dimension(923, 59));

        lblSelectedNode.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblSelectedNode.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedNode.setText("Welcome");

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

        lblAccountName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblAccountName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 593, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAccountName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(266, 425));

        btnAppointment.setBackground(new java.awt.Color(0, 153, 153));
        btnAppointment.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnAppointment.setText("Schedule Appointment");
        btnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentActionPerformed(evt);
            }
        });

        btnOrder.setBackground(new java.awt.Color(0, 153, 153));
        btnOrder.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setText("Place Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnRecentOrders.setBackground(new java.awt.Color(0, 153, 153));
        btnRecentOrders.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRecentOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnRecentOrders.setText("View Recent Orders");
        btnRecentOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecentOrdersActionPerformed(evt);
            }
        });

        btnRecentAppointments.setBackground(new java.awt.Color(0, 153, 153));
        btnRecentAppointments.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRecentAppointments.setForeground(new java.awt.Color(255, 255, 255));
        btnRecentAppointments.setText("View Recent Appointments");
        btnRecentAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecentAppointmentsActionPerformed(evt);
            }
        });

        btnTopCharts.setBackground(new java.awt.Color(0, 153, 153));
        btnTopCharts.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnTopCharts.setForeground(new java.awt.Color(255, 255, 255));
        btnTopCharts.setText("Top Charts");
        btnTopCharts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopChartsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTopCharts, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecentAppointments)
                    .addComponent(btnRecentOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAppointment, btnOrder, btnRecentAppointments, btnRecentOrders, btnTopCharts});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrder)
                .addGap(20, 20, 20)
                .addComponent(btnRecentOrders)
                .addGap(18, 18, 18)
                .addComponent(btnRecentAppointments)
                .addGap(18, 18, 18)
                .addComponent(btnTopCharts)
                .addContainerGap(441, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAppointment, btnOrder, btnRecentAppointments, btnRecentOrders, btnTopCharts});

        jSplitPane1.setLeftComponent(jPanel1);

        innercontainer.setBackground(new java.awt.Color(255, 255, 255));
        innercontainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(innercontainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        innercontainer.removeAll();
        CustomerPlaceOrderJPanel ls = new CustomerPlaceOrderJPanel(innercontainer, userAccount, system);
        innercontainer.add("signup", ls);
        CardLayout crdLyt = (CardLayout) innercontainer.getLayout();
        crdLyt.next(innercontainer);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed
        // TODO add your handling code here:
        innercontainer.removeAll();
        CustomerScheduleAppmtJPanel ls = new CustomerScheduleAppmtJPanel(innercontainer, userAccount, system);
        innercontainer.add("schedule", ls);
        CardLayout crdLyt = (CardLayout) innercontainer.getLayout();
        crdLyt.next(innercontainer);
    }//GEN-LAST:event_btnAppointmentActionPerformed

    private void btnRecentOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecentOrdersActionPerformed
        // TODO add your handling code here:
        innercontainer.removeAll();
        CustomerRecentOrdersJPanel ls = new CustomerRecentOrdersJPanel(innercontainer, userAccount, system);
        innercontainer.add("signup", ls);
        CardLayout crdLyt = (CardLayout) innercontainer.getLayout();
        crdLyt.next(innercontainer);
    }//GEN-LAST:event_btnRecentOrdersActionPerformed

    private void btnTopChartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopChartsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTopChartsActionPerformed

    private void btnRecentAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecentAppointmentsActionPerformed
        // TODO add your handling code here:
        innercontainer.removeAll();
        CustomerRecentAppointmentsJPanel ls = new CustomerRecentAppointmentsJPanel(innercontainer, userAccount, system);
        innercontainer.add("signup", ls);
        CardLayout crdLyt = (CardLayout) innercontainer.getLayout();
        crdLyt.next(innercontainer);
    }//GEN-LAST:event_btnRecentAppointmentsActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnRecentAppointments;
    private javax.swing.JButton btnRecentOrders;
    private javax.swing.JButton btnTopCharts;
    private javax.swing.JPanel innercontainer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblAccountName;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
