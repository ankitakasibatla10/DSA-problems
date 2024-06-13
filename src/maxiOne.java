public class maxiOne {
    public static void main(String[] args) {

        int[] a1 = {1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0 ,1 , 1, 1, 0, 1};

        System.out.println(greatones(a1));
    }
    public static int greatones(int[] a){
        int c = 0;
        int m = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] == 1){
                c++;
            }else{
                c=0;
            }
            m = Math.max(m, c);
        }
        return m;
    }
}
