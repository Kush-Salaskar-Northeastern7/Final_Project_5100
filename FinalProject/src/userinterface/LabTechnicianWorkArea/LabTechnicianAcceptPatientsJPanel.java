/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabTechnicianWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.LabSupervisor.LabSupervisor;
import Business.LabTechnician.LabTechnician;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabApprovalWorkRequest;
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
public class LabTechnicianAcceptPatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabTechnicianAcceptPatientsJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private LabApprovalWorkRequest req;
    
    public LabTechnicianAcceptPatientsJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        populateTable();
    }

    

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)labWorkRequestJTable.getModel();
        
        model.setRowCount(0);
        if(system.getLabTechnicianDirectory().getLabTechnicianList().size() == 0) return;
        for (LabTechnician lt : system.getLabTechnicianDirectory().getLabTechnicianList()) {
//            account.getUsername()
            if (lt.getUserAccount().getUid() == account.getUid()) {
                for(WorkRequest request : lt.getUserAccount().getWorkQueue().getWorkRequestList()){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        labWorkRequestJTable = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblGlucoseLevel = new javax.swing.JLabel();
        lblDiabetesType = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        btnLogout20 = new javax.swing.JButton();
        lblSelectedNode20 = new javax.swing.JLabel();

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

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel1.setText("Glucose Level");

        jLabel3.setText("Diabetes type");

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnLogout20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout20.setAlignmentX(0.5F);
        btnLogout20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogout20.setBorderPainted(false);
        btnLogout20.setContentAreaFilled(false);
        btnLogout20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hoveredlogin.png"))); // NOI18N
        btnLogout20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout20ActionPerformed(evt);
            }
        });

        lblSelectedNode20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectedNode20.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedNode20.setText("Lab Supervisor Work Area");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectedNode20, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 464, Short.MAX_VALUE)
                .addComponent(btnLogout20)
                .addGap(19, 19, 19))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblSelectedNode20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGlucoseLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDiabetesType, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnAccept)
                        .addGap(31, 31, 31)
                        .addComponent(btnReject))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnView)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnView)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblGlucoseLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblDiabetesType, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnReject))
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here
        Employee employee = system.getEmployeeDirectory().createEmployee(req.getCustomer().getCustName());       
        UserAccount userAccount = system.getUserAccountDirectory().createUserAccount(req.getUsername(), req.getPassword(), employee, new CustomerRole());
        req.getCustomer().setUserAccount(userAccount);
        
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnLogout20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout20ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        LoginScreen ls = new LoginScreen(userProcessContainer, system);
        userProcessContainer.add("blank", ls);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogout20ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = labWorkRequestJTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.NO_OPTION);
        }
        else {
            LabApprovalWorkRequest wr = (LabApprovalWorkRequest) labWorkRequestJTable.getValueAt(selectedRow, 0);
            req = wr;
            lblName.setText(wr.getCustomer().getCustName());
            lblGlucoseLevel.setText(String.valueOf(wr.getCustomer().getGlucoseLvl()));
            lblDiabetesType.setText(wr.getCustomer().getTypeDiabetes());
        
        }
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JButton btnLogout10;
    private javax.swing.JButton btnLogout11;
    private javax.swing.JButton btnLogout12;
    private javax.swing.JButton btnLogout13;
    private javax.swing.JButton btnLogout14;
    private javax.swing.JButton btnLogout15;
    private javax.swing.JButton btnLogout16;
    private javax.swing.JButton btnLogout17;
    private javax.swing.JButton btnLogout18;
    private javax.swing.JButton btnLogout19;
    private javax.swing.JButton btnLogout2;
    private javax.swing.JButton btnLogout20;
    private javax.swing.JButton btnLogout3;
    private javax.swing.JButton btnLogout4;
    private javax.swing.JButton btnLogout5;
    private javax.swing.JButton btnLogout6;
    private javax.swing.JButton btnLogout7;
    private javax.swing.JButton btnLogout8;
    private javax.swing.JButton btnLogout9;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labWorkRequestJTable;
    private javax.swing.JLabel lblDiabetesType;
    private javax.swing.JLabel lblGlucoseLevel;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JLabel lblSelectedNode1;
    private javax.swing.JLabel lblSelectedNode10;
    private javax.swing.JLabel lblSelectedNode11;
    private javax.swing.JLabel lblSelectedNode12;
    private javax.swing.JLabel lblSelectedNode13;
    private javax.swing.JLabel lblSelectedNode14;
    private javax.swing.JLabel lblSelectedNode15;
    private javax.swing.JLabel lblSelectedNode16;
    private javax.swing.JLabel lblSelectedNode17;
    private javax.swing.JLabel lblSelectedNode18;
    private javax.swing.JLabel lblSelectedNode19;
    private javax.swing.JLabel lblSelectedNode2;
    private javax.swing.JLabel lblSelectedNode20;
    private javax.swing.JLabel lblSelectedNode3;
    private javax.swing.JLabel lblSelectedNode4;
    private javax.swing.JLabel lblSelectedNode5;
    private javax.swing.JLabel lblSelectedNode6;
    private javax.swing.JLabel lblSelectedNode7;
    private javax.swing.JLabel lblSelectedNode8;
    private javax.swing.JLabel lblSelectedNode9;
    // End of variables declaration//GEN-END:variables
}
