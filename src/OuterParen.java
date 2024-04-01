public class OuterParen {
    public static void main(String[] args) {
        String s = "(()())(())";
        String res = remove(s);
        System.out.println(res);
    }

    public static String remove(String s) {
        String res = "";
        int count = 0;
        for(int cnt = 0; cnt < s.length(); cnt++){
            System.out.print(count + "   ");
            if(s.charAt(cnt) == '(' && count++ > 0){
                System.out.print(count++);
                System.out.print(count + "for ( ");

                res += s.charAt(cnt);
            }
            if(s.charAt(cnt) == ')' && count-- > 1){
                System.out.print(count + " for ) ");
                res += s.charAt(cnt);
            }

        }

        return res;
    }

}
