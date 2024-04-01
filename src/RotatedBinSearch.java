public class RotatedBinSearch {
    public static void main(String[] args) {
         int[] a = {4, 5, 6, 7, 0, 1, 2};
         System.out.println(findEle(a));
    }
    public static int search(int[] nums, int target){
        int pivot = findEle(nums);
        //if you dont find pivot, it means array not rotated
        if(pivot == -1){
            //do normal bin search
            binary(nums, target, 0, nums.length-1);

        }
        //if pivot is found we will be having 2 asc sorted arr
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binary(nums, target, 0, pivot-1);
        }
        return binary(nums, target, pivot+1, nums.length-1);

    }

    public static int binary(int[] a, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > a[mid]){
                start = mid+1;
            } else if(target < a[mid]){
                end = mid-1;
            } else{
                return mid;
            }
        }
        return -1;
    }

    //found pivot
    public static int findEle(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && a[mid] > a[mid+1]){
                return mid;
            }
            if(mid > start && a[mid] < a[mid-1]){
                return mid-1;
            } if (a[mid] <= a[start]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
}
