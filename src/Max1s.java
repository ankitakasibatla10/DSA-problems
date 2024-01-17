public class Max1s {

    public static int findMaxOnes(int[] nums){
        int count = 0;
        int maxCount = 0;
        for (int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 1, 1};
        int ans  = findMaxOnes(nums);
        System.out.println("max count:" + ans);
    }
}
