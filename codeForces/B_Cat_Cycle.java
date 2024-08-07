import java.util.Scanner;

public class B_Cat_Cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int k =sc.nextInt();
         k--;
        if(n%2==0){
            System.out.println(k%n +1);
        }
        else {
            int midim = n/2;
            int ans = ((k/midim)+k)%n;
            System.out.println(ans+1);
        }
        
        
        }
    }
}
