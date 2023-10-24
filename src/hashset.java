import java.util.*;
public class hashset {
    public static void main(String[] args) {
       //l Set<Integer> s = new LinkedHashSet<>();
        Set<Integer> s = new TreeSet<>();
        s.add(12);
        s.add(54);
        s.add(9);   //random order
        s.add(76);
        System.out.println(s);
        s.remove(9);
        System.out.println(s);
        System.out.println(s.contains(5));
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
        System.out.println(s);
    }
}