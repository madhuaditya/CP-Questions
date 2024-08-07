import java.util.*;
import java.io.*;
public class SupercentralPoint {
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
            if(n<5){
                System.out.println(0);
                return ;
            }
        int[][] arr = new int[n][2];
        for(int i =0; i<n ; i++){
            arr[i][0] = fs.nextInt();
            arr[i][1] = fs.nextInt();
        }
        int ans =0;
        for(int i =0 ;i< n ; i++){
//            int count =0;
            // for uper and lower nabour
            int uper =0;
            int lower =0;
            for(int j = 0 ; j < n ;j++){
                if(j!= i){
                    if(arr[i][0] == arr[j][0]){
                        if(arr[j][1]>arr[i][1]){
                            if(uper==0)
                                uper++;
                        }
                        if(arr[j][1]<arr[i][1]){
                            if(lower==0)
                                lower++;
                        }
                    }
                    if(uper+lower== 2){
                        break;
                    }

                }
            }
            // check left right naboure
            int left =0, right =0;
            if (uper+lower == 2){
                for(int j = 0 ; j < n ;j++){
                    if(j!= i){
                        if(arr[i][1] == arr[j][1]){
                            if(arr[j][0]>arr[i][0]){
                                if(right==0)
                                    right++;
                            }
                            if(arr[j][0]<arr[i][0]){
                                if(left==0)
                                    left++;
                            }
                        }
                        if(right+left== 2){
                            break;
                        }

                    }
                }
            }
            if(left+right+uper+lower==4){
                ans++;
            }
        }
        sysoutln(ans);

    }
}
