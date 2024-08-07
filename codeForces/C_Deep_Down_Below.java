import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C_Deep_Down_Below {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] [] arr = new int[n]   [2];
        for( int i =0; i<n; i++){
            int t = sc.nextInt();
            int max = 0;
            for( int j =0; j<t ;j++){
                int a = sc.nextInt();
                if(j ==0){
                    max = a+1;
                }
                else {
                    a-=j-1;
                    max = Math.max(max,a);
                }
            }
            arr[i][0] = max;
            arr[i][1]= t;
        }
            Arrays.sort(arr, Comparator.comparingDouble(o-> o[0]));

//        long min = arr[0][0];
        long sum =0;
        long size=0;
        for( int i =0; i<n; i++){
//            if(sum+size>=arr[i][0]){
//                sum = arr[i][0];
//                size+= arr[i][1];
//            }
//            else {
//                min=sum = arr[i][0]-size;
//                size+= arr[i][1];
//
//            }
            if(size+sum<arr[i][0]){
                sum=arr[i][0]-size;
            }
//            sum = arr[i][0]-size;
            size+= arr[i][1];

        }
            System.out.println(sum);
        
        
        }
    }
}
