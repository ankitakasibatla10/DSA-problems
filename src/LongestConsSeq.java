import java.util.Arrays;
import java.util.HashSet;

public class LongestConsSeq {
    public static void main(String[] args) {
        int[] arr = {2,6,1,9,4,5,3};
        //System.out.println(longest(arr));
        System.out.println(longest2(arr));
    }
    public static int longest(int[] arr){
        int longest = 1;
        int count = 1;
        int last = Integer.MIN_VALUE;
        if(arr.length == 0){
            return 0;
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] - 1 == last){
                count = count + 1;
                last = arr[i];
            }
            else if(arr[i] != last){
                count = 1;
                last = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static int longest2(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        int longest = 1;
        for(int j : arr){
            hs.add(j);
        }
        for(int i : hs){
            if(!hs.contains(i-1)) {
                int count = 1;
                int x = i;

                while (hs.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;

    }
}
