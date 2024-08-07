import java.util.Scanner;

public class B_AND_0_Sum_Big {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
//        tc= 1;
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int k = sc.nextInt();
//            System.out.println((1<<9) * 10);
            long ans =1;
            int mod = 1000000007;
        for( int i =0; i<k; i++){
            ans = (ans*n)%mod;
        }
            System.out.println(ans);

        }
    }

}
