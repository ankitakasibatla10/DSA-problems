import java.util.*;
public class armstrong {
    static boolean anum(int n) {
        int original = n;
        int c = 0;
        int dum = n;
        while(dum!=0){
            c++;
            dum = dum/10;
        }
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum += Math.pow(digit,c);
            n /= 10;
        }
        return (sum == original);
    }
    public static void main(String[] args){
        int n1 = 153;
        if(anum(n1)){
            System.out.println("Armstrong number");
        } else{
            System.out.println("Not an armstrong number");
        }
    }
}