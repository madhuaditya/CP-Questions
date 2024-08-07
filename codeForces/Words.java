import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cUper = 0;
        int cLow=0;
        for(int i =0 ; i<str.length(); i++){
            int ch =str.charAt(i);
            if(ch>= 65&& ch<= 90)
                cUper++;
            else
                cLow++;
        }

         if(cLow<cUper){
            System.out.println(str.toUpperCase());
        }
        else {
            System.out.println(str.toLowerCase());
        }
    }
}
