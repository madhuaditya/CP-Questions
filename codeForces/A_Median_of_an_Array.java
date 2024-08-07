import java.util.Arrays;
import java.util.Scanner;

public class A_Median_of_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for( int i =0; i<n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int m= (n+1)/2;
            m-=1;
            int a = arr[m];
            int count =0;
            for(int i = m ; i<n; i++){
                if(arr[i] == a) count++;
            }
            System.out.println(count);

        
        
        }
    }
}
