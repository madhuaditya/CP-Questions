import java.util.Scanner;

public class Insomina {
    public static void main(String[] args) {
//        public class Madhu{
//            public static void main(String[] arg ){
                Scanner sc = new Scanner(System.in);
                int k,l,m,n,d;
                k = sc.nextInt();
                l = sc.nextInt();
                m = sc.nextInt();
                n = sc.nextInt();
                d = sc.nextInt();
                int count=0;
                boolean arr[] = new boolean[d];
                for(int i = k ; i<=d; i+=k){
                    if(!arr[i-1])
                    {
                        arr[i-1]= true;
                        count++;
                    }
                }
                for(int i = l ; i<=d; i+=l){
                    if(!arr[i-1])
                    {
                        arr[i-1]= true;    count++;
                    }
                }
                for(int i = m ; i<=d; i+=m ){
                    if(!arr[i-1])
                    {
                        arr[i-1]= true;   count++;
                    }
                }
                for(int i = n ; i<=d; i+=n){
                    if(!arr[i-1])
                    {
                        arr[i-1]= true;    count++;
                    }
                }
                System.out.println(count);
            }
        }
/*
import java.io.*;
import java.util.*;

public class Main {
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
        FastReader read = new FastReader();
        int[] n = new int[5];
        for(int i=0;i<5;i++){
            n[i]=read.nextInt();
        }
        boolean[] check = new boolean[n[4]+1];
        for(int i=0;i<4;i++){
            int num = n[i];
            int j=2;
            while(num<=n[4]){
                check[num] = true;
                num=n[i]*j;
                j++;
            }
        }
        int count=0;
        for(int i=1;i<=n[4];i++){
            if(check[i]) count++;
        }
        sysoutln(count);
    }
}

import java.io.*;
import java.util.*;

public class Main {

    static PrintWriter out = new PrintWriter((System.out));

    public static void main(String[] args) throws IOException {

        Reader sc = new Reader();
        int k = sc.nextInt(), l = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt(), d = sc.nextInt();
        int res = d;

        if(k == 1 || l == 1 || m == 1 || n == 1) {
            out.println(res);
        } else {
            for(int i = 1; i <= d; i++) {
                if((i%k != 0) && (i%l != 0) && (i%m != 0) && (i%n != 0)) {
                    res--;
                }
            }
            out.println(res);
        }
        out.close();
    }
}

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Reader {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    public String next() {
        while (!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public String nextLine() {
        try {
            return br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean hasNext() {
        String next = null;
        try {
            next = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (next == null) {
            return false;
        }
        st = new StringTokenizer(next);
        return true;
    }
}

 */
