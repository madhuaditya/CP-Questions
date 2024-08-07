import java.util.*;

public class CN_Distinct_Islands {
    static class Pair<A extends Comparable<A>, B> implements Comparable<Pair<A, B>> {
        private A first;
        private B second;

        public Pair(A first, B second) {
            super();
            this.first = first;
            this.second = second;
        }

        public int hashCode() {
            int hashFirst = first != null ? first.hashCode() : 0;
            int hashSecond = second != null ? second.hashCode() : 0;

            return (hashFirst + hashSecond) * hashSecond + hashFirst;
        }

        public boolean equals(Object other) {
            if (this == other) return true;
            if (other == null || getClass() != other.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) other;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        public String toString() {
            return "(" + first + ", " + second + ")";
        }

        public A getFirst() {
            return first;
        }

        public void setFirst(A first) {
            this.first = first;
        }

        public B getSecond() {
            return second;
        }

        public void setSecond(B second) {
            this.second = second;
        }

        @Override
        public int compareTo(Pair<A, B> other) {
            return this.first.compareTo(other.first);
        }
    }
//    static  class Pair implements Comparable<Pair>{
//        int x ;
//        int y;
//        Pair(int x , int y){
//            this.x  = x;
//            this.y = y;
//
//        }
//        @Override
//        public  int compareTo(Pair p){
//            if(p.x == this.x){
//                return  this.y- p.y;
//            }
//            else {
//                return this.x- p.x;
//            }
//        }
//    }
    public static int distinctIsland(int [][] arr, int n, int m)
    {
        //write your code here
         boolean[][] visted = new boolean[n][m];
         int count =0;
         HashSet<ArrayList<Pair<Integer,Integer>>> set = new HashSet<>();
         for(int i =0; i<n; i++){
             for( int j =0; j<m; j++){
                 if(!visted[i][j] && arr[i][j] ==1){
                     ArrayList<Pair<Integer,Integer>> list = new ArrayList<>();
                     count++;
                     dfs(arr,visted,i,j,n,m, i,j , list);
                     Collections.sort(list);
                     set.add(list);
                 }
             }
         }
        System.out.println(set);

        return  set.size();
    }
    public static void dfs(int[][] arr, boolean[][] visted ,int a , int b, int n, int m,int row , int col , ArrayList<Pair<Integer,Integer>> list){
        visted[row][col ]= true;

//        for(int i =-1 ;i<=1; i++){
//            for(int j =-1; j<= 1; j++){
                if(row-1>=0 && arr[row-1][col]==1 && !visted[row-1][col ] ){
                    dfs(arr,visted,a,b,n,m , row-1,col, list);

                }
                if( row+1<n && arr[row+1][col]==1 && !visted[row+1][col ]) {
                    dfs(arr,visted,a,b,n,m , row+1,col, list);
                }
                if(col-1>=0 && arr[row][col-1]==1 && !visted[row][col-1 ]){
                    dfs(arr,visted,a,b,n,m , row,col-1,list);

                }
                if (col+1<m && arr[row][col+1]==1 && !visted[row][col+1 ]){
                    dfs(arr,visted,a,b,n,m , row,col+1,list);
                }
                list.add(new Pair<>(row-a , col-b));
//            }
//        }
    }
    public static void main(String[] args) {
     int[][] arr= {{1 ,1, 0 ,1 ,1},
             {1 ,0, 0 ,0 ,0},
             {0 ,0 ,0 ,0 ,1},
             {1 ,1, 0 ,1 ,1}};
     int count = distinctIsland(arr,4,5);
        System.out.println(  count);
//        System.out.println();
    }
}
