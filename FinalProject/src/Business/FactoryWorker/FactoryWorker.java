/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FactoryWorker;

import Business.UserAccount.UserAccount;

/**
 *
 * @author anushka
 */
public class FactoryWorker {
    private String fwName;
    private UserAccount userAccount;
    
    public FactoryWorker(){
        userAccount = new UserAccount();
    }

    public String getFwName() {
        return fwName;
    }

    public void setFwName(String fwName) {
        this.fwName = fwName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    
}
