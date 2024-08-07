import java.util.Scanner;

public class E_MirrorGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        char[][] chars = new char[n][n];
        for( int i =0; i<n; i++){
            chars[i]= sc.next().toCharArray();

        }
        if(n==1){
            System.out.println(0);
            continue;
        }
        long sum=0;
        for( int i =0; i<n/2; i++){
            int a =i;
            int b= i;
            int c=n-i-1;
            int d=n-i-1;
            for(int j =i ; j<n-i-1;j++){
                int zero=0;
                int one =0;
               if( chars[i][a++]=='1'){
                one++;
               }else zero++;
                if( chars[b++][n-i-1]=='1'){
                    one++;
                }else zero++;
                if(chars[n-i-1][c--]=='1'){
                    one++;
                }else zero++;
                if(  chars[d--][i]=='1'){
                    one++;
                }else zero++;
                sum+= Math.min(zero,one);
            }
        }
            System.out.println(sum);
        
        
        }
    }
}
