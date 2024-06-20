public class SqRtNum {
    public static void main(String[] args) {
        int n = 24;
        System.out.println(squareRoot(n));
    }
    public static int squareRoot(int n){
        if(n <= 1){
            return n;
        }
        int s = 1, e=n/2;
        int ans = 1;
        while(s<=e){
            int m=s + (e-s)/2;
            long x = m*m;
            if(x == n){
                ans = m;
                break;
            } else if(x < n){
                ans = m;
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return ans;
    }
}
