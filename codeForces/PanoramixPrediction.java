import java.util.Scanner;

public class PanoramixPrediction {
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in  );
        int a = sc.nextInt();
        int b = sc.nextInt() ;
        a++;
          while(true){
             if(isPrime(a)) {

                 break;
             }
             a++;
          }
          if(a==b){
              System.out.println("YES");
          }
//          else if(a<b){
//              System.out.println("YES");
//          }
          else{
              System.out.println("NO");
          }

    }
}
