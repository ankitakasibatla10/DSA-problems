import java.util.Scanner;

public class NumberOfSmaller {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        for(int i=0; i<m; i++){
            nums1[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++){
            nums2[j] = sc.nextInt();
        }

        smaller(nums1, m, nums2, n);
    }

    public static void smaller(int[] nums1, int m , int[] nums2, int n){
        int i = 0;
        for(int j = 0; j<n; j++){
            while(i < m  && nums1[i] < nums2[j]){
                i++;
            }
            System.out.print(i + " ");
        }
    }
}
