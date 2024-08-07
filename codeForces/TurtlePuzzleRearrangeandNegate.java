import java.util.Scanner;

public class TurtlePuzzleRearrangeandNegate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();

         int sum =0;
         for(int i =0; i<n ; i++){
             sum += Math.abs(sc.nextInt());
            }
            System.out.println(sum);
        }
    }
}
