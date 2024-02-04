import java.util.ArrayList;
import java.util.Arrays;

public class Sort0s1s {
//    public static void sortArray(ArrayList<Integer> arr, int n){
//        int c1=0, c2=0, c3=0;
//        for(int i=0; i<n; i++){
//            if(arr.get(i) == 0) c1++;
//            else if (arr.get(i) == 1) {
//                c2++;
//            } else c3++;
//        }
//        for(int i=0; i<c1; i++) arr.set(i, 0);
//        for(int j=c1; j<c2; j++) arr.set(j, 1);
//        for(int i=c1+c2; i<n; i++) arr.set(i, 2);
//    }

    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(arr.get(mid) == 0){
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else{
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
    }
    public static void main(String[] args) {
        int n=6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        for(int i=0; i<n; i++){
            System.out.println(arr.get(i) + " ");
        }
        System.out.println();
    }
}
