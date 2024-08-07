import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class B_Nene_and_the_Card_Game {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n];
        foro(arr, 0,n);
            HashMap<Integer, Integer> map  = new HashMap<>();
            for( int i =0; i<n; i++){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            int count=0;
            for( int key : map.keySet()){
                if( map.get(key)==2) count++;
            }
            System.out.println(count);
        }
    }
     public  static  void foro(int[] arr, int start , int end){
             for( int i =start ; i<end; i++){
                 arr[i] = sc.nextInt();
             }
         }
         public static void  fort(int[][] arr, int row , int col ){
             for( int i =0; i<row; i++){
                 for (int j =0 ; j<col; j++){
                     arr[i][j] = sc.nextInt();
                 }
             }
         }
         public  static int max(int m, int n){
             return Math.max(m, n);
         }
         public static int min(int m , int n){
             return Math.min(m,n);
         }
         public  static long max(long m, long n){
             return Math.max(m, n);
         }
         public static long min(long m , long n){
             return Math.min(m,n);
         }
}
