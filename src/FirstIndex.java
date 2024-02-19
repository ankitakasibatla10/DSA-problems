public class FirstIndex {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 7, 8, 9, 2, 3,4 };
        int x = 2;
        System.out.println(printIndex(a, x, 5));
        int n = 5;
        System.out.println(fact(n));
    }
    public static int printIndex(int[] a, int x, int i){
        if(i== a.length){
            return -1;
        }
        if (a[i] == x){
            return i;
        } else{
            int index = printIndex(a,x, i+1);
            return index;
        }
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int mn = fact(n-1);
        return n * mn;
    }
}
