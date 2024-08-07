import java.sql.Struct;

public class DP_Day001 {
    public static int febonacci(int n) {
//        if(n ==0 || n ==1){
//            return n;
//        }
//        if(arr[n] != 0){
//            return arr[n];
//        }
//        int a = febonacci(n-1, arr)+febonacci(n-2, arr);
//        arr[n]= a;
//        return a;
        int dp[] = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        return 420;
    }

    // count number of ways to to go to in a top of stairs.
//    public static int stairsWay(int sta)
//    {
//        if(sta==0){
//            return 1;
//        }
//        if(sta<0)
//            return 0;
//
//        int a= stairsWay(sta-1)+stairsWay(sta-2);
//        return a;
//    }
    public static int stairsWay(int sta)//, int dp[]
    {
//        if(sta==0){
//            return 1;
//        }
//        if(sta==1)
//            return 1;
//     if(dp[sta]!= 0){
//         return dp[sta];
//
//     }
//        int a= stairsWay(sta-1, dp)+stairsWay(sta-2,dp);
//        dp[sta]= a;
//        return a;

        int[] dp = new int[sta+1];
        dp[0]= 1;
        dp[1]= 1;
        for (int i = 2; i <=sta; i++) {
            dp[i]= dp[i-1]+dp[i-2];
        }
        return dp[dp.length-1];
    }
//
    // tabulation mat hod


    // all cobination of any distinct alphabets

    public static int lcs(String a , String b , int m , int n )
    {
     if(m==0||n==0)
        {
            return 0;
        }      if(a.charAt(m-1)==b.charAt(n-1)){
            return 1+lcs(a,b,m-1,n-1);
        }
        else {
       return Math.max(lcs(a,b,m-1,n),lcs(a,b,m,n-1));
        }
    }

    // frog jump
    public static int frogJump(int[] arr , int i , int ans){
        if(i== 0)
            return ans;
        if(i == 1){
            return ans +Math.abs(arr[i] -arr[i-1]);
        }
        return Math.min(frogJump(arr,i-1,ans+Math.abs(arr[i] -arr[i-1])),frogJump(arr, i-2,ans+Math.abs(arr[i] -arr[i-2])));
    }
    public static int frogJumpDP(int[] arr , int i , int[] dp){
        if(i== 0)
            return 0;
        if(i == 1){
            return Math.abs(arr[i] -arr[i-1]);
        }
        if(dp[i]!= 0){
            return dp[i];
        }
//        dp[i ]= ans ;`
//        int a= Math.min(frogJumpDP(arr,i-1,ans+Math.abs(arr[i] -arr[i-1]),dp),frogJumpDP(arr, i-2,ans+Math.abs(arr[i] -arr[i-2] ),dp));

         int left = frogJumpDP(arr, i-1,dp)+Math.abs(arr[i] -arr[i-1]);
        int right = frogJumpDP(arr, i-2,dp)+Math.abs(arr[i] -arr[i-2]);
        int a = Math.min(left, right);
//        if(dp[i]!=0)
//        dp[i]= a<dp[i]?a:dp[i];
//        else
            dp[i] = a;
        return a;

    }
    public static int frogJumpTB(int[] arr ){
//        int[] dp = new int[arr.length];
//
//        dp[1]= 20;

        int prev =0;
        int prev2 = 20 ;
        int curr =0;

        for(int i =2; i< arr.length;i++)
        {
            int firstStep =  prev2+Math.abs(arr[i]-arr[i-1]);

            int secStep =  prev+Math.abs(arr[i]-arr[i-2]);
            curr  = Math.min(firstStep, secStep);
            prev= prev2 ;
            prev2 = curr    ;
        }
        return curr;
    }

    // kthJump
    public static int kthJum(int[] arr , int k){
        if (k > arr.length-1){
            return  0;
        }
        int dp[] = new int[arr.length];
        for(int i =0; i<k;i++)
        {
            dp[i]= Math.abs(arr[0]-arr[i]);
        }
        for(int i =k; i<arr.length;i++){
            int curr = Integer.MAX_VALUE;
            for (int j = i-1;j>=i-k;j--){
                int step = dp[j]+ Math.abs(arr[j]-arr[i]);
                curr = Math.min(curr, step);
            }
            dp[i] = curr;
        }
        return dp[dp.length-1];
    }
    public static void main(String[] args) {
//        System.out.println("Madhurendra pratap singh");
        // foibonacci serise
//        System.out.println(febonacci(100));
//        System.out.println(stairsWay(47, new int[51]));

//        System.out.println(lcs("abcdgh", "aedfhr",6,6));
        //
//        int dp[ ] = new int[7];
//        System.out.println(stairsWay(4));
//         int[] arr={30,10,60,10,60,50,30,5,3,234,45,531,345,4,543,34,5,33,23,210,10,20};
        int[] arr = {30,10,60,10,60,50};
        long startTime = System.nanoTime();
//        System.out.println(frogJumpDP(arr, arr.length-1,dp));
//        System.out.println(frogJumpTB(arr));
        System.out.println(kthJum(arr, 2));
        long stopTime = System.nanoTime();

        System.out.println(stopTime - startTime);

    }

}
