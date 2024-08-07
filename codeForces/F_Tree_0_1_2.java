import java.util.Scanner;

public class F_Tree_0_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int a = sc.nextInt();
        int g =a;
        int b = sc.nextInt();
        int h = b;
        int c = sc.nextInt();
        int j = c;
        if(c<1){
            System.out.println(-1);
            continue;
        }
        int spick =0;
        if( a!=0){
            spick=2;
            a--;
        }
        else if( b!=0){
            spick=1;
            b--;
        }
        int count =0;
        while( spick!=0){
          count++;
            int x =0;

            if( spick !=0 && a!=0 ){
                if(spick<=a){
                    x += 2*spick;
                    a -= spick;
                    spick=0;
                }
                else {
                    x += 2*a;
                    spick -= a;
                    a=0;

                }
            }
             if( spick!= 0 && b!=0) {
               if(spick<= b){
                   x+= spick;
                   b-= spick;
                   spick=0;
               }
               else {
                   x+= b;
                   spick-= b;
                   b=0;
               }
            }
             if(spick!=0){
                 if(spick>c){
                     break;
                 }
                 else {
                     c-= spick;
                     spick=0;
                 }
             }
             spick=x;
        }
        if( g==0&& h==0 && j==1){
            System.out.println(0);
        }
        else if(spick ==0 && c==0) {
            System.out.println(count);
        }
        else System.out.println(-1);

        }
    }
}
