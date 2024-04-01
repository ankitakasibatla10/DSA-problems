import java.util.HashMap;

public class TooSum {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int k = 9;
        int[] ans = twoSum(arr, k);
        for(int a : ans){
            System.out.println(a);
        }

    }
    public static int[] twoSum(int[] arr, int k){
        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int no = k - arr[i];
            if(map.containsKey(no)){
                ans[0] = map.get(no);
                ans[1] = i;
            }
            map.put(arr[i], i);
        }
        return ans;
    }
}
