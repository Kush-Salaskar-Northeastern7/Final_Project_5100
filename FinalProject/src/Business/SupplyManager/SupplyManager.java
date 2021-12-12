/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplyManager;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anushka
 */
public class SupplyManager {
    private String smName;
    private UserAccount userAccount;
    private int type1 = 0;
    private int type2 = 0;
    private List<Integer> rating;
    private float stars;
    
    public SupplyManager(){
        userAccount = new UserAccount();
        rating = new ArrayList<>();
    }

    public float getStars() {
        if(rating.size() == 0){
            return -1;
        } else {
            int sum = 0;
            for(int num : rating){
                sum += num;
            }
            return sum/rating.size();
        }
    }
    
    

    public List<Integer> getRating() {
        return rating;
    }

    public void setRating(List<Integer> rating) {
        this.rating = rating;
    }
    
    public void addRating(int rate){
        rating.add(rate);
    }

    public int getType1() {
        return type1;
    }

    public void setType1(int type1) {
        this.type1 += type1;
    }

    public int getType2() {
        return type2;
    }

    public void setType2(int type2) {
        this.type2 += type2;
    }
    
    

    public String getSmName() {
        return smName;
    }

    public void setSmName(String smName) {
        this.smName = smName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return smName;
    }
}
