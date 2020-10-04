/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico3
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String LatinName) {
        this.name = name;
        this.latinName = LatinName;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return this.name+" ("+this.latinName+"): "+this.observations+" observations";
    }
    
    
    
    
    
}
