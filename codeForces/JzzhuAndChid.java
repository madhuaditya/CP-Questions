import java.util.*;
import java.io.*;

public class JzzhuAndChid {
    static class data {
        int ind ;
        int candi;
        data(int ind , int candi){
            this.candi= candi;
            this.ind= ind;
        }
    }
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
       int m = fs.nextInt();
        Queue<data> st = new LinkedList<>();
        for (int i =0; i<n ; i++){
            int a = fs.nextInt();
            st.add( new data(i+1, a) );
       }
        while (st.size()>1){
            data curr =st.remove();
            if((curr.candi-m )>0){
                int b = curr.candi-m;
                st.add(new data(curr.ind, b));
            }
        }

        sysoutln(st.remove().ind);
    }
}
