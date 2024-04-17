import java.util.HashMap;
public class BeautifulYear {
    public static void main(String[] args) {
        int a = 1987;
        System.out.println(findYear(a));
    }
    public static int findYear(int a){
        while(true){
            a++;
            if(isUnique(a)){
                return a;
            }
        }


    }
    public static boolean isUnique(int a){
        HashMap<Character, Integer> hm = new HashMap<>();
        String s = Integer.toString(a);
        for(char c:s.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+ 1);
            }else{
                hm.put(c, 1);
            }
        }
        for(int i : hm.values()){
            if(i > 1){
                return false;
            }
        }
        return true;
    }
}
