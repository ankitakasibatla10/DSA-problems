public class MaxProductSub {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4,0, 5, -1, 0};
        int n = 7;
        long ans = maximumProduct(arr, n);
        System.out.println(ans);
    }

    public static long maximumProduct(int[] arr, int n){

        long prefix = 1;
        long suffix = 1;
        long maxi = Long.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix =1;
            }
            prefix = prefix * arr[i];
            suffix = suffix * arr[n-i-1];

            maxi = Math.max(maxi, Math.max(prefix, suffix));

//            if(product < 0){
//                product = 1;
//                start = i + 1;
//            }
//            if(product > maxi){
//                maxi = product;
//                newS = start;
//                end = i;
//            }
        }
        return maxi;

    }
}
