import java.util.Scanner;

public class D_Buying_Shovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        long n = sc.nextLong();
        int k = sc.nextInt();
        if( k>= n){
            System.out.println(1);
            continue;
        }
        if( k ==1){
            System.out.println(n);
            continue;
        }
        int count=Integer.MAX_VALUE;

        for( int i = 1 ; i<=(int ) Math.sqrt(n); i++){
            if( i<=k){
                if( n%i==0){
                    count = Math.min(count,(int )n/i);
                }
            }
            if( (n/i)<=k){
                if(n%i ==0)
                    if(n%(n/i)==0){
                        count= Math.min(count, i);
                }
            }
        }

            System.out.println(count);
        }
    }
}
