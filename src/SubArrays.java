public class SubArrays {

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int n = a.length;


        for(int i=0; i<n; i++){
           for(int j=i; j<n; j++){

               for(int k=i; k<j; k++){
                   System.out.println(a[k] + " ");
               }
               System.out.println();

           }
        }
    }
}
