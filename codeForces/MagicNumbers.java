import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MagicNumbers {
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
        String str = fs.next();
        int n = str.length();
        boolean bl = false;
        int left =n -1, right =n-2;
        if(str.length()==1){
            if(str.charAt(0)!='1'){
                System.out.println("NO");
                return;
            }
            else {
                System.out.println("YES");
                return;
            }
        }
        while (right>=0){
            if((str.charAt(left)!= '1' && str.charAt(left)!='4')|| (str.charAt(right)!= '1' && str.charAt(right)!='4'))
           break;
            else {
                if (str.charAt(left) == str.charAt(right) && str.charAt(left) == '1') {
                    left = right;
                    right--;
                } else if (str.charAt(left) == '1' && str.charAt(right) == '4') {
                    left = right;
                    right--;
                } else if (str.charAt(left) == '4' && str.charAt(right) == '1' && (left - right + 1 == 2)) {
                    left = right - 1;
                    right = left - 1;
                } else if ((left - right + 1) == 2) {
                    String ss = str.substring(right, left + 1);
                    if (ss.equals("44")) {
                        if(right == 0)
                            break;
                        right--;
                    }
                    else {
                        break;
                    }
                } else if ((left - right + 1 == 3)) {
                    String ss = str.substring(right, left + 1);
                    if (ss.equals("144")) {
                        left = right - 1;
                        right = left - 1;
                    } else break;
                }


            }
        }




        if(right <0 ){
           if(left>=0){
            if(str.charAt(left) == '4')
                System.out.println("NO");
           else System.out.println("YES");}

           else
                System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
