import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class solution{
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        int n = arr.size();
        System.out.println("before:");
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr = quick.quick_sort(arr);
        System.out.println("after:");
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
