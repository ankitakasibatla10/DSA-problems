import java.util.*;

public class ClosestToTHeLeft {
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
        closestLeft(arr, arr2);
    }
    public static void closestLeft(int[] arr, int[] arr2){
        for(int i=0; i<arr2.length; i++){
            System.out.println(searchPos(arr, arr2[i]) );
        }
    }

    public static int searchPos(int[] arr, int t){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] > t){
                ans = mid ;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if(ans == -1){
            ans = arr.length;
        }
        return ans;
    }
}


