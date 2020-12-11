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


    @Test
    public void testEliminateDuplicates(){
        int[] array = new int[] {33, 4, 4, 1};
        int[] anotherArray = new int[] {33, 4, 4, 1, 3, 7, 9, 10};
        List<Integer> output= new ArrayList<Integer>();
        output.add(1);
        output.add(4);
        output.add(33);
        List<Integer> anotherOutput= new ArrayList<Integer>();
        anotherOutput.add(1);
        anotherOutput.add(3);
        anotherOutput.add(4);
        anotherOutput.add(7);
        anotherOutput.add(9);
        anotherOutput.add(10);
        anotherOutput.add(33);
        assertEquals(output, Sorting.EliminateDuplicates(Sorting.BubbleUp(array)));
        assertEquals(anotherOutput, Sorting.EliminateDuplicates(Sorting.BubbleUp(anotherArray)));
    }
}