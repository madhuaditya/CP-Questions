import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class FormingTriangles {
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
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0){
            int n = fs.nextInt();
            TreeMap<Long , Long> map = new TreeMap<>();

            for(int i =0; i<n;i ++){
                int a = fs.nextInt();
                map.put((long)a,map.getOrDefault((long)a,0l)+1);
            }
            int count =0;
            long ans =0;

            for(long ele : map.keySet()){
                if(map.get(ele)>2){
                    ans += (map.get(ele)*(map.get(ele)-1)*(map.get(ele)-2))/6;

                }
                if(count>0){
                    if(map.get(ele)>=2){
                        ans = ans+ count*((map.get(ele)*(map.get(ele)-1))/2);
                    }
                }
                count += map.get(ele);
            }

            System.out.println(ans);

        }
    }
}
//            Arrays.sort(arr);
//            System.out.println(count(arr, n));