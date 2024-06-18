public class SubarrMax {
    public static void main(String[] args) {
        int[] b = {-1, 3, -2, 5, 3, -5, 2, 2};
        int m = b.length;

        System.out.println(maxsub(b, m));
    }
    public static int maxsub(int[] a, int n){
        int maxi1 = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += a[k];
                }
                maxi1 = Math.max(maxi1, sum);
            }
        }
        return maxi1;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += a[j];
                maxi1 = Math.max(maxi1, sum);
            }


        }
        return maxi1;

        int c = 0;
        for(int i=0; i<n; i++){
            c = c + a[i];
            if(c > maxi1){
                maxi1 = c;
            }
            if(c < 0){
                c = 0;
            }
        }
        return maxi1;

        int cs = a[0];
        int os = a[0];
        for(int i=0; i<n; i++){
            if(cs > 0){
                cs += a[i];
            }
            else{
                cs = a[i];
            }
            if(cs > os){
                os = cs;
            }
        }
        return os;

    }
}
