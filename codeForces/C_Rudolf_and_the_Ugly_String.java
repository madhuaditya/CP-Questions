import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class C_Rudolf_and_the_Ugly_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        String str = sc.next();
        if(n<3) {
            System.out.println(0);
            continue;
        }
        int count =0;
        String s1 = "pie";
        String s2 = "map";
        for( int i =0 ; i<n-2; i++){
              String curr = str.substring(i,i+3);

              if(curr.equals(s1)){
                  count++;
              }
              if(curr.equals(s2)){
                  count++;
              }

        }
        int z= 0;
        if(n>4){
            for( int i =0 ;i<n-4; i++){
                String curr = str.substring(i,i+5);
                if( curr.equals("mapie")){
                    z++;
                }
            }
        }
            System.out.println(count-z);
        
        
        }
    }
}
