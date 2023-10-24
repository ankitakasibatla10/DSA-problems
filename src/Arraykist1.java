import java.util.*;
public class Arraykist1 {
    public static void main(String[] args) {
//        String[] sname = new String[30];
//        sname[0] = "Ramesh";
        ArrayList<String> sname = new ArrayList<>();
        sname.add("Rakesh");
        // size---> s --> s+s/2+1
        System.out.println(sname);

        sname.add(1, "Suresh");
        System.out.println(sname);

//        List<Integer> n = new List<Integer>() ;
//            n.add(1);
//            n.add(2);
//            System.out.println(n);
//        sname.get(0);
//        System.out.println(sname);
        sname.remove("Suresh");

//        sname.clear();
//        System.out.println(sname);
        sname.add("Ankita");
        sname.set(1, "ank");
        System.out.println(sname.contains("ank"));
        System.out.println(sname);

        for(int i=0; i<sname.size(); i++){
            System.out.println(sname.get(i));
        }
        for(String ele: sname){
            System.out.println(sname.get(Integer.parseInt(ele)));
        }

//        Iterator<String> it = sname.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}