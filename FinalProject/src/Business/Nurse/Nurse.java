/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Nurse;

import Business.UserAccount.UserAccount;

/**
 *
 * @author anushka
 */
public class Nurse {
    private String nurseName;
    private UserAccount userAccount;
    private int DoctorId;

    public int getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(int DoctorId) {
        this.DoctorId = DoctorId;
    }
    
    public Nurse(){
        userAccount = new UserAccount();     
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return nurseName;
    }
    
}
