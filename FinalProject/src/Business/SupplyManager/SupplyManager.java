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
    private int type1 = 0;
    private int type2 = 0;
    private String phoneNum;
    private String location;

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public SupplyManager(){
        userAccount = new UserAccount();
    }

    public int getType1() {
        return type1;
    }

    public void setType1(int type1) {
        this.type1 += type1;
    }

    public int getType2() {
        return type2;
    }

    public void setType2(int type2) {
        this.type2 += type2;
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
