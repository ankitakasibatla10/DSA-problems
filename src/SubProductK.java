public class SubProductK {
    public static void main(String[] args) {
        int[] a = {10, 5, 2, 6};
        int k = 100;
        int ans = subArraysLessThanK(a, k);
        System.out.print(ans);
    }

    public static int subArraysLessThanK(int[] a, int k){
        int ans = 0;
        for(int i=0; i<a.length; i++){
            int p = 1;
            for(int j=i; j<a.length; j++){
                p = p * a[j];
                if(p<k){
                    ans++;
                } else{
                    break;
                }
            }

        }
        return ans;
    }
}
