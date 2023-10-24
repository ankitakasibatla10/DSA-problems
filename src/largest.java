import java.util.*;
public class largest {
    public static void main(String[] args){
        int[] arr = {2, 5, 1, 3, 0};
        System.out.println("Largest number:" + largest_ele(arr));

    }

    public static int largest_ele(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
