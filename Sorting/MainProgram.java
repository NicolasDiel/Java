import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        
    }
    
    public static int smallest(int[] array){
        // write your code here
        int minor = array[0];
        for (int i : array){
            if (minor > i){
                minor = i;
            }
        }
        return minor;
    }
    
    public static int indexOfSmallest(int[] array){
        // write your code here
        int minorIndex = indexOfSmallestFrom(array,0);  
        return minorIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int minorIndex = startIndex;
        for (int i = startIndex; i < table.length; i++){
            if (table[minorIndex] > table[i]){
                minorIndex = i;
            }
        }
        return minorIndex;
        
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }
    
    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            int minor = indexOfSmallestFrom(array,i);        
            swap(array,i,minor);            
        }        
        

    }

}
