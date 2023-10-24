public class countD {
    //method to count the number of digits
    static int count(int n){
       int y = 0;
       while(n!=0){
           int digit = n%10;
           y = y*10 + digit;
           n = n/10;
       }
       return y;
    }
    public static void main(String[] args){
        int n = 121;
        int dummy = n;
        int y = count(n);
        if(dummy == y){
            System.out.println("Yes");
        } else{
            System.out.println("False");
        }
    }
}
