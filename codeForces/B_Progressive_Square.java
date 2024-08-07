import java.util.HashMap;
import java.util.Scanner;

public class B_Progressive_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
         int c = sc.nextInt();
         int d = sc.nextInt();


            HashMap<Integer, Integer> map = new HashMap<>();
            int min =Integer.MAX_VALUE;
         int[][] arr = new int[n][n];
         for( int i =0; i<n ; i++){
             for ( int j=0;j<n; j++){
                 arr[i][j] = sc.nextInt();
                 min = Math.min(min, arr[i][j]);
             }
         }
         for(int i =0; i<n; i++){
             for( int j=0;j <n; j++){
                 map.put(arr[i][j],map.getOrDefault(arr[i][j],0)+1);
             }
         }
         boolean bl= true;
         // collum check
            arr[0][0] = min;
            for( int i =0; i<1; i++){
                for( int j =0 ; j<n-1; j++){
                    if(map.containsKey(arr[i][j]+d)){
                        if(map.get(arr[i][j]+d)==1){
                            map.remove(arr[i][j] +d);
                        }
                        else {
                            map.put(arr[i][j]+d,map.get(arr[i][j]+d)-1);
                        }
                        arr[i][j+1]= arr[i][j] +d;
                    }
                    else {
                        bl = false;
                        break;
                    }
                }
            }
            if(bl){
                for( int i  =0; i<n ; i++){
                    for( int j =1; j<n; j++){
                        if(map.containsKey(arr[j-1][i]+c)){
                            if(map.get(arr[j-1][i]+c)==1){
                                map.remove(arr[j-1][i] +c);
                            }
                            else {
                                map.put(arr[j-1][i]+c,map.get(arr[j-1][i]+c)-1);
                            }
                            arr[j][i]= arr[j-1][i] +c;
                        }
                        else {
                            bl = false;
                            break;
                        }
                    }
                }
            }


            if(bl){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
