import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * TestingMethods
 */
public class TestingMethods {

    @Test
    public void testBubbleUp(){
        int[] array = new int[] {33, 4, 4, 1};
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(33);
        assertEquals(list, Sorting.BubbleUp(array));
    }
}