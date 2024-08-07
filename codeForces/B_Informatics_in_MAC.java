import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class B_Informatics_in_MAC {
    static class Pair<A, B> {
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
            if (other instanceof Pair) {
                Pair otherPair = (Pair) other;
                return
                ((  this.first == otherPair.first ||
                    ( this.first != null && otherPair.first != null &&
                      this.first.equals(otherPair.first))) &&
                 (  this.second == otherPair.second ||
                    ( this.second != null && otherPair.second != null &&
                      this.second.equals(otherPair.second))) );
            }

            return false;
        }

        public String toString()
        {
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
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++) arr[i] = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);

        }
        int key =-1;
        for( int i =0; i<=100000; i++){
            if(map.containsKey(i)){

            }
            else {
                key = i;
                break;
            }
        }
        if(key==-1){
            System.out.println(-1);
            continue;
        }
        if(key ==0){
//
            System.out.println(2);
            System.out.println(1+" "+1);
            System.out.println(2+" "+n);
            continue;
        }
        map = new HashMap<>();

            ArrayList<Pair<Integer,Integer>> list = new ArrayList<>();
            int count=0;
            int left  = 1;
            for( int i =0; i<n; i++){
                if(arr[i]<key){
                    map.put(arr[i],1);
                }
                if(map.size()==key){
                    count++;
                    list.add( new Pair(left,i+1));
                    left= i+2;
                    map= new HashMap<>();

                }
            }
            if (count<2){
                System.out.println(-1);
            }
            else {
                System.out.println(2);
                System.out.println(list.get(0).first+" "+list.get(0).second);
                System.out.println(list.get(0).second+1+" " + n);

            }
        }
    }
}
