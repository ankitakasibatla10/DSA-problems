import java.util.*;

public class FirstRepEle {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 3, 5, 6};
        int n = 7;
        //System.out.println(firstRep(arr, n));
        System.out.println(firstNonRep(arr, n));

    }

    public static int firstRep(int[] arr, int n){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int mini = Integer.MAX_VALUE;
        for(int i= 0; i<n; i++){
            if(hm.containsKey(arr[i])){
                mini = Math.min(mini, hm.get(arr[i]));
            } else{
                hm.put(arr[i], i+1);
            }
        }
        return (mini == Integer.MAX_VALUE) ? -1 : mini;

    }

    public static int firstNonRep(int[] arr, int n){
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i:arr){
            if(hs.contains(i)){
                return arr[i];
            } else{
                hs.add(i);
            }
        }
        return 0;
    }
}
