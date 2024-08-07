import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ThreeActivities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        long[][] a = new long[n][2];
        long[][] b = new long[n][2];
        long[][] c = new long[n][2];
        for(int i =0; i<n; i++){
            a[i][0] = i+1;
          a[i][1] = sc.nextLong();
          }
            for(int i =0; i<n; i++){
                b[i][0] = i+1;
                b[i][1] = sc.nextLong();
            }
            for(int i =0; i<n; i++){
                c[i][0] = i+1;
                c[i][1] = sc.nextLong();
            }
            Arrays.sort(a, Comparator.comparingDouble(o -> o[1]));
            Arrays.sort(b, Comparator.comparingDouble(o -> o[1]));
            Arrays.sort(c, Comparator.comparingDouble(o -> o[1]));
            System.out.println( maxValue(a,b,c));


        }
    }
    static long maxValue(long[][] a, long[][]b, long[][]c){
        long max = Integer.MIN_VALUE;
       int n = a.length;
            for(int i =n-1 ; i>=n-3; i--){
                for(int j =n-1;j>= n-3; j -- ){
                    if(b[j][0]!=a[i][0]) {
                        for (int k = n - 1; k >= n - 3; k--) {
                              if(c[k][0]!= b[j][0] && c[k][0]!=a[i][0]){
                                  max = Math.max(max, a[i][1]+b[j][1]+c[k][1]);
                              }
                        }
                    }
                }
            }

        return max;
    }
}
