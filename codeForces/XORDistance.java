import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XORDistance {
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
    static boolean getBit(long a, int i) {
        return (a & (1L << i)) != 0;
    }
    static final int maxb =60;
    public static void main(String[] args) {
        FastReader fs = new FastReader()    ;
        int t =fs.nextInt() ;
        while (t-- > 0){
            long a = fs.nextLong();
            long b = fs.nextLong();
            long c = fs.nextLong();
            long x =0;
            boolean firstBit = true;
            if(a> b){
                long z =  a;
                a= b;
                b =z;
            }
            for(int i = maxb-1 ; i>=0; --i ){
                    boolean bitA = getBit(a,i);
                    boolean bitB = getBit(b,i);
                    if (bitA != bitB){
                        if (firstBit)
                        firstBit = false;
                    }
                    else {
                        if (!bitA && x+(1L << i) <= c){
                            x+= (1L << i);
                            a ^= (1L << i);
                            b ^= (1L << i);

                        }
                    }
            }
            System.out.println(b-a);
            }

    }
}
