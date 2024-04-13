public class MaxSubArSum {
    public static void main(String[] args) {
        int[] a = {-1, 3, -2, 5, 3, -5, 2, 2}; // 9
        System.out.println(maxSum(a));
    }
    public static int maxSum(int[] a){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];

            if(maxi < sum){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}
