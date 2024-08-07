
import java.util.Scanner;

public class CQuests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] first = new int[n];
        int[] second = new int[n];
        for(int i =0; i<n ; i++){
            first[i] = sc.nextInt();
        }
            for(int i =0; i<n ; i++){
                second[i] = sc.nextInt();
            }
//            long ans = first[0];
//            long max = second[0];
//            int i =1;
//            while (k-- > 1){
//                if(i<n){
//                    ans += Math.max(max, first[i]);
//                }
//                else
//                    ans += max;
//                if(i<n && max<=first[i]){
//                    max= Math.max(max, second[i]);
//                    i= i+1;
//
//                }
//            }
//            System.out.println(ans);
            long ans =0;
            int max =0;
            long preSum =0;
            for( int i =0; i< Math.min(n,k); i++){
                ans = Math.max(ans,preSum+(max*(k-i)));
                preSum+= first[i];
                ans = Math.max(ans, preSum+(max*(k-i-1)));
                max = Math.max(max, second[i]);
            }
            if(k>n){
                ans = Math.max(ans, preSum+max*(k-n));
            }
            System.out.println(ans);


        }
    }
}
