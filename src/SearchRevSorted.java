public class SearchRevSorted {
    public static void main(String[] args) {
        int[] a = {20, 17, 15, 10, 5, 4, 3, 2, 1};
        int n = a.length;
        int k = 4;
        System.out.println(searchInsort(a, n, k));
    }

    public static int searchInsort(int[] a, int n, int k) {
        int s = 0;
        int e = n-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(k == a[m]){
                return m;
            }else if(k < a[m]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return -1;
    }
}
