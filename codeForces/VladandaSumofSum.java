import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VladandaSumofSum {
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
    static int[] arr= new int[200007];
    static int findsum (int n){
        if(n/10 == 0)
            return n%10;
        return n%10 + findsum(n/10);
    }
    static void fill (){
        arr[1] = 1;
        int curr =0;
        for(int i =2; i<200007;i++){
            if(i%10 != 0){
                arr[i]= arr[i-1] + (i%10)+ curr;
            }
            else {
                curr = findsum(i);
                arr[i]= arr[i-1]+curr;

            }
        }
    }

    public static void main(String[] args) {
    fill();

    FastReader fs = new FastReader();
    int t = fs.nextInt();
        while (t-- > 0){
            int n = fs.nextInt() ;
            System.out.println(arr[n]);

       }

      }
}

