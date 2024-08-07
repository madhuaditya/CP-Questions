import java.util.Arrays;
import java.util.Scanner;

public class C_Stable_Groups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int tc = sc.nextInt();
        int tc =1;
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        long k = sc.nextLong();
        long x = sc.nextLong();
       long[] arr = new long[n];
       for( int i =0; i< n ;i++) arr[i] = sc.nextLong();
       if(n ==1) {
           System.out.println(1);
           return;
       }
            Arrays.sort(arr);
            long[] diff = new long[n-1];
            for( int i =0; i<n-1; i++){
                diff[i] = arr[i+1]- arr[i];
            }
            Arrays.sort(diff);
            for( int i = 0; i<n-1; i++){
                if( diff[i]>x){
                    long a = diff[i]/(x+1);
                    if(a<=k){
                        diff[i]= x;
                        k-=a;
                    }
                    else{
                        break;
                    }
                }
            }
            long count =1;
            for( int i =0 ; i<n-1; i++){
                if( diff[i] >x) count++;
            }

            System.out.println(count);
        }
    }
}
