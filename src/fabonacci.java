public class fabonacci {
    public static void main(String[] args){
        int n = 5;
        if(n == 0) {
           // System.out.println("The Fibonacci Series up to "+n+"th term:");
            System.out.print(0);
            //     System.out.println("0");
        } else{
            int secLast = 0;
            int last = 1;
            int cur;
            for(int i = 2; i <= n; i++){
                cur  = last + secLast;
                secLast = last;
                last = cur;
                System.out.println(cur);
            }
        }
    }
}
