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

public class Room {
    
    private ArrayList<Person> personList;

    public Room() {        
        personList = new ArrayList<>();
    }
    
    public void add(Person person){
        personList.add(person);
    }
    
    public boolean isEmpty(){
        return personList.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return personList;
    }
    
    public Person shortest(){
        if (personList.isEmpty()){
            return null;
        }
        
        Person shortest = personList.get(0);
        
        for (Person i : personList){
            if (shortest.getHeight() > i.getHeight()){
                shortest = i;
            }
        }
        
        return shortest;
            
    }
    
    public Person take(){
        Person take = this.shortest();
        
        
        personList.remove(this.shortest());
        
        return take;
    }
}
