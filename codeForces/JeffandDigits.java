import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JeffandDigits {
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
    int[] arr = new int[n];
    int sum =0;
    int freq =0;
    for(int i =0; i< n ; i++)
    {
       arr[i] = fs.nextInt();
       sum += arr[i];
       if(arr[i]==0)
           freq++;
      }

     while (sum !=0){
         if(sum % 9 ==0){
             break;
         }
         sum -= 5;
     }
     StringBuilder sb = new StringBuilder("");
     if(sum == 0){
         sysoutln(0);
     }
     else {
//         sb. append()
         int a = sum / 5;
         sb.append("5".repeat(a));
         sb.append("0".repeat(freq));
         System.out.println(sb.toString());
     }
//        System.out.println(sb.toString().equals("5555555550"));
    }
}
