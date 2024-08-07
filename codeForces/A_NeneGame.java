import java.util.Scanner;

public class A_NeneGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min =Integer.MAX_VALUE;
        for( int i =0; i<n;i++){
            int a = sc.nextInt();
            min = Math.min (min, a);
        }

        for( int i =0; i<m; i++){
            int a = sc.nextInt();
            if(a>=min){
                System.out.print(min-1 +" ");
            }else {
                System.out.print(a+" " );
            }
        }
            System.out.println();


        }
    }
}
