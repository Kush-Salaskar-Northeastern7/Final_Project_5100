/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author anushka
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorList;
    
    public DoctorDirectory(){
        doctorList = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public Doctor addDoctor(String name, UserAccount ua, String phoneNum, String location){
        Doctor d = new Doctor();
        d.setDocName(name);
        d.setUserAccount(ua);
        d.setPhoneNum(phoneNum);
        d.setLocation(location);
        doctorList.add(d);
        return d;
    }
    
    public void deleteDoctor(Doctor d){
        doctorList.remove(d);
    }
}
