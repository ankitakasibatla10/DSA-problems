import java.util.Arrays;

public class NumberDigitOne {
    public static void main(String[] args) {
        int n = 13;
        //System.out.println(count(n));
        System.out.println(count2(n));
    }

    public static int count(int n){

        String s = Integer.toString(n);
        int count = 0;
        for(int i= 1; i<=n; i++){
            String temp = Integer.toString(i);
            System.out.println(temp);
            for(int j=0; j<temp.length(); j++){
                if(temp.charAt(j) == '1'){
                    count++;
                    System.out.println(count + " its c ");
                }
            }
        }
        return count;
    }

    public static int count2(int n){
        int c = 0;
        for(int i=1; i<=n; i++){
            int cnt = count1s(i);
            c = c + cnt;
        }
        return c;
    }

    public static int count1s(int n){
        int onesCount = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 1){
                onesCount++;
            }
            n = n/10;
        }
        return onesCount;
    }
}
// complexity is nlong n