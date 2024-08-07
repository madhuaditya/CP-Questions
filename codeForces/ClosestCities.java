import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ClosestCities {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static <T> void sysout(T obj){
        System.out.print(obj);
    }
    static <T> void sysoutln(T obj){
        System.out.println(obj);
    }
    static int forwerPay(int[] arr , int start , int end , int[][] dp){
        if(start== end ){
            dp[start][1]= 0;
            return 0;
        }
        if(dp[start][1]!=0){
            return dp[start][1];
        }
        if(start==0){
            int a = 1+ forwerPay(arr, start+1, end,dp);
            dp[start][1]= a;
            return a;

        }
        else {
            if (Math.abs(arr[start]-arr[start+1])<Math.abs(arr[start]-arr[start-1])){
                int a = 1+ forwerPay(arr, start+1, end, dp);
                dp[start][1]= a;
                return a;

            }
            else {
                int a= Math.abs(arr[start]-arr[start+1])+forwerPay(arr, start+1,end,dp);
                dp[start][1] = a;
                return a;

            }
        }

    }
    static int fbackPay(int[] arr , int start , int end , int[][] dp){
        if(start== end ){
            dp[start][0]= 0;
            return 0;
        }
        if(dp[start][0]!=0){
            return dp[start][0];
        }
        if(start==arr.length-1){
            int a = 1+ fbackPay(arr, start-1, end,dp);
            dp[start][0]= a;
            return a;
        }
        else {
            if (Math.abs(arr[start]-arr[start+1])>Math.abs(arr[start]-arr[start-1])){
                int a = 1+ fbackPay(arr, start-1, end, dp);
                dp[start][0]= a;
                return a;

            }
            else {
                int a= Math.abs(arr[start]-arr[start-1])+fbackPay(arr, start-1,end,dp);
                dp[start][0] = a;
                return a;

            }
        }

    }
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- >0){

            int n = fs.nextInt();
            int[] arr= new int[n];
            for(int i =0; i<n; i++){
                arr[i] = fs.nextInt();
            }
            int[][] dp = new int[n][2];
            forwerPay(arr, 0,n-1 ,dp);
            fbackPay(arr, n-1,0,dp);
            int x = fs.nextInt();
            while (x-- >0){
                int start = fs.nextInt();
                int end = fs.nextInt();
                start--;
                end--;
              if(end>start)
                System.out.println(Math.abs(dp[start][1]- dp[end][1]));
              else
                  System.out.println(Math.abs(dp[start][0]-dp[end][0]));

            }
        }
        }
}
//                start--;
//                end--;
//                int max = Math.abs(arr[start] - arr[end]);
//                while ((start)!= (end)){
//                    if(visted[city[start][1]]){
//                        pay = pay+ Math.abs(arr[start]-arr[end]);
//                        break;
//                    }
//                    else {
//                        visted[start]= true;
//                        pay++;
//                        start = city[start][1];
//
//                    }
//                    max = Math.min(pay +  Math.abs(arr[start] - arr[end]), max);
//                }
//                pay = Math.min(max, pay);
//                System.out.println(pay);
/*
            for(int i = 0; i< n; i++){
                if(i == 0){
                    city[i][0]= i;
                    city[i][1] = i+1;
                }
                else if(i == n-1){
                    city[i][0]= i;
                    city[i][1] = i-1;
                }
              else  if(Math.abs(arr[i]-arr[i-1])<Math.abs(arr[i]-arr[i+1])){
                    city[i][0]= i;
                    city[i][1] = i-1;
                }
              else {
                    city[i][0]= i;
                    city[i][1] = i+1;
                }

            }
 */