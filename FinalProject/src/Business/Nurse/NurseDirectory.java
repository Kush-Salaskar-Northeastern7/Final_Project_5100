/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Nurse;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author anushka
 */
public class NurseDirectory {
    
    private ArrayList<Nurse> nurseList;
    
    public NurseDirectory(){
        nurseList = new ArrayList();
    }

    public ArrayList<Nurse> getNurseList() {
        return nurseList;
    }

    public void setNurseList(ArrayList<Nurse> nurseList) {
        this.nurseList = nurseList;
    }
    
    public Nurse createNurse(String name, UserAccount ua){
        Nurse nurse = new Nurse();
        nurse.setNurseName(name);
        nurse.setUserAccount(ua);
        nurseList.add(nurse);
        return nurse;
    }
    
    public void deleteNurse(Nurse n){
        nurseList.remove(n);
    }
}
