import java.util.HashMap;
import java.util.Scanner;

public class B_Rock_and_Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt()   ;
        while (tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for( int i =0; i< n; i++) arr[i] = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();

            for( int i =0; i<n; i++){
                int a = (int ) ( Math.log(arr[i])/ Math.log(2));
                map.put(a,map.getOrDefault(a, 0)+1);

            }
            long ans = 0;
            for( int i : map.keySet()){
                int t = map.get(i);
                ans += (((long) (t - 1) *t)/2);
            }
            System.out.println(ans);
        }
    }
}
