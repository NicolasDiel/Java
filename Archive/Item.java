/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico3
 */
public class Item {
    
    String identifier;
    String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Item)) {
            return false;
        }

        // convert the object to a Bird object
        Item comparedBird = (Item) compared;

        // if the values of the object variables are equal, the objects are, too
        if (this.identifier.equals(comparedBird.identifier) ) {
            return true;
        }
        
        return false;
    }
    
    
}
