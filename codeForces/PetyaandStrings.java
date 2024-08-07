import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int  n = str2.compareToIgnoreCase(str1);
        if(n ==0){
            System.out.println(0);
        }
        else if(n<0){
            System.out.println(1);
        }
        else System.out.println(-1);
    }
}
