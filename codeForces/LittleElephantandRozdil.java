import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LittleElephantandRozdil {
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
        int[] arr= new int[n];
        int freq =0;
        int ind =-1;
        int min = Integer.MAX_VALUE;
        for(int i =0; i< n; i++)
        {
            arr[i] = fs.nextInt();

        }
        for(int i =0; i< n; i++){
            if(min == arr[i]){
                freq++;
            } else if (arr[i]<min) {
                freq =1;
                min  = arr[i];
                ind = i+1;
            }
        }

        if(freq>1){
            sysoutln("Still Rozdil");
        }
        else {
            sysoutln(ind);
        }
    }
}
