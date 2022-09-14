import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            a.add((int) (Math.random()*10));
        }
        System.out.println("Input array: ");
        System.out.println(a);
        System.out.println("Bubble sorted: ");
        System.out.println(bubSort(a));
        System.out.println("Insertion sorted: ");
        System.out.println(insertSort(a));
    }





    public static ArrayList<Integer> bubSort(ArrayList in){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        return temp;
    }
    public static ArrayList<Integer> insertSort(ArrayList in){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        return temp;
    }
}
