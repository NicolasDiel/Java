import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> stringers = new ArrayList<>(); 
        
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);

        stringers.add("Hola");
        stringers.add("Manolo");
        stringers.add("Lama");
                
        
        int[] array = {3, 1, 5, 99, 3, 12};
        
        String[] arrayStrings = {"La", "Va", "Sa", "Er", "Te"};
        
        sortIntegers(numbers);
        System.out.println(numbers);
        
        sortStrings(stringers);
        System.out.println(stringers);
        
        sort(array);
        System.out.println(Arrays.toString(array));
        
        sort(arrayStrings);
        System.out.println(Arrays.toString(arrayStrings));
        
        
        
        
    }
    
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}
