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

    public static int fact2(int x1){
        int sum = 1;
        if(x1 == 0 || x1 == 1){
            return 1;
        }else{
            sum = sum * fact2(x1-1);
        }
        return sum;
    }

    public static void main(String[] args){
        int x = 7;
//        int res = fact(x);
//        System.out.println(res);
//        int n = 6;
//        System.out.println(fact1(n));

        int x1 = 5;
        System.out.println(fact2(x1));
    }
}
