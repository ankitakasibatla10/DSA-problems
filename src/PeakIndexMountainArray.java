public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        System.out.println(peakIndex(arr));
    }

    public static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;  // this will be decreasing side anduke end = mid pettestham
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

}
