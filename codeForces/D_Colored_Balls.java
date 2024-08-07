import java.util.Arrays;
import java.util.Scanner;

public class D_Colored_Balls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int mod=998244353;
        int N = 5001;
        int[] arr= new int[n];
            Arrays.sort(arr);
        for( int i =0; i<n; i++) arr[i] = sc.nextInt();
        int[][] dp= new int[N][N];
        int[] count= new int[N];
        dp[arr[0]][arr[0]]+=1;
        count[arr[0]]+=1;
        for( int i =1; i<n ; i++){
            for( int j =5000; j>arr[i];j--){
                dp[j][arr[i]]+=count[j-arr[i]];
                dp[j][arr[i]]%=mod;
            }
            for( int j =5000; j>arr[i];j--){
                count[j]+=count[j-arr[i]];
                count[j]%=mod;
            }
        }
        int ans =0;
        for( int i = 1; i<=5000;i++){
            for( int j = 1; j<=i; j++){
                if(j<=i/2){
                    ans+= ((i+1)/2)*dp[i][j];
                    ans%= mod;
                }else{
                    ans+= j*dp[i][j];
                    ans%=mod;
                }
            }
        }
            System.out.println(ans);


        }
    }
}
