public class subArrayProduct {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 6};
        int target = 100;
        int ans = subarray(arr, target);
        System.out.println(ans);
    }

    public static int subarray(int[] arr, int target){

        int ans = 0;
        for(int i=0; i<arr.length;i++){
            int p = 1;
            for(int j=0; j<arr.length; j++){
                p = p * arr[j];
                if(p < target){
                    ans++;
                } else{
                    break;
                }
            }
        }
        return ans;
    }

}
