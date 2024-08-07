import javax.print.DocFlavor;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C_Grandma_Capa_Knits_a_Scarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0) {
            // code here
            int n = sc.nextInt();
            String str = sc.next();
            int ans = Integer.MAX_VALUE;
            for( int i = 'a' ; i<='z' ; i++){
                int chang =0;
                int l =0;
                int r =n-1;
                while (l<= r){
                    if( str.charAt(l)!=str.charAt(r)){
                        if((char)i == str.charAt(l)){
                            l++;
                            chang++;
                        }
                        else if((char)i == str.charAt(r)){
                            chang++;
                            r--;

                        }
                        else {
                            chang= Integer.MAX_VALUE;
                            break;
                        }
                    }else {
                        l++;
                        r--;
                    }
                }
                ans = Math.min(ans, chang);

            }
            if( ans == Integer.MAX_VALUE)
                System.out.println(-1);
            else
                System.out.println(ans);

//            int left = 0;
//            int right = n - 1;
//            char ch1 = ' ';
//            char ch2=' ';
//
//            while (left < right) {
//                if (str.charAt(left) != str.charAt(right)) {
//                    ch1 = str.charAt(left);
//                    ch2 = str.charAt(right);
//                    break;
//                }
//                left++;
//                right--;
//
//            }
//           if(ch1==' '){
//               System.out.println(0);
//
//           }
//           else{
//               Deque<Character> dq1 = new ArrayDeque<>();
//               Deque<Character> dq2 = new ArrayDeque<>();
//
//               while (left<right){
//                   if(str.charAt(left)== str.charAt(right)){
//                       left++; right--;
//
//                   }
//                   if()
//               }
//               boolean bl1 =true;
//               boolean bl2 =true;
//               left=0;
//               right= sb1.length()-1;
//               while (left<right){
//                   if(sb1.charAt(left)!=sb1.charAt(right)){
//                       bl1=false;
//                       break;
//                   }
//                   left++;
//                   right--;
//
//               }
//               left =0;
//               right= sb2.length()-1;
//               while (left<right){
//                   if(sb2.charAt(left)!=sb2.charAt(right)){
//                       bl2=false;
//                       break;
//                   }
//                   left++;
//                   right--;
//
//               }
//               if(bl1){
//                   System.out.println(n-sb1.length());
//               }
//               else if(bl2){
//                   System.out.println(n-sb2.length());
//               }
//               else
//                   System.out.println(-1);
//           }


        }
    }
}
