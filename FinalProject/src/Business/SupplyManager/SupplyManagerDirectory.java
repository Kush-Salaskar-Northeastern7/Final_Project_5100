/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplyManager;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author anushka
 */
public class SupplyManagerDirectory {
    private ArrayList<SupplyManager> supplyManagerList;
    
    public SupplyManagerDirectory(){
        supplyManagerList = new ArrayList();
    }

    public ArrayList<SupplyManager> getSupplyManagerList() {
        return supplyManagerList;
    }

    public void setSupplyManagerList(ArrayList<SupplyManager> supplyManagerList) {
        this.supplyManagerList = supplyManagerList;
    }
    
    public SupplyManager createSupplyManager(String name, UserAccount ua){
        SupplyManager supplymanager = new SupplyManager();
        supplymanager.setSmName(name);
        supplymanager.setUserAccount(ua);
        supplyManagerList.add(supplymanager);
        return supplymanager;
    }
    
    public void deleteSupplyManager(SupplyManager sm){
        supplyManagerList.remove(sm);
    }
}
