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

public class Suitcase { 
    
    private ArrayList<Item> suitcaseList;
    private int maxWeight;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcaseList = new ArrayList<Item>();
        this.currentWeight = 0;
    }
    
    public void addItem(Item item){
        if (currentWeight+item.getWeight()<=maxWeight){
            suitcaseList.add(item);
            currentWeight += item.getWeight();
        }        
    }

    public int getCurrentWeight() {
        return currentWeight;
    }
    
    
    
    public void printItems(){        
        for (Item i : suitcaseList){
            System.out.println(i.getName()+"("+i.getWeight()+" kg)");
        }
    }
    
    public int totalWeight(){
        return currentWeight;
    }
    
    public Item heaviestItem(){
        if (this.suitcaseList.isEmpty()){
            return null;
        }
        
        Item heaviest = suitcaseList.get(0);
        
        for (Item i : suitcaseList){
            if (heaviest.getWeight() < i.getWeight()){
                heaviest = i;
            }
        }
        
        return heaviest;
    }
    
    public String toString(){
        if (suitcaseList.size() == 0){
            return  "no items ("+currentWeight+" kg)";    
        }else if (suitcaseList.size() == 1){
            return  suitcaseList.size()+" item ("+currentWeight+" kg)";
        }
        
        return  suitcaseList.size()+" items ("+currentWeight+" kg)";
    }
    
}
