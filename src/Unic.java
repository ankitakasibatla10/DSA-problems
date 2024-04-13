public class Unic {
    public static void main(String[] args) {
        int[] a = {4, 1, 1, 2, 3 , 2, 3, 2, 3};
        int ans = unicc(a);
        System.out.println(ans);
    }
    public static int unicc(int[] a){
        int an = 0;
        for(int j : a){
            an = an ^ j;
        }
        return an;
    }

}

