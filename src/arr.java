import java.util.Arrays;
import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 54;
//        arr[2] = 7;
//        System.out.println(arr[2]);

//        //input using loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
////        for (int j : arr) {
////            System.out.println(j);
////        }
//        System.out.println(Arrays.toString(arr));
         String[] str = new String[4];
         for(int i=0 ; i<str.length; i++){
            str[i] = sc.next();
         }
        System.out.println(Arrays.toString(str));

         str[1] = "ankita";
        System.out.println(Arrays.toString(str));
    }
}