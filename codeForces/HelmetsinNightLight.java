import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HelmetsinNightLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        long k = sc.nextInt();
        long[][] arr = new long[n][2];

        for(int i =0; i<n; i++){
            arr[i][1] = sc.nextLong();
        }
            for(int i =0; i<n; i++){
                arr[i][1] = sc.nextLong();
            }
            Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));

            if(arr[0][1] >=k  || n ==1){
                System.out.println(k*n);
                continue;
            }
//            int ans = k;
//            n-=1;
//            for(int i = 0 ; i<n; i++){
//                int curr = arr[i][0];
//
//                if(n<=curr){
//                    ans += n*arr[i][1];
//                    break;
//                }
//                ans += curr*arr[i][1];
//                n-= curr;
//
//            }
            var ans = (long) k;

            int i = 0, j = n - 1;
            for (; i < n; i++) {
                if (j <= i || arr[i][1] > k) break;
                var j2 = Math.max(i + 1, j - arr[i][0] + 1);
                ans += (long) arr[i][1] * (j - j2 + 1);
                j = (int) j2;
            }
            ans += (long) k * Math.max(j - i, 0);
            System.out.println(ans);
        }
    }
}
// 1045232