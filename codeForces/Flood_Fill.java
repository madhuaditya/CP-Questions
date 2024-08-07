import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Flood_Fill {
    public static int[][] floodFill(int[][] img, int sr, int sc, int color) {
        if( color == 0 ){
            return img;
        }

        Queue<Pair> q = new LinkedList<>();
        q.add( new Pair(sr,sc));
        int a = img[sr][sc];
        img[sr][sc] = color;
      boolean[][] visited = new boolean[img.length][ img[0].length];
      visited[sr][sc]= true;
        while(!q.isEmpty()){
            Pair pair = q.remove();

            if((pair.x-1)>=0 ){
                if(img[pair.x-1][pair.y] == a && !visited[pair.x-1][pair.y]){
                    img[pair.x-1][pair.y] = color;
                    visited[pair.x-1][pair.y]= true;
                    q.add(new Pair(pair.x-1,pair.y));
                }
            }
            if((pair.x+1)<img.length ){
                if(img[pair.x+1][pair.y] == a && !visited[pair.x+1][pair.y]){
                    img[pair.x+1][pair.y] = color;
                    visited[pair.x+1][pair.y]=true;
                    q.add(new Pair(pair.x+1,pair.y));
                }
            }
            if((pair.y+1)<img[0].length && !visited[pair.x][pair.y+1]){
                if(img[pair.x][pair.y+1] == a){
                    img[pair.x][pair.y+1] = color;
                    visited[pair.x][pair.y+1]= true;
                    q.add(new Pair(pair.x,pair.y+1));
                }
            }
            if((pair.y-1)>=0 ){
                if(img[pair.x][pair.y-1] == a && !visited[pair.x][pair.y-1]){
                    img[pair.x][pair.y-1] = color;
                    visited[pair.x][pair.y-1]= true;
                    q.add(new Pair(pair.x,pair.y-1));
                }
            }

        }
        return img;

    }
   static class Pair {
        int x;
        int y ;
        Pair(int i , int j ){
            this.x = i;
            this.y = j;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] img = new int[n][m ];
        for( int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                img[i][j] = sc.nextInt();
            }
        }
        int sr = sc.nextInt();
        int sv= sc.nextInt();
        int color = sc.nextInt();
        floodFill(img, sr,sv,color);
        for( int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.print(img[i][j] +" ");
            }
            System.out.println();
        }
    }
}
