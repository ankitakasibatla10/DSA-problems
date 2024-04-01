public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] l = {'a', 'b', 'c'};
        char t = 'a';
        char ans = nxtGreatest(l,t);
        System.out.println( 1 % l.length);
        System.out.println(ans);
        System.out.println(3%5);
    }
    public static char nxtGreatest(char[] le, char t){
        int l = 0;
        int h = le.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if (le[m] > t){
                h = m - 1;
            } else{
                l = m + 1;
            }
        }
        return le[l % le.length];
    }
}
