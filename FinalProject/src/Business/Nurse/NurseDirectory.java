/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Nurse;

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
    
    public Nurse createNurse(){
        Nurse nurse = new Nurse();
        
        nurseList.add(nurse);
        return nurse;
    }
    
    
}
