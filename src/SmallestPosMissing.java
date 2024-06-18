public class SmallestPosMissing {
    public static void main(String[] args) {
        int[] a = {0, 9, -1, 3, -4, 5};
        System.out.println(smallpos(a));
    }
    public static int smallpos(int[] a){
        int n = 1000002;
        boolean[] ans = new boolean[n];
        for(int i=0; i<n; i++){
            ans[i] = false;
        }
        for(int i=0; i<a.length; i++){
            if(a[i] > 0){
                ans[a[i]] = true;
            }
        }
        int re = -1;
        for(int i=1; i<n;i++){
            if(!ans[i]){
                re = i;
                break;
            }
        }
        return re;
    }
}
