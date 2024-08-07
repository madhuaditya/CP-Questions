import  java.util.*;
public class testDoubte001 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        boolean[] x = new boolean[1000000];
//        int[] m = new int[1000000];
//        int n = 1000000;
//        for( int i =0; i<n; i++){
//            x[i] = false;
//        }
        long smallArray = System.nanoTime();

//        long bigArray = System.nanoTime();
//        System.out.println("big:" +  ( bigArray - smallArray));
        System.out.println("small:" +  ( smallArray - start));

    }
}
