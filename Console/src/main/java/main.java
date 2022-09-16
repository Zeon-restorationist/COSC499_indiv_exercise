import java.util.ArrayList;

public class main {






    //Bubble sort function, requires one Arraylist of Int type and returns a sorted arraylist.
    public static ArrayList <Integer> bubSort(ArrayList in){
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
        return temp;
    }

}
