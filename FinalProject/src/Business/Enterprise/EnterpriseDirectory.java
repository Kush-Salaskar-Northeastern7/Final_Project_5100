/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author rolwy
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    public Enterprise createEnterprise(String name,Enterprise.EnterpriseType enterprisetype, String location, String email, String phone){
        Enterprise enterprise = null;
        // create an manufacturer enterprise
        if(enterprisetype == Enterprise.EnterpriseType.Manufacturer){
            enterprise = new ManufacturerEnterprise(name, location, email, phone);
            enterpriseList.add(enterprise);
        }
        // create hospital enterprise
        if(enterprisetype == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name, location, email, phone);
            enterpriseList.add(enterprise);
        }
        // create laboratory enterprise
        if(enterprisetype == Enterprise.EnterpriseType.Laboratory){
            enterprise = new ManufacturerEnterprise(name, location, email, phone);
            enterpriseList.add(enterprise);
        }
        // create supplier enterprise
        if(enterprisetype == Enterprise.EnterpriseType.Supplier){
            enterprise = new ManufacturerEnterprise(name, location, email, phone);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public void deleteEnterprise(Enterprise enterprise){
        enterpriseList.remove(enterprise);
    }
    
    
    
    
    
}
