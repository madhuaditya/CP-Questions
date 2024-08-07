import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BicycleChain {
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
    static <T> void sysout(T obj){
        System.out.print(obj);
    }
    static <T> void sysoutln(T obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int n = fs.nextInt();
        int[] first = new int[n];
        for (int i =0 ; i < n; i++)
        {
            first[i] = fs.nextInt();
        }
        int m = fs.nextInt();
        int[] sec = new int[m];
        for (int i =0 ; i < m; i++)
        {
            sec[i] = fs.nextInt();
        }
        int i =0 ;
        int freq =0, curr=0 , ans =0 ;
        for( ; i < n ; i++ ){
            boolean bl = false;
            int  j = m -1;
            for (; j>= 0 ; j--)
            {
                if(sec[j]%first[i] == 0){
                    bl = true;
                    curr = sec[j]/ first[i];
             if(curr>ans){
                 ans = curr;
                 freq=1;
             } else if (curr == ans) {
                 freq++;
             }

                }
                if (bl )
                  break;
            }
        }
        System.out.println(freq);
    }
}
