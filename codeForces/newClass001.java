import java.util.Scanner;

public class newClass001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        if( n%7==0){
            System.out.println("Thala");
        }
else {
            System.out.println("For-a-reason");
        }

        }
    }
}
