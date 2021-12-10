/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory(){
        customerList = new ArrayList<Customer>();
    }
    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer(String name, int age, String address, String community, String zip, String img, String presImg, long phoneNum, int glucLvl, String diabetesType, String emailid, UserAccount ua){
        Customer cu = new Customer();
        cu.setAge(age);
        cu.setCustName(name);
        cu.setCustAddress(address);
        cu.setCustCommunity(community);
        cu.setCustZip(zip);
        cu.setCustImage(img);
        cu.setPrescriptionImg(presImg);
        cu.setCustPhoneNumber(phoneNum);
        cu.setGlucoseLvl(glucLvl);
        cu.setTypeDiabetes(diabetesType);
        cu.setEmailId(emailid);
        cu.setUserAccount(ua);
        customerList.add(cu);
        return cu;
    }
    
    public void deleteCustomer(Customer cu){
        customerList.remove(cu);
    }
}
