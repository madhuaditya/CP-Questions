import java.util.Scanner;

public class FindB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[] arr= new long[n];
            for(int i =0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            long[] prifixSum = new long[n];
            for(int i =0; i<n ; i++){
                if(i>0){
                    prifixSum[i] += arr[i] ;
                }
            }

              boolean bl = true;
            while (m-- > 0){

                int a = sc.nextInt();
                int b = sc.nextInt() ;
                if(a ==b){
                    System.out.println("NO");
                    bl = false;
                    break;
                }
              long sum = a!=1 ? arr[b-1]-arr[a-2] : arr[b-1];

                for (int i = a-1 ; i<= b-1; i++){

                }

            }

            if(bl){
                System.out.println("YES");
            }
        }

    }
}
