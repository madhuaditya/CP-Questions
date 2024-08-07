
    import java.util.*;
import java.io.*;
public class PetrandBook {
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
      int arr[]= new int[7];
      int sum =0;
      for(int i =0; i<7; i++){
          arr[i] = fs.nextInt();
          sum += arr[i];

      }
        while(n>sum){
           n -= sum;
        }
              int ans =0;
       for(int i =0; i<7; i++){
           if(n <=0 ){
               sysoutln(ans);
               return;
           }
           n = n-arr[i];
           ans++;
       }
       if(ans ==7)
           sysoutln(ans);

    }
}

  /*


//        if (sum !=1  ) {
//            sum = n%sum;
//        }
//        else {
//            sum =1;
//        }
//        if(sum ==0){
////          sysoutln(7);
////          return;
//            sum =n;
//      }
//      int ans =0;
//       for(int i =0; i<7; i++){
//           if(sum <=0 ){
//               sysoutln(ans);
//               return;
//           }
//           sum = sum-arr[i];
//           ans++;
//       }
//       if(ans ==7)
//           sysoutln(ans);

       */