import java.util.Scanner;

public class PrintEvenIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        //print(arr);

        helper(0, n, arr);
    }
    public static void print(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            if(i%2==0){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void helper(int i, int n, int[] arr){
        if(i==n){
            return;
        }
        helper(i+1, n, arr);
        if(i%2 == 0){
            System.out.print(arr[i] + " ");
        }
    }
}
