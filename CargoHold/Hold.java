/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico3
 */

import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> holdList;
    private int currentWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holdList = new ArrayList<Suitcase>();
        this.currentWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (currentWeight+suitcase.getCurrentWeight() <= maxWeight){
            holdList.add(suitcase);
            currentWeight += suitcase.getCurrentWeight();            
        }
        
    }
    
     public void printItems(){
         for (Suitcase suitcase : holdList){
             suitcase.printItems();
         }
     }
    
    public String toString(){
        return  holdList.size() +" suitcases ("+currentWeight+" kg)";
    }
}
