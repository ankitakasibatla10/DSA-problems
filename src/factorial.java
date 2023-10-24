public class factorial {
    //iterative
    static int fact(int x){
        int a = 1;
        for(int i = 1; i<= x; i++){
            a = a * i;
        }
        return a;
    }

    static int fact1(int n){
        if(n == 0){
            return 1;
        }
        return n * fact1(n-1);
    }
    public static void main(String[] args){
        int x = 7;
        int res = fact(x);
        System.out.println(res);
        int n = 6;
        System.out.println(fact1(n));
    }
}
