import java.util.Scanner;

public class B_Make_It_Ugly {
  static   Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = sc.nextInt();
        while (tc-- >0){
            int n = sc.nextInt();
            int count=0;
            int same = 0 ;
            int [] arr = new int[n];
         for(int i =0; i<n; i++ ){
             arr[i]= sc.nextInt();

             if(arr[i] != same) {
                 same = arr[i];
                 count++;
             }
         }
         if(count==1){
             System.out.println(-1);
             continue;
         }
         int ans = Integer.MAX_VALUE;
         int key = arr[0];
         int curr =0;
         for( int i=0; i<n; i++){
             if(arr[i]==key) curr++;
             else {
                 ans = min(curr, ans);
                 curr=0;
             }
         }
         ans = min(curr, ans);
         if(ans == Integer.MAX_VALUE) System.out.println(-1);
         else System.out.println(ans);

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
