import java.util.*;
 
public class code005 {
 
    public static final int MOD = (int) (1e9 + 7);
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            while(n-- > 0) arr.add(sc.nextInt());
 
            long ans = 0, curr = 0;
 
            for (int x :
                    arr) {
                curr += x;
                ans = Math.max(ans, curr);
                curr = Math.max(curr, 0);
            }
 
            long fAns = ((sum(arr) % MOD + MOD) % MOD);
 
            for (int i = 0; i < k; i++) {
                fAns = (fAns + ans) % MOD;
                ans = (ans * 2) % MOD;
            }
            System.out.println(fAns);
        }
    }
 
    public static long
    sum(List<Integer> arr) {
        long sum = 0;


        for (int ans :
                arr) {


           sum += ans;

           
        }
        return sum;
    }
}