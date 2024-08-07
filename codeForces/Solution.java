import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static int[][] printAdjacency(int n, int m, int[][] edges) {
        // Write your code here.
         HashMap<Integer,ArrayList<Integer>> graph = new HashMap<>();

         for( int i = 0 ; i<n; i++){
             graph.put(i, new ArrayList<>());
         }

         for( int i =0; i<m; i++){
             int u = edges[i][0];
             int v = edges[i][1];
             graph.get(u).add(v);
             graph.get(v).add(u);
         }

         int[][] arr = new int[n][m];
      for( int i =0; i<n; i++){
          Arrays.fill(arr[i],-1);
      }
         for( int t : graph.keySet()){
           arr[t][0] = t;
           int i= 1;
           for( int ele : graph.get(t)){
               arr[t][i++]= ele;
           }
         }
         return arr;

    }

    public static void main(String[] args) {
        int[][] edges= {{1, 2},
                        {0, 3},
                        {2, 3}};
        int[][] grapgh = printAdjacency(4,3,edges);
        for( int i =0;i<4; i++){
            for( int j =0; j<3; j++){
                if(grapgh[i][j]==-1){

                    break;
                }
                System.out.print( grapgh[i][j]+ " ");
            }
            System.out.println();
        }
    }
}