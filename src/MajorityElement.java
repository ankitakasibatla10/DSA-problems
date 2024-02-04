public class MajorityElement {

    public static int majorityEle1(int []a){
        int n = a.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(a[j] == a[i]){
                    count++;
                }
            }
            if(count > n/2){
                return a[i];
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        int[] a = {2, 2, 1, 2, 1, 1, 2};

        int ans = majorityEle1(a);
        System.out.println("the majority ele is:" + ans);
    }
}
