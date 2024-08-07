
import java.util.Scanner;

public class ThousandTonsofTNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                if (i > 0) {
                    arr[i] += arr[i - 1];
                }
            }
            if(n==1){
                System.out.println(0);
                continue;
            }
            long ans =0;
            for (int i = 1; i <= (n / 2); i++) {
                if (n % i == 0) {
                  long  min=arr[i-1];
                   long  max= arr[i-1];
                    for(int j=i+i; j<=n; j+=i){
                        if(max <(arr[j-1]-arr[j-1-i]) ){
                            max = (arr[j-1]-arr[j-1-i]);
                        }
                        if(min >(arr[j-1]-arr[j-1-i]) )
                            min =(arr[j-1]-arr[j-1-i]);
                    }
                    ans = Math.max(ans, max-min);
                }
            }
            System.out.println(ans);
        }
    }
}
