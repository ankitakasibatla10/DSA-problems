public class LinearSearch {
    public static int linear(int[] a, int n, int num){
        for(int i=0; i<n; i++){
            if(a[i] == num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {6, 7, 8, 9, 1};
        int n = 5;
        int num = 9;
        int val = linear(a, n, num);
        System.out.println(val);

    }
}
