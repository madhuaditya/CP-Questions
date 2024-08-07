import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindtheDifferentOnes {static class FastReader {
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
          int n= fs.nextInt();;
          int[] arr = new int[n];
          for (int i =0; i<n; i++){
              arr[i]= fs.nextInt();
          }
          boolean[][] pairs = new boolean[n][n];
          for(int i = 0; i< n-1; i++){
              for(int j = i+1; j<n;j++){
                  if(arr[i]!= arr[j]){
                      while(j<n){
                          pairs[i][j] = true;
                          j++;
                      }
                      break;
                  }
              }
          }
          int m = fs.nextInt();
          while (m-- >0){
              int a = fs.nextInt();
              int b = fs.nextInt();
             if(pairs[a-1][b-1]){
                 System.out.println(a+" "+b);
             }
             else
                 System.out.println(-1 +" "+ -1);
          }
            System.out.println();
        }
    }
}
