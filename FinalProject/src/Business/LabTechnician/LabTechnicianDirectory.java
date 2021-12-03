/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTechnician;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author anushka
 */
public class LabTechnicianDirectory {
    private ArrayList<LabTechnician> labTechnicianList;
    
    public LabTechnicianDirectory(){
        labTechnicianList = new ArrayList<>();
    }

    public ArrayList<LabTechnician> getLabTechnicianList() {
        return labTechnicianList;
    }

    public void setLabTechnicianList(ArrayList<LabTechnician> labTechnicianList) {
        this.labTechnicianList = labTechnicianList;
    }
    
    public LabTechnician addLabTechnician(String name, UserAccount ua){
        LabTechnician lt = new LabTechnician();
        lt.setLtName(name);
        lt.setUserAccount(ua);
        labTechnicianList.add(lt);
        return lt;
    }
    
    public void deleteLabTechnician(LabTechnician lt){
        labTechnicianList.remove(lt);
    }
}
