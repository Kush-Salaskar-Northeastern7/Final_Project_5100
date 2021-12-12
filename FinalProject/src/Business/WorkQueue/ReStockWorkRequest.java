/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Doctor.Doctor;
import Business.Pharmacist.Pharmacist;
import Business.SupplyManager.SupplyManager;

/**
 *
 * @author kushsalaskar
 */
public class ReStockWorkRequest extends WorkRequest{
    private Doctor doc;
    private Pharmacist pharmacist;

    public Pharmacist getPharmacist() {
        return pharmacist;
    }

    public void setPharmacist(Pharmacist pharmacist) {
        this.pharmacist = pharmacist;
    }
    private SupplyManager sm;
    private int quantity1;
    private int quantity2;

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public SupplyManager getSm() {
        return sm;
    }

    public void setSm(SupplyManager sm) {
        this.sm = sm;
    }

    public int getQuantity2() {
        return quantity2;
    }

    public void setQuantity2(int quantity2) {
        this.quantity2 = quantity2;
    }

    

    public int getQuantity1() {
        return quantity1;
    }

    public void setQuantity1(int quantity) {
        this.quantity1 = quantity;
    }
    
    
}
