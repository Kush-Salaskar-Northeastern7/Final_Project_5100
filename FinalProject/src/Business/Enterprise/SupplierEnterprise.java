/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rolwy
 */
public class SupplierEnterprise extends Enterprise{
    public SupplierEnterprise(String name, String location, String email, String phone){
        super(name, Enterprise.EnterpriseType.Supplier, location, email, phone);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }       
}
