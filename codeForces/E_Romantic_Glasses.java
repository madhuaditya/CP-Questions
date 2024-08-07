import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class E_Romantic_Glasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i =0; i<n; i++){
                if(i%2==0){
                    arr[i]= -sc.nextLong();
                }else
                    arr[i] = sc.nextLong();
            }
            if(findZeroSm(arr, n)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    static boolean findZeroSm(long[] arr , int n )
    {
        Set<Long> set = new HashSet<>();
        long  sum = 0;
        for(int i =0; i<n ; i++){
            sum += arr[i];
            if(sum==0 || set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
