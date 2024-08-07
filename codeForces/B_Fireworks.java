import java.util.Scanner;

public class B_Fireworks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        long a = sc.nextLong();
        long b = sc.nextLong();
        long m = sc.nextLong();

    if(m<a &&m <b){
        System.out.println(2);
        continue;
    }
    long ans = 0;
    ans = m/a +m /b  +2;
            System.out.println(ans);

        }
    }
}
