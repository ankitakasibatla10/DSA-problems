import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

    public static List<Integer> nextPermutation(List<Integer> a){
        int n = a.size();
        int ind = -1;
        for(int i=n-2; i>=0; i--){
            if(a.get(i) < a.get(i+1)){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            Collections.reverse(a);
            return a;
        }

        for(int i=n-1; i>ind; i--){
            if(a.get(i) > a.get(ind)){
                int temp = a.get(i);
                a.set(i, a.get(ind));
                a.set(ind, temp);
                break;
            }
        }

        List<Integer> sublist = a.subList(ind+1, n);
        Collections.reverse(sublist);

        return a;
    }
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextPermutation(a);
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i) + " ");
        }
    }
}
