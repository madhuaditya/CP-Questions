import java.util.Scanner;

public class C_Differential_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int  n = sc.nextInt();
        int[] arr = new int[n];
        for( int  i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        if( arr[n-1]<arr[n-2]){
            System.out.println(-1);
        }
        else{
            if(arr[n-1]>=0){
                System.out.println(n-2);
                for( int i =0; i<n-2; i++){
                    System.out.println((i+1)+" "+ (n-1)+" "+ (n));
                }
            }
            else{
                boolean bl = true;
                for( int i =0; i<n-1;i++){
                    if(arr[i]>arr[i+1])
                    {
                        bl= false;
                        break;
                    }
                }
                if( bl)
                    System.out.println(0);
                else System.out.println(-1);
            }
        }


        }
    }
}
