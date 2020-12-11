import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Sorting {
    
    public static void main(String[] args) {
        
    }
    public static String strValidation(String[] arr){
    
        String message = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != ""){
                message = "Esto es un string";

            }
        }

        return message;
    }

    public static List<Integer> BubbleUp(int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j +1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }

        for(int x: result){
            System.out.println(x);
        }
        
        return result;

    }
}
