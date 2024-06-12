public class MaxSumConfig {
    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 2};
        int n = 4;
        max(arr, n);
    }
    public static void max(int[] arr, int n){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int cur = 0;
            for(int j=0; j<n; j++){
                int index = (i+j)%n;
                cur += j * arr[index];
            }
            maxi = Math.max(maxi, cur);
        }
        System.out.println(maxi);
    }
}
