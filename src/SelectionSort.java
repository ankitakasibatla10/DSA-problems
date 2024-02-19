public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 7, 3, 8, 5, 1};
        selectionSort(arr);

    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min = arr[i];
            int minI = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minI = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minI];
            arr[minI] = temp;


        }
        for(int val : arr){
            System.out.println(val);
        }
    }
}
