import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class PermutationPrinting {
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

    static void permutate (int n ) {
        int[] arr = new int[n];
        for(int i =0; i<n;i++) {
            arr[i] = n-i;
        }
        for(int i =1; i<n-1; i++){
            if(arr[i] % arr[i+1]==0){
                int curr = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]= curr;
            }
        }
        for(int i =0; i<n; i++){
            sysout(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0){
            int n = fs.nextInt();
       if(n%2==0){
           int left = n;
           int right =1;
           while(left>0 && right<n){
               System.out.print(left+" " + right+" ");
               left-=2;
               right+=2;
           }
       }
       else{
           int left = n-1;
           int right =1;
           while(left>0 || right<=n){


            if (right<=n)    System.out.print(right+" " );
               if(left>0)
                   System.out.print(left+" ");
               left-=2;
               right+=2;
           }
       }
            System.out.println();
        }
    }
}



    /*
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt(); // Number of test cases
            for (int testCase = 0; testCase < t; testCase++) {
                int n = scanner.nextInt(); // Length of the permutation
                int[] permutation = generatePermutation(n);
                for (int i = 0; i < n; i++) {
                    System.out.print(permutation[i] + " ");
                }
                System.out.println();
            }
            scanner.close();
        }

        public static int[] generatePermutation(int n) {
            int[] permutation = new int[n];
            for (int i = 0; i < n; i++) {
                permutation[i] = n - i;
            }
            for (int i = 1; i < n - 1; i++) {
                if (permutation[i] % permutation[i + 1] == 0) {
                    int temp = permutation[i];
                    permutation[i] = permutation[i + 1];
                    permutation[i + 1] = temp;
                }
            }
            return permutation;
        }
     */

