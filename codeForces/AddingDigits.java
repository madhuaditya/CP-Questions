import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class AddingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, n ;
        a = sc.nextInt();
        b= sc.nextInt();
        n = sc.nextInt();
      if(n<8){
          while (n>0){
              int check =a;
              a = a*10;

              int i =1;
              while(i<10){
                  a = a+1;
                  if(a%b ==0 && check%10 != i){
                      break;
                  }
                  i++;
              }
              if(a%b!=0){
                  System.out.println(-1);
                  return;
              }
              n--;
          }
          System.out.println(a);
          return;
      }
       int res =-1;
       for(int i =0; i<10; i++){
           if(((a*10)+i)%b ==0){
               res =i;
               break;
           }
       }
       if(res!=-1){
           String str = Integer.toString(a*10+res);
           StringBuilder sb = new StringBuilder(str);
           while (n>0){
               sb.append('0');
               n--;
           }
           System.out.println(sb.toString());
       }
       else
           System.out.println(-1);




    }
}


/*
        long x =b;
        boolean bl = false;
        while (x>1){
            long z = x%10;
            if(z!=0){
                bl = true;
                break;
            }
            x = x/10;
        }
        StringBuilder sb = new StringBuilder("");
        sb.append(a);
        if(n>10){
            long s = n;
            while (s>0) {
                sb.append('0');
                s--;
            }
            System.out.println(sb.toString());
            return;
        }
        while (n>0){
            long check =a;
            a = a*10;

            int i =1;
            while(i<10){
                a = a+1;
                if(a%b ==0 && check%10 != i){
                    break;
                }
                i++;
            }
            if(a%b!=0){
                System.out.println(-1);
                return;
            }
            n--;
        }
        System.out.println(a);
 */