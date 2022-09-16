import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class test {

    @Test
    public void testbubble(){
        //Initialize input arraylist
        ArrayList<Integer> a = new ArrayList<Integer>(){{
            add(3);
            add(4);
            add(1);
            add(5);
            add(2);
        }};

        //prints unsorted arraylist
        System.out.println("Input array: ");
        System.out.println(a);
        //prints bubble sorted arraylist
        System.out.println("Bubble sorted: ");
        //Calls bubSort() with "a" as input
        System.out.println(main.bubSort(a));

    }

    @Test
    public void testSelection(){
        //Initialize input arraylist
        ArrayList<Integer> a = new ArrayList<Integer>(){{
            add(3);
            add(4);
            add(1);
            add(5);
            add(2);
        }};
        //prints unsorted arraylist
        System.out.println("Input array: ");
        System.out.println(a);
        //prints insertion sorted arraylist
        System.out.println("Insertion sorted: ");
        //Calls insertSort() with "a" as input
        System.out.println(main.insertSort(a));
    }
}
