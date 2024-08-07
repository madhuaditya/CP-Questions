public class GCD_LCM {
    public static int gcd (int a , int b){   //  Euclidean algorithm
        if(a==1|| b==1){
            return 1;
        }
        if(a==b){
            return  a;
        }
        int c ;
        while(!(a%b ==0))
        {
            c = a%b ;
            a = b;
            b = c;
        }
        return b;
        /*
        if(b ==0)
        return a;
        return gcd(b , a%b);
         */
    }
    public static  int lcm(int a , int b ){
        if(a==0|| b == 0){
            return -1;
        }
        return (a*b)/gcd(a,b);
    }
    public static void factor(int  n){
        for(int i =1 ; i*i<=n ; i++){
            if(n%i ==0){
                if(n/i ==i){
                    System.out.print(i+" ");
                }
                else
                    System.out.print(i +" "+ n/i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(gcd(42,6));
        System.out.println(lcm(42,6));
        factor(100);
    }
}
