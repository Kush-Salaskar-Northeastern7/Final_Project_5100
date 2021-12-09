/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplyManagerWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.SupplyManager.SupplyManager;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        lblType2.setText("Type 2");

        lblType1.setText("Type 1");

        btnAdd.setText("Add");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblType1)
                        .addGap(18, 18, 18)
                        .addComponent(txtType1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblType2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(txtType2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType1)
                    .addComponent(txtType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType2)
                    .addComponent(txtType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String type1 = txtType1.getText();
        String type2 = txtType2.getText();
        
        if(type1.length() == 0 && type2.length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill all details.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(SupplyManager sm : system.getSupplyManagerDirectory().getSupplyManagerList()){
            if(sm.getUserAccount().getUid() == account.getUid()){
                sm.setType1(Integer.parseInt(type1));
                sm.setType2(Integer.parseInt(type2));
                System.out.println(sm.getType1());
                System.out.println(sm.getType2());
            }
        }
        JOptionPane.showMessageDialog(null, "Inventory Updated Successfully.");
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
    private javax.swing.JButton btnBackBtn;
    private javax.swing.JButton btnBackBtn1;
    private javax.swing.JButton btnBackBtn2;
    private javax.swing.JButton btnBackBtn3;
    private javax.swing.JButton btnBackBtn4;
    private javax.swing.JButton btnBackBtn5;
    private javax.swing.JButton btnBackBtn6;
    private javax.swing.JButton btnBackBtn7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JLabel lblSelectedNode1;
    private javax.swing.JLabel lblSelectedNode2;
    private javax.swing.JLabel lblSelectedNode3;
    private javax.swing.JLabel lblSelectedNode4;
    private javax.swing.JLabel lblSelectedNode5;
    private javax.swing.JLabel lblSelectedNode6;
    private javax.swing.JLabel lblSelectedNode7;
    private javax.swing.JLabel lblType1;
    private javax.swing.JLabel lblType2;
    private javax.swing.JTextField txtType1;
    private javax.swing.JTextField txtType2;
    // End of variables declaration//GEN-END:variables
}
