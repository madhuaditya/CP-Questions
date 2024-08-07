import java.util.Scanner;

public class A_Setting_up_Camp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int t = b%3;
        if(t == 1 || t == 2){
            if(t== 1 && c <2){
                System.out.println(-1);
                continue;
            }
            if(t == 2 && c == 0){
                System.out.println(-1);
                continue;
            }
        }
        int n = a ;
        n+= b/3;
        if(t == 1){
            n+= 1;
            c-=2;
        }
        if(t == 2){
            n+= 1;
            c-=1;
        }
        n += (int) Math.ceil((double)c/3);
            System.out.println(n);



        }
    }
}
