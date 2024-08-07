import java.util.Scanner;
import java.util.TreeMap;

public class C_MEX_Game_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            // code here 
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            int mex = 0;
            for (int i = 0; i <= n; i++) {
                if (!map.containsKey(i)) {
                    mex = i;
                    break;
                }
            }
            int first = 0;
            for (int i = 0; i <= n; i++) {
                if (map.containsKey(i) && map.get(i) == 1) {
                    first = i;
                    break;
                }
            }
            int max2 = 0;
            for (int i = first + 1; i <= n; i++) {
                if (!map.containsKey(i) || map.get(i) <= 1) {
                    max2 = i;
                    break;
                }
            }
            mex = Math.min(mex, max2);
            System.out.println(mex);


        }
    }
}
