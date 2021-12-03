/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabSupervisor;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author anushka
 */
public class LabSupervisorDirectory {
    private ArrayList<LabSupervisor> labSupervisorList;
    
    public LabSupervisorDirectory(){
        labSupervisorList = new ArrayList<>();
    }
    
    public ArrayList<LabSupervisor> getLabSupervisorList() {
        return labSupervisorList;
    }

    public void setLabSupervisorList(ArrayList<LabSupervisor> labSupervisorList) {
        this.labSupervisorList = labSupervisorList;
    }
    
    public LabSupervisor addLabSupervisor(String name, UserAccount ua){
        LabSupervisor ls = new LabSupervisor();
        ls.setLsName(name);
        ls.setUserAccount(ua);
        labSupervisorList.add(ls);
        return ls;
    }
    
    public void deleteLabSupervisor(LabSupervisor ls){
        labSupervisorList.remove(ls);
    }
}
