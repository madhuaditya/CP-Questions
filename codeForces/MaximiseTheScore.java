import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MaximiseTheScore {
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
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while(t-- >0){
            int n = fs.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0 ; i<n; i ++){
                list.add(fs.nextInt());
                list.add(fs.nextInt());
            }
            Collections.sort(list);
            int score =0;
            int i =1;
            while ( i< list.size()){
                score = score+ Math.min(list.get(i-1), list.get(i));
                i +=2;
            }
            System.out.println(score);
        }
    }
}
