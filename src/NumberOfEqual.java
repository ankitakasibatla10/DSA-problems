import java.util.HashMap;
import java.util.*;

public class NumberOfEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[k];
        for(int j=0; j<k; j++){
            arr2[j] = sc.nextInt();
        }
        equalPairs(arr, arr2, n, k);
    }

    public static void equalPairs(int[] arr, int[] arr2, int n, int k){
        int i = 0;
        int j = 0;
        int c = 0;
        while(i<n && j<k){
            if(arr[i] < arr2[j]){
                i++;
            } else if(arr[i] > arr2[j]){
                j++;
            }
            else{
                int countA = 0;
                int currentA = arr[i];
                while(i<n && arr[i] == currentA){
                    countA++;
                    i++;
                }
                int countB = 0;
                int currentB = arr2[j];
                while(j < k && arr2[j] == currentB){
                    countB++;
                    j++;
                }
                c = c + countA*countB;
            }
        }
        System.out.println(c);
    }

}
//    public static void equalPairs(int[] arr, int[] arr2, int n, int k){
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for(int i=0; i<n; i++){
//            if(hm.containsKey(arr[i])){
//                hm.put(arr[i], hm.get(arr[i]) + 1);
//            }else{
//                hm.put(arr[i], 1);
//            }
//        }
//        int c = 0;
//        for(int j : arr2){
//            if(hm.containsKey(j)){
//                c = c + hm.get(j);
//            }
//        }
//        System.out.println(c);
//    }