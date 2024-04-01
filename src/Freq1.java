import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Freq1 {
    public static void main(String[] args) {
        int[] a = {3, 3};
        boolean ans = dup(a);
        System.out.println(ans);


        HashSet<Integer> hs = new HashSet<>();
        for(int i : a){
            hs.add(i);
        }
        System.out.println(hs);
        ArrayList<Integer> l = new ArrayList<>(hs);
        System.out.println(l.get(2));

    }

    public static boolean dup(int[] a){
//        Arrays.sort(a);
//        for(int i=0; i<a.length; i++){
//            if(a[i] == a[i+1]){
//                return true;
//            }
//        }
//        return false;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : a) {
            if (hm.containsKey(i)) {         //if(hm.containsKey(i) -----> hm.put(i, hm.get(i)+1;
                return true;                 // else hm.put(i, 1)
            } else{
                hm.put(i, 1);
            }
        }
        return false;
    }





}
