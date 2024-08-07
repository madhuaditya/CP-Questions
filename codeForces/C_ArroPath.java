import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class C_ArroPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // Size of array a
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(scanner.nextInt()); // Input array a
            }
            ArrayList<Integer> b = new ArrayList<>();
            b.add(a.get(n - 1)); // Initialize b with last element of a
            for (int i = n - 2; i >= 0; i--) {
                if (a.get(i) > b.get(b.size() - 1)) {
                    b.add(a.get(i) % 10);
                    b.add(a.get(i) / 10);
                } else {
                    b.add(a.get(i));
                }
            }


            Collections.reverse(b);



            System.out.println(isSortedNonIncreasing(b) ? "YES" : "NO");
        }
        scanner.close();
    }

    // Function to check if the array is sorted in non-increasing order
    public static boolean isSortedNonIncreasing(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) < arr.get(i)) {
                return false;
            }
        }
        return true;
    }
}
