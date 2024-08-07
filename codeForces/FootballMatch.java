import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FootballMatch {
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
   FastReader fs = new FastReader() ;
   String   str = fs.next();
   int prev =0;
    if(str.length()<7){
        System.out.println("NO");
        return;
    }
   for(int i =0; i<str.length(); i++ ){
       if(i>0 && str.charAt(i)!= str.charAt(i-1) ){
           if(str.substring(prev, i).length()>=7){
               System.out.println("YES");
               return;
           }
           prev = i;
       }
   }
   if(str.charAt(prev)== str.charAt(str.length()-1)){
       if(str.substring(prev, str.length()).length()>=7){
           System.out.println("YES");
           return;
       }
   }
        System.out.println("NO");
    }
}
