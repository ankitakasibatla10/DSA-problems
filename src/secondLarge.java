import java.util.*;
import java.io.*;
public class secondLarge {

    public static void getLargest2(int[] arr, int n){
        if(n==0||n==1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
//        BRUTE-FORCE SOLUTION:
//        Arrays.sort(arr);
//        int small = arr[1];
//        int large = arr[n-2];
//        System.out.println("2nd smallest:" + small);
//        System.out.println("2nd largest:" + large);
//        OPTIMAL
        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;
        int i;
        for(i=0; i<n; i++){
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for (i=0; i<n; i++){
            if(arr[i] < sec_small && arr[i] != small){
                sec_small = arr[i];
            }
            if(arr[i] > sec_large && arr[i] != large){
                sec_large = arr[i];
            }
        }
        System.out.println("2nd smallest:" + sec_small);
        System.out.println("2nd largest:" + sec_large);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        getLargest2(arr, n);
    }
}
