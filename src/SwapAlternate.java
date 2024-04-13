public class SwapAlternate {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = 5;
        //swapAlternate(a, n);

        int[] b = { 1, 1, 8,  2, 3 , 2, 3, 2, 3};
        int anss = uniq(b);
        System.out.println(anss);
    }

    public static int uniq(int[] b){
        int an = 0;
        int ans = 0;
//        for(int j=0; j<b.length; j++){
//            an ^=  b[j];
//        }
        for(int j : b){
            an = an ^ j;
        }

        return an;
    }
    public static void swapAlternate(int[] a, int n){
        for(int i=0; i<n; i += 2){
            if(i+1 < n){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }


}
