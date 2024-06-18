public class MaxSubarraySum {

    public static int maxSubSum(int[] a, int n){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += a[k];
                }
                max = Math.max(max, sum);

            }
        }
        return max;
    }



    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = a.length;
        int ans = maxSubSum(a, n);
        System.out.println("the max subarray sum is:" + ans);
    }
}
