public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(checkP(s));
    }
    public static boolean checkP(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
