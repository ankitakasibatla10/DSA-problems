import java.util.*;

public class ClockAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int  t1= 0; t1 < t; t1++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            String temp = "";
            for (int i = 1; i <= 12; i++) {
                if (i == a || i == b) {
                    temp += 'a';
                } else if (i == c || i == d) {
                    temp += 'b';
                }
            }
            if (temp.contains("abab") || temp.contains("baba")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
