/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManList;
    
    public DeliveryManDirectory(){
        deliveryManList = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    public DeliveryMan createDeliveryMan(String name, UserAccount ua, int suppmgrId){
        DeliveryMan dm = new DeliveryMan();
        dm.setDeliveryManName(name);
        dm.setUserAccount(ua);
        dm.setSupplyManagerId(suppmgrId);
        deliveryManList.add(dm);
        return dm;
    }
    
    public void deleteDeliveryMan(DeliveryMan dm){
        deliveryManList.remove(dm);
    }
}
