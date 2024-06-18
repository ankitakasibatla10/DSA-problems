import java.util.HashMap;

public class FindMajEle {
    public static void main(String[] args) {
        int[] a = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int n = a.length;
        majorityele(a,n);
    }
    public static void majorityele(int[] a, int n){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<a.length;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
            }else{
                hm.put(a[i], 1);
            }
        }
        for(int i : hm.keySet()){
            if(hm.get(i) > n/2){
                System.out.println(i);
                break;
            }
        }
    }
}
