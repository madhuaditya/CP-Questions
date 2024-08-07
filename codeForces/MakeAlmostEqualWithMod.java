import java.util.HashSet;
import java.util.Scanner;

public class MakeAlmostEqualWithMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int  n = sc.nextInt();
            HashSet<Long > arr = new HashSet<>();

        boolean even = false;
        boolean odd = false;

        for(int i =0; i<n; i++){
          long a = sc.nextLong();
          if(a%2==0)
              even = true;
          else
              odd= true;
               arr.add(a);
          }
        if(even && odd){
            System.out.println(2);
            continue;
        }

          boolean bl = false;
          for(int i =1; ; i++){
             boolean check = true;
             long prev =0;
             for (long ele :arr){
                 long a = ele % (1l<<i);
                 if(check){
                     check = false;
                     prev = a;
                 }
                else if(a!= prev){
                     prev = 1l<< i;
                     bl = true;
                     break;
                 }
             }
             if(bl){
                 System.out.println(prev);
                 break;
             }

          }



        }

    }

}
/*
static long gcd(long a, long b)
    {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
 */
