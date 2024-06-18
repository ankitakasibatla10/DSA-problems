import java.util.ArrayList;
import java.util.HashSet;

public class CommonEles {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 3, 4, 5};
        System.out.println(common(a, b));
    }
    public static int common(int[] a, int[] b){
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int an : a){
            al.add(an);
        }
        for(int bn : b){
            al.add(bn);
        }
        for(int i : al){
            if(hs.contains(i)){
                hs1.add(i);
            }else{
                hs.add(i);
            }
        }
        return hs1.size();
    }
}
