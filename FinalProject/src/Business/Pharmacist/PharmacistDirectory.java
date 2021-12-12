/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author anushka
 */
public class PharmacistDirectory {
    
    private ArrayList<Pharmacist> pharmacistList;
    
    public PharmacistDirectory(){
        pharmacistList = new ArrayList();
    }

    public ArrayList<Pharmacist> getPharmacistList() {
        return pharmacistList;
    }

    public void setPharmacistList(ArrayList<Pharmacist> pharmacistList) {
        this.pharmacistList = pharmacistList;
    }
    
    public Pharmacist createPharmacist(String name, UserAccount ua,int docid){
        Pharmacist pharmacist = new Pharmacist();
        pharmacist.setPharmacistName(name);
        pharmacist.setUserAccount(ua);
        pharmacist.setDoctorId(docid);
        pharmacistList.add(pharmacist);
        return pharmacist;
    }
    
    public void deletePharmacist(Pharmacist p){
        pharmacistList.remove(p);
    }
    
}
