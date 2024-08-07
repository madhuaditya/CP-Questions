import java.util.Scanner;

public class B_Most_socially_distanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int[] arr = new int[n];

        for( int i =0; i<n ; i++) arr[i] = sc.nextInt();
        boolean[] check = new boolean[n];
        check[0] =true;
        check[n-1]= true    ;
  int count =2;
        for( int i =1 ; i<n-1; i++){
            if( (arr[i] > arr[i-1] && arr[i]> arr[i+1] )|| (arr[i]<arr[i-1]&& arr[i]<arr[i+1])) {
                count++;
                check[i] = true;
            }
        }
            System.out.println(count);
        for( int i =0; i< n; i++){
            if( check[i] ){
                System.out.print( arr[i]+" ");
            }
        }
            System.out.println();


        }
    }
}
