public class recursion {
   //printing n-1:
//    static void func(int i, int n){
// //        if(i<1) return;
////          System.out.println(i);
////
////       func(i-1, n);
//        if(i>n) return;
//        func(i+1, n);
//        System.out.println(i);
//    }
//    public static void main(String[] args){
//    int n = 4;
//    func(1,n);
  //  }

    //printing 1-n:
    static void func(int i, int n){
//        if(i>n) return;
//        System.out.println(i);
//
//        func(i+1, n);
        if(i<1) return;
        func(i-1, n);
        System.out.println(i);
        System.out.println("Ankita");
    }

    public static void main(String[] args){
        int n=6;
        func(n,n);
    }
}