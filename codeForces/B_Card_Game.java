import java.util.Scanner;

public class B_Card_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
         int a1 = sc.nextInt();
         int a2 = sc.nextInt();
         int b1 = sc.nextInt();
         int b2 = sc.nextInt();
         int count =0;
         if(a1>b1 && a2>b2) count++;
         if(a1>b2&& a2>b1) count++;

            System.out.println(count*2);

        }
    }
}
