import java.util.Scanner;

public class B_Pleasant_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        long[] arr = new long[n];
        for( int i =0; i<n; i++) arr[i]= sc.nextLong();
        long count=0;
        for( int j = 1; j <n; j++){
             int i = (int) (arr[j]- ((j+1)%arr[j]));
             for(i = i-1; i<j; ){
                 if((arr[i]*arr[j])==( (i+1)+(j+1))) count++;
                 i += (int) arr[j];

             }

        }
            System.out.println(count);
        
        }
    }
}
