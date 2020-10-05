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
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokeManager;

    public JokeManager() {
        this.jokeManager = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokeManager.add(joke);
    }
    
    public String drawJoke(){
        
        if (this.jokeManager.isEmpty()){
            return "Jokes are in short supply.";
        }
        
        Random draw = new Random();
        int index = draw.nextInt(jokeManager.size());
        
        return jokeManager.get(index);
    }
    
    public void printJokes(){       
        
        System.out.println("Printing the jokes.");
        
        for (String joke : jokeManager){
            System.out.println(joke);
        }
        
    }
    
}
