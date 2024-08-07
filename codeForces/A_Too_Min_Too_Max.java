import java.util.Arrays;
import java.util.Scanner;

public class A_Too_Min_Too_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i =0; i<n; i++) arr[i]= sc.nextInt();
            Arrays.sort(arr);


            System.out.println(2*(arr[n-1]- arr[0]) + 2*(arr[n-2]- arr[1]));
        
        }
    }
}
