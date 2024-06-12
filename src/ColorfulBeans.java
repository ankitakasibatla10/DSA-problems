import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ColorfulBeans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = sc.nextInt();
        for(int i=1; i<= n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(!hm.containsKey(b) || a < hm.get(b)){
                hm.put(b, a);
            }
        }
        MinDelicious(hm);
//        for(Map.Entry<Integer, Integer> m : hm.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
    }

    public static void MinDelicious(HashMap<Integer, Integer> hm){
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int val : hm.values()){
            maxi = Math.max(maxi, val);
        }

        System.out.println(maxi);
    }
}
