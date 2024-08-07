import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RecoveringaSmallString {
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
//    static <T> void sysout(T obj){
//        System.out.print(obj);
//    }
//    static <T> void sysoutln(T obj){
//        System.out.println(obj);
//    }


    public static void main(String[] args) {
        FastReader fs = new FastReader()    ;
        int t = fs.nextInt();
        while (t-- > 0){
            int n = fs.nextInt();
            StringBuilder sb = new StringBuilder("");
            if(n>27){
                 sb.append("z");
                 n-=26;
                 if(n>26){
                     sb.append("z");
                     n-= 26;
                     char ch = (char) (64+n);
                     sb.append(ch);
                 }
                 else {
                     n-=1;
                     char ch = (char) (64+n);
                     sb.append(ch);
                     sb.append("a");
                 }

            }
            else {
                n -=2;
               char ch = (char) (64+n);
               sb.append(ch);
                sb.append("aa");
            }
            System.out.println(sb.reverse().toString());
        }
        Character ch = (char) 89;
        System.out.println(ch.toString() );
    }
}
