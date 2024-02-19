public class SquareRoot {
    public static void main(String[] args) {
        int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);

    }
//    public static int floorSqrt(int n){
//        int a = (int) Math.sqrt(n);
//        return a;
//    }

    public static int floorSqrt(int n){
        int l = 1;
        int h = n;
        while(l <= h){
            long mid = (l+h)/2;
            long val = mid*mid;
            if(val <= (long)(n)){
                l = (int)(mid+1);
            } else{
                h = (int) (mid-1);
            }
        }
        return h;
    }
}
