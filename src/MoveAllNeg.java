public class MoveAllNeg {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 4, -3, 6, -1};
        int n = 6;
        int[] ans = moveallNegative(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] moveallNegative(int[] arr, int n){
        int l = 0;
        int r = n-1;
        while(l<=r){
            if(arr[l] < 0 && arr[r] < 0){
                l++;
            }
            else if(arr[l] > 0 && arr[r] < 0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            else if(arr[l] > 0 && arr[r] > 0){
                r--;
            }
            else{
                l++;
                r--;
            }
        }

        return arr;
    }
}
