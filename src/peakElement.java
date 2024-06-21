public class peakElement {
    public static void main(String[] args) {
        int[] a = {10, 15, 5, 25, 100, 70};
        int n = a.length;
        System.out.println(findpeak(a,n));
    }
    public static int findpeak(int[] a, int n){
        int s=0, e=n-1;

        while(s<=e){
            int m = s + (e-s)/2;
            if((m==0 || (a[m] >= a[m-1])) && (m==n-1) || (a[m]>=a[m+1])){
                return m;
            }else if (m > 0 && a[m-1] > a[m]){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }
}
