public class PriInc {
    public static void main(String[] args) {
        //printincreasing(7);
        int[] ar = {10, 20, 30, 40, 50};
        printarr( ar, 0);
    }
//    public static void printincreasing(int n){
//        if(n==0){
//            return;
//        }
//
//        printincreasing(n-1);
//        System.out.print(n);
//    }
    public static void printarr(int[] ar, int i){
        if(i == ar.length){
            return;
        }
        System.out.print( ar[i]);
        printarr(ar, i+1);
    }
}
