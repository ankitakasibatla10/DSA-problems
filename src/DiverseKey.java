import java.util.HashMap;
import java.util.Map;

public class DiverseKey {
    public static void main(String[] args) {
        int[] arr = {15, 13, 15, 15, 12};
        int k = 3;
//        int[] ans = diversekey(arr, k);
//        for(int i=0; i<n; i++){
//            System.out.println(ans[i]);
//        }
        diversekey(arr, k);
    }
    public static void diversekey(int[] arr, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            hm.put(arr[i], i);
        }

        for(Map.Entry<Integer, Integer> m1 : hm.entrySet()){
            count++;
            System.out.println(m1.getValue() + 1 + " ");
            if(count == k){
                break;
            }
        }
    }
}
