import java.util.Scanner;

public class OptimizeResources {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of containers
            long[] supplies = new long[n]; // Array to store initial supplies

            // Reading initial supplies for each container
            for (int i = 0; i < n; i++) {
                supplies[i] = scanner.nextLong();
            }

            // Calculate the product of initial supplies
            long initialProduct = 1;
            for (int i = 0; i < n; i++) {
                initialProduct *= supplies[i];
            }

            // Find the minimum value of k such that the modified array has a greater product
            long k = 1;
            while (true) {
                boolean increased = false;
                long modifiedProduct = 1;
                for (int i = 0; i < n; i++) {
                    long newValue = supplies[i] / k;
                    modifiedProduct *= newValue;
                    if (newValue * k != supplies[i]) {
                        increased = true;
                    }
                }
                if (modifiedProduct > initialProduct || !increased) {
                    break;
                }
                k++;
            }

            System.out.println(k);
        }
        scanner.close();
    }
}
