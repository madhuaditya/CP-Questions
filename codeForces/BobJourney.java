import java.util.Scanner;

public class BobJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int X = scanner.nextInt(); // Time required by Alice to reach Gargi
            int N = scanner.nextInt(); // Number of planets
            int M = scanner.nextInt(); // Number of space buses on every planet

            // Store time taken by each space bus to reach from current planet to next planet
            int[][] timeToNextPlanet = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    timeToNextPlanet[i][j] = scanner.nextInt();
                }
            }

            // Check if Bob can reach Gargi before Alice
            boolean canReachGargi = canBobReachGargi(X, timeToNextPlanet, N, M);
            if (canReachGargi) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    private static boolean canBobReachGargi(int X, int[][] timeToNextPlanet, int N, int M) {
        for (int i = 0; i < N; i++) {
            int minTime = X - (i + 1);
            int maxTime = X + (i + 1);
            for (int j = 0; j < M; j++) {
                if (timeToNextPlanet[i][j] >= minTime && timeToNextPlanet[i][j] <= maxTime) {
                    return true;
                }
            }
        }
        return false;
    }
}
