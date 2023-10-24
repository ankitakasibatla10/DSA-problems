import java.util.*;
public class Merge {
    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else{
                temp.add(arr[right]);
                right++;
            }

            while(left <= mid){
                temp.add(arr[left]);
                left++;
            }

            while(right <= high){
                temp.add(arr[right]);
                right++;
            }

            for(int i=low; i<=high; i++){
                arr[i] = temp.get(i-low);
            }
        }
    }

    public static void mergesort(int[] arr, int low, int high) {
        if (low < high) {

            int mid = (low + high) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args){
  //      Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = {9, 4, 7, 6, 3, 1, 5};
        System.out.println("before:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        Merge m = new Merge();
        m.mergesort(arr, 0, n-1);

        System.out.println("after:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
