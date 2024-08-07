import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class VeryDifferentArray {
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
        FastReader fs= new FastReader();
        int t = fs.nextInt();
        while (t-- > 0){
            int n = fs.nextInt(), m = fs.nextInt();
            int[] paty = new int[n];
            int[] vasya = new int[m];
            for (int i =0; i<n; i++){
                paty[i] = fs.nextInt();
            }
            for (int i =0; i<m; i++){
                vasya[i] = fs.nextInt();
            }
            Arrays.sort(paty);
            Arrays.sort(vasya);
            int l =0,r =n-1;
            int L=0,R=m-1;
            long diff = 0;

            while(l<=r){
              long left = Math.abs(paty[r]-vasya[L]);
              long right =  Math.abs(paty[l]-vasya[R]);
              long max = Math.max(left, right);
              diff+= max;
              if(max==left){
                  r--;
                  L++;
              }
              else if(right==max){
                  l++;
                  R--;
              }
            }
            System.out.println(diff);
        }
    }
}
