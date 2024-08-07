public class factorial {
    static class Factorial{
        int n ;
       public Factorial(int n ) {
          int fac=1;
             for(int i = 1; i<=n; i++){
                fac*= i;
             }
           System.out.println(fac);
        }
    }

    public static void main(String[] args) {
        Factorial ab= new Factorial(7);
    }
}
