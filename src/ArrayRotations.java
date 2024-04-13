public class ArrayRotations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 , 5, 6, 7};
        int k = 2;

//        int[] ans = leftRotate1(arr, k);
//        for(int i=0; i<arr.length; i++){
//            System.out.println(ans[i]);
//        }
          leftRotate2(arr, k);
//          rightRotate(arr, k);
    }
    public static int[] leftRotate1(int[] arr, int k){
        int n = arr.length;
        while(k > 0){
            int temp = arr[0];
            for(int i=0; i<n-1; i++){
                arr[i] = arr[i+1];

            }
            arr[n-1] = temp;
            k--;
        }
        return arr;
    }
    public static void leftRotate2(int[] arr, int k){
        if(arr == null || arr.length <=1){
            return;
        }
        int n = arr.length;
        k = k%n;
        reverse(arr,0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }

    }

    public static void rightRotate(int[] arr, int k){
        if(arr == null || arr.length <= 1){
            return;
        }
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);


        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
