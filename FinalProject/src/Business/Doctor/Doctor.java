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
    
    public Doctor(){
        userAccount = new UserAccount();
    }
}
