/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Nurse.Nurse;
import Business.SupplyManager.SupplyManager;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientAppointmentWorkRequest;
import Business.WorkQueue.PatientOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginScreen;

/**
 *
 * @author kushsalaskar
 */
public class CustomerRecentAppointmentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerRecentAppointmentsJPanel
     */
    
    private JPanel userProcessContainer;

    private UserAccount account;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Doctor selDoc;
    private PatientAppointmentWorkRequest selReq;
    
    public CustomerRecentAppointmentsJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        
        populateTable();
        hideList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void showList(){
        lblGreeting.setVisible(true);
        jScrollPane2.setVisible(true);
        liRating.setVisible(true);
        btnSubmit.setVisible(true);
    }
    
    
    public void hideList(){
        lblGreeting.setVisible(false);
        jScrollPane2.setVisible(false);
        liRating.setVisible(false);
        btnSubmit.setVisible(false);
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblRecentOrders.getModel();
        
        model.setRowCount(0);
        if(system.getCustomerDirectory().getCustomerList().size() == 0) return;
        for (Customer c : system.getCustomerDirectory().getCustomerList()) {
//            account.getUsername()
            if (c.getUserAccount().getUid() == account.getUid()) {
                for(WorkRequest request : c.getUserAccount().getWorkQueue().getWorkRequestList()){
                    if(request instanceof PatientAppointmentWorkRequest){
                        Doctor doc = null;
                        for(Doctor d : system.getDoctorDirectory().getDoctorList()){
                            if(d.getUserAccount().getUid() == ((PatientAppointmentWorkRequest)request).getReceiver().getUid()){
                                doc = d;
                                break;
                            }
                        }
                        Object[] row = new Object[6];
                        row[0] = doc != null ? doc : "Supplier doesnt exist";
                        row[1] = ((PatientAppointmentWorkRequest)request).isType1() ? "Type1" : "Type2";
                        row[2] = ((PatientAppointmentWorkRequest)request).getQuantity();
                        row[3] = ((PatientAppointmentWorkRequest)request).getResolveDate();
//                        row[4] = ((PatientAppointmentWorkRequest)request).getStatus();
                        row[4] = (PatientAppointmentWorkRequest) request;
                        

                        model.addRow(row);
                    }
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblSelectedNode = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecentOrders = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        lblGreeting = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        liRating = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setPreferredSize(new java.awt.Dimension(923, 59));

        lblSelectedNode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectedNode.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedNode.setText("View Recent Appointments");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRefresh.setBackground(new java.awt.Color(0, 153, 153));
        btnRefresh.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tblRecentOrders.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblRecentOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Doctor", "Type", "Quantity", "Innoculation Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRecentOrders.setRowHeight(23);
        tblRecentOrders.setSelectionBackground(new java.awt.Color(0, 153, 255));
        jScrollPane1.setViewportView(tblRecentOrders);

        btnView.setBackground(new java.awt.Color(0, 153, 153));
        btnView.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("Review");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnSubmit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        liRating.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        liRating.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(liRating);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnView)
                            .addComponent(btnRefresh)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGreeting)
                            .addComponent(btnSubmit))))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addComponent(lblGreeting)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRecentOrders.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else {
            Doctor lt = (Doctor) tblRecentOrders.getValueAt(selectedRow, 0);
            PatientAppointmentWorkRequest wr = (PatientAppointmentWorkRequest) tblRecentOrders.getValueAt(selectedRow, 4);
            selDoc = lt;
            selReq = wr;
            if(selReq.isIsReviewed()){
                JOptionPane.showMessageDialog(null, "You have already reviewed this order", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                lblGreeting.setText("Give review for " + selDoc.getDocName());
                showList(); 
            }
        }
        
       
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String rating = (String) liRating.getSelectedValue();
        if(rating == null){
            JOptionPane.showMessageDialog(null, "Please select a rating", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int rate = Integer.parseInt(rating);

        selDoc.addRating(rate);
        selReq.setIsReviewed(true);

        hideList();
        populateTable();

    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JList<String> liRating;
    private javax.swing.JTable tblRecentOrders;
    // End of variables declaration//GEN-END:variables
}
