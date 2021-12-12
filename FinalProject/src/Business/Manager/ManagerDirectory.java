/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manager;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author kushsalaskar
 */
public class ManagerDirectory {
    private ArrayList<Manager> managerList;
    
    public ManagerDirectory(){
        managerList = new ArrayList<>();
    }

    public ArrayList<Manager> getManagerList() {
        return managerList;
    }

    public void setManagerList(ArrayList<Manager> managerList) {
        this.managerList = managerList;
    }
    
    public Manager addManager(String name, UserAccount ua, String phoneNum, String location){
        Manager m = new Manager();
        m.setManagerName(name);
        m.setUserAccount(ua);
        m.setLocation(location);
        m.setPhoneNum(phoneNum);
        managerList.add(m);
        return m;
    }
    
    public void deleteManager(Manager m){
        managerList.remove(m);
    }
}
