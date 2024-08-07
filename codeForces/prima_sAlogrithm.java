import java.util.Iterator;
import java.util.PriorityQueue;

public class prima_sAlogrithm {
    static class Node implements Comparable<Node> {
        int from ;
        int to ;
        int weight;
        Node next ;
        Node(int from, int to, int weight){
            this.from= from;
            this.to = to;
            this.weight= weight;
            this.next = null;
        }
        @Override
        public int compareTo(Node node){
            return weight-node.weight;
        }
    }

    public static int primsAlgo(int[][] grapgh){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int i =0; i<grapgh.length; i++){
            for (int j =i; j <grapgh[0].length; j++){
                if(grapgh[i][j] !=0){
                    pq.add(new Node(i,j,grapgh[i][j]));
                }
            }
        }
        boolean[] visited = new boolean[grapgh.length];
        Iterator<Node > it = pq.iterator();
        Node dummy = new Node(0,0,-1);
        int sum = 0;
        while (it.hasNext()){
            Node node = pq.poll();
            if(!visited[node.to]){
                visited[node.from]=true;
                visited[node.to]= true;
                sum+= node.weight;
//                dummy.next= node;
//                dummy= dummy.next;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int graph[][] = new int[][] {    { 0, 2, 0, 6, 0 },
                                         { 2, 0, 3, 8, 5 },
                                         { 0, 3, 0, 0, 7 },
                                         { 6, 8, 0, 0, 9 },
                                         { 0, 5, 7, 9, 0 } };
        int t =primsAlgo(graph);
        System.out.println(t);


    }
}
