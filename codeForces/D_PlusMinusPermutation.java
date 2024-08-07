import java.util.Scanner;

public class D_PlusMinusPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        long n = sc.nextLong();
        long a = sc.nextLong() ;
        long b = sc.nextLong();
        long lcm = lcm(a,b);
          long firstSum =0;
          long lastSum =0;
          long countB= (n/b)-(n/lcm);
          long countA= (n/a)-(n/lcm);

//          while(countA-- > 0l){
//              firstSum+=n;
//              n--;
//          }
//          int i =1;
            firstSum = (countA)*(2*n-((countA-1)))/2l;
          lastSum = (countB)*(countB+1l)/2;
            System.out.println(firstSum-lastSum);


        }
    }
    static long lcm (long a , long b){
        return (a*b)/gcd(a,b);
    }
    static long gcd(long a,long b){
        if(b%a==0){
            return a;
        }
        return gcd(b%a, a);
    }
}
