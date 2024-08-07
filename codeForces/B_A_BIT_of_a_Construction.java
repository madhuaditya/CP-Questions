import java.util.Scanner;

public class B_A_BIT_of_a_Construction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ln = ( int) (Math.log(k) / Math.log(2))+1;
        if(n==1){
            System.out.println(k);
            continue;
        }
        if( k == (int ) Math.pow(2,ln)-1){
            System.out.print(k+" ");
            for (int i =0; i<n-1; i++){
                System.out.print(0 +" ");
            }
            System.out.println();
            continue;
        }
            System.out.print((int)(Math.pow( 2, ln-1)-1)+" ");
        k -= (int) Math.pow(2, ln-1) -1;
            System.out.print(k +" ");
            for( int i = 0; i<n-2; i++)
                System.out.print( 0+" ");

            System.out.println();
        
        
        }
    }
}
