public class MissingInt {

    public static int missingint(int []a, int n){
        for(int i = 1; i<n; i++){
            int flag = 0;

            for(int j = 0; j<n-1; j++){
                if(a[j] == i){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) return i;
        }
        return -1;
    }

    public static int missing2(int[] b, int m){
        int sum = (m*(m+1))/2;
        int sum2 = 0;
        for(int i=0; i<m; i++){
            sum2 += b[i];
        }

        int missingNumber = sum - sum2;
        return missingNumber;
    }

    public static void main(String[] args) {

        int n = 5;
        int a[] = {1, 2, 3, 5};
        /* int ans  = missingint(a, n); */

        int m = 5;
        int b[] = {1, 2, 4, 5};
        int ans;
        ans = missing2(b, m);
        System.out.println("the missing int is : " + ans );

    }
}
