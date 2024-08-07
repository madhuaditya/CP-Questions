import java.util.Scanner;

public class C_Game_with_Reversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int fist =0;
        for( int  i =0; i<n; i++){
            if(s.charAt(i)!= t.charAt(i)) fist++;
        }
        int last =0;
        for( int i =0 ; i<n; i++){
            if(s.charAt(i)!= t.charAt(n-i-1)) last++;
        }
        if(fist==0){
            System.out.println(0);
            continue;
        }
        if (last==0) {
            System.out.println(2);
            continue;
        }
            if(fist%2!=0) fist+= fist-1;
            else fist+=fist;
            if(last%2== 0) last+= last-1;
            else last+=last;
            System.out.println(Math.min(fist,last));
        }
    }
}
