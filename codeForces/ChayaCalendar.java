import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChayaCalendar {
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
        while (t-- >0){
            int n = fs.nextInt();

            int[] arr = new int[n];
            for(int i =0; i < n ; i++){
                arr[i] = fs.nextInt();
            }
            int year = arr[0];
            for(int  i =1; i<n ; i++){
                if(arr[i]> year){
                    year = arr[i];
                }
                else {
                    int x = year / arr[i];
                    x = (x+1)*arr[i];
                    year = x;
                }
            }
            System.out.println(year);
        }
    }
}
