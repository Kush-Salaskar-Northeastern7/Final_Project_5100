/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabSupervisor;

import Business.UserAccount.UserAccount;

/**
 *
 * @author anushka
 */
public class LabSupervisor {
    private String lsName;
    private UserAccount userAccount;
    
    public LabSupervisor(){
        userAccount = new UserAccount();
    }

    public String getLsName() {
        return lsName;
    }

    public void setLsName(String lsName) {
        this.lsName = lsName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return lsName;
    }
    
}
