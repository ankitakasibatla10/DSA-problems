import java.util.*;
public class gcd {
    static int gcdd(int a, int b){
        for(int i=0; i<Math.min(a, b); i++){
            if(a%i == 0 && b%i == 0){
                System.out.println(i);
            }
            break;
        }

        return a;
    }
    public static void main(String[] args){
        int a = 4; int b = 8;
        int ans = gcdd(a, b);
        System.out.println(ans);
    }
}
