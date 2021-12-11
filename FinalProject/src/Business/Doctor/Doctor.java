/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.UserAccount.UserAccount;

/**
 *
 * @author anushka
 */
public class Doctor {
    private String docName;
    private UserAccount userAccount;
    private int type1;
    private int type2;
    
    public Doctor(){
        userAccount = new UserAccount();
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
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

    @Override
    public String toString() {
        return docName;
    }
}
