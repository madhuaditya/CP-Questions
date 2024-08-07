import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Submitsolution {
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
        FastReader sc= new FastReader();
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int bit = 0;
            bit = bit | (1<<sc.nextInt());
            int c = sc.nextInt();
            if(((bit>>c)&1) == 1){
                System.out.println(sc.nextInt());
            }
            else{
                bit = bit|(1<<c);
                bit = bit &(~(1<<sc.nextInt()));
                System.out.println((int)(Math.log(bit) / Math.log(2)));
            }

        }
    }
}
