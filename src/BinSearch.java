public class BinSearch {
//    public static int binarySearch(int[] a, int target){
//        int n = a.length;
//        int l = 0;
//        int h = n-1;
//        while(l <= h){
//            int mid = (l+h) / 2;
//            if(a[mid] == target){
//                return mid;
//            }
//            else if(target > a[mid]){
//                l = mid + 1;
//            } else{
//                h = mid - 1;
//            }
//        }
//        return -1;
//    }
    public static int binarySearch1(int[] a, int l, int h, int t ){
        if(l > h) return -1;
        int m = (l+h) / 2;
        if(a[m] == t) return m;
        else if(t > a[m]) return binarySearch1(a, m+1, h, t);
        return binarySearch1(a, l, m-1, t);
    }
    public static int search(int[] a, int t){
        return binarySearch1(a, 0, a.length-1, t);
    }
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int t = 6;
        int l;
        int h;
//        int ind = binarySearch(a, target);
//        System.out.println(ind);
        int ind = search(a, t);
        System.out.println(ind);
    }
}
