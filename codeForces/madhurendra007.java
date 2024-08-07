import java.util.Comparator;
import java.util.PriorityQueue;

public class madhurendra007 {
   public static int minProduct(int arr[], int n,int k)
    {
        // Complete the function
        int m =1, Minm =1;
        int left =0;
        int right = 0;
        while(left<n){
            if(left<k){
                m *=arr[left];
                left++;
                Minm = m;

            }
            else{

                m *=arr[left];
                m /= arr[right];
                Minm = Math.min(m, Minm);
                left++;
                right++;
            }
        }
        return  Minm;
    }
   static class Pair implements Comparator<Pair> {
        long data; int i;
        public Pair(long data, int i){
            this.data = data;
            this.i= i;
        }
        public int compare(Pair k1, Pair k2)
        {
            if (k1.data > k2.data)
                return 1;
            else if (k1.data < k2.data)
                return -1;
            return 0;
        }
    }
   static class Solution {
        public static long sumBetweenTwoKth(long A[], long N, long k1, long k2)
        {
            // Your code goes here
            PriorityQueue<Pair> p = new PriorityQueue<>();
            for(int i =0;i<A.length; i++){
                p.add(new Pair(A[i],i));
            }
            long sum =0;
            for(int i = 0 ;i<k2;i++){
                if(p.peek().i>k1){
                    sum += p.poll().data;
                }
            }
            return sum;
        }

    }
    public static void main(String[] args) {
//       Solution s = new Solution();
        long[] arr ={20, 8, 22, 4, 12, 10, 14};//54839848
      long sum = Solution.sumBetweenTwoKth(arr, 77, 3,6);
        System.out.println(sum);
    }
}
