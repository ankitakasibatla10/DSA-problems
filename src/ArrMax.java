//import java.util.Arrays;
//
//public class ArrMax {
//    public static void main(String[] args) {
//        //int[] a = {1, 3, 4, 2, 6, 9, 5, 7};
//        int[] a = {1, 2, 3, 4, 5, 6};
//        int[]ans = arraymax(a);
//        int ii = 0;
//        int jj = a.length-1;
//        while(ii<jj){
//            int temp = ans[ii];
//            ans[ii] = ans[jj];
//            ans[jj] = temp;
//            ii++;
//            jj--;
//        }
//        for(int im =0; im<a.length; im++){
//            System.out.print(ans[im]);
//        }
//        System.out.println();
//    }
//        for(int  i=0; i<a.length; i++){
//            System.out.print(ans[i]);
//        }
//
//    public static int[] arraymax(int[] a) {
//        int n = a.length;
////        Arrays.sort(a);
//        int[] b = new int[n];
//        int i = 0;
//        int j = n - 1;
//        for (int in = n - 1; in >= 0; in--) {
//            if (i <= j) {
//                if (in % 2 == 0) {
//                    b[i] = a[in];
//                    i++;
//                } else {
//                    b[j] = a[in];
//                    j--;
//                }
//            }
//        }
////        i = 0;
////        j = a.length-1;
////        while(i<j){
////            int temp = ans[i];
////            ans[i] = ans[j];
////            ans[j] = temp;
////            i++;
////            j--;
////        }
////        for(int im =0; im<a.length; im++){
////            System.out.print(ans[im]);
////        }
////        System.out.println();
////    }
//        return b;
//    }
//}
