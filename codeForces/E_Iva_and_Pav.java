import java.util.Scanner;

public class E_Iva_and_Pav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[][] bit = new int[n+1][32];
        for( int i =0; i<n; i++){
             arr[i] = sc.nextInt();
        }
        for( int i =1; i<=n;i++){
            int a= arr[i-1];
            int j = 31;
            while(a>0){
                if((a & 1) ==1) bit[i][j]=0;
                else bit[i][j] = 1;
                j--;
                a= a>>1;
            }
        }
        for(int i =1 ; i<=n ; i++){
            for( int j =0;j<32; j++){
                bit[i][j]+= bit[i-1][j];
            }
        }
        int t = sc.nextInt();
        while (t-->0){
            int l = sc.nextInt();
            int k = sc.nextInt();
            int ans=-1;
            int day = l;
            int nig = n;
            while (day<=nig){
                int eve = day+(nig-day)/2;
                int val = 0;
                for( int i =1;i<32; i++){
                    if(bit[eve][i]-bit[day][i]==0){
                        val+=(1<<i);
                    }
                }
                if(val>=k){
                    ans = eve;
                    day = eve+1;
                }
                else nig = eve-1;
            }
            System.out.print(ans+" ");
        }
            System.out.println();
        
        
        }
    }
}
