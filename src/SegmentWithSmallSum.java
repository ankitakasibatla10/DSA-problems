import java.util.ArrayList;
import java.util.Scanner;

public class SegmentWithSmallSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = sc.nextLong();
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        System.out.println(goodSegment(a, n, s));
    }
    public static long goodSegment(long[] a, int n, long s){
        long sum = 0;
        int start = 0;
        int end = -1;
        long maxi = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum = sum + a[i];
            while(sum > s){
                sum = sum - a[start];
                start++;
            }
            int length = i-start+1; //(j-i+1)
            maxi = Math.max(maxi, length);
        }
        return maxi;
    }
}
