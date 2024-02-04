import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ALOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a  = new ArrayList<>();
        //add - adding at the end
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        //adding at an index
        a.add(2, 40);
        System.out.println(a);
        //get
        System.out.println(a.get(1));
        //set
        a.set(2, 44);
        System.out.println(a);

        //remove
        a.remove(3);
        System.out.println(a);
        //size
        System.out.println(a.size());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        removeEven(list);
        System.out.println(list);
        list.add(0, 11);
        System.out.println(list);


    }
    public static void removeEven(ArrayList<Integer> list){
        for(int i = list.size()-1; i>=0; i--){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
    }
}
