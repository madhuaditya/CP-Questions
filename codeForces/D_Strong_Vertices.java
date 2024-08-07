import java.util.ArrayList;
import java.util.Scanner;

public class D_Strong_Vertices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for( int i =0; i<n; i++) a[i] = sc.nextInt();
        for( int i =0; i<n; i++) b[i] = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for( int i =0; i<n; i++){
            arr[i] = a[i] - b[i];

            max = Math.max(max, arr[i]);

        }
        max = Math.max(max, arr[n-1]);
            ArrayList<Integer> list = new ArrayList<>();
            for( int i=0; i<n; i++){
                if(arr[i] == max){
                    list.add(i+1);
                }
            }
            System.out.println(list.size());
            for( int i =0; i<list.size();i++) System.out.print( list.get(i)+" ");
            System.out.println();

        
        }
    }
}
