public class arrSort {
    public static boolean isSorted(int[] ar1, int n){
        for(int i=1; i<n; i++) {
            if (ar1[i] < ar1[i - 1]) {
                return false;
            }
        }
            return true;

    }
    public static void main(String[] args){
        int ar1[] = {1, 2, 3, 4, 1, 5};
        int n = 5;
        System.out.println(isSorted(ar1, n));
    }
}
