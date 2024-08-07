import java.util.Scanner;

public class AEntertainmentinMAC {
    static String reverse(String str ){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        String str = sc.next();
        int m = str.length();
       int left =0;
       int right = m-1;
       while (left<=right&& n>0){
           if(left==right){
               System.out.println(str);
               break;
           }
           if(str.charAt(left)== str.charAt(right)){
               left++;
               right--;
           }
           else {
               if(str.charAt(left)<str.charAt(right)){
                   System.out.println(str);
                   break;
               }
               else{
                   StringBuilder sb = new StringBuilder(reverse(str));
                   sb.append(str);
                   str = sb.toString();
                   left=0; right=sb.length()-1;
                   n-=2;
               }
           }
       }
        if(n==0|| left>right){
            System.out.println(str);
        }

        }
    }
}
