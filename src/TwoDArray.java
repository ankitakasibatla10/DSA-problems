public class TwoDArray {
    public static void main(String[] args) {
//        int[][] arr = new int[4][5];
//        arr[1][2] = 5;
//        System.out.println(arr[1][2]);
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        transpose(arr);
    }
        //traversal
        public static void transpose(int[][] arr){
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<i; j++){
                    int temp = arr[i][j];
                    arr[i][j]= arr[j][i];
                    arr[j][i] = temp;
                }
            }
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();


            }
            rotate2D(arr);

        }
        public static void rotate2D(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][0];
                arr[i][0] = arr[i][3];
                arr[i][3] = temp;

            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }




}
