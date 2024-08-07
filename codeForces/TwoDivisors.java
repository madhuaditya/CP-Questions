import java.util.Scanner;

public class TwoDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt() ;


                if (b % a == 0){
                    System.out.println(b / a * b);
                }
                else{
                    System.out.println(b / gcd(a,b) * a);
                }

        }
    }

    public static int gcd(int a, int b){
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
//            int x = gcd(a,b);
//            int n = findLCM(a,b);
//            for(int i = b ; i<= x; i+=b){
//                if(i==b)
//                    continue;
//                if(i%a==0 && i%b == 0){
//                    System.out.println(i);
//                    break;
//                }
//            }
//            System.out.println(a*b);
//    public static int findLCM(int a, int b)
//    {
//        int greater = Math.max(a, b);
//        int smallest = Math.min(a, b);
//        for (int i = greater;; i += greater) {
//            if (i % smallest == 0)
//                return i;
//        }
//    }