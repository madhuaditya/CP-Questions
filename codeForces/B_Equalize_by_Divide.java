import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B_Equalize_by_Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for( int i =0; i<n; i++) {
            arr[i][1] = sc.nextInt();
            arr[i][0]= i+1;
        }


            Arrays.sort(arr, Comparator.comparingDouble(o-> o[1]));


            int count =0;
                  for( int i =0; i<n;i++){
                      if(arr[i][1] != arr[0][1]){
                          count++;
                      }
                  }
          if(count == 0) {
              System.out.println(0);
              continue;
          }
          if(arr[0][1]==1){
              System.out.println(-1);
              continue;
          }
          int freq=0;
          int[][] ans = new int[30*n][2];
          while ( arr[0 ][1] != arr[n-1][1]){

              for( int i =0; i<n ; i++){
                  if(arr[i][1] > arr[0][1]){

                      arr[i][1] = (int ) Math.ceil((double) arr[i][1] / arr[0][1]);
                      ans[freq][0]= arr[0][0];
                      ans[freq] [1] =arr[i][0] ;
                      freq++;
                  }
              }
              Arrays.sort(arr, Comparator.comparingDouble(o-> o[1]));

          }
//            for (int i = 0; i < n; i++) {
//                System.out.print(arr[i][1]+" ");
//            }
//            System.out.println();
            System.out.println(freq);
          for(int  i =0; i<freq; i++){
              System.out.println(ans[i][1] +" " + ans[i][0]);
          }


        
        
        }
    }
}
