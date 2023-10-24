import java.util.*;
public class sumN {
//    public static void main(String[] args){
//        solve(5);
//        solve(6);
//    }
//    public static void solve(int n){
////        int sum = 0;
////        for(int i=1; i<=n; i++){
////            sum += i;
////        }
//        int sum = n * (n+1) / 2;
//        System.out.println(sum);
//    }

    static int func(int n){
        if (n == 0) {return 0;}
        return n + func(n-1);
    }
    public static void main(String[] args){
        int n = 7;
        System.out.println(func(n));
    }
}
