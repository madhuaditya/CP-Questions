import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
        if (n % 2 == 1) {
            System.out.println("-1");
        } else {
            int[] permutation = new int[n];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    permutation[i] = i + 2;
                } else {
                    permutation[i] = i;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(permutation[i] + " ");
            }
        }
    }
}

