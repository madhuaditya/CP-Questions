import java.util.Scanner;

public class E1_Rudolf_and_Snowflakes {
    static int QudraticSol( int n){
        double a = (-1 +(Math.sqrt(1+(4*n))))/2;
        return (int) a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        if(n<7){
            System.out.println("NO");
        }
        else{
            boolean flag = false;
           int a = QudraticSol(n);
            for( int i =a; i>=2; i--){
                long z = n-1;
                long b = i;
                while (z>=0){
                    z-= b;
                    b*=i;
                    if(z==0) {
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
        
        
        }
    }
}
