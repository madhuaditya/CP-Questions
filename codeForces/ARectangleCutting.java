import java.util.Scanner;

public class ARectangleCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a%2!=0 && b%2!=0){
                System.out.println("NO");
            }
            else if (a%2==0 && b%2==0){
                System.out.println("YES");
            }
            else{
                if(a%2 !=0){
                    b = b/2;
                    if(b == a){
                        System.out.println("NO");
                    }
                    else System.out.println("YES");
                }
              else {
                    a = a/2;
                    if(b == a){
                        System.out.println("NO");
                    }
                    else System.out.println("YES");
                }
            }
        }
    }
}
