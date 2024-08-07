import java.util.Scanner;

public class Cupboards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int left =0;
        int right =0;
        for (int i =0 ; i< n; i++){
            arr[i][0] = sc.nextInt();
            arr [i][1] = sc.nextInt();

            if( arr[i][0] ==0 || arr[i][1] == 0){
                if(arr[i][0] ==0)
                    left=left-1;
                if(arr[i][1] == 0) right=right-1;
            }
             if( arr[i][0] ==1 || arr[i][1] == 1){
                if(arr[i][0] ==1)
                    left=left+1;
                if(arr[i][1] == 1) right=right+1;
            }

        }
        int ans =(n - Math.abs((left)))/2+(n-Math.abs(right))/2;
        System.out.println(ans);
    }
}
