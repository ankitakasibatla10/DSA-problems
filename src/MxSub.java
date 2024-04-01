import java.util.ArrayList;

public class MxSub {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, -1, 5, -3};
        ArrayList<Integer> ans = maxSub(arr);
        for(int i : ans){
            System.out.print(i + " ");
        }

    }
    public static ArrayList<Integer> maxSub(int[] arr){
        ArrayList<Integer> a = new ArrayList<>();
       int start = 0;
       int newstart = -1;
       int end = -1;
       int sum = 0;
       int max = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
           sum = sum + arr[i];

           if(sum < 0){
               sum = 0;
               start = i + 1;
           }
           if(sum > max){

               max = sum;
               newstart = start;
               end = i;

           }

       }
        a.add(newstart);
        a.add(end);
        return a;
    }
}
