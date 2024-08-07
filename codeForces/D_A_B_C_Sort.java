import java.util.Scanner;

public class D_A_B_C_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n]  ;
        for (int i =0; i<n; i++) arr[i] =sc.nextInt();

        for(int i = n-1 ; (i-1)>=0; i-=2){
            int a = arr[i];
            int b= arr[i-1];
            arr[i] = Math.max(a,b);
            arr[i-1]= Math.min(a,b);
        }
        boolean bl = true;
            for (int i = 1; i < n; i++) {
                if(arr[i]< arr[i-1]) {
                    bl = false;
                    break;
                }
            }
            if(bl) System.out.println("YES");
            else System.out.println("NO");


        
        
        }
    }
}
