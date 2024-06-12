import java.util.Scanner;
import java.util.Arrays;

public class ContestProposal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            System.out.println(minNewProb(a, b, n));
        }

    }

    public static int minNewProb(int[] a, int[] b, int n) {
        int newProblems = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && a[i] > b[j]) {
                j++;
                newProblems++;
            }
            if (j == n) {
                newProblems += (n-i);
                break;
            }
            j++;
        }

        return newProblems;
    }
}
