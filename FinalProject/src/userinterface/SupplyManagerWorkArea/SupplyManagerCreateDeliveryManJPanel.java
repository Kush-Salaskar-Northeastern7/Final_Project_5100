/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplyManagerWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.FactoryWorker.FactoryWorker;
import Business.Role.DeliveryManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LoginScreen;

/**
 *
 * @author anushka
 */
public class SupplyManagerCreateDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplyManagerCreateDeliveryManJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private UserAccount userAcc;
    private EcoSystem ecosystem;
    private DeliveryMan deliveryman;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public SupplyManagerCreateDeliveryManJPanel(JPanel userProcessContainer, UserAccount userAcc, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;   
        this.userAcc = userAcc;
//        this.userAccount = account;
        this.ecosystem = ecosystem;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        lblSelectedNode = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryMen = new javax.swing.JTable();
        btnViewLt = new javax.swing.JButton();
        txtDmusername = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDmpassword = new javax.swing.JPasswordField();
        txtDmname = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblSelectedNode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectedNode.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedNode.setText("Create Delivery Man");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBack.setContentAreaFilled(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        tblDeliveryMen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Username"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveryMen);

        btnViewLt.setBackground(new java.awt.Color(0, 153, 153));
        btnViewLt.setForeground(new java.awt.Color(255, 255, 255));
        btnViewLt.setText("View");
        btnViewLt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLtActionPerformed(evt);
            }
        });

        txtDmusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDmusernameActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(0, 153, 153));
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create ");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        btnDelete.setBackground(new java.awt.Color(0, 153, 153));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 153));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDmusername, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDmname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewLt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDmname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDmusername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewLt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, txtDmpassword});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, txtDmusername});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, txtDmname});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(txtDmname.getText().isEmpty() || txtDmusername.getText().isEmpty() || txtDmpassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all details.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String name = txtDmname.getText();
        String username = txtDmusername.getText();
        String password = String.valueOf(txtDmpassword.getPassword());

        for(DeliveryMan lt : ecosystem.getDeliveryManDirectory().getDeliveryManList()){
            if(lt.getDeliveryManName() == null) continue;
            if(lt.getUserAccount().getUid() == deliveryman.getUserAccount().getUid()){
                lt.setDeliveryManName(name);
                lt.getUserAccount().setUsername(username);
            }
        }


        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(name);
        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(username, password, employee, new DeliveryManRole());
        DeliveryMan lt = ecosystem.getDeliveryManDirectory().createDeliveryMan(name,userAccount,userAcc.getUid(), true);


        txtDmname.setText("");
        txtDmusername.setText("");
        txtDmpassword.setText("");

        populateTable();
        JOptionPane.showMessageDialog(null, "Delivery Man Updated Successfully.");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewLtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLtActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMen.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else {
            DeliveryMan lt = (DeliveryMan) tblDeliveryMen.getValueAt(selectedRow, 0);
            deliveryman = lt;
            txtDmname.setText(lt.getDeliveryManName());
            txtDmusername.setText(lt.getUserAccount().getUsername());
            txtDmpassword.setText(lt.getUserAccount().getPassword());
        }
    }//GEN-LAST:event_btnViewLtActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMen.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select any row.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else {
            DeliveryMan lt = (DeliveryMan) tblDeliveryMen.getValueAt(selectedRow, 0);
            UserAccount ua = lt.getUserAccount();
            ecosystem.getUserAccountDirectory().deleteUserAccount(ua); //need to delete useraccount of lab technician as well
            ecosystem.getDeliveryManDirectory().deleteDeliveryMan(lt);
            JOptionPane.showMessageDialog(null, "Delivery Man removed Successfully.");
            populateTable();}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        if(txtDmname.getText().isEmpty() || txtDmusername.getText().isEmpty() || txtDmpassword.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Please fill all details.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String name = txtDmname.getText();
        String username = txtDmusername.getText();
        String password = String.valueOf(txtDmpassword.getPassword());

        if(!ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists, select a new username", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(name);
        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(username, password, employee, new DeliveryManRole());
        DeliveryMan lt = ecosystem.getDeliveryManDirectory().createDeliveryMan(name, userAccount, userAcc.getUid(), true);

        txtDmname.setText("");
        txtDmpassword.setText("");
        txtDmusername.setText("");
        populateTable();
        JOptionPane.showMessageDialog(null, "Delivery Man Created");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtDmusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDmusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDmusernameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.removeAll();
        SupplyManagerWorkAreaJPanel dw = new SupplyManagerWorkAreaJPanel(userProcessContainer, userAcc, ecosystem);
        userProcessContainer.add("supplyworkarea", dw);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMen.getModel();
        model.setRowCount(0);
        for (DeliveryMan deliveryman : ecosystem.getDeliveryManDirectory().getDeliveryManList()) {
            if(deliveryman.getSupplyManagerId() == userAcc.getUid()){
                Object[] row = new Object[2];
                 row[0] = deliveryman;
                 row[1] = deliveryman.getUserAccount().getUsername(); 

                 model.addRow(row);
             }
         }  
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewLt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JTable tblDeliveryMen;
    private javax.swing.JTextField txtDmname;
    private javax.swing.JPasswordField txtDmpassword;
    private javax.swing.JTextField txtDmusername;
    // End of variables declaration//GEN-END:variables
}
