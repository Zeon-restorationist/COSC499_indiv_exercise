import java.util.ArrayList;

public class main {
<<<<<<< Updated upstream
    public static void main(String[] args) {
        //Instantiating input arraylist
        ArrayList<Integer> a = new ArrayList<Integer>();
        //Initializing input arraylist
        for (int i = 0; i < 5; i++) {
            a.add((int) (Math.random()*10));
        }
        //prints unsorted arraylist
        System.out.println("Input array: ");
        System.out.println(a);
        //prints bubble sorted arraylist
        System.out.println("Bubble sorted: ");
        //Calls bubSort() with "a" as input
        System.out.println(bubSort(a));
        //prints insertion sorted arraylist
        System.out.println("Insertion sorted: ");
        //Calls insertSort() with "a" as input
        System.out.println(insertSort(a));
    }
=======
>>>>>>> Stashed changes




<<<<<<< Updated upstream
    //Bubble sort function, requires one Arraylist of Int type and returns a sorted arraylist.
    public static ArrayList<Integer> bubSort(ArrayList in){
=======

    //Bubble sort function, requires one Arraylist of Int type and returns a sorted arraylist.
    public static ArrayList <Integer> bubSort(ArrayList in){
>>>>>>> Stashed changes
        ArrayList<Integer> temp = in;
        int hold;
        int count = 0;
        boolean sorted = false;
        while(sorted!= true){
            for (int i = 0; i < temp.size()-1; i++) {
                if(temp.get(i) > temp.get(i+1)){
                    hold = temp.get(i+1);
                    temp.set(i+1, temp.get(i));
                    temp.set(i, hold);
                    count ++;
                }
            }
            if(count == 0){
                break;
            }
            count = 0;
        }
        return temp;
    }
    //Insert sort function, requires one Arraylist of Int type and returns a sorted arraylist.
<<<<<<< Updated upstream
    public static ArrayList<Integer> insertSort(ArrayList in){x
        ArrayList<Integer> temp = new ArrayList<Integer>();
=======
    /*
    public static ArrayList<Integer> insertSort(ArrayList in){

        ArrayList<Integer> temp = in;

        int i, key, j;
        for (i = 1; i < temp.size(); i++)
        {
            key = temp.get(i);
            j = i - 1;

            // Move elements of arr[0..i-1],
            // that are greater than key, to one
            // position ahead of their
            // current position
            while (j >= 0 && temp.get(j) > key)
            {
                temp.set(j+1, temp.get(j));
                j -= 1;
            }
            temp.set(j+1, key);
        }
>>>>>>> Stashed changes
        return temp;
    }
    */
}
