public class insertion {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 7, 3, 8, 5, 1};
        insertionM(arr);

    }
    public static void insertionM(int[] arr){
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

}
