import java.util.HashMap;

public class maps {
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();
        //names to their IDs
        // why not map? map is an interface nd has dufferent implementations
        hm.put("Ankita", 1001);
        hm.put("John", 102);
        hm.put("Kre", 1003);
        System.out.println(hm);// maps doesnot guarantee order

        System.out.println(hm.get("Kre"));

        System.out.println(hm.containsKey("John"));

        System.out.println(hm.containsValue(1003));

        hm.put("John", 9876);
        System.out.println(hm);//replace the older value or if the key isnt there it adds it ito the last

        hm.replace("John", 777);
        System.out.println(hm); //replace and doesnot add if the key is doesnot there

        hm.putIfAbsent("Ale", 6784);
        System.out.println(hm);

        hm.putIfAbsent("Ale", 6786);
        System.out.println(hm);

        hm.remove("Ale");
        System.out.println(hm);
    }
}
