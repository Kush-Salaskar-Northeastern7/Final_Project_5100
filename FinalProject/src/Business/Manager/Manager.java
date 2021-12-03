/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manager;

import Business.UserAccount.UserAccount;

/**
 *
 * @author kushsalaskar
 */
public class Manager {
   private String managerName;
   private UserAccount userAccount;
   
   public Manager(){
       userAccount = new UserAccount();
   }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
   
}
