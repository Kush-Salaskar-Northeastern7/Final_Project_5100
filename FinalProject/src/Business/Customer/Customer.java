/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer {
    private String custName;
    private String custAddress;
    private String custCommunity;
    private String custZip;
    private String emailId;
    private int age;
    private boolean diagnosed;
    private String typeDiabetes;
    private int glucoseLvl;
    private String custImage;
    private long custPhoneNumber;
    private UserAccount userAccount;

    public String getCustCommunity() {
        return custCommunity;
    }

    public void setCustCommunity(String custCommunity) {
        this.custCommunity = custCommunity;
    }

    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip;
    }

    public String getCustImage() {
        return custImage;
    }

    public void setCustImage(String custImage) {
        this.custImage = custImage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDiagnosed() {
        return diagnosed;
    }

    public void setDiagnosed(boolean diagnosed) {
        this.diagnosed = diagnosed;
    }

    public String getTypeDiabetes() {
        return typeDiabetes;
    }

    public void setTypeDiabetes(String typeDiabetes) {
        this.typeDiabetes = typeDiabetes;
    }

    public int getGlucoseLvl() {
        return glucoseLvl;
    }

    public void setGlucoseLvl(int glucoseLvl) {
        this.glucoseLvl = glucoseLvl;
    }
    
    public Customer(){
        userAccount = new UserAccount();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public long getCustPhoneNumber() {
        return custPhoneNumber;
    }

    public void setCustPhoneNumber(long custPhoneNumber) {
        this.custPhoneNumber = custPhoneNumber;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    @Override
    public String toString(){
        return custName;
    }
}
