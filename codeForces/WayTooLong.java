import java.util.Scanner;
public class WayTooLong {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
           for(int  i =0 ; i<n; i++){
               String str = sc.next();
               if(str.length()>10){
                   StringBuilder sb = new StringBuilder("");
                sb.append(str.charAt(0));
                sb.append((str.length()-2));
                sb.append(str.charAt(str.length()-1));
                   System.out.println(sb.toString());

               }
               else {
                   System.out.println(str);
               }
           }
    }
}
