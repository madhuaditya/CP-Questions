import java.util.Scanner;

public class C_YarikandArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++) arr[i]= sc.nextInt();
        long maxSum = arr[0];
        long currSum = arr[0];
        for(int i =1; i<n ; i++){
            if(currSum<0 ){
                currSum=0;

            }
            currSum +=arr[i];
            if( ((arr[i-1]&1)^(arr[i]&1))==0 || currSum<0 ){
//                if(currSum<0 ){
//                    maxSum= Math.max(maxSum,currSum);
//                    currSum=0;
//
//                }else {
//                    currSum = arr[i];
//
//                    maxSum = Math.max(maxSum, arr[i]);
//                }
//                continue;
                currSum= arr[i];
            }

            maxSum= Math.max(maxSum,currSum);


        }
            System.out.println(maxSum);
        
        
        }
    }
}
