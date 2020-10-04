
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> ingredients = new ArrayList<>();
        String name = "";
        int time = 0;
        
        
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("");

        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            int countLine = 0;            
            
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                
                if (row.isEmpty()) {
                    countLine = 0; 
                    recipes.add(new Recipe(name, time, ingredients));
                    ingredients.clear();
                    continue;
                }
                
                countLine++;
                
                if (countLine == 1){
                    name = row; 
                }else if (countLine == 2){
                    time = Integer.valueOf(row); 
                }else{
                    ingredients.add(row);
                }
                
            }
            recipes.add(new Recipe(name, time, ingredients));
        }
        catch (Exception e) {
            System.out.println("An error occured..");
        }
        
        
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
                
        
        while (true){
            System.out.println("");
            System.out.print("Enter command: ");
            String searchedFor = scanner.nextLine();
            
            
            if (searchedFor.equals("stop")){
                break;
            }

            if (searchedFor.equals("list")){
                System.out.println("Recipes:");
                for (Recipe r : recipes){
                    System.out.println(r);
                }
            }
            
            if (searchedFor.equals("find name")){
                System.out.print("Searched word: ");
                String nameSearched = scanner.nextLine();                
                System.out.println("");
                
                System.out.println("Recipes:");
                for (Recipe r : recipes){
                    if (r.getName().contains(nameSearched)){
                        System.out.println(r);
                    }
                    
                }
               
            }
            
            if (searchedFor.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                String maxTime = scanner.nextLine();                
                System.out.println(""); 
                
                System.out.println("Recipes:");
                for (Recipe r : recipes){
                    if (r.getTime() <= Integer.valueOf(maxTime)){
                        System.out.println(r);
                    }
                    
                }               
            }
            
            if (searchedFor.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();                
                System.out.println(""); 
                
                System.out.println("Recipes:");
                for (Recipe r : recipes){
                    
                    for (String ing : r.getIngredients()){
                        if (ing.equals(ingredient)){
                            System.out.println(r);
                            break;
                        }
                    }
                    
                }               
            }
            
           
        }
    }
            
          
}

