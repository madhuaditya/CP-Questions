import java.util.Scanner;

public class VladandtheBest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {


            String str = sc.next();
            int n = str.length();
            int a = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'A') {
                    a++;
                }

            }
            if (a > (n - a)) {
                System.out.println('A');
            } else {
                System.out.println('B');
            }
        }
    }
}
