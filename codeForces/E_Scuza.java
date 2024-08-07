import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class E_Scuza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        long[][] arr2 = new long[m][3];
        for( int i =0; i<n; i++) arr[i]= sc.nextInt();
        for( int i =0; i<m ; i++){
            arr2[i][0]=i;
            arr2[i][1]=sc.nextLong();
        }
//            Arrays.sort(arr2, Comparator.comparingDouble(o->o[1]));
        int upper=0;
        int lover  =0;
        long sum =0L;

        while(upper<n&& lover<m){
            if(arr[upper]>arr2[lover][1]){
                arr2[lover][2]= sum;
                lover++;
            }else{
                sum+=arr[upper];
                upper++;
            }

        }
        while (lover<m){
            arr2[lover][2]= sum;
            lover++;
        }
//        Arrays.sort(arr2,Comparator.comparingDouble(o->o[0]));
        for( int i =0; i<m; i++){
            System.out.print(arr2[i][2]+" ");
        }
            System.out.println();


        
        }
    }
}
