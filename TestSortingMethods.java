import jdk.jfr.Timestamp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


public class TestSortingMethods {
    

    @Test
    public void testBubbleUp(){ 
        int[] array = new int[] {3, 5, 5, 7, 2, 1};
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        assertEquals(list, sorting.BubbleUp(array));
    }

    
    @Test
    public void testBubbleUpAnotherArray(){ 
        int[] array = new int[] {5, 7, 1, 1};
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(7);
        assertEquals(list, sorting.BubbleUp(array));
    }
}
