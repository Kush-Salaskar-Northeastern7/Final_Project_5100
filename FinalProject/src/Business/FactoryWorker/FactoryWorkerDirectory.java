/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FactoryWorker;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author anushka
 */
public class FactoryWorkerDirectory {
    private ArrayList<FactoryWorker> factoryWorkerList;
    
    public FactoryWorkerDirectory(){
        factoryWorkerList = new ArrayList();
    }

    public ArrayList<FactoryWorker> getFactoryWorkerList() {
        return factoryWorkerList;
    }
    
    public FactoryWorker createFactoryWorker(String fwName, UserAccount ua){
        FactoryWorker factoryworker = new FactoryWorker();
        factoryworker.setFwName(fwName);
        factoryworker.setUserAccount(ua);
        factoryWorkerList.add(factoryworker);
        return factoryworker;
    }

    public void setFactoryWorkerList(ArrayList<FactoryWorker> factoryWorkerList) {
        this.factoryWorkerList = factoryWorkerList;
    }
    
    public void deleteFactoryWorker(FactoryWorker fw){
        factoryWorkerList.remove(fw);
    }
    
    
}
