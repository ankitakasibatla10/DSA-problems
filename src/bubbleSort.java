
import java.util.*;
public class bubbleSort {
    public static void bubble_sort(int[] arr, int n){
        if(n==1) return;

        for(int j=0; j<=n-2; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        bubble_sort(arr, n-1);

    }

    public static void bubble(int ar1[], int n){
        if(n==1) return;

        int didSwap = 0;
        for(int j=0; j<=n-1; j++){
            if(ar1[j] > ar1[j+1]){
                int temp = ar1[j];
                ar1[j] = ar1[j+1];
                ar1[j+1] = temp;
                didSwap = 1;
            }
        }
        if(didSwap==0) return;
        bubble(ar1, n-1);
    }

    public static void main(String[] args){
    //    int arr[] = {13, 46, 24, 52, 20, 9};
    //    int n = arr.length;

        int ar1[] = {13, 46, 24, 52, 20, 9};
        int n = ar1.length;
        System.out.println("Before:");
        for(int i=0; i<n; i++) System.out.println(ar1[i] + " ");
        System.out.println();

       // bubble_sort(arr, n);
       bubble(ar1, n);

        System.out.println("after:");
        for(int i=0; i<n; i++){
            System.out.println(ar1[i] + " ");
        }
        System.out.println();
    }
}
