import java.util.*;

public class Solution01 {
    static final int INF = 1000000005;
    static final int MAXN = 200005;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[MAXN];
            int[] b = new int[MAXN];
            int[] aid = new int[MAXN];
            int[] ans = new int[MAXN];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                aid[i] = i;
            }
//            Arrays.sort(aid, 0, n, new Comparator<Integer>() {
//                @Override
//                public int compare(Integer l, Integer r) {
//                    return a[l] - a[r];
//                }
//            });
            Arrays.sort(b, 0, n);

            for (int i = 0; i < x; i++) {
                ans[aid[n - x + i]] = b[i];
            }
            for (int i = x; i < n; i++) {
                ans[aid[i - x]] = b[i];
            }
            for (int i = 0; i < n; i++) {
                x -= (a[i] > ans[i]) ? 1 : 0;
            }
            if (x == 0) {
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }
    }
}
