/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

//import Business.Restaurant.RestaurantDirectory;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Doctor.DoctorDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.FactoryWorker.FactoryWorkerDirectory;
import Business.LabTechnician.LabTechnicianDirectory;
import Business.LabSupervisor.LabSupervisorDirectory;
import Business.Manager.ManagerDirectory;
import Business.Nurse.NurseDirectory;
import Business.Pharmacist.PharmacistDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.SupplyManager.SupplyManagerDirectory;
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
    private DoctorDirectory doctorList;
    private LabSupervisorDirectory labSupervisorDirectory;
    private ManagerDirectory managerDirectory;
    private SupplyManagerDirectory supplyManagerDirectory;
    private FactoryWorkerDirectory factoryWorkerDirectory;
    private NurseDirectory nurseDirectory;
    private PharmacistDirectory pharmacistDirectory;
    
    public EcoSystem(FactoryWorkerDirectory factoryWorkerDirectory, CustomerDirectory customerDirectory, 
            DeliveryManDirectory deliveryManDirectory, EnterpriseDirectory enterpriseDirectory, 
            DoctorDirectory doctorList, LabSupervisorDirectory labSupervisorDirectory, 
            LabTechnicianDirectory labTechnicianDirectory, ManagerDirectory managerDirectory, 
            SupplyManagerDirectory supplyManagerDirectory, NurseDirectory nurseDirectory,
            PharmacistDirectory pharmacistDirectory) { 
        
//        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.enterpriseDirectory = enterpriseDirectory;
        this.labTechnicianDirectory = labTechnicianDirectory;
        this.doctorList = doctorList;
        this.nurseDirectory = nurseDirectory;
        this.labSupervisorDirectory = labSupervisorDirectory;
        this.managerDirectory = managerDirectory;
        this.supplyManagerDirectory = supplyManagerDirectory;
        this.factoryWorkerDirectory = factoryWorkerDirectory;
        this.pharmacistDirectory = pharmacistDirectory;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    
    public SupplyManagerDirectory getSupplyManagerDirectory(){
        if(supplyManagerDirectory == null){
            supplyManagerDirectory = new SupplyManagerDirectory();
        }
        return supplyManagerDirectory;
    }
    
    public PharmacistDirectory getPharmacistDirectory(){
        if(pharmacistDirectory == null){
            pharmacistDirectory = new PharmacistDirectory();
        }
        return pharmacistDirectory;
    }
    
    public ManagerDirectory getManagerDirectory(){
        if(managerDirectory == null){
            managerDirectory = new ManagerDirectory();
        }
        return managerDirectory;
    }
    
    public LabSupervisorDirectory getLabSupervisorDirectory() {
        if(labSupervisorDirectory == null){
            labSupervisorDirectory = new LabSupervisorDirectory();
        }
        return labSupervisorDirectory;
    }
    
    public FactoryWorkerDirectory getFactoryWorkerDirectory() {
        if(factoryWorkerDirectory == null){
            factoryWorkerDirectory= new FactoryWorkerDirectory();
        }
        return factoryWorkerDirectory;
    }
    
    public DoctorDirectory getDoctorDirectory(){
        if(doctorList == null){
            doctorList = new DoctorDirectory();
        }
        return doctorList;
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

    public NurseDirectory getNurseDirectory() {
        if (nurseDirectory == null) {
            nurseDirectory = new NurseDirectory();
        }
        return nurseDirectory;
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
