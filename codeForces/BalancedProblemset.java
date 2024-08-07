import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BalancedProblemset {
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
    static int gcd(int a, int b)
    {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
             result--;
        }
        return  result;
    }
    public static void main(String[] args) {
        FastReader fs= new FastReader();
        int t = fs.nextInt();
        while((t--)>0){
            int n = fs.nextInt();
            int k = fs.nextInt();

            int s=n;
            for(int j=1;j*j<=n;j++){
                if(n%j!=0) continue;
                if(j>=k) s=Math.min(s,j);
                if(n/j >=k) s=Math.min(s,n/j);
            }
            int ans=n/s;
            sysoutln(ans);
            }

        }
    }

