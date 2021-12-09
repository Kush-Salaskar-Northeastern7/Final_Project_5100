/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplyManager;

import Business.UserAccount.UserAccount;

/**
 *
 * @author anushka
 */
public class SupplyManager {
    private String smName;
    private UserAccount userAccount;
    
    public SupplyManager(){
        userAccount = new UserAccount();
    }

    public String getSmName() {
        return smName;
    }

    public void setSmName(String smName) {
        this.smName = smName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return smName;
    }
}
