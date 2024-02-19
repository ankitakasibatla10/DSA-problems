public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 7, 3, 8, 5, 1};
        bubble(arr);

    }
    public static void bubble(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int val:arr){
            System.out.print(val);
        }

    }
}
