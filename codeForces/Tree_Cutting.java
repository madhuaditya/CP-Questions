import java.util.*;

public class Tree_Cutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int k = sc.nextInt();
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for( int i = 0; i<n-1; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(map.containsKey(a)){
                    map.get(a).add(b);
                }
                else {
                    map.put(a, new ArrayList<>());
                    map.get(a).add(b);
                }

            }
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

            for( int i : map.keySet()){
                ArrayList<Integer> list = map.get(i);
                ArrayList<Integer> ls = new ArrayList<>();
                for( int z :list){
                    int t;
                 if(map.containsKey(z)){
                   t=  map.get(z).size();
                 }
                 else t =0;
                  ls.add(t+1);
                }
                Collections.sort(ls);
                pq.add(ls.get(0)+1);
                for( int x =1; x<ls.size(); x++){
                    pq.add(ls.get(x));
                }
            }
            ArrayList<Integer> li = new ArrayList<>();
            for( int s=0; s<k; k++){
                int g = pq.remove();
               if(g>=2) {
                   int l = g / 2;
                   int w = g - l;
                   pq.add(l);
                   pq.add(w);
                   li.add(l);
                   li.add(w);
               }
            }
            int max = Integer.MAX_VALUE;
            for( int q: li){
                max = Math.min(q,max);
            }
            System.out.println(max);


        }
    }
}
