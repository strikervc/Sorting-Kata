import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
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
        list.add(4);
        list.add(33);
        assertEquals(list, Sorting.BubbleUp(array));
    }

    @Test
    public void testStrValidation(){
        String[] array = {"Uno", "Dos"};
        assertEquals("Esto es un string", Sorting.strValidation(array));
    }
}