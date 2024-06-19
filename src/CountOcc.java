public class CountOcc {
    public static void main(String[] args) {
        int[] a = {2, 4, 10, 10, 10, 18, 20};
        int n = a.length;
        int k = 10;
        System.out.println(countOcc(a, n, k));
    }
    public static int countOcc(int[] a, int n, int k){
        int s = 0, e=n-1;
        int f=-1, l=-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(k == a[m]){
                f=m;
                e=m-1;
            }else if(k < a[m]){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        s = 0;
        e = n-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(k == a[m]){
                l = m;
                s=m+1;
            }else if(k < a[m]){
                e=m-1;
            }else{
                s = m+1;
            }
        }

        if(f==-1 && l==-1){
            return 0;
        }

        return l-f+1;

    }
}
