import java.util.HashSet;

public class ArraysSets {
    public static void main(String[] args) {
        int n = 5;
        int[] a1 = {1, 2, 3, 4 ,5};
        int m = 4;
        int[] a2 = {1, 2, 3, 6};
        System.out.println(unionof2(a1,n,a2,m));
    }
    public static int unionof2(int[] a1, int n, int[] a2, int m){
        HashSet<Integer> hs = new HashSet<>();
        for(int i : a1){
            hs.add(i);
        }
        for(int j : a2){
            hs.add(j);
        }
        for(int k : hs){
            System.out.print(k);

        }
        System.out.println();
        return hs.size();
    }
}
