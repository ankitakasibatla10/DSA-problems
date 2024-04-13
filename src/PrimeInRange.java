public class PrimeInRange {
    public static void main(String[] args) {
        int n = 16;
        for(int i=1; i<n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static  boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
