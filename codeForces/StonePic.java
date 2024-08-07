import java.util.Scanner;

public class StonePic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = sc.next();
        int count =0;
        int left=0;
        int right =1;
        while (right < str.length() ){
            if(str.charAt(left) == str.charAt(right)){
                count++;
                right++;
            }
            else {
                left = right;
                right++;
            }
        }
        System.out.println(count);
    }
}
