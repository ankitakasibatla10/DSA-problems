public class MinOpSortArr {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 4, 2};
        System.out.println(miniop(a));
    }
    public static int miniop(int[] a){
        int c = 0;
        for(int i=1; i<a.length; i++){
            if(a[i] <= a[i-1]){
                int ch = a[i-1] - a[i] + 1;
                c += ch;
                a[i] += ch;
            }
        }
        return c;
    }
}
