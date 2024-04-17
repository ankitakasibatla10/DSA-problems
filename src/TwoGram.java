import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoGram {
    public static void main(String[] args) {
        String str = "AA";
        System.out.println(twogram(str));
//        twogram(str);

    }

    public static String twogram(String str){
        HashMap<String, Integer> hm = new HashMap<>();
        int maxCount = Integer.MIN_VALUE;
        String ans = " ";
        for(int i=0; i<=str.length()-2; i++){
            String s = str.substring(i, i+2 );
            if(hm.containsKey(s)){
                hm.put(s, hm.get(s) + 1);
            }else{
                hm.put(s, 1);
            }
        }

        for(Map.Entry<String, Integer> map : hm.entrySet()){
            if(map.getValue() > maxCount){
                maxCount = map.getValue();
                ans = map.getKey();
            }
        }
        return ans;
    }
}
