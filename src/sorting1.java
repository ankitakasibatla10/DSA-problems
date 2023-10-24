import java.util.*;
import java.io.*;

public class sorting1 {

        public static void main(String args[]){
            int arr[] = {13, 46, 24, 52, 20, 9};
            int ar1[] =  {13, 46, 24, 52, 20, 9, 58};
            int n = arr.length;
            System.out.println("before sorting");
            for(int i=0; i<n; i++){
                System.out.println(arr[i] + " ");
            }
//            System.out.println();
//            selection_sort(arr, n);
//            bubble_sort(ar1, n);
            insertion_sort(arr, n);
        }

        public static void selection_sort(int arr[], int n){
            for(int i=0; i<n-1; i++){
                int mini = i;
                for(int j = i+1; j<n; j++){
                    if(arr[j] < arr[mini]){
                        mini = j;
                    }
                }
                int temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;

            }
            System.out.println("after selection sort:");
            for(int i=0; i<n; i++){
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }

        static void bubble_sort(int[] ar1, int n){
            for(int i = n-1; i>=0; i--){
                for(int j=0; j<=i; j++){
                    if(ar1[j] > ar1[j+1]){
                        int temp = ar1[j];
                        ar1[j] = ar1[j+1];
                        ar1[j+1] = temp;
                    }
                }
            }
            System.out.println("After bubble sort:");
            for(int i=0; i<n; i++){
                System.out.println(ar1[i] + " ");
            }
            System.out.println();
        }

        static void insertion_sort(int[] arr, int n){
            for(int i=0; i<=n-1; i++){
                int j=i;
                while(j > 0 && arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
            }
            System.out.println("After insertion sort:");
            for(int i=0; i<n; i++){
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }


}
