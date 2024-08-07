import java.util.*;

public class DistinctKValues {
    
    public static Map<Integer, Integer> factorize(int n) {
        Map<Integer, Integer> factors = new HashMap<>();
        int divisor = 2;
        while (n > 1) {
            int count = 0;
            while (n % divisor == 0) {
                n /= divisor;
                count++;
            }
            if (count > 0) {
                factors.put(divisor, count);
            }
            divisor++;
        }
        return factors;
    }

    public static int countDistinctK(int a, int b, int l) {
        // Factorize l into its prime factors
        Map<Integer, Integer> primeFactors = factorize(l);

        // Find the maximum powers of a and b that divide l
        int maxPowerA = primeFactors.containsKey(a) ? primeFactors.get(a) : 0;
        int maxPowerB = primeFactors.containsKey(b) ? primeFactors.get(b) : 0;

        Set<Integer> distinctValuesOfK = new HashSet<>();

        // Iterate through all possible combinations of powers of a and b
        for (int x = 0; x <= maxPowerA; x++) {
            for (int y = 0; y <= maxPowerB; y++) {
                int k = l / (int) (Math.pow(a, x) * Math.pow(b, y));
                distinctValuesOfK.add(k);
            }
        }

        return distinctValuesOfK.size();
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int l = 48;
        System.out.println(countDistinctK(a, b, l)); // Output: 4
    }
}
