import java.util.HashSet;
import java.util.Scanner;

public class CMinusABCSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] B = new int[m];
        for(int i=0; i<m; i++){
            B[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int[] C = new int[l];
        for(int i=0; i<l; i++){
            C[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] D = new int[q];
        for(int i=0; i<q; i++){
            D[i] = sc.nextInt();
        }
//        sumEqualsD(A, B, C, D, n, m, l, q);
        sumEqualsD2(A, B, C, D, n, m, l, q);
    }
    public static void sumEqualsD(int[] A, int[] B, int[] C, int[] D, int n, int m, int l, int q){
        HashSet<Integer> hs = new HashSet<>();
        for(int i : A){
            for(int j : B){
                hs.add(i+j);
            }
        }
        for(int d = 0; d<q; d++){
            boolean found = false;
            for(int k : C){
                int ans = D[d] - k;
                if(hs.contains(ans)){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    public static void sumEqualsD2(int[] A, int[] B, int[] C, int[] D, int n, int m, int l, int q){
        HashSet<Integer> hs = new HashSet<>();
        for(int i : A){
            for(int j : B){
                for(int k : C){
                    hs.add(i+j+k);
                }
            }
        }
        for(int d = 0; d<q; d++){
            //boolean found = false;
            if(hs.contains(D[d])){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
