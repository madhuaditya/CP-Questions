import java.util.HashMap;
import java.util.Scanner;

public class D_Divide_and_Equalize {
    public static void main(String[] args) {
//        int a = 5;
//        double b= 5d;
//        int z = (int) Math.sqrt(a);
//        System.out.println(z);
//        System.out.println(( int ) Math.sqrt(a));
//        double c= Math.sqrt(b);
//        System.out.println(c);
//        System.out.println(Math.sqrt(a));
//        System.out.println(Math.sqrt(b));
//     if(Math.abs( c-z) < 1e-9){
//         System.out.println("YES");
//     }
//     else
//         System.out.println("NO");
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
        for( int i =0; i<n; i++) {
            int a = sc.nextInt();
            primeFactors(a, map);
        }
        boolean bl = true;
        if(map.isEmpty()){
            System.out.println("YES");
        }
        else {
            for( int i : map.keySet()){
                if( map.get(i)%n!=0){
                    bl = false;
                    break;
                }
            }
            if(bl) System.out.println("YES");
            else System.out.println("NO");
        }



        }

    }

    public static void primeFactors(int n , HashMap<Integer,Integer> map)
    {
        while (n%2==0)
        {
            map.put(2,map.getOrDefault(2,0)+1);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                map.put(i, map.getOrDefault(i,0)+1);
                n /= i;
            }
        }
        if (n > 2)
            map.put(n,map.getOrDefault(n,0)+1);

    }
}
