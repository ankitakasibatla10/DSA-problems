public class String1 {
    public static void main(String[] args) {
        String a = "Ank";
        String b = "Ank";
        String c = new String("Ank");
        String d = new String("Ank");
        System.out.println(a==b);
        System.out.println(c==d);

        char[] a1 = {'j', 'a', 'v', 's'};
        String s = new String(a1);
        System.out.println(s);

        String s1 = new String(a1, 0, 2);
        System.out.println(s1);
        System.out.println(s.charAt(3));
        System.out.println(s.length());
//        System.out.println(s[2]); error

        String s2 = new String("Ank");
        String s3 = new String("Ank");
        String s4 = new String("ank");
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s4));

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("ank");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append("sai");
        sb.append("sai");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append("kasibatla");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append("myname");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.ensureCapacity(20);
        System.out.println(sb1);
        sb1.ensureCapacity(70);
        System.out.println(sb1.capacity());

        StringBuffer sb3 = new StringBuffer("ankitasai");
        System.out.println(sb3.charAt(2));
        sb3.setCharAt(2, 'l');
        System.out.println(sb3);
        sb3.delete(1, 2);
        System.out.println(sb3);
        sb3.reverse();
        System.out.println(sb3);
        sb3.replace(2, 6, "kas");
        System.out.println(sb3);


        System.out.println(isPalindrome("malayalam"));
        System.out.println(isPalindrome("naveen"));

        String string1 = "abc";
        String string2 = "cab";
        System.out.println(isPermutation(string1, string2));


        String sub1 = "industry";
        showSubs(sub1);
        showSub2(sub1);

        String subb1 = "2(ab)4(cd)";

        //expand(subb1);


    }
    public static boolean isPalindrome(String str){
        int i, j;
        for(i=0, j=str.length()-1; i<j; i++, j-- ){
            char l = str.charAt(i);
            char r = str.charAt(j);
            if(l!=r){
                break;
            }
        }
        if(i<j){
            return false;
        } else{
            return true;
        }
    }

    public static boolean isPermutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int l = s1.length();
        int[] arr = new int[256];
        int i;
        char x;
        for(i=0; i<l; i++){
            x = s1.charAt(i);
            arr[x]++;
            x = s2.charAt(i);
            arr[x]--;
        }
        for(i=0; i<arr.length; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void showSubs(String str){
        int l = str.length();
        for(int i=0; i<l; i++){
            for(int j=i; j<l; j++){
                System.out.print(str.substring(i, j+1) + " ");
            }
        }
        System.out.println();
    }

    public static void showSub2(String str){
        int l = str.length();
        for(int i=0; i<l; i++){
            StringBuffer sb = new StringBuffer();
            for(int j=i; j<l; j++){
                sb.append(str.charAt(j));
                System.out.print(sb + " ");
            }
        }
    }

//    public static void expand(String str){
//        StringBuffer sb = new StringBuffer();
//        int i, j, k;
//        for(i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            int n = ch-'0';
//            StringBuffer temp = new StringBuffer();
//            for(j=i+2; str.charAt(j) != ")"; j++){
//                temp.append(str.charAt(j));
//            }
//            for(k=1; k<=n;k++){
//                sb.append(temp);
//            }
//            i=j;
//        }
//        System.out.println(sb);
//    }
}
