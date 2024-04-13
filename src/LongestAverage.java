public class LongestAverage {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4; //length
        System.out.println(longest(arr, k));
    }
    public static double longest(int[] arr, int k){
        int i=0;
        int j=0;
        double sum = 0;
        double avg = Double.NEGATIVE_INFINITY;
        for(j = 0; j<arr.length; j++){
            sum = sum + arr[j];

            if(j-i+1 > k){
                sum = sum - arr[i];
                i++;
            }
            if(j-i+1 == k){
                double avg1 = sum/k;
                avg = Math.max(avg, avg1);
            }

        }
        return avg;

    }
}
