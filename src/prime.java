public class prime {
    public static boolean isPrime(int n){
        for(int i=1; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n = 20;
        boolean a = isPrime(n);
        if (n != 1 && a == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Non-Prime Number");
        }
    }
}
