import java.util.Arrays;
import java.util.Scanner;

public class A_Dual_Trigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        char[] str = sc.next().toCharArray();
        int one = 0;
        for( int i =0; i<n; i++){
            if ( str[i]== '1'){
                one++;
            }
        }
        if(one%2!=0){
            System.out.println("NO");
        }
        else {
            if( one == 2){
                boolean bl = false ;
                for(int i =0; i<n-1; i++){
                    if( str[i] == str[i+1] && str[i] == '1'){
                        bl = true;
                        break;
                    }

                }
                if(bl) System.out.println("NO");
                else System.out.println("YES");
            }else System.out.println("YES");
        }

        
        
        }
    }
}
