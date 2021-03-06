/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Nurse.Nurse;
import Business.SupplyManager.SupplyManager;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientAppointmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rolwy
 */
public class DoctorWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    private Doctor doctor;
    private PatientAppointmentWorkRequest req;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public DoctorWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        hideNursesTable();
        populateInvTable();
        populateWorkRequestTable();
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        lblSelectedNode2 = new javax.swing.JLabel();
        btnFinalSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientApmtWorkRequestJTable = new javax.swing.JTable();
        nursesSPane = new javax.swing.JScrollPane();
        tblNurses = new javax.swing.JTable();
        btnRefres = new javax.swing.JButton();
        btnAssignToNurse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoctorInv = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txtQuantity = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblSelectedNode2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectedNode2.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedNode2.setText("Assign Work");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSelectedNode2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectedNode2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnFinalSubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnFinalSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalSubmit.setText("Assign");
        btnFinalSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalSubmitActionPerformed(evt);
            }
        });

        patientApmtWorkRequestJTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        patientApmtWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        patientApmtWorkRequestJTable.setRowHeight(23);
        patientApmtWorkRequestJTable.setSelectionBackground(new java.awt.Color(51, 153, 255));
        patientApmtWorkRequestJTable.setShowGrid(false);
        jScrollPane1.setViewportView(patientApmtWorkRequestJTable);

        tblNurses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nurses"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNurses.setRowHeight(23);
        tblNurses.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblNurses.setShowGrid(false);
        nursesSPane.setViewportView(tblNurses);

        btnRefres.setBackground(new java.awt.Color(0, 153, 153));
        btnRefres.setForeground(new java.awt.Color(255, 255, 255));
        btnRefres.setText("Refresh");
        btnRefres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresActionPerformed(evt);
            }
        });

        btnAssignToNurse.setBackground(new java.awt.Color(0, 153, 153));
        btnAssignToNurse.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignToNurse.setText("Assign to a Nurse");
        btnAssignToNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToNurseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setText("Select an appointment to assign it to a nurse");

        tblDoctorInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Insulin Type", "Available Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDoctorInv);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblQuantity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblQuantity.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQuantity)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jScrollPane2)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRefres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAssignToNurse, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nursesSPane, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFinalSubmit, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nursesSPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnFinalSubmit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRefres)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAssignToNurse))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantity)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresActionPerformed
        // TODO add your handling code here:
//        populateWorkReqTable();
    }//GEN-LAST:event_btnRefresActionPerformed

    public void populateInvTable(){
        DefaultTableModel model = (DefaultTableModel) tblDoctorInv.getModel();
        model.setRowCount(0);
        
        for (Doctor doc: system.getDoctorDirectory().getDoctorList()) {
            if (doc.getUserAccount().getUid() == account.getUid()) {
                doctor = doc;
            }
        }
        
        if (doctor != null) {
            if(doctor.getType1() == 0 || doctor.getType2() == 0) return;
            Object[] row = new Object[2];
            row[0] = "Type1";
            row[1] = doctor.getType1();

            model.addRow(row); 

            row[0] = "Type2";
            row[1] = doctor.getType2();
            model.addRow(row);       
        } else {
            System.out.println("empty doctor");
        }
    }    
    
    public void populateNursesTable(){
        DefaultTableModel model = (DefaultTableModel) tblNurses.getModel();
        
        model.setRowCount(0);
                    System.out.println("account id is " +account.getUid());

        if(system.getNurseDirectory().getNurseList().size() == 0) return;
        for(Nurse ns : system.getNurseDirectory().getNurseList()){
            System.out.println("doccc id is " +ns.getDoctorId());
            
            if(account.getUid() == ns.getDoctorId()){
                Object[] row = new Object[2];
                row[0] = ns;
//                row[1] = ns.getNurseName();
                
                model.addRow(row);
            }
        }
    }
    
    private void btnAssignToNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToNurseActionPerformed
        // TODO add your handling code here:

        int selectedRow = patientApmtWorkRequestJTable.getSelectedRow();
        int selectedTypeRow = tblDoctorInv.getSelectedRow();
//        int quantity = (int) tblSupplierInv.getValueAt(selectedRow, 1);
                
        if(txtQuantity.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter the amount of insulin to administer", "Error", JOptionPane.NO_OPTION);
            return;
        }
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient", "Error", JOptionPane.NO_OPTION);
            return;
        }
        if (selectedTypeRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a type and set quantity from available", "Error", JOptionPane.NO_OPTION);
            return;
        }
        
        
        String type = (String) tblDoctorInv.getValueAt(selectedTypeRow, 0);
        PatientAppointmentWorkRequest wr = (PatientAppointmentWorkRequest) patientApmtWorkRequestJTable.getValueAt(selectedRow, 0);
            
        int availQuantity = (int) tblDoctorInv.getValueAt(selectedTypeRow, 1);
//            PatientAppointmentWorkRequest wr = new PatientAppointmentWorkRequest();
        if(Integer.parseInt(txtQuantity.getText()) > availQuantity){
            JOptionPane.showMessageDialog(null, "The Hospital inventory doesn't have the stock available. Please enter lower value", "Error", JOptionPane.NO_OPTION);
            return;
        }
        else {
            wr.setQuantity(Integer.parseInt(txtQuantity.getText()));
        }
            
        if(type.equals("Type1")){
            wr.setType1(true);  
        } else {
            wr.setType1(false);
        }
        req = wr;
            System.out.println(req.getQuantity());
            System.out.println(req.isType1());
            
        tblNurses.setVisible(true);
        btnFinalSubmit.setVisible(true);
        nursesSPane.setVisible(true);
        

        populateNursesTable();
    }//GEN-LAST:event_btnAssignToNurseActionPerformed

    private void btnFinalSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalSubmitActionPerformed
        // TODO add your handling code here:
        System.out.println(req);
        int selectedRow = tblNurses.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else {
            Nurse ns = (Nurse) tblNurses.getValueAt(selectedRow, 0);
            ns.getUserAccount().getWorkQueue().getWorkRequestList().add(req);
            System.out.println("Line removed here" + account.getWorkQueue().getWorkRequestList().size());
            account.getWorkQueue().getWorkRequestList().remove(req);
            System.out.println(account.getWorkQueue().getWorkRequestList().size());
            JOptionPane.showMessageDialog(null, "Task assigned to Nurse", "Error", JOptionPane.WARNING_MESSAGE);
            populateWorkRequestTable();
            populateNursesTable();
            hideNursesTable();
        }
    }//GEN-LAST:event_btnFinalSubmitActionPerformed

    public void populateWorkRequestTable() {
        // populate doctorworkreqtable
        DefaultTableModel model = (DefaultTableModel) patientApmtWorkRequestJTable.getModel();
        
        model.setRowCount(0);
        if(system.getDoctorDirectory().getDoctorList().size() == 0) return;
        for (Doctor doc : system.getDoctorDirectory().getDoctorList()) {
//            account.getUsername()
            if (doc.getUserAccount().getUid() == account.getUid()) {
                for(WorkRequest request : doc.getUserAccount().getWorkQueue().getWorkRequestList()){
                    if(request instanceof PatientAppointmentWorkRequest){
                        Object[] row = new Object[5];
                        row[0] = (PatientAppointmentWorkRequest)request;
                        row[1] = ((PatientAppointmentWorkRequest)request).getCustomer();
                        row[2] = ((PatientAppointmentWorkRequest)request).getMessage();
                        row[3] = ((PatientAppointmentWorkRequest)request).getReceiver();
                        row[4] = ((PatientAppointmentWorkRequest)request).getStatus();

                        model.addRow(row);
                    }
                }
            }
        }
        
    }
    
    public void hideNursesTable(){
        tblNurses.setVisible(false);
        btnFinalSubmit.setVisible(false);
        nursesSPane.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToNurse;
    private javax.swing.JButton btnFinalSubmit;
    private javax.swing.JButton btnRefres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSelectedNode2;
    private javax.swing.JScrollPane nursesSPane;
    private javax.swing.JTable patientApmtWorkRequestJTable;
    private javax.swing.JTable tblDoctorInv;
    private javax.swing.JTable tblNurses;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
