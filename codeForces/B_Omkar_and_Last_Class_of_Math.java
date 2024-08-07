import java.util.Scanner;

public class B_Omkar_and_Last_Class_of_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();

//      for(int j =2 ; j <= 49; j++){
//          int n=j;
          if(n%2==0){
              System.out.println(n/2+" " + n/2);
          }
          else {


                 for( int i =1 ; i<n; i++){
                     if(n%(1+i)==0){
                         int t = n /(i+1);
                         System.out.println(t +" "+((i)*t));
                         break;
                     }
                 }

              }
          }
//          int t=1;
//          int gcd = n;
//          for( int i = 1; i<n/2; i++) {
//              if(lcm(i, n-i)<gcd){
//                  t=i;
//              }
//          }
//          System.out.println(t+" " + (n-t));
//          System.out.println();
//          System.out.println();
//      }

    }
//    static int gcd(int a, int b)
//    {
//        if (a == 0)
//            return b;
//        return gcd(b % a, a);
//    }
//
//    // method to return LCM of two numbers
//    static int lcm(int a, int b)
//    {
//        return (a / gcd(a, b)) * b;
//    }
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        // Check if n=2 or n=3
        if (n == 2 || n == 3)
            return true;

        // Check whether n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
