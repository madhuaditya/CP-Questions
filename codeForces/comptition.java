import java.util.Scanner;

public class comptition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;

        for(int i =1; i<=n;i++){
            int min =Integer.MAX_VALUE;
            for(int j = 1 ; j<= i; j++){
                if(i != j){

                    int greater = Math.max(i, j);
                    int smallest = Math.min(i, j);
                    int d=0;
                    for (int k = greater;; k += greater) {
                        if (k % smallest == 0) {
                            d = k;
                            break;
                        }
                    }

                    min = Math.min(d, min);
                }
            }
            if(min != Integer.MAX_VALUE)
            ans +=min;
        }
        System.out.println(ans);
    }
}

