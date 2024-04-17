import java.util.HashSet;

public class Subsum0 {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        int n = 5;
       // System.out.println(subarraysum(arr, n));
        System.out.println(subarraysum2(arr, n));
    }
    public static boolean subarraysum(int[] arr, int n){


        for(int i=0; i<n; i++){
            int sum = arr[i];
            if(sum == 0){
                return true;
            }
            for(int j=i+1; j<n; j++){
                sum = sum + arr[j];
                if(sum == 0){
                    return true;
                }
            }

        }
        return false;

    }

    public static boolean subarraysum2(int[] arr, int n){
        int sum = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            if(arr[i] == 0 || sum == 0 || hs.contains(sum)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
}
