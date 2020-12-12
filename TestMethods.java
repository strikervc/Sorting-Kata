import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * TestingMethods
 */
public class TestMethods {

    @Test
    public void testBubbleUp(){ 
        int[] array = {8, 6, 7, 5, 4, 1};
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        assertEquals(list, Sorting.BubbleUp(array));
    }

    @Test
    public void testEliminateDuplicates(){ 
        int[] array = {8, 6, 7, 4, 5, 5, 4, 1};
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        assertEquals(list, Sorting.EliminateDuplicates(Sorting.BubbleUp(array)));
    }

    
    @Test
    public void testEliminateDuplicates2(){ 
        int[] array = {8, 6, 7, 4, 5, 5, 4, 2};
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        assertEquals(list, Sorting.EliminateDuplicates(Sorting.BubbleUp(array)));
    }
}