import java.util.Arrays;
import java.util.Scanner;

public class C_Less_or_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int k =sc.nextInt();
        int[] arr = new int[n];
        for( int i =0; i<n ; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);

           if(k==0){
               if(arr[0] >1){
                   System.out.println(arr[0]-1);
               }
               else {
                   System.out.println(-1);

               }
               return;
           }
           if(n==1){
               if(arr[0]>1){
                   System.out.println(arr[0]);
               }
               else {
                   System.out.println(-1);

               }
               return;
           }
            if(n==k){
                System.out.println(arr[k-1]);
                return;
            }
            if(arr[k] - arr[k-1]<1){
                System.out.println(-1);
                return;
            }
            else {
                System.out.println(arr[k]-1);
            }
        }
    }
}
