import java.util.*;

public class SpaceAdventurers {
    
    static double findOptimalMeetingPoint(int n, int[] positions, int[] times) {
        // Find all potential meeting points
        TreeSet<Integer> potentialMeetingPoints = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            potentialMeetingPoints.add(positions[i]);
            potentialMeetingPoints.add(positions[i] - 1);
            potentialMeetingPoints.add(positions[i] + 1);
        }

        // Calculate the total time for each potential meeting point
        double minTotalTime = Double.MAX_VALUE;
        double optimalMeetingPoint = 0;
        for (int meetingPoint : potentialMeetingPoints) {
            double totalTime = 0;
            for (int i = 0; i < n; i++) {
                totalTime += Math.abs(positions[i] - meetingPoint) * times[i];
            }
            if (totalTime < minTotalTime) {
                minTotalTime = totalTime;
                optimalMeetingPoint = meetingPoint;
            }
        }

        return optimalMeetingPoint;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] positions = new int[n];
            int[] times = new int[n];
            for (int i = 0; i < n; ++i) {
                positions[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; ++i) {
                times[i] = scanner.nextInt();
            }

            double optimalMeetingPoint = findOptimalMeetingPoint(n, positions, times);
            System.out.println(optimalMeetingPoint);
        }
        scanner.close();
    }
}
