/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTechnician;

import Business.UserAccount.UserAccount;

/**
 *
 * @author anushka
 */
public class LabTechnician {
    private String ltName;
    private UserAccount userAccount;
    private int supervisorId;
    
    public LabTechnician(){
        userAccount = new UserAccount();
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }
    
    

    public String getLtName() {
        return ltName;
    }

    public void setLtName(String ltName) {
        this.ltName = ltName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return ltName;
    }
    
}
