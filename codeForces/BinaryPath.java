import java.util.Scanner;

public class BinaryPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int val =0;
        while ((int)Math.pow(2,val)<=n)
           val++;

            System.out.println((int )Math.pow(2, val-1));
        }

    }
}
