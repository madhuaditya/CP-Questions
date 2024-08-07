import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr =new int[n][2];
        int sum =0;
        int max =0;
        for (int i =0 ; i<n ; i++){
            arr[i][0]= sc.nextInt();
            sum = sum-arr[i][0];
            arr[i][1]= sc.nextInt();
            sum = sum+arr[i][1];
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
