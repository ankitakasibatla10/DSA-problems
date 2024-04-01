
import java.util.*;
public class CountWAYS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            System.out.println(countWays(a));
        }
        sc.close();
    }

    public static int countWays(int a){
        int mod = 1000000007;
        return ((a-1) * (a-2)) % mod;
    }
}
