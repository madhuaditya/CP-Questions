import java.util.Arrays;
import java.util.Scanner;

public class B_Playing_in_a_Casino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for( int i =0; i<n; i++){
            for (int j =0; j<m ; j++){
                grid[i][j]= sc.nextInt();

            }
        }
        if(n==1){
            System.out.println(0);
            continue;
        }
        long sum =0;
        for(int i = 0; i<m ; i++){

            int[] arr = new int[n];
            for( int j = 0 ; j<n; j++){
                arr[j]= grid[j][i];
            }
            sum+=sumPairs(arr,n);
        }
            System.out.println(sum);
        }


    }
    static long sumPairs(int[] arr, int n) {

        Arrays.sort(arr);
        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum += (long) i *arr[i] - (long) (n - 1 - i) *arr[i];
        }

        return sum;
    }
}
