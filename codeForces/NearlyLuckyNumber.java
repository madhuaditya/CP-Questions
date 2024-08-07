import java.math.BigInteger;
import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
//        if(a ==4 || a== 7){
//            System.out.println("NO");
//            return;
//        }
//        boolean bl = false;
//        boolean blun = false;
//        boolean chk = false;
//        while (a != 0){
//            long b= a%10;
//            if (b!= 4 && b!= 7)
//                blun = true;
//                if(b ==4|| b ==7){
//                   bl =true;
//                    if(bl && blun){
//                        chk = true;
//                    }
//
//                }
//
//                if(bl ){
//                    if(b == 4 || b == 7 && chk){
//                        System.out.println("NO");
//                        return;
//                    }
//                }
//
//
//            a = a/10;
//        }
//        if(!bl){
//            System.out.println("NO");
//            return;
//        }
//        System.out.println("YES");
//      if (a ==4 || a ==7){
//          System.out.println("NO");
//          return;
//      }
//
//        boolean lu = false;
//        boolean unl = false;
//        int swtch = 0;
//        while (a !=0) {
//            long b = a % 10;
//
//            if (b != 4 && b != 7)
//                unl = true;
//           else if (b == 4 || b == 7) {
//                lu = true;
//            }
//            a = a / 10;
//            if(lu && unl){
//                if((b != 4 && b != 7)&& ((a%10 == 4 || a%10 == 7) && (a!=0))){
//                    swtch++;
//                }
//                else if((b == 4 || b == 7)&& ((a%10 != 4 && a%10 != 7) && (a!=0))){
//                    swtch++;
//                }
//            }
//
//
//
//        }
//        if(unl&& !lu && swtch==0){
//            System.out.println("NO");
//        }
//        else if (swtch>0){
//            System.out.println("NO");
//        }
//        else {
//            System.out.println("YES");
//        }
        int b =0;
        int c = 0;
        while(a !=0){
            long i = a%10;
            if(i==4)
                b++;
            if(i ==7){
                c++;
            }
            a=a/10;
        }
        if(b+c == 4 || b+c ==7){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
