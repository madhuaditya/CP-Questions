import java.util.*;
import java.util.spi.AbstractResourceBundleProvider;


public class B_Average_Sleep_time
{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double sum = 0;
        double curr=0;
        int[] arr = new int[n]; 
        for( int i=0; i<n ; i++){
            arr[i] = sc.nextInt();    
        }
        int t = n-k+1;
//        if( n ==1){
//            System.out.println(arr[0]);
//            return;
//        }
        int left =0;
        for( int i =0; i<n; i++){
          if(i<k){
              curr+= arr[i];
              if(i==k-1){
                  sum= curr;
              }
          }
              else {
                  curr-= arr[left++];
                  curr+= arr[i];
                  sum += curr;
                  
              }
          }

        double ans = sum/(double) t;
        System.out.format("%.10f",ans);
        System.out.println();
        }
        
    }
