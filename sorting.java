import java.util.ArrayList;
import java.util.List;


public class sorting {

    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 1};
        BubbleUp(arr);
    }

    public static List<Integer> BubbleUp(int[] array){
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }

        for (int i = 0; i < result.size() - 1; i++) {
            if (result.toArray()[i] == result.toArray()[i+1]){
                result.remove(i);
            }
        }
        
        for(int x: result){
            System.out.println(x);
        }
        
        return result; 
    }
}