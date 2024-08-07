import java.util.HashSet;
import java.util.Scanner;

public class C_How_Does_the_Rook_Move {
    static         int mod = 1000000007;
   static long ways( int n , long[] dp){
        if(n<=1) return  1;
        if(dp[n]!=0) return dp[n];
        dp[n] = (ways(n-1,dp)%mod + (((n-1)%mod * ways(n-2,dp)%mod)%mod*2) ) %mod;
        return dp[n] ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int k = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for( int i =0; i<k ; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                set.add(a);
                set.add(b);
            }
        long[] dp = new long[n+1];
            long ans = ways(n- set.size(), dp);
            System.out.println(ans);





        }
    }
}
