import java.util.*;
public class UniqueEleSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,2};
        int n = 4;
        sumOfUnique(nums);
        System.out.println(sumUnique2(nums));
    }



    public static void sumOfUnique(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        int sum = 0;
        for(int j : nums){
            hs.add(j);
        }

        for(int i : hs){
            sum = sum + i;
            System.out.print(i + " ");

        }
        System.out.println(sum + " sum");


    }

    public static int sumUnique2(int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for(int i : nums){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i) + 1);
            } else{
                hm.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> h : hm.entrySet()){
//            System.out.println(h.getKey() + " and value is " + h.getValue());
            if(h.getValue() == 1){
                sum = sum + h.getKey();
            }
        }
        return sum;


    }

}
