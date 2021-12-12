/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;

/**
 *
 * @author rolwy
 */
public class PatientAppointmentWorkRequest extends WorkRequest {
    private Customer customer;
    private boolean type1;
    private int quantity;
    private boolean isReviewed;

    public boolean isIsReviewed() {
        return isReviewed;
    }

    public void setIsReviewed(boolean isReviewed) {
        this.isReviewed = isReviewed;
    }
    
    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isType1() {
        return type1;
    }

    public void setType1(boolean type1) {
        this.type1 = type1;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
