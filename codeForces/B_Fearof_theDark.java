import java.util.Scanner;

public class B_Fearof_theDark {
    public static void main(String[] args) {
//        double a = 0.3*3+0.1;
//        System.out.println(a);
//
//        if(Math.abs(a-1)<= 1e-9){
//            System.out.println("Equal");
//        }
//        else
//            System.out.println("NOT EQUAL");
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int px = sc.nextInt();
        int py = sc.nextInt();
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();
        double min = Long.MAX_VALUE;

        double atop = Math.sqrt((ax-px)*(ax-px)+(ay-py)*(ay-py));
        double atoo = Math.sqrt((ax)*(ax)+(ay)*(ay));
        double valu = Math.max(atoo,atop);

            min= Math.min(min,valu);

        double btop = Math.sqrt((bx-px)*(bx-px)+(by-py)*(by-py));
            double btoo = Math.sqrt((bx)*(bx)+(by)*(by));
            valu = Math.max(btoo, btop);

                min= Math.min(min,valu);
//
            double atob = Math.sqrt((bx-ax)*(bx-ax)+(by-ay)*(by-ay))/2d;
////            if((atoo<atob || Math.abs(atoo-atob)<= 1e-9) &&(atop>atob)){
////                if((btop<atob || Math.abs(btop-atob)<= 1e-9) &&(btoo>atob)){
////                    min= Math.min(min, atob);
////                }
////            }
////            if((btoo<atob || Math.abs(btoo-atob)<= 1e-9) &&(btop>atob)){
////                if((atop<atob || Math.abs(atop-atob)<= 1e-9) &&(atoo>atob)){
////                    min= Math.min(min, atob);
////                }
////            }
//            boolean orig = false;
//            boolean home = false;
//            if((atoo<atob || Math.abs(atoo-atob)<= 1e-9)){
//                orig = true;
//            }
//            if((atop<atob || Math.abs(atop-atob)<= 1e-9)){
//                home = true;
//            }
//            if((btoo<atob || Math.abs(btoo-atob)<= 1e-9)){
//                orig = true;
//            }
//            if((btop<atob || Math.abs(btop-atob)<= 1e-9)){
//                home = true;
//            }
//
//            if(home&& orig){
//                min = Math.min(min,atob);
//            }
//            else if(orig){
//                min = Math.min(min,atob);
//                min = Math.max(min, Math.min(atop,btop));
//            }
//            else{
//                min = Math.min(min,atob);
//                min = Math.max(min, Math.min(atoo,btoo));
//            }
//
            double mintoa = Math.min(atoo,btoo);
            double mintob = Math.min(atop,btop);
            System.out.println(Math.min(min,Math.max(mintoa,Math.max(mintob,atob))));

        }
    }
}
