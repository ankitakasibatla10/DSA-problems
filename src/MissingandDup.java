public class MissingandDup {
//    public static void main(String[] args) {
//        int[] a1 = {  3, 4, 7,  6, 7};
//
//        missing(a1);
//    }
//    public static void missing(int[] a){
//        for(int i=0; i<a.length; i++){
//            if(a[i] != i+1){
//                int missing = i + 1;
//                int dup = a[i];
//                System.out.println(missing);
//                System.out.println(dup);
//            }
//        }
//    }
//}

//public class MissingandDup {
//    public static void main(String[] args) {
//        int[] a1 = {3, 4, 7, 6, 7};
//
//        int[] result = findMissingAndDuplicate(a1);
//        System.out.println("Duplicate: " + result[0]);
//        System.out.println("Missing: " + result[1]);
//    }
//
//    public static int[] findMissingAndDuplicate(int[] a) {
//        int n = a.length;
//        int duplicate = -1, missing = -1;
//
//        // Traverse the array
//        for (int i = 0; i < n; i++) {
//            int absValue = Math.abs(a[i]);
//
//            // If the value at the index corresponding to the absolute value is negative, it's a duplicate
//            if (a[absValue - 1] < 0) {
//                duplicate = absValue;
//            } else {
//                // Mark the value at that index as visited by making it negative
//                a[absValue - 1] = -a[absValue - 1];
//            }
//        }
//
//        // Traverse the array again to find the missing number
//        for (int i = 0; i < n; i++) {
//            if (a[i] > 0) {
//                missing = i + 1;
//                break;
//            }
//        }
//
//        return new int[]{duplicate, missing};
//    }
}
