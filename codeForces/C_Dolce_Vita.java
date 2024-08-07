import java.util.Arrays;
import java.util.Scanner;

public class C_Dolce_Vita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for( int i =0; i<n; i++){
        arr[i]= sc.nextInt();

        }
            Arrays.sort(arr);
        long day =0;
        int right =n-1;
        long[] preSum = new long[n];
            long sum = 0;
            for( int i =0; i<n; i++){
                sum+= arr[i];
                preSum[i]= sum;
            }
        long ans =0;
        while (right>=0){
           long Sum = preSum[right]+  day *(right+1);
            if(Sum>k){
                right--;
                continue;
            }
            long t= (((k-Sum)/(right+1)) + 1);
            ans += t*(right+1);
            day+=t;
            right--;
        }
            System.out.println(ans);
        }
    }
}
