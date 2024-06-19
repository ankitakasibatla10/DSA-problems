public class FirstAndLastOcc {
    public static void main(String[] args) {
        int[] a = {2, 4, 10, 10, 10, 18, 20};
        int n = a.length;
        int k = 10;
        //System.out.println(firstOcc(a, n, k));
        System.out.println(lastOcc(a, n, k));
    }

    public static int firstOcc(int[] a, int n, int k) {
        int s=0, e=n-1, ans = -1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(k == a[m]){
                ans = m;
                e = m - 1;
            }else if(k < a[m]){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return ans;
    }
    public static int lastOcc(int[] a, int n, int k){
        int s=0, e=n-1, ans = -1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(k == a[m]){
                ans = m;
                s = m+1;
            }else if(k < a[m]){
                e = m-1;
            }else{
                s=m+1;
            }
        }
        return ans;
    }
}
