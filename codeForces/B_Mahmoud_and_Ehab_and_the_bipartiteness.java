import java.util.*;

public class B_Mahmoud_and_Ehab_and_the_bipartiteness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
//        int u = sc.nextInt();
//        int v = sc.nextInt();
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for( int i=1; i<=n; i++){
                map.put(i,new ArrayList<>())    ;
            }
        for( int i =0;i<n-1 ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }
        long setone =0;
        long settwo =0;
        Queue<Pair> q = new LinkedList<>();
        boolean[] visted = new boolean[n];
        q.add(new Pair(1,-0));
        visted[0]= true;
        while (!q.isEmpty())
        {
            Pair pair = q.remove();
            if(pair.level%2==0) setone++;
            else settwo++;
            for( int ele : map.get(pair.node)){
                if(!visted[ele - 1]){
                    visted[ele-1]= true;
                    q.add(new Pair(ele,pair.level+1));
                }
            }
        }
            System.out.println((setone*settwo)-(n-1));
        
        }
    }
    static class Pair{
        int node;
        int level;
        Pair(int node, int level){
            this.node = node;
            this.level=level;
        }
    }
}
