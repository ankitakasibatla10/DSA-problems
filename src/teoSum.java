
import java.util.*;
public class teoSum {
    public static void main(String[] args){
        int[] arr = {17, 3, 7, 9, 14, 2};
        int target = 17;
        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int no = target - arr[i];
            if(map.containsKey(no)){
                ans[0] = map.get(no);
                ans[1] = i;
                break;
            }
            map.put(arr[i], i);
        }
        System.out.println(ans[0] + " " + ans[1]);
    }


}
