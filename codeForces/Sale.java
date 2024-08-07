import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sale {
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
        int m = fs.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = fs.nextInt();
        }
        Arrays.sort(arr);
        int ptr =-1;
        int ans =0;
        for (int i =0; i<n ; i++){
            if(arr[i] < 0){
                ptr =i;
            }
            else
                break;
        }
        if(ptr ==-1){
            System.out.println(0);
            return;
        }
        else {
            if(ptr<=(m -1)){
                for(int i =0 ; i<=ptr ; i++){
                    ans+= arr[i];
                }
            }
            else {
                for (int i = 0 ; i<m ; i++){
                    ans += arr[i];
                }
            }
        }
        System.out.println(Math.abs(ans));
    }
}
