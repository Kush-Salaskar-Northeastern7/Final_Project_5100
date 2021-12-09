/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabSupervisorWorkArea;

import Business.EcoSystem;
import Business.LabSupervisor.LabSupervisor;
import Business.LabTechnician.LabTechnician;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabApprovalWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rolwy
 */
public class LabSupervisorWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabSupervisorWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount account;
    LabApprovalWorkRequest req;
    public LabSupervisorWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        hideLabTechTable();
        populateWorkReqTable();
    }
    
    
    public void hideLabTechTable(){
        tblLabTech.setVisible(false);
        btnFinalSubmit.setVisible(false);
        jScrollPane2.setVisible(false);
    }
    
    public void populateTechTable(){
        DefaultTableModel model = (DefaultTableModel)tblLabTech.getModel();
        
        model.setRowCount(0);
        if(system.getLabTechnicianDirectory().getLabTechnicianList().size() == 0) return;
        for(LabTechnician lt : system.getLabTechnicianDirectory().getLabTechnicianList()){
            if(account.getUid() == lt.getSupervisorId()){
                Object[] row = new Object[2];
                row[0] = lt;
                row[1] = lt.getLtName();
                
                model.addRow(row);
            }
        }
    }
    
    public void populateWorkReqTable() {
        DefaultTableModel model = (DefaultTableModel)labWorkRequestJTable.getModel();
        
        model.setRowCount(0);
        if(system.getLabSupervisorDirectory().getLabSupervisorList().size() == 0) return;
        for (LabSupervisor ls : system.getLabSupervisorDirectory().getLabSupervisorList()) {
//            account.getUsername()
            if (ls.getUserAccount().getUid() == account.getUid()) {
                for(WorkRequest request : ls.getUserAccount().getWorkQueue().getWorkRequestList()){
                    if(request instanceof LabApprovalWorkRequest){
                        Object[] row = new Object[5];
                        row[0] = (LabApprovalWorkRequest)request;
                        row[1] = ((LabApprovalWorkRequest)request).getCustomer();
                        row[2] = ((LabApprovalWorkRequest)request).getMessage();
                        row[3] = ((LabApprovalWorkRequest)request).getReceiver();
                        row[4] = ((LabApprovalWorkRequest)request).getStatus();

                        model.addRow(row);
                    }
                }
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        labWorkRequestJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLabTech = new javax.swing.JTable();
        btnRefres = new javax.swing.JButton();
        btnFinalSubmit = new javax.swing.JButton();
        btnAssignLabTech = new javax.swing.JButton();

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
        lblSelectedNode.setText("Assign Work");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        labWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Customer", "Message", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        labWorkRequestJTable.setSelectionBackground(new java.awt.Color(51, 153, 255));
        labWorkRequestJTable.setShowGrid(false);
        jScrollPane1.setViewportView(labWorkRequestJTable);

        tblLabTech.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Lab Technicians"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLabTech.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblLabTech.setShowGrid(false);
        jScrollPane2.setViewportView(tblLabTech);

        btnRefres.setText("Refresh");
        btnRefres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresActionPerformed(evt);
            }
        });

        btnFinalSubmit.setText("Assign");
        btnFinalSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalSubmitActionPerformed(evt);
            }
        });

        btnAssignLabTech.setText("Assign to Lab Tech");
        btnAssignLabTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignLabTechActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAssignLabTech)
                    .addComponent(btnFinalSubmit)
                    .addComponent(btnRefres, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefres)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAssignLabTech)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinalSubmit)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
//        userProcessContainer.removeAll();
//        JPanel blankJP = new JPanel();
//        LoginScreen ls = new LoginScreen(userProcessContainer, ecosystem);
//        userProcessContainer.add("blank", ls);
//        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
//        crdLyt.next(userProcessContainer);
//        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnFinalSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalSubmitActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblLabTech.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else {
            LabTechnician lt = (LabTechnician) tblLabTech.getValueAt(selectedRow, 0);
            lt.getUserAccount().getWorkQueue().getWorkRequestList().add(req);
            account.getWorkQueue().getWorkRequestList().remove(req);
            JOptionPane.showMessageDialog(null, "Task assigned to Lab Technician", "Error", JOptionPane.WARNING_MESSAGE);
            populateWorkReqTable();
            populateTechTable();
        }
    }//GEN-LAST:event_btnFinalSubmitActionPerformed

    private void btnRefresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresActionPerformed
        // TODO add your handling code here:
        populateWorkReqTable();
    }//GEN-LAST:event_btnRefresActionPerformed

    private void btnAssignLabTechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignLabTechActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = labWorkRequestJTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.NO_OPTION);
        }
        else {
            LabApprovalWorkRequest wr = (LabApprovalWorkRequest) labWorkRequestJTable.getValueAt(selectedRow, 0);
            req = wr;
            tblLabTech.setVisible(true);
            btnFinalSubmit.setVisible(true);
            jScrollPane2.setVisible(true);
        
        }
         
        populateTechTable();
    }//GEN-LAST:event_btnAssignLabTechActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignLabTech;
    private javax.swing.JButton btnFinalSubmit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefres;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable labWorkRequestJTable;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JTable tblLabTech;
    // End of variables declaration//GEN-END:variables
}
