import java.util.*;
public class Union2 {

    static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();
        for(int i=0; i<n; i++){
            h.add(arr1[i]);
        }
        for(int j=0; j<m; j++){
            h.add(arr2[j]);
        }
        for(int it :h){
            union.add(it);
        }
        return union;
    }
    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> union = findUnion(arr1, arr2, n, m);
        for(int val : union){
            System.out.print(val+ " ");
        }
    }
}
