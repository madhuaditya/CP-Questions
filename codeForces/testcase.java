import java.util.List;

public class testcase {
    static boolean  detectCycle(int V, List<List<Integer>> adj) {
        // Write your code here.
//        boolean[] visted= new boolean[V];
//        boolean [] path= new boolean[V];
//
//        for( int i =0 ; i<V; i++){
//            if(!visted[i]){
//                visted[i]= true;
//                path[i]= true;
//                if(dfscheck(adj, i,-1, visted, path))
//                    return true;
//            }
//        }
//        return false;
        boolean[] visted = new boolean[V];
        for( int i =0; i<V; i++){
            if(!visted[i]){
                visted[i] = true;
                if(dfs(adj,i, -1, visted)){
                    return true;
                }
            }
        }
        return false ;
    }
    static boolean dfs(List<List<Integer>> adj,int node , int par ,boolean[] visted){
        if(adj.get(node).size()!=0)
            for( int child: adj.get(node)){
                if(visted[child] && child!= par){
                    return true;
                }
                if(!visted[child]){
                    visted[child]= true;
                    if(dfs(adj, child, node, visted) ){
                        return true;
                    }
                }
            }
        return false ;
    }
  static   boolean dfscheck(List<List<Integer>> adj,int par,int prev, boolean[] visted , boolean[] path){

        for( int child : adj.get(par)){
            if(visted[child]&& path[child] && child!= prev){
                return true;
            }
            if(!visted[child]){
                visted[child ]= true;
                path[child]= true;
                return dfscheck(adj, child,par, visted, path);
            }
            path[child ] = false;
        }
        return false;

    }
    public static void main(String[] args) {
//        int a = (1<<30) ;
//        System.out.println(a);
//        while (a>0){
//            System.out.print(a&1);
//            a>>=1;
//        }
//        List<List<Integer>> adj = new ArrayList<>();
//        for( int i = 0; i<5; i++){
//            adj.add(new ArrayList<>());
//        }
//        adj.get(0).add(1);
////        adj.get(0).add(3);
////        adj.get(1).add(2);
//        adj.get(1).add(0);
//        adj.get(1).add(2);
//        adj.get(2).add(1);
////        adj.get(2).add(3);
//        adj.get(3).add(4);
//        adj.get(4).add(3);
//
//
//        boolean value = detectCycle(5,adj);
//        System.out.println(value);

//        long a = 1000000000L*1000000000L;
//        System.out.println(a);
//        TreeMap<Integer,Integer> map= new TreeMap<>();



    }
}
