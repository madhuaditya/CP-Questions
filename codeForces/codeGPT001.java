import java.util.*;
public class codeGPT001 {


//    public class Main {
static final int MOD = 1000000007;

    static int countConfigs(int n, int k, int[][] moves) {
        boolean[] row = new boolean[n + 1];
        boolean[] col = new boolean[n + 1];

        for (int i = 0; i < k; i++) {
            int r = moves[i][0];
            int c = moves[i][1];
            row[r] = true;
            col[c] = true;
        }

        int emptyRowCount = countEmpty(row);
        int emptyColCount = countEmpty(col);

        long ans = 1;
        for (int i = 1; i <= n; i++) {
            if (!row[i] && !col[i]) {
                ans = (ans * 2) % MOD;
            } else if (!row[i]) {
                ans = (ans * (n - emptyColCount)) % MOD;
            } else if (!col[i]) {
                ans = (ans * (n - emptyRowCount)) % MOD;
            }
        }

        return (int) ans;
    }

    static int countEmpty(boolean[] arr) {
        int count = 0;
        for (boolean b : arr) {
            if (!b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[][] moves = new int[k][2];
            for (int i = 0; i < k; i++) {
                moves[i][0] = scanner.nextInt();
                moves[i][1] = scanner.nextInt();
            }
            System.out.println(countConfigs(n, k, moves));
        }
        scanner.close();
    }
    }

