import java.util.Scanner;

public class C_Showering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
           int n = sc.nextInt();
           int s = sc.nextInt();
           int m = sc.nextInt();
           int[][] arr = new int[n][2];
           for( int i =0; i<n; i++){
               int a = sc.nextInt();
               int b = sc.nextInt();
               arr[i][0]=a;
               arr[i][1]=b;
           }

           
        }
    }
}
