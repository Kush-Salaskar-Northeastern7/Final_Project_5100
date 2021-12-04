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
public class LaboratoryEnterprise extends Enterprise {
    public LaboratoryEnterprise(String name, String location, String email, String phone){
        super(name, Enterprise.EnterpriseType.Laboratory, location, email, phone);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }    
}
