import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        double s = 0.0;
        double avg = averageArray(i, s, n, arr);
        System.out.printf("%.6f", avg);
    }
    public static double averageArray(int i, double s, int n, int[] arr){
        if(i==n){
            return (s*1.0/n);
        }
        return averageArray(i+1, s+arr[i], n, arr);
    }
}
