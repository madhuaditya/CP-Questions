public class bisectionMethod {
    static double fun(double a){
        double ans = Math.pow( 10,a) + Math.sin(a ) + 2*a;
        return ans;
    }
    static void  biart(double a , double b){
        if(Math.abs(a-b)<1e-6) return;
        double mid = (a+b)/2;
        double val = fun(mid);
        if (val == 0) return;
        if(val>0){
            System.out.printf("%.10f %.10f %.10f %.10f\n", a, b,mid,val );
            biart(a,mid);
        }
        else {
            System.out.printf("%.10f %.10f %.10f %.10f\n", a, b,mid,val );
            biart(mid , b);
        }
    }
    public static void main(String[] args) {
        biart(-1,0);
    }
}
