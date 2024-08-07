import java.util.Scanner;

public class SendingMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
                int n=sc.nextInt();
                long f=sc.nextLong(),op=sc.nextLong(),b=sc.nextLong();
                long sum=0;
                long set[]=new long[n+1];
                for(int i=1;i<=n;i++){
                    set[i]=sc.nextLong();
                    sum+=Math.min((set[i]-set[i-1])*op,b);

                }
                System.out.println(sum>=f?"NO":"YES");

        }
    }
}
/*
il.*;

public class codecheff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        for (int j=0;j<m;j++){
            int n=sc.nextInt();
            long f=sc.nextLong(),op=sc.nextLong(),b=sc.nextLong();
            long sum=0;
            long a[]=new long[n+1];
            for(int i=1;i<=n;i++){
                a[i]=sc.nextLong();
                sum+=Math.min((a[i]-a[i-1])*op,b);

            }
            System.out.println(sum>=f?"NO":"YES");
        }

    }}
 */