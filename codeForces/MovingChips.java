import java.util.Scanner;

public class MovingChips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int zero =0;
            int one =0;
            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] ==0)
                    zero++;
                if(arr[i] ==1)
                    one++;
            }
            if(zero==n || one== n || one ==1){
                System.out.println(0);
                continue;
            }
            int left = 0;
            int right = 0;
            for(int i =0; i<n; i++){
                if(arr[i]==1){
                    left= i;
                    break;
                }
            }
            for(int i = n-1; i>=0; i--){
                if(arr[i] ==1){
                    right = i;
                    break;
                }
            }
            int count = 0;
            for(int i = left; i<= right; i++){
                if(arr[i] == 0)
                    count++;
            }
            System.out.println(count);

        }
    }
}
