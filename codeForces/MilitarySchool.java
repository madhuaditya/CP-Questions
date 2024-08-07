import java.util.Arrays;

public class MilitarySchool {

    static class Student {
        int beauty;
        int cleverness;
        int payment;

        Student(int beauty, int cleverness, int payment) {
            this.beauty = beauty;
            this.cleverness = cleverness;
            this.payment = payment;
        }
    }

    public static int maxPayment(int n, int[] B, int[] C, int[] P) {
        final int MOD = 1000000007;

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(B[i], C[i], P[i]);
        }

        // Sort students by beauty, and by cleverness in descending order if beauties are equal
        Arrays.sort(students, (a, b) -> {
            if (a.beauty != b.beauty) {
                return Integer.compare(a.beauty, b.beauty);
            } else {
                return Integer.compare(b.cleverness, a.cleverness);
            }
        });

        // DP array to store maximum payment achievable with students up to i
        int[] dp = new int[n];
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = students[i].payment;
            for (int j = 0; j < i; j++) {
                if (students[j].cleverness <= students[i].cleverness) {
                    dp[i] = Math.max(dp[i], dp[j] + students[i].payment);
                }
            }
            maxProfit = Math.max(maxProfit, dp[i]);
        }

        return maxProfit % MOD;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] B = {4, 5, 1, 5, 9, 7};
        int[] C = {4, 5, 8, 4, 5, 9};
        int[] P = {4, 8, 9, 4, 7, 5};
        //B=[4, 5, 1, 5, 9, 7], C=[4, 5, 8, 4, 5, 9) and P=[4, 8, 9, 4, 7, 5]

        System.out.println(maxPayment(n, B, C, P)); // Expected output based on optimal selection
        String str = "madhurendra";
        System.out.println();
    }
}
