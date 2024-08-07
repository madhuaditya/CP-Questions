import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in );
        String year = sc.next();
        String name = sc.next();
        String suff = sc.next();
        int n = year.length()+name.length();
        int m = suff.length();
        if(m!= n){
            System.out.println("NO");
            return;
        }
        char[] chr = new char[n];
        char[] chs = new char[m];
        int j =0;
        for (int i =0 ; i<n; i++){
            if(i<year.length()){
                chr[i]= year.charAt(i);
            }
            else {
                chr[i]= name.charAt(j++);
            }
            chs[i]= suff.charAt(i);
        }
        Arrays.sort(chr);
        Arrays.sort(chs);
        for (int i =0 ;i<n;i++){
            if(chr[i]!= chs[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
