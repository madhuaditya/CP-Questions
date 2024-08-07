import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XeniaandRingroad {
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
    int n ,m;
    n = fs.nextInt();
    m = fs.nextInt();
    int[] arr = new int[m];
    for (int i =0; i<m; i++){
           arr[i] = fs.nextInt();
    }
    int left =0;
    long count =0;
        int i = 1 ;
    while(left<m){
        if(i<= arr[left]){
            count+= (arr[left]-i);
            i = arr[left];
            left++;
        }
        else {
            count += (n -i);
            if(arr[left] ==1){
                count++;
                i =1;
            }
            else {
                count++;
                count += (arr[left]-1);
                i = arr[left];
                left++;
            }
        }
    }

        System.out.println(count);
    }
}
