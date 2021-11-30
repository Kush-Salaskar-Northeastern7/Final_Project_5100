/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FactoryWorker;

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
    
    public FactoryWorker createFactoryWorker(){
        FactoryWorker factoryworker = new FactoryWorker();
        
        factoryWorkerList.add(factoryworker);
        return factoryworker;
    }
    
    
}
