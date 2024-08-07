import java.util.Scanner;

public class B_Just_Eat_It {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum =0;
        boolean check = true;
        boolean zero = true;
        for( int i =0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
            if( arr[i] <0) check = false;
            if( arr[i] !=0)  zero = false;
            sum+= arr[i];

        }

        if( zero){
            System.out.println("NO");
            continue;
        }
        if(check ) {
            System.out.println("YES");
            continue;
        }

        long curr=0 ;
        long ans = Long.MIN_VALUE;
        for( int i =0  ; i<n-1 ; i++){
            curr = Math.max(arr[i], curr+arr[i]);
            ans = Math.max(curr,ans);
        }
        curr=0;
            for( int i =1  ; i<n ; i++){
                curr = Math.max(arr[i], curr+arr[i]);
                ans = Math.max(curr,ans);
            }
        if( ans < sum) {
            System.out.println("YES");
        }
        else System.out.println("NO");



        
        
        }
    }
}
