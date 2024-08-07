import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class B_CollectingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- >  0){
            int n = sc.nextInt();
            int[][] arr= new int[n][2];
            for( int i =0; i<n ; i++){ // O(n)
                arr[i][0]= sc.nextInt();
                arr[i][1]= i;
            }
            Arrays.sort(arr, Comparator.comparingDouble(o ->o[0] ));// O(nlogn)
            HashMap<Integer, Integer> map = new HashMap<>();
            int count =0;
            long score = arr[0][0];
            int left =0;
            for(int i =1; i<=n; i++){// O(2n)
                if(i==n){
                    for(int j = left ; j<i;j++){
                       map.put(arr[j][1],count);
                    }
                    break;
                }
                if(score>= arr[i][0]){

                }
                else{
                    for(int j = left ; j<i;j++){
                        map.put(arr[j][1],count);
                    }
                    left=i;
                }
                count++;
                score+=arr[i][0];

            }
            for(int i =0;i<n; i++){ // O(n)
                System.out.print(map.get(i)+" ");
            }
            System.out.println();

        }
    }
}
