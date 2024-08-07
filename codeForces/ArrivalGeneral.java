//import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class ArrivalGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in  )   ;
        int n = sc.nextInt();
        int[] arr = new int[n];
        if(n <=1){
            return;
        }
        int maxind = -1 , minind =-1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i =0 ; i< n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max ){
                max = arr[i];
                maxind=i;
            }
            if(arr[i]<=min){
                min = arr[i];
                minind = i;
            }
        }
        if(maxind<minind){
            System.out.println((maxind+(n- minind -1)));
        }
        else {
            System.out.println((maxind+(n- minind -2)));
        }
    }
}
