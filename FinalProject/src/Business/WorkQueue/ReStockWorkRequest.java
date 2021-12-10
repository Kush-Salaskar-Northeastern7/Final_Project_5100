/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Doctor.Doctor;
import Business.SupplyManager.SupplyManager;

/**
 *
 * @author kushsalaskar
 */
public class ReStockWorkRequest extends WorkRequest{
    private Doctor doc;
    private SupplyManager sm;
    private boolean isType1;
    private int quantity;

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

    public boolean isIsType1() {
        return isType1;
    }

    public void setIsType1(boolean isType1) {
        this.isType1 = isType1;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
