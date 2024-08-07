import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        StringBuilder sb = new StringBuilder("");
        for (int i =0 ; i< str1.length(); i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                sb.append(1);
            }
            else
                sb.append(0);
        }
        System.out.println(sb.toString());

    }
}
