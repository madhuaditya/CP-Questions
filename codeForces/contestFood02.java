import java.util.Scanner;

public class contestFood02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        String str = sc.next();
            if(str.contains("it")){
                System.out.println("YES");
            }
            else System.out.println("NO");


        }
    }
}
