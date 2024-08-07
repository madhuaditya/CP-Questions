import java.util.Scanner;

public class D_JUmping_through_sigment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for( int i =0; i<n; i++){
            arr[i][0]= sc.nextInt();;
            arr[i][1]= sc.nextInt();
        }
        int low =0,high = 1000000000;
        while (low<high){
            int k = low +(high-low)/2;
            int leftk = 0, rightk = k, f =0;
            for( int  i =0; i<n; i++){
                if(rightk<arr[i][0]  || arr[i][1] <leftk){
                    f=1;
                    break;
                }
                leftk = Math.max(leftk,arr[i][0]);
                rightk= Math.min(rightk,arr[i][1]);
                leftk = Math.max(0,leftk-k);
                rightk = rightk+k;

            }
            if(f==0){
                high=k;

            }
            else low=k+1;

        }
            System.out.println(low);

        }
    }
}
