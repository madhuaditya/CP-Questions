import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Football {
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
        String[] str = new  String[n];
        for (int i =0; i<n ; i++){
            str[i] = fs.next();
        }

        int team1 =0;
        int team2 =0;
        String st = str[0];
        String sr = "";
        for(String ele : str){
            if(ele.equals(st)){
                team1++;
            }
            else {
                sr = ele    ;
                team2++;
            }
        }
        if(team2<team1){
            System.out.println(st);
        }
        else
            System.out.println(sr);
    }
}
