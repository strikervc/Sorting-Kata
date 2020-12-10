import java.util.List;

public class sorting {

    public static void main(String[] args) {
        int[] array = new int[] {5, 5, 7, 3, 2, 1};
        BubbleUp(array);
    }

    public static int[] BubbleUp(int[] array){

        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }

        return array; 
    }
}