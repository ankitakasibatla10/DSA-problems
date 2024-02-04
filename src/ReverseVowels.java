import java.util.*;
public class ReverseVowels {
    public static void main(String[] args) {

        String s2 = "WeLcomEetOScaLaR";
        reverseVowels(s2);
        UpperToLower(s2);


    }
    public static void reverseVowels(String s2){
        char[] c = s2.toCharArray();
        int i=0;
        int j= c.length-1;
        while(i<j) {
            while (c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u') {
                i++;
            }
            while (c[j] != 'a' && c[j] != 'e' && c[j] != 'i' && c[j] != 'o' && c[j] != 'u') {
                j--;
            }
            if (i >= j) {
                break;
            }

            char ch = c[i];
            c[i] = c[j];
            c[j] = ch;

            i++;
            j--;
        }
        for(char ch1 : c){
            System.out.print(ch1);
        }

    }

    public static void UpperToLower(String s2){
        char[] s = s2.toCharArray();
        for(int i=0; i<s.length; i++){
            char ch = s[i];

            if(ch>= 'A' && ch <= 'Z'){
                char a = (char)(ch-'A' + 'a');
                s[i] = a;
            }
        }
        System.out.print(s);
    }
}
