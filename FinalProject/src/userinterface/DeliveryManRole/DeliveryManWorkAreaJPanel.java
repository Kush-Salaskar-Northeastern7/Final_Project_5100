/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
      
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblOrders.getModel();
        
        model.setRowCount(0);
        if(system.getDeliveryManDirectory().getDeliveryManList().size() == 0) return;
        for (DeliveryMan dm : system.getDeliveryManDirectory().getDeliveryManList()) {
//            account.getUsername()
            if (dm.getUserAccount().getUid() == account.getUid()) {
                for(WorkRequest request : dm.getUserAccount().getWorkQueue().getWorkRequestList()){
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

        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

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
        tblOrders.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tblOrders.setShowGrid(false);
        jScrollPane1.setViewportView(tblOrders);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
       
        int selectedRow = tblOrders.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Your Req is sent to your Lab for review.");
            return;
        }

        PatientOrderWorkRequest request = new PatientOrderWorkRequest() ;
//        request.setTestResult(workRequestJTable.getValueAt(selectedRow, 0).toString());
//        request.setStatus("Processing");
        
        
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request, account);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
