import java.util.Scanner;

public class MergeTwoSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        merge(nums1, m, nums2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int i=0;
        int j=0;
        while(i<m || j<n){
            if(i<m && (j >= n || nums1[i] < nums2[j])){
                ans[i+j] = nums1[i];
                i++;
            }else{
                ans[i+j] = nums2[j];
                j++;
            }
        }
        for(int it: ans){
            System.out.print(it + " ");
        }
    }
}

//6 7
//        1 6 9 13 18 18
//        2 3 8 13 15 21 25
