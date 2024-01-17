public class Appear {

    public static int appearOnce(int[] n){
        int m = n.length;
        for(int i=0; i<m; i++){
            int num = n[i];
            int count = 0;

            for(int j=0; j<m; j++){
                if(n[j] == num){
                    count++;
                }
            }
            if (count == 1) return num;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n[] = {4, 1, 2, 1, 2};
        int a = appearOnce(n);
        System.out.println("the number that appears only once is : " + a);
    }
}
