import java.util.Scanner;

public class contest005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long mul =1;
        for( int i =0; i<n ; i++){
            int a = sc.nextInt();
            min=Math.min(min, a);
            max=Math.max(max,a);
            arr[i] = a;
            mul*=a;

        }
        for( int i = min ;i<=max+1; i++){
            long curr = (long) Math.pow(i,n);
            if(curr>mul){
                System.out.println(i);
                break;
            }
        }
        
        
        }
    }
}
