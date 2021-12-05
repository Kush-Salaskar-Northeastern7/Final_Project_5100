/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Doctor.Doctor;
import Business.LabSupervisor.LabSupervisor;
import Business.Role.CustomerRole;
import Business.Role.DoctorRole;
import Business.Role.LabSupervisorRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rolwy
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        initComponents();
        // populate enterprise list
//        populateEnterprises();
        for(Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()){
            populateTable(type.toString());
        }
        
    }
   
    private void populateTable(String enterprise) {
        DefaultTableModel model; 
        if(enterprise.equals("Hospital")) model = (DefaultTableModel) tblHospEnterpriseTable.getModel();
        else if(enterprise.equals("Manufacturer")) model = (DefaultTableModel) tblManufacturerEnterpriseTable.getModel();
        else if(enterprise.equals("Supplier")) model = (DefaultTableModel) tblSupplierEnterpriseTable.getModel();
        else model = (DefaultTableModel) tblLabEnterpriseTable.getModel();
        model.setRowCount(0);
//        for (Enterprise en : system.getEnterpriseDirectory().getEnterpriseList()) {
//            Object[] row = new Object[5];
//            row[0] = en;
//            row[1] = en.getEnterpriseType();
//            row[2] = en.getEmail();
//            row[3] = en.getLocation();
//            row[4] = "hi";
//            model.addRow(row);
//        }
        if(enterprise.equals("Hospital")){
           for (Doctor en : system.getDoctorDirectory().getDoctorList()) {
                Object[] row = new Object[5];
                row[0] = en;
                row[1] = en.getUserAccount().getUid();
                row[2] = en.getUserAccount().getUsername();
                row[3] = en.getDocName();
                row[4] = "hi";
                model.addRow(row);
           }
        } else if(enterprise.equals("Manufacturer")){
//            for (Admin en : system.getDoctorDirectory().getDoctorList()) {
//                Object[] row = new Object[5];
//                row[0] = en;
//                row[1] = en.getUserAccount().getUid();
//                row[2] = en.getUserAccount().getUsername();
//                row[3] = en.getDocName();
//                row[4] = "hi";
//                model.addRow(row);
//           }
        } else if(enterprise.equals("Supplier")) {
                
        } else {
            for(LabSupervisor ls: system.getLabSupervisorDirectory().getLabSupervisorList()){
                Object[] row = new Object[5];
                row[0] = ls;
                row[1] = ls.getUserAccount().getUid();
                row[2] = ls.getUserAccount().getUsername();
                row[3] = ls.getLsName();
                row[4] = "hi";
                model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblSelectedNode = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        btnHome2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEnterprisePhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEnterpriseUsername = new javax.swing.JTextField();
        txtEnterpriseLoc = new javax.swing.JTextField();
        txtEnterpriseName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPasswordField = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        btnDeleteEnterprise = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        selectEnterpriseType = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospEnterpriseTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblManufacturerEnterpriseTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSupplierEnterpriseTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblLabEnterpriseTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 102, 102));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblSelectedNode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectedNode.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedNode.setText("Manage Enterprise");

        btnBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBack2.setContentAreaFilled(false);
        btnBack2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack2.setEnabled(false);
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        btnHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        btnHome2.setContentAreaFilled(false);
        btnHome2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHome2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSelectedNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/networking (1).png"))); // NOI18N

        jLabel1.setText("Name");

        jLabel4.setText("Location");

        jLabel6.setText("Phone");

        txtEnterpriseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterpriseNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Username");

        submitBtn.setText("Add");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Password");

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEnterpriseLoc)
                            .addComponent(txtEnterprisePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPasswordField))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnterpriseUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtEnterpriseUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(19, 19, 19)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtEnterpriseLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEnterprisePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelInputLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel4, jLabel5, jLabel6, txtEnterpriseLoc, txtEnterpriseName});

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(61, 61, 61)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(panelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnDeleteEnterprise.setText("Delete");
        btnDeleteEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEnterpriseActionPerformed(evt);
            }
        });

        jLabel2.setText("Enterprise Type");

        selectEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hospital", "Manufacturer", "Supplier", "Laboratory" }));
        selectEnterpriseType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectEnterpriseTypeItemStateChanged(evt);
            }
        });
        selectEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEnterpriseTypeActionPerformed(evt);
            }
        });
        selectEnterpriseType.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                selectEnterpriseTypePropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectEnterpriseType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(559, 559, 559)
                .addComponent(btnDeleteEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(selectEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDeleteEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblHospEnterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Type", "Email", "Location", "Username"
            }
        ));
        jScrollPane1.setViewportView(tblHospEnterpriseTable);

        jTabbedPane1.addTab("Hospitals", jScrollPane1);

        tblManufacturerEnterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Type", "Email", "Location", "Username"
            }
        ));
        jScrollPane2.setViewportView(tblManufacturerEnterpriseTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Manufacturer", jPanel4);

        tblSupplierEnterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Type", "Email", "Location", "Username"
            }
        ));
        jScrollPane3.setViewportView(tblSupplierEnterpriseTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Supplier", jPanel5);

        tblLabEnterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Type", "Email", "Location", "Username"
            }
        ));
        jScrollPane5.setViewportView(tblLabEnterpriseTable);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Laboratory", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed
        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        blankJP.setBackground(Color.white);
        userProcessContainer.add("blank", blankJP);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnHome2ActionPerformed

    private void txtEnterpriseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterpriseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterpriseNameActionPerformed

    private void populateEnterprises() {
        selectEnterpriseType.removeAllItems();
        //loop through the enterprise type
        // in ui custom code, remove type parameter as string
        for(Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            selectEnterpriseType.addItem(type);
        }
        
//        System.out.println(system.getEnterpriseDirectory().getEnterpriseList().get(0).getLocation());
    }    
    
    public boolean checkEmptyFields() {
            
        String enterpriseName = txtEnterpriseName.getText();
        String enterpriseEmail = txtEnterpriseUsername.getText();
        String enterpriseLoc = txtEnterpriseLoc.getText();
        String enterprisePhone = txtEnterprisePhone.getText();
        
        if (enterpriseName.trim().equals("") || enterpriseEmail.trim().equals("") || enterpriseLoc.trim().equals("") || enterprisePhone.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty");
            return false;
        }
        else {
            return true;
        }
    }
    
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // Submit button action performed
        // take the enterprise type from dropdown
        
        if (checkEmptyFields()) {
            String enterprisetype = (String) selectEnterpriseType.getSelectedItem();

            String name = txtEnterpriseName.getText();
            String address = txtEnterpriseLoc.getText();
            String username = txtEnterpriseUsername.getText();
            String phone = txtEnterprisePhone.getText();
            char[] passwordArr = txtPasswordField.getPassword();
            String password = String.valueOf(passwordArr);

            if(enterprisetype.equals("Hospital")){
                Employee employee = system.getEmployeeDirectory().createEmployee(name);       
                UserAccount userAccount = system.getUserAccountDirectory().createUserAccount(username, password, employee, new DoctorRole());        
//                Customer c = ecosystem.getCustomerDirectory().addCustomer(name, age, address, 
//                                                           community, zip, "sk", phonenumber, userAccount); 
                Doctor doc = system.getDoctorDirectory().addDoctor(name, userAccount);
            } else if(enterprisetype.equals("Manufacturer")){
                
            } else if(enterprisetype.equals("Supplier")){
                
            } else {
                Employee employee = system.getEmployeeDirectory().createEmployee(name);       
                UserAccount userAccount = system.getUserAccountDirectory().createUserAccount(username, password, employee, new LabSupervisorRole());
                LabSupervisor ls = system.getLabSupervisorDirectory().addLabSupervisor(name, userAccount);
            }
//            Enterprise enterprise = system.getEnterpriseDirectory().createEnterprise(enterpriseName, enterprisetype, enterpriseLoc, enterpriseEmail, enterprisePhone);
            JOptionPane.showMessageDialog(this, "Enterprise is added");

            populateTable(enterprisetype);
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void btnDeleteEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEnterpriseActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospEnterpriseTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select an enterprise to delete");
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) tblHospEnterpriseTable.getModel();
            Enterprise selectedEnterprise = (Enterprise) model.getValueAt(selectedRowIndex, 0);
            // get the manager account of the selected restaurant
//            UserAccount useracc = ecosystem.getUserAccountDirectory().authenticateUser(userName.toString(), password.toString());
            // Delete enterprise and his account
//            system.getUserAccountDirectory().deleteUserAccount(useracc);
            system.getEnterpriseDirectory().deleteEnterprise(selectedEnterprise);
//            populateTable();
        }
        
        
    }//GEN-LAST:event_btnDeleteEnterpriseActionPerformed

    private void selectEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEnterpriseTypeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_selectEnterpriseTypeActionPerformed

    private void selectEnterpriseTypePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_selectEnterpriseTypePropertyChange
        // TODO add your handling code here:
        
//        if (enterpriseType == 0)
    }//GEN-LAST:event_selectEnterpriseTypePropertyChange

    private void selectEnterpriseTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectEnterpriseTypeItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_selectEnterpriseTypeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnDeleteEnterprise;
    private javax.swing.JButton btnHome2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JPanel panelInput;
    private javax.swing.JComboBox selectEnterpriseType;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTable tblHospEnterpriseTable;
    private javax.swing.JTable tblLabEnterpriseTable;
    private javax.swing.JTable tblManufacturerEnterpriseTable;
    private javax.swing.JTable tblSupplierEnterpriseTable;
    private javax.swing.JTextField txtEnterpriseLoc;
    private javax.swing.JTextField txtEnterpriseName;
    private javax.swing.JTextField txtEnterprisePhone;
    private javax.swing.JTextField txtEnterpriseUsername;
    private javax.swing.JPasswordField txtPasswordField;
    // End of variables declaration//GEN-END:variables
}
