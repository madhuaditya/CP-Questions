import java.util.Scanner;

public class C_Scoring_Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int[] arr= new int[n];
        for( int i =0;i<n; i++) arr[i] = sc.nextInt();


//            int j = 1, i = 0, len = 1, curr = 0;
//            while (curr < n)
//            {
//                while (arr[i] < j) {
//                    len--; j--; i++;
//                }
//                System.out.print(len+" ");
//                j++; len++;
//                curr++;
//            }
            for(int i=1;i<=n;i++) {

                int index = bs(0, i - 1, arr);


                System.out.print((i - index) + " ");

            }
            System.out.println();



        }
    }
    public static int bs(int st,int en,int[] a1){
        int lo=st;
        int hi=en;

        int ans=-1;
        while(lo<=hi){

            int mid=(lo+hi)/2;
            if((a1[mid]/(en-mid+1))>=1){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }

        return ans;

    }
//    static int binSearch(int s , int e,int i, int[] arr){
//        if(s<=e){
//            int m = (s+e)/2;
//            if(arr[m]>(i-m+1)){
//                if(m>1 && arr[m-1]>=(i-(m-1)+1)){
//                    return binSearch(s,m-1,i,arr);
//                }
//                else return m;
//            }
//            else {
//                return binSearch(m+1,e,i,arr);
//            }
//        }
//        return -1;
//    }
}
//1 1 1 2 3 3 3
//1 2 2 2 2 3 4 5
/*
//    static int solve( long[] prefixSum , int start, int end , int[] arr){
//        if(end==0){
//            return 1;
//        }
//
//
//
////        while (start<= en){
//////            int mid = (start)+ ((en-start)/2);
//////            double curr = (double) (prefixSum[end] / ((mid > 0) ? prefixSum[mid - 1] : 1)) /factorial(end-mid+1);
//////            if(max>curr|| Math.abs(max-curr)<1e-9){
//////                if(Math.abs(max-curr)<1e-9) ans = Math.max(ans, end-mid+1);
//////                start= mid+1;
//////            }else {
//////                max = curr;
//////                ans =  end-mid+1;
//////                en = mid-1;
//////            }
////        }
//           double max =1;
//
//        int ans = 1;
//         long  mul =1;
//        for( int i = end; i>=start; i--)
//        {
////            double curr =  (((double)(prefixSum[end])) / ((double)((i > 0) ? prefixSum[i - 1] : 1))) /((double)factorial(end-i+1));
//            mul *= arr[i];
//            double curr = (double) mul/ (double) factorial(end-i+1);
//           if(curr>max){
//               ans = end -i+1;
//               max = curr;
//           }
//           else if(Math.abs( max - curr)<1e-9) {
//               ans = Math.max(ans, end-i+1);
//           }
//           else {
//               break;
//           }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tc = sc.nextInt();
//        while(tc-- >0){
//        // code here
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for( int i =0; i<n; i++) arr[i]= sc.nextInt();
//
//        long[] prefSum = new long[n];
//        long sum = 1;
//        for( int i =0; i<n ; i++){
//            sum*=arr[i] ;
//            prefSum[i] = sum ;
//        }
//       long[] ans = new long[n];
//        for( int i =0; i<n ; i++){
//
//            ans[i] = solve(prefSum, 0,i,arr);
//        }
//            Arrays.sort(ans);
//        for( int i =0; i<n; i++){
//            System.out.print(ans[i] +" ");
//        }
//            System.out.println();
//
//
//        }
//    }
//    static  long factorial( int n){
//        if(n==0||n ==1){
//            return 1;
//        }
//        return n*factorial(n-1);
//    }
 */