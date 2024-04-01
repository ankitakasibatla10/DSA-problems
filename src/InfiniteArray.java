public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findRange(arr, target));

    }
    public static int findRange(int[] arr, int target){
        //start with the box of 2
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            //double end value - end = prev end + sizeOf(box * 2)
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return binSearch(arr, target, start, end);
    }
    public static int binSearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
