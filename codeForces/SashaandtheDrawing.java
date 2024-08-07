import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SashaandtheDrawing {
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
        int t = fs.nextInt();
        while (t-- > 0){
            int n = fs.nextInt();
            int k = fs.nextInt();
            int maxD = (4*n)-2;
            if(k == maxD){
                System.out.println(2*n);
                continue;
            }
            int count = 0;
            int ans =0;
            if(k<=(2*n)){
                System.out.println((k+1)/2);
            }

            else{

              int a  = k - (2*n);
                count = n-2;
              if(( (a+1)/2) > count){
                  ans = count;
                  a -= (2*count);
              }
              else{
                  ans =  ( (a+1)/2);
                  a =0;
              }
                if(a<=0){
                    System.out.println(n+(ans));
                }
                else{
                    if(a ==1){
                        System.out.println(n+(ans)+1);
                    }
                    else
                        System.out.println(n+(ans)+2);
                }

            }
        }
    }
}
