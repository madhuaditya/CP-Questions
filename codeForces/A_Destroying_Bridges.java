import java.util.Scanner;

public class A_Destroying_Bridges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int  k = sc.nextInt();
        if(k >= (n-1)){
            System.out.println(1);

        }
        else {
            System.out.println(n);
        }


        }
    }
}
