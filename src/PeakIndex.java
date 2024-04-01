
class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 8, 7, 4, 1};

        System.out.println(peakIndexInMountainArray(arr));

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            } else{
                start = mid + 1;
                //coz mid+1 eele greater than mid
            }
            //in the end start== end pointing to the largest no.and when they point to one ele that is the max element

        }
        return start;
    }
}