import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class VladandDivision {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0){
            int n = fs.nextInt();
            HashMap<Integer,Integer> set = new HashMap<>();
           int[] arr = new int[n];

            for(int i =0; i<n;i++) {
                int x = fs.nextInt() ;
                arr[i] = x;
            }

          int count =0;
            int curr = Integer.MAX_VALUE;
            for(int i =0; i<n; i++){
              int y = arr[i]^curr;
              if(set.containsKey(y)){
                  count++;
                  if(set.get(y)==1) set.remove(y);
                  else{
                      set.put(y,set.get(y)-1);
                  }
              }else{
                  set.put(arr[i],set.getOrDefault(arr[i],0)+1);
              }
            }
            System.out.println(n-count);
        }
    }
}
