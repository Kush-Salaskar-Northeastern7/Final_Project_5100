/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FactoryWorkerWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.FactoryWorker.FactoryWorker;
import Business.SupplyManager.SupplyManager;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientOrderWorkRequest;
import Business.WorkQueue.ReStockWorkRequest;
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
public class FactoryWorkerAssignDeliveryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FactoryWorkerAssignDeliveryJPanel
     */
    
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private ReStockWorkRequest req;
    
    public FactoryWorkerAssignDeliveryJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        populateWorkReqTable();
        hideLabTechTable();
    }
    
    public void hideLabTechTable(){
        tblDeliveryMan.setVisible(false);
        btnFinalSubmit.setVisible(false);
        jScrollPane2.setVisible(false);
    }
    
    public void populateTechTable(){
        DefaultTableModel model = (DefaultTableModel)tblDeliveryMan.getModel();
        
        model.setRowCount(0);
        
        int managerID = -1;
        for(FactoryWorker fw : system.getFactoryWorkerDirectory().getFactoryWorkerList()){
            if(fw.getUserAccount().getUid() == account.getUid()){
                managerID = fw.getManagerId();
            }
        }
        if(managerID == -1){
            JOptionPane.showMessageDialog(null, "Manager not found", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(system.getDeliveryManDirectory().getDeliveryManList().size() == 0) return;
        for(DeliveryMan dm : system.getDeliveryManDirectory().getDeliveryManList()){
            if(managerID == dm.getSupplyManagerId()){
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
        if(system.getFactoryWorkerDirectory().getFactoryWorkerList().size() == 0) return;
        for (FactoryWorker fw : system.getFactoryWorkerDirectory().getFactoryWorkerList()) {
//            account.getUsername()
            if (fw.getUserAccount().getUid() == account.getUid()) {
                for(WorkRequest request : fw.getUserAccount().getWorkQueue().getWorkRequestList()){
                    if(request instanceof ReStockWorkRequest){
                        Object[] row = new Object[5];
                        row[0] = (ReStockWorkRequest)request;
                        row[1] = ((ReStockWorkRequest)request).getSm();
                        row[2] = ((ReStockWorkRequest)request).getQuantity1();
                        row[3] = ((ReStockWorkRequest)request).getQuantity2();
                        row[4] = ((ReStockWorkRequest)request).getStatus();

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
        btnRefres = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
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
                .addContainerGap(571, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRefres.setBackground(new java.awt.Color(0, 153, 153));
        btnRefres.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRefres.setForeground(new java.awt.Color(255, 255, 255));
        btnRefres.setText("Refresh");
        btnRefres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresActionPerformed(evt);
            }
        });

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Customer", "Type1", "Type2", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        tblDeliveryMan.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tblDeliveryMan.setShowGrid(false);
        jScrollPane2.setViewportView(tblDeliveryMan);

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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAssignLabTech)
                            .addComponent(btnRefres, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalSubmit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignLabTech)
                    .addComponent(btnFinalSubmit))
                .addGap(0, 281, Short.MAX_VALUE))
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

            
            req.setStatus("OUT FOR DELIVERY");
            dm.getUserAccount().getWorkQueue().getWorkRequestList().add(req);
            account.getWorkQueue().getWorkRequestList().remove(req);
            JOptionPane.showMessageDialog(null, "Task assigned to Delivery Men", "Error", JOptionPane.WARNING_MESSAGE);
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
            ReStockWorkRequest wr = (ReStockWorkRequest) tblOrders.getValueAt(selectedRow, 0);
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
