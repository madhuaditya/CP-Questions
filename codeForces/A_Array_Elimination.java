import java.util.Scanner;

public class A_Array_Elimination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[31];

        for( int i =0; i<n; i++){
            int a = sc.nextInt();
            int j =0;
            while (a>0){
                if((a&1)==1){
                    arr[j ]+=1;
                }
                j++;
                a>>=1;
            }
        }
        for( int i =1; i<=n; i++){
            boolean flag=false;
            for( int k =0; k<31;k++){
                if(arr[k]%i!=0){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.print(i+" ");
            }
        }
            System.out.println();
        
        }
    }
}
