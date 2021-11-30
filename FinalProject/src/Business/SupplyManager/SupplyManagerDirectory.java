/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplyManager;

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
    
    public SupplyManager createSupplyManager(){
        SupplyManager supplymanager = new SupplyManager();
        
        supplyManagerList.add(supplymanager);
        return supplymanager;
    }
    
}
