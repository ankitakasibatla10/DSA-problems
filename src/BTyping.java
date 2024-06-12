import java.util.Scanner;

public class BTyping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int si = 0;
        for(int i=0; i<t.length(); i++){
            if(si < s.length() && t.charAt(i) == s.charAt(si)){
                System.out.println(i+1 + " ");
                si++;
            }
        }
    }
}
