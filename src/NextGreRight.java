public class NextGreRight {
    public static void main(String[] args) {
        int n = 4;
        int[] a1 = {1, 3, 2, 4};

        nextGreat(a1,n);
    }
    public static void nextGreat(int[] a, int n){
        for(int i=0; i<a.length; i++){
            int next = -1;
            for(int j=i+1; j<n; j++){
                if(a[j] > a[i]){
                    next = a[j];
                    break;
                }
            }
            a[i] = next;
        }
        for(int j : a){
            System.out.print(j);
        }

    }
}
