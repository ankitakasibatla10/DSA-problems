import java.util.*;

public class multidimarr {
    public static void main(String[] args) {
//        int[][] arr = new int[3][3];
      Scanner sc  = new Scanner(System.in);
//        int[][] arr = {
//                {1, 3, 4}, //0 ,index
//                {2, 4, 7},  // 1
//                {5, 6, 9}    //2
//        };
//        System.out.println(Arrays.toString(arr[1]));
//        for (int i=0; i<arr.length; i++){
//            for(int j=0; j<arr.length; j++){
//                arr[i][j] = sc.nextInt();
//                System.out.println(Arrays.toString(arr));
//            }
//        }
//        System.out.println();
//            String[] arr = new Stirng[4];
//
//            for (String ele : arr){
//                System.out.println(ele);
//            }

        int[][] arr = {
                {1, 3, 4}, //0 ,index
                {2, 4, 7},  // 1
                {5, 6, 9}    //2
        };
            for (int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    System.out.println(Arrays.toString(arr));
                }
                System.out.println();
            }
    }
}
