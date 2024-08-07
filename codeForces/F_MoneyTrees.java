import java.awt.font.MultipleMaster;
import java.awt.geom.Area;
import java.util.HashMap;
import java.util.Scanner;

public class F_MoneyTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] arr1 = new int[n];
        int[] arr2= new int[n];
        for(int i =0; i<n; i++){
            arr1[i] = sc.nextInt();

        }
            for(int i =0; i<n; i++){
                arr2[i] = sc.nextInt();

            }

            int maxLen = 0;
            if(n==1){
                if(arr1[0]>k){
                    System.out.println(0);
                }
                else{
                    System.out.println(1);
                }
                continue;
            }
//
//            long ans =0;
//            int len=0;
//            int left =0;
//            int right=0;
//
//            maxLen= Math.max(len, maxLen);
//            System.out.println(maxLen);
//            HashMap<Integer, Long> map = new HashMap<>();
//
//            int left =0;
//            int right =0;
//            while (right<n){
//
//            }
            int[] range = new int[n];
            range[n-1]=1;
            int count =1;
            for(int i =n-2; i>=0; i--){
                if(arr2[i]%arr2[i+1]==0){
                    count++;
                    range[i]=count;
                }
                else{
                    count=1;
                    range[i]=count;
                }
            }
            long[] preSum= new long[n];
            preSum[0]=arr1[0];
            for(int i =1; i<n; i++){
                preSum[i]=preSum[i-1]+arr1[i];
            }

            for(int i=0; i<n; i++){
                int rng = range[i];
                long rangSum= i<1? preSum[i+rng-1]:preSum[i+rng-1]-preSum[i-1];
                if(rangSum<=k){
                    maxLen= Math.max(rng, maxLen);
                }

            }
            System.out.println(maxLen);


        }
    }
}
/*
  while (right<n){

                if(right==0){
                   if(k>= arr1[0]){
                       ans+=arr1[0];
                       len++;

                   }
                   else{
                       left++;
                   }
                   maxLen= Math.max(len, maxLen);
                   right++;
                   continue;
                }
//                while (ans>k && left<=right){
//                    ans-=arr1[left];
//                    left++;
//                    len--;
//                }
//                if(ans+arr1[right]<=k && arr2[right-1]%arr2[right]==0){
//                    ans+=arr1[right];
//                    len++;
//                    maxLen= Math.max(len, maxLen);
//                }
//                else if(arr2[right-1]%arr2[right]!=0){
//                    maxLen= Math.max(len,maxLen);
//                    len=0;
//
//
//                }
                if (ans + arr1[right] <= k && arr2[right - 1] % arr2[right] == 0) {

                    ans+=arr1[right];
                    len++;
                    maxLen= Math.max(len,maxLen);
                    right++;

                }
                else if(arr2[right - 1] % arr2[right] != 0){
                    maxLen= Math.max(maxLen, len);
                    ans=0;
                    len=0;
                    if(arr1[right]<=k){
                        ans+= arr1[right];
                        left=right;
                        len++;
                    }
                    else{
                        left=right+1;
                    }
                    right++;
                }
                else {
                    if(left<right){
                        ans-=arr1[left++];
                        len-= len>0?1:0;

                    }else {
                        ans=0;
                        len=0;
                        left=right+1;
                        right++;
                    }
                }


            }
 */
