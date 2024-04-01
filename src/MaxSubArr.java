public class MaxSubArr {
    public static void main(String[] args) {
        int[] arr = {-2, 5, -3, 4, -1, 2, 1, -5, 4};
        int nas = sub(arr);
        System.out.println(nas);
        System.out.println(sub2(arr));

    }
    public static int sub(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){
                int c = 0;
                for(int k=i; k<=j; k++){
                    c = c + arr[k];
                }
                max = Math.max(max, c);
            }

        }
        return max;
    }

    public static int sub2(int[] arr){
        int maxi = Integer.MIN_VALUE;
        int c = 0;
        for(int i=0; i<arr.length; i++){
            c += arr[i];
            if(c > maxi){
                maxi = c;
            }
            if(c < 0){
                c = 0;
            }

        }
        return maxi;
    }
}
//n3
//sum abbary, largest smallest comprisions - math.max( a, b)
//        a = min;
//    loop -
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//
//        Example 2:
//
//        Input: nums = [1]
//        Output: 1
//        Explanation: The subarray [1] has the largest sum 1.
//        Example 3:
//
//        Input: nums = [5,4,-1,7,8]
//        Output: 23
//        Explanation: The subarray [5,4,-1,7,8] has the largest