public class RemoveVowel {
    public static void main(String[] args) {
        //String s = "youcandoit";

        String s2 = "welcometoscalar";
        reverseVowels(s2);

        //removeVowel(s);
    }
//    public static void removeVowel(String s){
//        for(int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            if(ch == 'a' | ch == 'e' | ch == 'i' | ch=='o' | ch=='u'){
//                continue;
//            }
//            System.out.println(ch);
//        }
//    }
    public static void reverseVowels(String s2){
        char[] c = s2.toCharArray();
        int i=0;
        int j= c.length-1;
        while(i<j) {
            while (c[i] != 'a' || c[i] != 'e' || c[i] != 'i' || c[i] != 'o' || c[i] != 'u') {
                i++;
            }
            while (c[j] != 'a' || c[j] != 'e' || c[j] != 'i' || c[j] != 'o' || c[j] != 'u') {
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
                System.out.println(ch1);
        }


    }
}
