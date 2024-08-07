import java.util.Scanner;

public class B_Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt(), x= sc.nextInt(),m =sc.nextInt();
           int a = x; int b = x;
        for( int i =0; i<m;i++){
     int l = sc.nextInt(), r = sc.nextInt();

     if( l<= a && r>= a) a = l;
     if(r>=b && l<=b) b = r;
        }

            System.out.println(b-a+1);
        
        
        }
    }
}
