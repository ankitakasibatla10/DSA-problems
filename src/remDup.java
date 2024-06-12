import java.util.*;

public class remDup {
    public static void main(String[] args) {
        int[] a = {1,1 , 2, 2, 3, 4, 4};
        int[] b = {1, 2, 5, 1, 7, 2, 4, 2};

        //System.out.println(removeduplic(a));
        System.out.println(removeduplic2(b));
    }


    public static int removeduplic(int[] a){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<a.length; i++){
            hs.add(a[i]);
        }
        for(int i : hs){
            System.out.print(i);
        }
        return hs.size();
    }

    public static int removeduplic2(int[] b){
            HashSet<Integer> hs = new HashSet<>();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0; i<b.length; i++){
                if(!hs.contains(b[i])){
                    hs.add(b[i]);
                    al.add(b[i]);
                }

            }
            for(int i:hs){
                System.out.print(i);
            }
            System.out.println();
            for(int i:al){
                System.out.print(i);
            }
            System.out.println();
            return al.size();
        }

}
