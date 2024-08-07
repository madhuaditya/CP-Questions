import java.util.Scanner;

public class B_Balanced_Tunnel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] a = new int[n];

        int[] b = new int[n];

        for( int i =0; i< n ; i++) {
            a[i] = sc.nextInt();
            a[i]-=1;
        }
        for( int i =0; i< n ; i++) {
            b[i] = sc.nextInt();
            b[i] -=1;
        }
        int[] pos= new int[n];
        for( int i =0; i<n ; i++)
            pos[b[i]] = i;

        int[] c= new int[n];
        for( int i=0;i<n; i++){
            c[i] = pos[a[i]];
        }
        int max =-1;
        int ans =0;
        for( int i =0 ; i<n ; i++){
            if( c[i] >max){
                max = c[i];
            }
            else {
                ans++;
            }
        }
            System.out.println(ans);
        
        
        }
    }
}
