/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization;

/**
 *
 * @author rolwy
 */
public abstract class Enterprise extends Organization {
    private EnterpriseType enterpriseType;

    
    public enum EnterpriseType{
        Manufacturer("Manufacturer"),
        Hospital("Hospital"),
        Laboratory("Laboratory"),
        Supplier("Supplier");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name, EnterpriseType enterprisetype, String location, String email, String phone){
        //convert type to string for parent super keyword
        super(name, enterprisetype.toString(), location, email, phone);
        this.enterpriseType = enterprisetype;
        //initialize organization below
    }
    
    
}
