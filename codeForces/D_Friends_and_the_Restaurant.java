import java.util.Arrays;
import java.util.Scanner;

public class D_Friends_and_the_Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for( int i =0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        for( int i =0; i<n; i++){
            arr2[i]= sc.nextInt();
        }
        int itrate[] = new int[n];
        for( int i =0; i<n; i++){
            itrate[i]= arr2[i]-arr[i];

        }
            Arrays.sort(itrate);
        int left = 0;
        int right =n-1;
        int count =0;
        while (left< right){
            if(itrate[left]+itrate[right]>=0){
                count++;
                left++;
                right--;
            }
            else{
                left++;
            }
        }
            System.out.println(count);
        
        }
    }
}
