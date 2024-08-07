import java.util.Arrays;
import java.util.Scanner;

public class SatisfyingConstraints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            // code here
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long[] priSum = new  long[n+1];

            for (int i = 1; i <= n; i++) {
                priSum[i] = priSum[i-1]+ arr[i-1];
            }

            long max = Integer.MIN_VALUE;
            int i =n;

            while (k >=0){
                if(i ==1){
                    if(k ==0)
                    max = Math.max(max,-priSum[i]);
                    else
                        max = Math.max(max, 0);

                    break;
                }
                if(i-x>=0){
                    long a = priSum[i-x];
                    long b = priSum[i] - a;
                    max= Math.max(max , a-b);

                }
                else {
                    long b = priSum[i]  ;
                    max= Math.max(max , -b);
                }
              i--;
                k--;
            }
            System.out.println(max);
        }

    }
}
