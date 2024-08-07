import java.util.Scanner;

public class A_Yogurt_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a*2>=b){
            int val = (n/2)*b;
            val+= (n%2)*a;
            System.out.println(val);

        }
        else {
            System.out.println(n*a);
        }
        
        
        }
    }
}
