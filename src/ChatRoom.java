import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        isHello(s);
    }
    public static void isHello(String s){
        String ans = "hello";
        int i = 0;
        for(int j=0; j<s.length(); j++){
            if(s.charAt(j) == ans.charAt(i)){
                i++;
            }
            if(i == ans.length() ){
                System.out.print("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
