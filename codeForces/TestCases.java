//import java.util.Scanner;


    /*
     public static int binarySearch(int[] arr, int key , int start , int end ){
        if (start > end){
            return 0;
        }
        int mid = (start+end)/2;
        if(arr[mid]== key){
            System.out.println(key);
            return 1;
        }
        System.out.println(arr[mid]);
        int e = end;
        int left =  binarySearch(arr, key, start, mid-1 );
           if(left == 0) binarySearch(arr, key, mid+1, e);

         return
                 left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] arr= {3,10,4,16,7,1,2,25,0,13,9,8,5};
 binarySearch(arr,5 ,0, arr.length-1);
    }
     */


 import java.math.BigInteger;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.List;
 import java.util.Scanner;

public class TestCases {
   static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        if(word1.equals(word2)){
            return 0;
        }
        int left =0;
        int right = s.size()-1;

       for(int i =0; i < s.size(); i++){
           if(s.get(i).equals (word1)){
               if((right-left)>=0)
                   left = i;
           }
           if(s.get(s.size()-1-i).equals (word2)){
               if((right-left)>=0)
                   right = s.size()-1 -i;
           }
       }
       return Math.abs(right- left);
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

//            // Read input
//            int n = scanner.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = scanner.nextInt();
//            }
//
//            int m = scanner.nextInt();
//            int[] queries = new int[m];
//            for (int i = 0; i < m; i++) {
//                queries[i] = scanner.nextInt();
//            }
//
//            // Calculate comparisons for both approaches
//            int[] comparisons = linearSearchComparisons(n, arr, m, queries);
//
//            // Determine the winner
//            if (comparisons[0] < comparisons[1]) {
//                System.out.println("Vasya");
//            } else if (comparisons[1] < comparisons[0]) {
//                System.out.println("Petya");
//            } else {
//                System.out.println("Sasha");
//            }
//         String S = "i.like.this.program.very.much";
//         String [] str = S.split("[.]");
//         StringBuilder sb = new StringBuilder("");
//         for (int i = str.length-1; i>0; i--){
//             sb.append(str[i]+".");
//         }
//            sb.append(str[0]);
//         String str = scanner.nextLine();
//            ArrayList<String> list = new ArrayList<>();
//            list.addAll(List.of(str.split(" ")));
//          int a= shortestDistance(list,"the","fox");
//            System.out.println(a);
//            String str = scanner.next();
//            BigInteger bi = new BigInteger(str);
//            BigInteger modu = BigInteger.valueOf(7);
////            System.out.println(   bi.mod(modu));
//            if(   bi.mod(modu) == BigInteger.valueOf(0)){
//                System.out.println(1);
//            }
//            else
//                System.out.println(0);
//            long long l =
//            String sb = "2342342";
//            Long l = Long.valueOf(str);
//            System.out.println(l);
//         if(str.length()<19){
//             long l = Long.parseLong(str);
//             if(l%7==0){
//                 System.out.println(1);
//             }
//             else
//                 System.out.println(0);
//         }
//            System.out.println(str-);
//          while(str.length()> 18){
//              int z = str.length();
//              int a = Integer.parseInt(String.valueOf(str.charAt(str.length()-1)));
//              a *= 2;
//              int x = Integer.parseInt( str.substring(z-4, z-1));
//                x -= a;
//                StringBuilder st  = new StringBuilder( str.substring(0,z-4));
//                st.append(x);
//                str= st.toString();
//          }
////            System.out.println(str);
//            long l = Long.parseLong(str);
//            if(l%7==0){
//                 System.out.println(1);
//             }
//             else
//                 System.out.println(0);

            System.out.println(encryptString("abc"));

        }
    static String encryptString(String str){
        // code here
        if(str.length()<2){
            return str;
        }
        int count =0;
        int left =0;
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i< str.length(); i++){
            if((i> 0 && str.charAt(left) != str.charAt(i))|| i == str.length()-1){
                if(count>9 ){
                    StringBuilder hexa = new StringBuilder(Integer.toHexString(count));
                    sb.append(str.charAt(left));
                    sb.append(hexa.reverse());
                    count =1;
                    left = i;
                }
                else{
                    sb.append(str.charAt(left));
                    sb.append(count);
                    count = 1;
                    left =i;
                }
            }
            else{
                count++;
            }

        }
//        System.out.println(count);
////        System.out.println(left);
if(left <str.length()){
    sb.append(str.charAt(left));
    sb.append(count);
}
        return sb.reverse().toString();
    }
        public static int[] linearSearchComparisons(int n, int[] arr, int m, int[] queries) {
            // Simulate linear search starting from the 1st element to the nth
            int comparisonsVasya = 0;
            for (int query : queries) {
                comparisonsVasya += linearSearch(arr, query) + 1;
            }

            // Simulate linear search starting from the nth element to the 1st
            int comparisonsPetya = 0;
            for (int query : queries) {
                comparisonsPetya += n - linearSearchReverse(arr, query);
            }

            return new int[]{comparisonsVasya, comparisonsPetya};
        }

        public static int linearSearch(int[] arr, int key) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    return i;
                }
            }
            return -1; // Not found
        }

        public static int linearSearchReverse(int[] arr, int key) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == key) {
                    return i;
                }
            }
            return -1; // Not found
        }
    }

