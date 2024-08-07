import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class F_white_black {
    static class Pair{
        int black;
        int white;
        Pair(int black, int white){
            this.black=black;
            this.white= white;
                    }
    }
    static int count =0;
    static Pair dfs (ArrayList<ArrayList<Integer>> graph, int par ,String str, boolean[] vist){
        if(vist[par])
            return new Pair(0,0);
        vist[par]= true;
        int b =0;
        int w   =0;
        if(str.charAt(par)=='W') w++;
        else b++;
        for( int i : graph.get(par)){
         Pair temp=   dfs(graph,i,str,vist);
         b+= temp.black;
         w+= temp.white;
        }
        if(b==w) count++;
        return new Pair(b,w);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for( int i =0; i<n; i++)
            {
                graph.add(new ArrayList<>());
            }
            for( int i = 1; i<n; i++){
                int u = sc.nextInt()-1;
                graph.get(i).add(u);
                graph.get(u).add(i);
            }
            String str = sc.next();
            boolean[] vist = new boolean[n];
            dfs(graph,0,str,vist);
            System.out.println(count);
            count=0;
        
        
        }
    }
}
