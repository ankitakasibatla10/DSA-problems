public class MinDiffNum {
    public static void main(String[] args) {
        int[] a = {2, 5, 10, 12, 15};
        int t = 13;
        System.out.println(minDiff(a, t));
    }
    public static int minDiff(int[] a, int t){
        int s=0, e=a.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(a[m] == t){
                return a[m];
            } else if (a[m] < t) {
                s=m+1;
            }else{
                e=m-1;
            }
        }
        if((a[s]-t) < t-a[e]){
            return a[s];
        }
        return a[e];
    }
}
