import java.util.*;
public class RotateD {

//    public static void rotate_left(int[] arr, int n, int k){
//        if (n==0)
//            return;
//
//        k = k % n;
//        if(k>n)
//            return;
//
//        int[] temp = new int[k]; //creating temp of size steps
//        for(int i=0; i<k; i++){  //copying first d element to temp
//            temp[i] = arr[i];
//        }
//        for(int i = k; i<n; i++){ //moving the rest of the elements to i-d index
//            arr[i-k] = arr[i];
//        }
//        for(int i=0; i<k; i++){   //copying temp to original arr
//            arr[i+n-k] = temp[i];
//        }
//    }

    public static void rotate_right(int[] arr, int n, int k){
        k = k%n;
        for(int i=0; i<n; i++){
            if(i<k){
                System.out.println(arr[i+n-k]+ " ");
            }
            else{
                System.out.println(arr[i-k] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
//        rotate_left(arr, n, k);
//        System.out.println("after rotating to left") ;
//        for(int i=0; i<n; i++){
//            System.out.print(arr[i] + " ");
//        }
        rotate_right(arr, n, k);
        System.out.println("after rotating to right");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
