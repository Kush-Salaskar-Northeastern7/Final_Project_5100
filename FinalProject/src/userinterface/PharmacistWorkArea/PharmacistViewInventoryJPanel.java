/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacistWorkArea;
import Business.DB4OUtil.DB4OUtil;
import Business.Doctor.Doctor;
import Business.Pharmacist.Pharmacist;
import Business.EcoSystem;
import Business.SupplyManager.SupplyManager;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.LoginScreen;

/**
 *
 * @author anushka
 */
public class PharmacistViewInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacistViewInventoryJPanel
     */
    private JPanel userProcessContainer;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    private Doctor doctor;
    private Pharmacist ph;
    
    public PharmacistViewInventoryJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        populateValues();
        showWarning();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        lblSelectedNode7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblType1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblType2 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel10.setPreferredSize(new java.awt.Dimension(923, 59));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSelectedNode7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectedNode7.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectedNode7.setText("Insulin Stock");
        jPanel10.add(lblSelectedNode7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, 273, 31));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Type 1");

        lblType1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Type 2");

        lblType2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        btnRefresh.setBackground(new java.awt.Color(0, 153, 153));
        btnRefresh.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRefresh)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblType1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(jSeparator1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblType2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(jSeparator2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblType1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblType2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, lblType1});

    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateValues();
        showWarning();
    }//GEN-LAST:event_btnRefreshActionPerformed

    
    public void showWarning(){
        if(doctor == null) return;
        if(doctor.getType1() <= 5 || doctor.getType2() <= 5){
            JOptionPane.showMessageDialog(this, "Looks like you are running low on insulin. Please refill.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    }
    
    public void populateValues(){
        for(Pharmacist sm : system.getPharmacistDirectory().getPharmacistList()){
            if(sm.getUserAccount().getUid() == account.getUid()){
                ph = sm;
            }
        }
        
        for(Doctor d : system.getDoctorDirectory().getDoctorList()){
            if(ph.getDoctorId() == d.getUserAccount().getUid()){
                doctor = d;
            }
        }
        
        if(doctor == null) return;
        lblType1.setText(String.valueOf(doctor.getType1()));
        lblType2.setText(String.valueOf(doctor.getType2()));
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblSelectedNode7;
    private javax.swing.JLabel lblType1;
    private javax.swing.JLabel lblType2;
    // End of variables declaration//GEN-END:variables
}
