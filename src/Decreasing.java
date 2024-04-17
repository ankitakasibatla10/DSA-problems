import java.util.*;
public class Decreasing {
    public static void main(String[] args) {
        int n = 512;
        int k = 4;
        System.out.println(decresing(n, k));
    }

    public static int decresing(int n, int k){
        while(k > 0){
            if(n % 10 == 0){
                n = n/10;
            } else{
                n--;
            }

            k--;
        }
        return n;
    }

}
