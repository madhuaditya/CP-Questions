import java.util.Scanner;

public class A_Painting_the_Ribbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if(n ==1 || k == n){
            System.out.println("NO");
            continue;
        }
        int l =(int ) Math.ceil((double) n/m);
        if((n-l)>k){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }


        }
    }
}
