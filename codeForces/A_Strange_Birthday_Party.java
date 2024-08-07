import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class A_Strange_Birthday_Party {
    static class Pair implements Comparable<Pair> {
        int val; int ind;
        Pair(int val, int ind){
            this.ind=ind;
            this.val=val;
        }
        @Override
        public int compareTo(Pair p){
            if(this.val==p.val)
                return this.ind-p.ind;
            else  return this.val-p.val;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for( int i =0; i<n; i++) arr[i] = sc.nextInt();

            PriorityQueue<Pair> pq = new PriorityQueue<>();
            int[] price= new int[m] ;
            for( int i =0; i<m; i++){
                int a= sc.nextInt();
                pq.add(new Pair(a,i+1));
                price[i] = a;
            }
            Arrays.sort(arr);
            long ans =0;
            for( int i =n-1; i>=0; i--){
                if(pq.isEmpty()) {
                    ans+= price[arr[i]-1];
                }
                else {
                    Pair pair = pq.peek();
                    if(pair.ind<= arr[i]){
                        ans+= pair.val;
                        pq.remove();
                    }
                    else{
                        ans+=price[arr[i]-1];
                    }
                }
            }
            System.out.println(ans);


        }
    }
}
