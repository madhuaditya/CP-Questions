import java.util.*;

public class GridFuctions


{
    class neighborSum {
        public HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();
        public int[][] arr ;
        public neighborSum(int[][] grid) {
            arr = new int[grid.length][grid.length];
            for(int i =0 ; i<grid.length; i++){
                for( int j=0; j<grid.length; j++){
          mp.put(grid[i][j] , new ArrayList<>(List.of(i,j)));
          arr[i][j] = grid[i][j];
                }
            }
        }

        public int adjacentSum(int value) {
          ArrayList<Integer> ls = mp.get(value);
          int x = ls.get(0);
          int y = ls.get(1);

          int sum = 0;
          if(x-1>=0){
              sum+= arr[x-1][y];
          }
            if(y-1>=0){
                sum+= arr[x][y-1];
            }
            if(x+1< arr.length){
                sum+= arr[x+1][y];
            }
            if(y+1< arr.length){
                sum+= arr[x][y+1];
            }
            return sum;

        }

        public int diagonalSum(int value) {
            ArrayList<Integer> ls = mp.get(value);
            int x = ls.get(0);
            int y = ls.get(1);

            int sum = 0;
            if(x-1>=0 && y-1>=0){
                sum+= arr[x-1][y-1];
            }
            if(y-1>=0&& x+1< arr.length){
                sum+= arr[x+1][y-1];
            }
            if(x-1>=0&& y+1< arr.length){
                sum+= arr[x-1][y+1];
            }
            if(x+1< arr.length && y+1< arr.length){
                sum+= arr[x+1][y+1];
            }
            return sum;
        }
    }
    public static void main(String[] args) {

    }
}
