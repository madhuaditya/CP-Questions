import java.util.Scanner;

public class H_Maximal_AND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for( int i =0; i<n ; i++) arr[i] = sc.nextInt();
        int [] bit = new int[31];
        for( int i =0; i<n; i++){
            int a = arr[i];
            int t=0;
            while (a>0){
                if((a&1)==1){
                    bit[t] +=1;
                }
                a>>=1;
                t++;
            }
        }
//        int t = k/n;
//        int x = k%n;
//        int r = n-1;
//        for( ;r>=0; ){
//            if(t==0){
//                break;
//            }
//            if(bit[r]==n){
//                r--;
//
//            }
//            else {
//                  bit[r] =n;
//                  r--;
//                  t--;
//            }
//        }

        for(int r =30 ;r>=0; r--){
            if(k<=0)
                break;
            if(bit[r] ==n){

            }
            else {
                if(k >= (n-bit[r])){
                    k-= (n-bit[r]);
                    bit[r]= n;

                }
            }
        }
        int ans = 0;
        for( int i =0; i<31; i++){
            if(bit[i]==n) ans += (int ) Math.pow(2,i);
        }
            System.out.println(ans);

        
        }
    }
}
