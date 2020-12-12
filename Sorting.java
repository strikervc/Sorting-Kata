import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        
    }

    public static List<Integer> BubbleUp(int[] array){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        return list;
    }

    public static List<Integer> EliminateDuplicates(List<Integer> list){
        List<Integer> result = list;
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.toArray()[i] == list.toArray()[i + 1]){
                result.remove(i);
            }
        }

        return result;
    }



}
