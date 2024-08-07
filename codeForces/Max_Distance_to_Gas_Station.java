import java.util.*;

public class Max_Distance_to_Gas_Station {
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
    public static double MinimiseMaxDistance(int []arr, int K){
        // Write your code here.
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int[] freq = new int[n-1];
        PriorityQueue<Pair<Float, Integer>> pq = new PriorityQueue<>();

        for( int i = 1; i<n; i++){
            max = Math.max(max, arr[i]-arr[i-1]);
            pq.add(new Pair(arr[i] -arr[i-1],   i-1));
        }
        for( int i = 0 ; i<K; i++){
            Pair pair = pq.remove();
            int id =(int)pair.second;
            double value = (float) pair.first;
            double d =value/(freq[id]+1);
            freq[id]+=1;
            pq.add(new Pair(d, id));
        }
        return (double) pq.remove().first;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        double ad = MinimiseMaxDistance(arr, 4);
        System.out.println(ad);

    }
}
