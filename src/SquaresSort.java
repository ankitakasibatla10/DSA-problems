import java.util.Arrays;

public class SquaresSort {
    public static void main(String[] args) {
        int[] a = {-1, -3, 4};
        int n = 6;
        int[] b = {-9, -5, -3, 0 , 6, 8};
        solve2(b, n);

        solve1(a);
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    public static int[] solve1(int[] a){
        for(int i=0; i<a.length;i++){
            a[i] = a[i]*a[i];
        }
        Arrays.sort(a);
        return a;
    }
    public static void solve2(int[] a, int n){
        int l=0, r=n-1;
        int[] ans = new int[n];
        for(int i=n-1;i >= 0; i--){
            if(Math.abs(a[l])> a[r]){
                ans[i] = a[l] * a[l];
                l++;
            }else{
                ans[i] = a[r] * a[r];
                r--;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
