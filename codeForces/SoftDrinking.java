import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int[] arr = new int[8];
        for (int i =0; i<8; i++){
            arr[i] = sc.nextInt();
        }
        int a =( arr[1]*arr[2])/arr[6];
        int b = arr[3]*arr[4];
         int c = arr[5]/arr[7];
        System.out.println(Math.min(a/arr[0],Math.min(b/arr[0], c/arr[0])));

    }
}
