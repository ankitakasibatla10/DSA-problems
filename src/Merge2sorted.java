public class Merge2sorted {
    public static void main(String[] args) {
        int[] a1 = {5, 8, 9,};
        int[] a2 = {4, 7, 8};
        int n1 = 3;
        int n2 = 3;
        int[] a3 = new int[n1+n2];
        merge(a1, a2, n1, n2, a3);
    }
    public static void merge(int[] a1, int[] a2, int n1, int n2, int[] a3){
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a1[i] < a2[j]){
                a3[k] = a1[i];
                k++;
                i++;
            }else{
                a3[k] = a2[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            a3[k] = a1[i];
            k++;
            i++;
        }
        while(j<n2){
            a3[k] = a2[j];
            k++;
            j++;
        }
        for(int l=0; l<a3.length;l++){
            System.out.print(a3[l]);
        }
    }
}
