public class CeilFloor {
    public static void main(String[] args) {
        int[] a = {1, 2, 8, 10, 10 ,12 , 19};
        int n = a.length;
        int x = 5;
        //System.out.println(findCeil(a, n, x));
        System.out.println(findFloor(a, n, x));
    }
    public static int findCeil(int[] a, int n, int x){
        int s = 0, e = n-1;
        int ans = -1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(x==a[m]){
                ans = a[m];
            }else if(x < a[m]){
                ans = a[m];
                e = m-1;
            }else{
                s = m + 1;
            }
        }
        return ans;
    }
    public static int findFloor(int[] a, int n, int x){
        int s = 0, e=n-1;
        int ans = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(x==a[m]){
                ans = a[m];
            } else if(x < a[m]){
                e = m-1;
            }else {
                ans = a[m];
                s=m+1;
            }
        }
        return ans;
    }
}
