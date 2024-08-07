import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GroupingIncreases {
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
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();

            }
            if (n < 3) {
                System.out.println(0);
                continue;
            }

            int t1 = 1000000005, t2 = 1000000005;
//            int ans = 0;
//            for (int i = 0; i < n; i++) {
//                if (t1 > t2) {
//                    int v = t1;
//                    t1 = t2;
//                    t2 = v;
//
//                }
//
//                if (a[i] <= t1) {
//                    t1 = a[i];
//                } else if (a[i] <= t2) {
//                    t2 = a[i];
//                } else {
//                    t1 = a[i];
//                    ans++;
//                }
//
//            }
                        int a = 0;
            int b = 0;
            int count = 0;
            for (int i =0; i<n; i++){
                if(arr[a]>arr[b]){
                    int c= a;
                    a= b;
                    b= c;
                }
                if(arr[i]<=arr[a]){
                    a=i;
                } else if(arr[i]<=arr[b]){
                    b = i;
                }
                else {
                    count++;
                    a = i;
                }
            }
            System.out.println(count);
        }
    }

}
//            int a = 0;
//            int b = -1;
//            int count = 0;
//            for (int i =1; i<n; i++){
//                if(arr[i]<=arr[a]){
//                    a=i;
//                } else if (b ==-1) {
//                    b = i ;
//                } else if(arr[i]<=arr[b]){
//                    b = i;
//                }
//                else {
//                    count++;
//                    b = i;
//                }
//            }