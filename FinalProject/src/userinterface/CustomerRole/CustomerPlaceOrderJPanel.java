/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.LabSupervisor.LabSupervisor;
import Business.SupplyManager.SupplyManager;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabApprovalWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginScreen;

/**
 *
 * @author kushsalaskar
 */
public class CustomerPlaceOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPlaceOrderJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private SupplyManager supManager;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public CustomerPlaceOrderJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        hideTable();
        populateSupplierTable();
    }
    
    
    public void populateSupplierTable(){
        DefaultTableModel model = (DefaultTableModel) tblSupplier.getModel();
        model.setRowCount(0);
        
        if(ecosystem.getSupplyManagerDirectory().getSupplyManagerList().size() == 0) return;
        for (SupplyManager sm : ecosystem.getSupplyManagerDirectory().getSupplyManagerList()) {
            Object[] row = new Object[2];
            row[0] = sm;
            row[1] = sm.getUserAccount().getUsername();
            
            model.addRow(row);       
        }
        
    }
    
    public void hideTable(){
        jScrollPane2.setVisible(false);
        tblSupplierInv.setVisible(false);
        btnPlaceOrder.setVisible(false);
    }
    
    public void showTable(){
        jScrollPane2.setVisible(true);
        tblSupplierInv.setVisible(true);
        btnPlaceOrder.setVisible(true);
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
        btnBackBtn = new javax.swing.JButton();
        lblSelectedNode = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        btnSelectSupplier = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSupplierInv = new javax.swing.JTable();
        btnPlaceOrder = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setPreferredSize(new java.awt.Dimension(923, 59));

        btnBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBackBtn.setAlignmentX(0.5F);
        btnBackBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBackBtn.setBorderPainted(false);
        btnBackBtn.setContentAreaFilled(false);
        btnBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackBtnActionPerformed(evt);
            }
        });

        lblSelectedNode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectedNode.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedNode.setText("Place Insulin Order");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackBtn)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Suppliers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSupplier);

        btnSelectSupplier.setText("Select");
        btnSelectSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectSupplierActionPerformed(evt);
            }
        });

        tblSupplierInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Insulin Type", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSupplierInv);

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPlaceOrder)
                        .addGap(156, 156, 156))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSelectSupplier)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(141, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelectSupplier)
                .addGap(91, 91, 91)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnPlaceOrder)
                .addContainerGap(175, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        LoginScreen ls = new LoginScreen(userProcessContainer, ecosystem);
        userProcessContainer.add("blank", ls);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_btnBackBtnActionPerformed

    private void btnSelectSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectSupplierActionPerformed
        // TODO add your handling code here:
        showTable();
        
        int selectedRow = tblSupplier.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.NO_OPTION);
        }
        else {
            SupplyManager sm = (SupplyManager) tblSupplier.getValueAt(selectedRow, 0);
            supManager = sm;
            showTable();
        
        }
    }//GEN-LAST:event_btnSelectSupplierActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlaceOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackBtn;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnSelectSupplier;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTable tblSupplierInv;
    // End of variables declaration//GEN-END:variables
}
