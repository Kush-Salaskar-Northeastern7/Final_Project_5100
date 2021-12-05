/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

//import Business.Restaurant.RestaurantDirectory;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.LabTechnician.LabTechnicianDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
//    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private LabTechnicianDirectory labTechnicianDirectory;

    public EcoSystem(CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, EnterpriseDirectory enterpriseDirectory) {

//        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.enterpriseDirectory = enterpriseDirectory;
        this.labTechnicianDirectory = new LabTechnicianDirectory();
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    
    public CustomerDirectory getCustomerDirectory() {
        if (customerDirectory == null) {
            customerDirectory = new CustomerDirectory();
        }
        return customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        if (deliveryManDirectory == null) {
            deliveryManDirectory = new DeliveryManDirectory();
        }
        return deliveryManDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        if (enterpriseDirectory == null) {
            enterpriseDirectory = new EnterpriseDirectory();
        }
        return enterpriseDirectory;
    }
    
    public LabTechnicianDirectory getLabTechnicianDirectory() {
        if (labTechnicianDirectory == null) {
            labTechnicianDirectory = new LabTechnicianDirectory();
        }
        return labTechnicianDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        // name, type, location, email, phone
        super(null, null, null, null, null);
        // networkList=new ArrayList<Network>();
    }

    public boolean checkIfUserIsUnique(String userName) {
        //
        return false;
    }
}
