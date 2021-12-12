/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplyManagerWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Manager.Manager;
import Business.SupplyManager.SupplyManager;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReStockWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginScreen;

/**
 *
 * @author kushsalaskar
 */
public class SupplyManagerAddInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplyManagerAddInventoryJPanel
     */
    
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    
    public SupplyManagerAddInventoryJPanel(JPanel container, UserAccount account, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.system = system;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblFactory.getModel();
        
        model.setRowCount(0);
        if(system.getManagerDirectory().getManagerList().size() == 0) return;
        for(Manager m : system.getManagerDirectory().getManagerList()){
                Object[] row = new Object[2];
                row[0] = m;
                row[1] = m.getManagerName();
                
                model.addRow(row);
            }
        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblType2 = new javax.swing.JLabel();
        lblType1 = new javax.swing.JLabel();
        txtType2 = new javax.swing.JTextField();
        txtType1 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnBackBtn7 = new javax.swing.JButton();
        lblSelectedNode7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFactory = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lblType2.setText("Type 2");

        lblType1.setText("Type 1");

        btnAdd.setBackground(new java.awt.Color(0, 153, 153));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Place Order");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel10.setPreferredSize(new java.awt.Dimension(923, 59));

        btnBackBtn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBackBtn7.setAlignmentX(0.5F);
        btnBackBtn7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBackBtn7.setBorderPainted(false);
        btnBackBtn7.setContentAreaFilled(false);
        btnBackBtn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackBtn7ActionPerformed(evt);
            }
        });

        lblSelectedNode7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectedNode7.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedNode7.setText("Place Insulin Order");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSelectedNode7, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackBtn7)
                .addGap(19, 19, 19))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackBtn7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(lblSelectedNode7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tblFactory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Factory"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFactory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblType2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtType2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblType1)
                        .addGap(18, 18, 18)
                        .addComponent(txtType1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType1)
                    .addComponent(txtType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType2)
                    .addComponent(txtType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFactory.getSelectedRow();
        String type1 = txtType1.getText();
        String type2 = txtType2.getText();
        
        
        
        if(type1.length() == 0 && type2.length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill all details.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else {
            Manager m = (Manager) tblFactory.getValueAt(selectedRow, 0);
            for(SupplyManager sm : system.getSupplyManagerDirectory().getSupplyManagerList()){
                if(sm.getUserAccount().getUid() == account.getUid()){
                    ReStockWorkRequest wr = new ReStockWorkRequest();
                    for(SupplyManager c : system.getSupplyManagerDirectory().getSupplyManagerList()){
                        if(c.getUserAccount().getUid() == account.getUid()){
                        wr.setSm(c);
                    }
                }
                wr.setSender(account);
                wr.setStatus("DELIVERY REQUEST");
                wr.setReceiver(m.getUserAccount());
                wr.setQuantity1(Integer.parseInt(txtType1.getText()));
                wr.setQuantity2(Integer.parseInt(txtType2.getText()));
                
//                    sm.setType1(Integer.parseInt(type1));
//                    sm.setType2(Integer.parseInt(type2));
                m.getUserAccount().getWorkQueue().getWorkRequestList().add(wr);
                }
                
            }
            JOptionPane.showMessageDialog(null, "Inventory Order placed Successfully.");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackBtn7ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        JPanel blankJP = new JPanel();
        LoginScreen ls = new LoginScreen(container, system);
        container.add("blank", ls);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnBackBtn7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackBtn7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelectedNode7;
    private javax.swing.JLabel lblType1;
    private javax.swing.JLabel lblType2;
    private javax.swing.JTable tblFactory;
    private javax.swing.JTextField txtType1;
    private javax.swing.JTextField txtType2;
    // End of variables declaration//GEN-END:variables
}
