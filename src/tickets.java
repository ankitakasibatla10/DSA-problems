import java.util.HashMap;
import java.util.HashSet;

public class tickets {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key: tick.keySet()){
            revMap.put(tick.get(key), key);
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("c", "b");
        tickets.put("m", "d");
        tickets.put("g", "c");
        tickets.put("d", "g");

        String start = getStart(tickets);
        while(tickets.containsKey(start)){
            System.out.println(start + "->");
            start = tickets.get(start);
        }
        System.out.println(start);

    }
}
