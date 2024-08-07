import java.util.Scanner;

public class Spaceships {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
            int x = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]  arr = new int[n][m     ];
        for( int i =0 ; i<n; i++){
            for( int j =0; j<m ; j++){
                arr[i][j]= sc.nextInt();
            }
        }


        }
    }
}
