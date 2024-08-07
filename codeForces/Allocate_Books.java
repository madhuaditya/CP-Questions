import java.util.ArrayList;
import java.util.List;

public class Allocate_Books {
    public static int findPages(ArrayList<Integer> list, int n, int m) {
        // Write your code here.
        int [] arr = new int[n];
        for ( int i =0; i<n; i++){
            arr[i] = list.get(i);
        }
        if(m>n){
            return -1;
        }
        int max =Integer.MIN_VALUE;
        int sum = 0;
        for( int i =0; i<n;i++){
            max = Math.max(max, arr[i]);
            sum+= arr[i];
        }

        int s = max;
        int e = sum;
        int ans = sum;
        while( s<= e){
            int mid = s+(e-s)/2;
            boolean bl = check(arr, mid, n, m);
            if(bl){
                ans = mid;
                e= mid-1;
            }
            else s= mid+1;
        }
        return ans;

    }
    public static boolean check ( int[] arr, int page, int n, int m ){

        int std =0;
        int sum =0;
        for( int i =0; i<n ; i++){
          if(arr[i]+sum<=page){
              sum+= arr[i];
          }
          else {
              std++;
              sum= arr[i];
          }
        }
        std++;
        if (std<=m){
            return true;
        }
        return false ;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(25 ,46, 28, 49, 24));
       int ans = findPages(list,5,4);
        System.out.println(ans);
    }
}
