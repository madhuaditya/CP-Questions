public class NumTheory002 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
//        long b = (1<<32);
        System.out.println(a);
//        System.out.println(b);
        int num =1;
        for(int i =1; i<34; i++ ){
           num = ((num<<1)| 1);
        }
        System.out.println(num);
    }
}
