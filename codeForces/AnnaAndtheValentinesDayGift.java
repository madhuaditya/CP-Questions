import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AnnaAndtheValentinesDayGift {
    static int countZero(int n){
        int ans = 0;
        while(n%10 ==0){
            ans++;
            n/=10;
        }
        return ans;
    }
    static int countDig(int n){
        int ans = 0;
        while (n!=0){
            ans++;
            n/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            long m = sc.nextLong();
            int[] arr = new int[n];
            for (int i =0; i<n; i++){
                arr[i] = sc.nextInt();

            }
            long sum =0;
            Integer[] zero = new Integer[n];
            for(int i =0; i<n ; i++){
                sum+=countDig(arr[i]);
                zero[i]= countZero(arr[i]);
            }
            Arrays.sort(zero, Collections.reverseOrder());
            for(int i =0; i<n ; i+=2){
                sum-= zero[i];
            }
            if(sum >= m+1){
                System.out.println("Sasha");
            }
            else
                System.out.println("Anna");
        }
    }
}
