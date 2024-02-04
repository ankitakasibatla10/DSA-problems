import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

//    public static String twoSum(int[]a, int n, int target){
//        for(int i=0; i<n; i++){
//            for(int j=i+1; j<n; j++){
//                if(a[i] + a[j] == target) return "Yes";
//            }
//        }
//        return "No";
//    }

//    public static int[] twoSum2(int[] b, int m, int target2){
//        int[] ans2 = new int[2];
//        ans2[0] = ans2[1] = -1;
//        for(int i=0; i<m; i++){
//            for(int j=i+1; j<m; j++){
//                if(ans2[0] + ans2[1] == target2){
//                    ans2[0] = i;
//                    ans2[1] = j;
//                    return ans2;
//                }
//            }
//        }
//        return ans2;
//    }

    public static String twoSum(int[] a, int n, int target){
        Arrays.sort(a);
        int left = 0; int right = n-1;
        while(left < right){
            int sum = a[left] + a[right];
            if(sum == target){
                return "Yes";
            } else if (sum<target) left++;
            else right--;
        }
        return "No";
    }

    public static int[] twoSum2(int[] b1, int m1, int target21){
        int[] ans21 = new int[2];
        ans21[0] = ans21[1] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<m1; i++){
            int num = b1[i];
            int moreNeeded = target21 - num;
            if(map.containsKey(moreNeeded)){
                ans21[0] = map.get(moreNeeded);
                ans21[1] = i;
                return ans21;
            }
            map.put(b1[i], i);
        }
        return ans21;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] a = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(a, n, target);
        System.out.println("the answer for 2 pointer approach for 1 :" + ans);
        //System.out.println("the answer for 1 :" + ans);

//        int m = 5;
//        int[] b = {2, 5, 6, 8, 11};
//        int target2 = 14;
//        int[] ans2 = twoSum2(b, m, target2);
//        System.out.println("the answer for 2 : [" + ans2[0] + " , " + ans2[1] + " ]");


        int m1 = 5;
        int[] b1 = {2, 5, 6, 8, 11};
        int target21 = 14;
        int[] ans21 = twoSum2(b1, m1, target21);
        System.out.println("the answer for 2 using Hashing : [" + ans21[0] + " , " + ans21[1] + " ]");
    }
}
