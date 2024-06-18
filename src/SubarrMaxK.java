public class SubarrMaxK {
    public static void main(String[] args) {
//        int n = 5;
//        int[] a = {3, 5, 2, 1, 7};
//        int k = 2;
//        System.out.println(maxksub(a, n, k));
        int[] b = {4, 2, 3, 5, 1, 2};
        int m = 6;
        int k = 3;
        System.out.println(maxksub1(b, m , k));
    }
    public static int maxksub(int[] a, int n, int k){
        int ms = 0;
        int c = 0;
        for(int i=0; i<=n-k; i++){
            c = 0;
            for(int j=i; j<k+i; j++){
                c = c + a[j];
            }
        }
        ms = Math.max(ms, c);
        return ms;
    }
    public static int maxksub1(int[] a, int n, int k){
        int mx = Integer.MIN_VALUE;
        int s = 0;
        int i=0, j=0;
        while(j < n){
            s = s + a[j];
            if(j-i+1 < k){
                j++;
            }
            else{
                mx = Math.max(mx, s);
                s = s - a[i];
                i++;
                j++;
            }
        }
        return mx;

    }
}
