import java.util.Scanner;

public class D_Buying_Jewels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
//        int  = sc.nextInt();
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n<k){
            System.out.println("NO");
            continue;
        }
        if(n==k){
            System.out.println("YES");
            System.out.println(1);
            System.out.println(1);
            continue;
        }
        long t = n/k;
        if(t<1L){
            System.out.println("NO");
            continue;
        }
        if(t==1){
            if(2*(n-(k-1))<=n) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            System.out.println(2);
            System.out.println((n-(k-1))+" "+ (1));
            continue;
        }
        if((n/t)!= k){
            if(2*(n-(k-1))<=n) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            System.out.println(2);
            System.out.println((n-(k-1))+" "+ (1));
            continue;
        }
            System.out.println("YES");
            System.out.println(1);
            System.out.println(t);


        }
    }
}


// 999999999999999995 499999999999999998
//         YES
//         2
//        499999999999999998 1
