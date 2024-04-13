import java.util.*;
public class majEle2 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
       // majorityElement(arr);
        List<Integer> ans = majElement(arr);
        for(int i : ans){
            System.out.print(i);
        }

    }

    public static List<Integer>  majElement(int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        List<Integer> l = new ArrayList<>();

        for(int i : nums){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i) + 1);
            }else{
                hm.put(i, 1);
            }

        }

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue() > (nums.length / 3 )){
                l.add(entry.getKey());
            }
        }
        return l;


    }
}
