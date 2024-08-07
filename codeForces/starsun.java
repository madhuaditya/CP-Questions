import java.util.Scanner;

public class starsun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int m = sc.nextInt();

        int t = n+m;
        t= t%100;

         if(t<10){
             System.out.println("ST0"+t);
         }
         else System.out.println("ST"+t);


        }
    }
}
