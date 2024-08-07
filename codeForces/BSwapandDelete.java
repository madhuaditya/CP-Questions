import java.util.Scanner;

public class BSwapandDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int tc = sc.nextInt();
        while (tc-- > 0 ){
            String str = sc.next();
            int n = str.length();
//            int zero = 0;
//            int one =0;
//            for( int i =0; i<str.length(); i++){
//                if(str.charAt(i)=='1')
//                    one++;
//                else
//                    zero++;
//            }
//            int min = Math.min(one, zero);
//            if(min == 0){
//                System.out.println(str.length());
//            }
//            else{
//                System.out.println(str.length()-2*min);
//            }
            boolean[] bl = new boolean[n];
            int left = 0;
            int right = 0;
            while (right<n ){
                if(bl[left]){
                    left++;
                    if(left== right)
                        right++;
                } else if (str.charAt(left)== str.charAt(right)) {
                    right++;
                }
                else{
                    bl[left]=true;
                    bl[right]= true;
                    left++;
                    right++;
                }
            }
           int i =0;
            for( ; i<n; i++){
                if(!bl[i])
                    break;
            }
            System.out.println(n-i);

        }
    }
}
