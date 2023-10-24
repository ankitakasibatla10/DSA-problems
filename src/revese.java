public class revese {
    static int rev(int num) {
        int n = 123;
        int r = 0;
        while (n != 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            n = n / 10;
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 123;

        rev(n);
        System.out.println(rev(n));
    }
}