import java.util.Scanner;

public class year2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rem=2023;
        int pos =1;
        for (int i =0; i<n; i++){
            int a = sc.nextInt();
           pos = pos & (rem %a==0 ? 1:0 );
            rem /= a;
        }
        if(pos==0){
            System.out.println("NO");
        }
        else {
            System.out.println("yes");
            System.out.print(rem+" ");
            for (int i =1 ; i<k; i++) System.out.print(1+" ");
            System.out.println();
        }

        }
    }
}
