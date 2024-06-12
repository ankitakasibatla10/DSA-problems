import java.util.Scanner;

public class ClosestToTheRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[k];
        for(int j=0; j<k; j++){
            arr2[j] = sc.nextInt();
        }
        closestRight(arr, arr2);
    }
    public static void closestRight(int[] arr, int[] arr2){
        for(int i=0; i<arr2.length; i++){
            System.out.println(searchPosition(arr, arr2[i]) );
        }
    }
    public static int searchPosition(int[] arr, int t){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length + 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] >= t){
                ans = mid + 1;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
