public class FactofLarge {
    public static void main(String[] args) {
        int a = 1210;
        facto(a);
    }

    public static void facto(int a){
        int[] res = new int[500];
        while (a > 0){
            for(int i = 499; i >= 0; ){
                res[i] = a%10;
                i--;
                a = a/10;
            }
            break;
        }


        for(int ans : res){
            System.out.println(ans + " ");
        }
    }
}
