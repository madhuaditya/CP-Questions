import java.util.Scanner;

public class LightsOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int arr[][]= new int[3][3];
        for(int i =0 ; i< arr.length; i++){
            for (int j =0 ; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        StringBuilder sb = new StringBuilder("");
        sb.append((arr[0][0]+arr[0][1]+arr[1][0]+1)%2);
        sb.append((arr[0][0]+arr[0][1]+arr[0][2]+arr[1][1]+1)%2);
        sb.append((arr[0][2]+arr[0][1]+arr[1][2]+1)%2);
        System.out.println(sb.toString());
        sb.delete(0,3);
        sb.append((arr[0][0]+arr[2][0]+arr[1][1]+arr[1][0]+1)%2);
        sb.append((arr[1][1] + arr[1][0] + arr[1][2] + arr[2][1] +arr[0][1]+ 1) % 2);
        sb.append( (arr[1][2]+arr[1][1]+arr[0][2]+arr[2][2]+1)%2);
        System.out.println(sb.toString());
        sb.delete(0,3);
        sb.append((arr[2][0]+arr[2][1]+arr[1][0]+1)%2);
        sb.append( (arr[2][0]+arr[2][1]+arr[1][1]+arr[2][2]+1)%2);
        sb.append((arr[2][2]+arr[1][2]+arr[2][1]+1)%2);
        System.out.println(sb.toString());

    }
}
