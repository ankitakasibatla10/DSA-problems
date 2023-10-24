
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
 //       Scanner sc = new Scanner(System.in);
        //     ArrayList<Integer> a = new ArrayList<Integer>(10);

//            a.add(75);
//            a.add(7);
//            a.add(5);
//            a.add(1275);
//
//            System.out.println(a.contains(34));
//
//            a.remove(2);
//            System.out.println(a);
//        for(int i=0; i<7; i++){
//            a.add(sc.nextInt());
//        }
//        for(int i=0; i<5; i++) {
//            System.out.println(a.get(i));
//        }
//        System.out.println(a);
//
//        ArrayList<ArrayList<Integer>> a1 = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            a1.add( new ArrayList<>());
//        }
//
//
//        for(int i = 0; i < 3; i++){
//            for(int j=0; j<3; j++){
//                a1.get(i).add(sc.nextInt());
//            }
//        }
//        System.out.println(a1);

        int[] arr = {1, 3, 5, 7};
        reverse(arr);
        System.out.println(arr);
//       System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
//    static int max(int[] arr) {
//        int maxval = arr[0];
//        for (int i = 1; i<arr.length; i++){
//            if(arr[i] > maxval){
//                maxval = arr[i];
//            }
//        }
//        return maxval;
         static void reverse(int[] arr) {
             int start = 0;
             int end = arr.length - 1;
             while (start < end) {
                 swap(arr, start, end);
                 start++;
                 end--;
             }
         }
}

