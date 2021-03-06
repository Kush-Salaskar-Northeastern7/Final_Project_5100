/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabSupervisorWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.LabSupervisor.LabSupervisor;
import Business.LabTechnician.LabTechnician;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabApprovalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LabTechnicianWorkArea.LabTechnicianAcceptPatientsJPanel;
import userinterface.LoginScreen;

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
    private UserAccount account;
    private LabApprovalWorkRequest req;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public LabSupervisorWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        hideLabTechTable();
        populateWorkReqTable();
    }
    
    
    public void hideLabTechTable(){
        custImagePanel.setVisible(false);
        custPrescriptionPanel.setVisible(false);
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
        lblSelectedNode = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        labWorkRequestJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLabTech = new javax.swing.JTable();
        btnRefres = new javax.swing.JButton();
        btnFinalSubmit = new javax.swing.JButton();
        btnAssignLabTech = new javax.swing.JButton();
        custImagePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        imgProfile = new javax.swing.JLabel();
        custPrescriptionPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        imgPrescription = new javax.swing.JLabel();

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
                .addContainerGap(521, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
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
        tblLabTech.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tblLabTech.setShowGrid(false);
        jScrollPane2.setViewportView(tblLabTech);

        btnRefres.setBackground(new java.awt.Color(0, 153, 153));
        btnRefres.setForeground(new java.awt.Color(255, 255, 255));
        btnRefres.setText("Refresh");
        btnRefres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresActionPerformed(evt);
            }
        });

        btnFinalSubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnFinalSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalSubmit.setText("Assign");
        btnFinalSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalSubmitActionPerformed(evt);
            }
        });

        btnAssignLabTech.setBackground(new java.awt.Color(0, 153, 153));
        btnAssignLabTech.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignLabTech.setText("Assign to Lab Tech");
        btnAssignLabTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignLabTechActionPerformed(evt);
            }
        });

        custImagePanel.setBackground(new java.awt.Color(255, 255, 255));
        custImagePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer Profile");

        javax.swing.GroupLayout custImagePanelLayout = new javax.swing.GroupLayout(custImagePanel);
        custImagePanel.setLayout(custImagePanelLayout);
        custImagePanelLayout.setHorizontalGroup(
            custImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, custImagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        custImagePanelLayout.setVerticalGroup(
            custImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custImagePanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        custPrescriptionPanel.setBackground(new java.awt.Color(255, 255, 255));
        custPrescriptionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customer Prescription");

        javax.swing.GroupLayout custPrescriptionPanelLayout = new javax.swing.GroupLayout(custPrescriptionPanel);
        custPrescriptionPanel.setLayout(custPrescriptionPanelLayout);
        custPrescriptionPanelLayout.setHorizontalGroup(
            custPrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
            .addGroup(custPrescriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        custPrescriptionPanelLayout.setVerticalGroup(
            custPrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custPrescriptionPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAssignLabTech)
                            .addComponent(btnRefres, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFinalSubmit)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(custImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(custPrescriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnRefres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAssignLabTech)
                    .addComponent(btnFinalSubmit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custPrescriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalSubmitActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblLabTech.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        else {
            LabTechnician lt = (LabTechnician) tblLabTech.getValueAt(selectedRow, 0);
            lt.getUserAccount().getWorkQueue().getWorkRequestList().add(req);
            account.getWorkQueue().getWorkRequestList().remove(req);
            JOptionPane.showMessageDialog(null, "Task assigned to Lab Technician");
            hideLabTechTable();
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
        custImagePanel.setVisible(false);
        custPrescriptionPanel.setVisible(false);
        imgProfile.setIcon(null);
        imgPrescription.setIcon(null);
        int selectedRow = labWorkRequestJTable.getSelectedRow();
        boolean cImage = false;
        boolean pImage = false;
     
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.NO_OPTION);
        }
        else {
            LabApprovalWorkRequest wr = (LabApprovalWorkRequest) labWorkRequestJTable.getValueAt(selectedRow, 0);
            req = wr;
            
            
            
//            if (!req.getCustomer().getCustImage().trim().equals("") && !req.getCustomer().getPrescriptionImg().trim().equals("")) {
//                custImagePanel.setVisible(true);
//                custPrescriptionPanel.setVisible(true);
//                System.out.println(req.getCustomer().getCustImage());
//            }
            if(req.getCustomer().getCustImage() != null){
                custImagePanel.setVisible(true);
                System.out.println(req.getCustomer().getCustImage());

            }
            if(req.getCustomer().getPrescriptionImg() != null){
                custPrescriptionPanel.setVisible(true);
                System.out.println(req.getCustomer().getPrescriptionImg());
            }
            
            try {
                BufferedImage profilePhoto = ImageIO.read(new File(req.getCustomer().getCustImage()));
                imgProfile.setIcon(new ImageIcon(profilePhoto.getScaledInstance(200, 150, java.awt.Image.SCALE_SMOOTH)));
            } catch (IOException ex) {
                System.out.println("Profile Image not uploaded");
            }
            
            try {
                BufferedImage prescriptionPhoto = ImageIO.read(new File(req.getCustomer().getPrescriptionImg()));
                imgPrescription.setIcon(new ImageIcon(prescriptionPhoto.getScaledInstance(420, 231, java.awt.Image.SCALE_SMOOTH)));
            } catch (IOException ex) {
                System.out.println("Prescription Image not uploaded");
            }
            tblLabTech.setVisible(true);
            btnFinalSubmit.setVisible(true);
            jScrollPane2.setVisible(true);
        
        }
         
        populateTechTable();
    }//GEN-LAST:event_btnAssignLabTechActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignLabTech;
    private javax.swing.JButton btnFinalSubmit;
    private javax.swing.JButton btnRefres;
    private javax.swing.JPanel custImagePanel;
    private javax.swing.JPanel custPrescriptionPanel;
    private javax.swing.JLabel imgPrescription;
    private javax.swing.JLabel imgProfile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable labWorkRequestJTable;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JTable tblLabTech;
    // End of variables declaration//GEN-END:variables
}
