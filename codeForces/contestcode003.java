import java.util.Scanner;

public class contestcode003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int tc = 21;
        while(tc-- >0){
        // code here

        String str = sc.next();
        int countZ =0;
        int counto =0;
        for( int i =0; i<21; i++){
            if(str.charAt(i)=='0') countZ++;
            else counto++;
        }
            if(counto>countZ) count++;
        }
        System.out.println(count);
    }
}
