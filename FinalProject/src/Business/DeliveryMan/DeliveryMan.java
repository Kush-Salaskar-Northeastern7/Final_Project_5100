/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String deliveryManName;
    private UserAccount userAccount;
    private int SupplyManagerId;

    public int getSupplyManagerId() {
        return SupplyManagerId;
    }

    public void setSupplyManagerId(int SupplyManagerId) {
        this.SupplyManagerId = SupplyManagerId;
    }
    
    public DeliveryMan(){
        userAccount = new UserAccount();
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    @Override
    public String toString() {
        return deliveryManName;
    }
    
}
