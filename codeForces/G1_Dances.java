import java.util.Arrays;
import java.util.Scanner;

public class G1_Dances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a [] = new int[n];
        int b[] = new int[n];
        a[0]=1;
        for( int i =1;i<n; i++) a[i] = sc.nextInt();
        for( int i =0;i<n; i++) b[i] = sc.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            int up =0;
            int down =0;
            int count =0;
            while( up<n&& down<n){
                if(a[up]<b[down]){
                    up++;
                    down++;
                }
                else {
                    count++;
                    down++;
                }
            }
            System.out.println(count);

        }
    }
}
