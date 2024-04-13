public class MaxCons0s {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 0, 0};
        int ans = maxConsecutive(arr);
        System.out.println(ans);
    }
    public static int maxConsecutive(int[] arr){
        int count = 0;
        int maxCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count++;

            }else{
                if(count > maxCount){
                    maxCount = count;
                }
                count = 0;
            }

        }
        if(count > maxCount){
            maxCount = count;
        }
        return maxCount;
    }
}
