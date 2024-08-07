import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C_Nenes_Magical_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int m = n;
        int[][] arr = new int[n][n];
//        int l = (n*(n+1))/2;
//        int a =0;
//        int k = n;
//        while(k>0) {
//            a++;
//            k/=2;
//        }

    long sum =0;
    for( int i =1; i<=n;i++){
        sum += ((i*i)+(i*(i-1)));
    }
//    if(n ==1) System.out.println(1);
//    else
            System.out.println(sum+" "+ (2*n));
    int x =n;
        while( m>0 ){
            System.out.print( 1+" " + x +" ");
            for( int i =1; i<=n ; i++){
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.print( 2+" " + x +" ");
            for( int i =1; i<=n ; i++){
                System.out.print(i+" ");
            }
            x--;
           m--;
            System.out.println();
//             if(flag%2==0){
//                 // row me chalna hai
//                 for( int i =0; i<n; i++ ){
//                     int y =2;
//                     count++;
//
//                     int curr = 0;
//                     for( int j =0;j<n; j++){
//                         curr+= arr[i][j];
//                     }
////                     System.out.print(1+" "+(i+1)+" ");
//                     if( curr<= l || curr==0) {
//                         result[x][0]=1;
//                         result[x][1]=(i+1);
//                         for (int j = 0; j < n; j++) {
//                             arr[i][j] = (j + 1);
////                         System.out.print( j+1+" ");
//                             result[x][y++] = (j + 1);
//                         }
////                     System.out.println();
//                         x++;
//                         m--;
//                     }
//                     else break;
//                 }
//
//                 flag++;
//             }
//             else {
//                 // colum me chalna hai;
//                 for( int i =0; i<m; i++ ){
//                     int y =2;
//                     count++;
//
//                     int curr = 0;
//                     for( int j =0;j<n; j++){
//                         curr+= arr[j][i];
//                     }
////                     System.out.print(2+" "+(i+1)+" ");
//                     if(curr<=l || curr==0) {
//                         result[x][0]=2;
//                         result[x][1]=(i+1);
//                         for (int j = 0; j < n; j++) {
//                             arr[j][i] = (j + 1);
//                             result[x][y++] = (j + 1);
////                         System.out.print( j+1+" ");
//                         }
//                         x++;
//                         m--;
//                     }
//                     else
//                            break;
////                     System.out.println();
//                 }
//                 flag++;
//             }

        }
//            System.out.println();
//        int sum=0;
        
        }
    }
}
