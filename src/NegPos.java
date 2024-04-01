public class NegPos {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 8, -9, -7, -6, 5};   // {1, 3, 8, 5, -1, -9, -7, -6}

        neg(arr);
    }

    public static void neg(int[] arr) {
        int pos = 0;
        int neg = arr.length - 1;
        while (pos <= neg) {
            if (arr[pos] < 0 && arr[neg] > 0) {
                int temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
                pos++;
                neg--;
            } else {
                if (arr[pos] >= 0) {
                    pos++;
                } if (arr[neg] < 0) {
                    neg--;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
