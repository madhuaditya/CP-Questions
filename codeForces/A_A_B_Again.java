import java.util.Scanner;

public class A_A_B_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = a%10;
            int c = a/10;
            System.out.println(b+c);
        }
    }
}
