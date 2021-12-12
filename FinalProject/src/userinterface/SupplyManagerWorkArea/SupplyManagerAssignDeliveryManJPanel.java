/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplyManagerWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.LabSupervisor.LabSupervisor;
import Business.LabTechnician.LabTechnician;
import Business.SupplyManager.SupplyManager;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabApprovalWorkRequest;
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
public class SupplyManagerAssignDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplyManagerAssignDeliveryManJPanel
     */
    
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    private PatientOrderWorkRequest req;
    
    public SupplyManagerAssignDeliveryManJPanel(JPanel container, UserAccount account, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.system = system;
        hideLabTechTable();
        populateWorkReqTable();
    }
    
    
    public void hideLabTechTable(){
        tblDeliveryMan.setVisible(false);
        btnFinalSubmit.setVisible(false);
        jScrollPane2.setVisible(false);
    }
    
    public void populateTechTable(){
        DefaultTableModel model = (DefaultTableModel)tblDeliveryMan.getModel();
        
        model.setRowCount(0);
        if(system.getDeliveryManDirectory().getDeliveryManList().size() == 0) return;
        for(DeliveryMan dm : system.getDeliveryManDirectory().getDeliveryManList()){
            if(account.getUid() == dm.getSupplyManagerId()){
                Object[] row = new Object[2];
                row[0] = dm;
                row[1] = dm.getDeliveryManName();
                
                model.addRow(row);
            }
        }
    }
    
    public void populateWorkReqTable() {
        DefaultTableModel model = (DefaultTableModel)tblOrders.getModel();
        
        model.setRowCount(0);
        if(system.getSupplyManagerDirectory().getSupplyManagerList().size() == 0) return;
        for (SupplyManager sm : system.getSupplyManagerDirectory().getSupplyManagerList()) {
//            account.getUsername()
            if (sm.getUserAccount().getUid() == account.getUid()) {
                for(WorkRequest request : sm.getUserAccount().getWorkQueue().getWorkRequestList()){
                    if(request instanceof PatientOrderWorkRequest){
                        Object[] row = new Object[5];
                        row[0] = (PatientOrderWorkRequest)request;
                        row[1] = ((PatientOrderWorkRequest)request).getCustomer();
                        row[2] = ((PatientOrderWorkRequest)request).isType1() ? "Type1" : "Type2";
                        row[3] = ((PatientOrderWorkRequest)request).getQuantity();
                        row[4] = ((PatientOrderWorkRequest)request).getStatus();

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
        lblSelectedNode = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        btnRefres = new javax.swing.JButton();
        btnAssignLabTech = new javax.swing.JButton();
        btnFinalSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

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
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Customer", "Type", "Quantity", "Status"
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
        tblOrders.setRowHeight(23);
        tblOrders.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tblOrders.setShowGrid(false);
        jScrollPane1.setViewportView(tblOrders);

        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Delivery Men"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryMan.setRowHeight(23);
        tblDeliveryMan.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblDeliveryMan.setShowGrid(false);
        jScrollPane2.setViewportView(tblDeliveryMan);

        btnRefres.setBackground(new java.awt.Color(0, 153, 153));
        btnRefres.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRefres.setForeground(new java.awt.Color(255, 255, 255));
        btnRefres.setText("Refresh");
        btnRefres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresActionPerformed(evt);
            }
        });

        btnAssignLabTech.setBackground(new java.awt.Color(0, 153, 153));
        btnAssignLabTech.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnAssignLabTech.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignLabTech.setText("Assign to Delivery Man");
        btnAssignLabTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignLabTechActionPerformed(evt);
            }
        });

        btnFinalSubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnFinalSubmit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnFinalSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalSubmit.setText("Assign");
        btnFinalSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnRefres, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAssignLabTech)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnFinalSubmit)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefres)
                    .addComponent(btnAssignLabTech)
                    .addComponent(btnFinalSubmit))
                .addContainerGap(275, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresActionPerformed
        // TODO add your handling code here:
        populateWorkReqTable();
    }//GEN-LAST:event_btnRefresActionPerformed

    private void btnFinalSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalSubmitActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMan.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else {
            DeliveryMan dm = (DeliveryMan) tblDeliveryMan.getValueAt(selectedRow, 0);
            for(SupplyManager sm : system.getSupplyManagerDirectory().getSupplyManagerList()){
                if(sm.getUserAccount().getUid() == account.getUid()){
                    if(req.isType1()){
                        sm.setType1(-req.getQuantity());
                    } else {
                        sm.setType2(-req.getQuantity());
                    }
                }
            }
            req.setStatus("OUT FOR DELIVERY");
            dm.getUserAccount().getWorkQueue().getWorkRequestList().add(req);
            account.getWorkQueue().getWorkRequestList().remove(req);
            JOptionPane.showMessageDialog(null, "Task assigned to Delivery Man", "Error", JOptionPane.WARNING_MESSAGE);
            populateWorkReqTable();
            populateTechTable();
        }
    }//GEN-LAST:event_btnFinalSubmitActionPerformed

    private void btnAssignLabTechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignLabTechActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblOrders.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.NO_OPTION);
        }
        else {
            PatientOrderWorkRequest wr = (PatientOrderWorkRequest) tblOrders.getValueAt(selectedRow, 0);
            req = wr;
            tblDeliveryMan.setVisible(true);
            btnFinalSubmit.setVisible(true);
            jScrollPane2.setVisible(true);

        }

        populateTechTable();
    }//GEN-LAST:event_btnAssignLabTechActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignLabTech;
    private javax.swing.JButton btnFinalSubmit;
    private javax.swing.JButton btnRefres;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JTable tblDeliveryMan;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
