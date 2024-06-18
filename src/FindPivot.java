public class FindPivot {
    public static void main(String[] args) {
        int[] a = {1, 7, 3, 6, 5, 6};
        int n = a.length;
        System.out.println(findpivot(a, n));
    }
    public static int findpivot(int[] a, int n){
        int s = 0;
        for(int i:a){
            s = s + i;
        }
        int l = 0;
        int r = s;
        for(int i=0; i<n;i++){
            r = r-a[i];
            if(l == r){
                return i;
            }else{
                l = l+a[i];

            }
        }
        return -1;
    }
}
