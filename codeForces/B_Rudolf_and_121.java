import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class B_Rudolf_and_121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i =0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for( int i =0; i<n-2; i++){
            if( arr[i]<0){
                flag=true;
                break;
            }
            if(arr[i]==0) continue;

            int a= arr[i];
            arr[i]= 0;
            arr[i+1] -= (2*a);
            arr[i+2]-= a;

        }
        if(flag){
            System.out.println("NO");
        }
        else{
            if(arr[n-2]==0 && arr[n-1]==0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        
        }
    }
}
