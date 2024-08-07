import java.util.*;
public class Equalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> set = new HashMap<>();
            for (int i = 0; i < n; i++) {
                set.put(sc.nextInt(), i);
            }
            int[] arr = new int[set.size()];

            int x = 0;
            for (int ele : set.keySet()) {
                arr[x++] = ele;
            }

            Arrays.sort(arr);

            if (n == 1) {
                System.out.println(1);
                continue;
            }
            int m = set.size();
            int curr = Integer.MIN_VALUE;
            int left = 0;
            int right = 0;
            while (right < m) {
                if (arr[right] - arr[left] < n) {
                    curr = Math.max(curr, right - left + 1);
                    right++;
                } else {

                    left++;
                }
            }
            System.out.println(curr);
        }

    }
}

