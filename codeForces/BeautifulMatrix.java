//import java.util.Scanner;
//
//public class BeautifulMatrix {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] mat = new int[5][5];
//        int row = 0 ;
//        int col =0;
//       for(int i =0 ; i<5;i++){
//           for (int j =0; j<5;j++){
//               mat[i][j]= sc.nextInt();
//               if(mat[i][j]==1){
//                   row = i;
//                   col = j;
//               }
//           }
//       }
//       int ans = Math.abs(2-row)+Math.abs(2-col);
//        System.out.println(ans);
//
//    }
//}




import java.util.*;
        import java.io.*;

public class BeautifulMatrix{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=1;
            while(testCases-- > 0){
                // write code here

                int[][] mat = new int[5][5];
        int row = 0 ;
        int col =0;
       for(int i =0 ; i<5;i++){
           for (int j =0; j<5;j++){
               mat[i][j]= in.nextInt();
               if(mat[i][j]==1){
                   row = i;
                   col = j;
               }
           }
       }
       int ans = Math.abs(2-row)+Math.abs(2-col);
        out.println(ans);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
