public class MaxStock {
    public static int maxProfit(int[] a){
        int max = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[j] > a[i]){
                    max = Math.max(a[j] - a[i], max);
                }
            }
        }
        return max;
    }



    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};

        int ans = maxProfit(a);
        System.out.println("the max profit :" + ans);
    }
}
