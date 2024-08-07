import java.util.HashMap;
import java.util.Scanner;

public class B_Equal_XOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = 2*k;
        int[] arr = new int[2*n];
        for (int i =0;i<2*n; i++){
            arr[i] = sc.nextInt();
        }
            HashMap<Integer, Integer> map = new HashMap<>();
             HashMap<Integer,Integer> set = new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(arr[i] , map.getOrDefault(arr[i], 0)+1);
            set.put(arr[i+n] , set.getOrDefault(arr[i+n], 0)+1);

        }
//        if(map.size()==n ){
//           for( int i =1; i<=2*k; i++) System.out.print( i+" ");
//
//                      System.out.println();
//
//           for( int i =1; i<=2*k; i++) System.out.print( i+" ");
//                    System.out.println();
//            continue;
//
//        }
//        if(2*k == n){
//            for( int i =0; i<n; i++) System.out.print(arr[i]+" ");
//            System.out.println();
//            for( int i =0; i<n; i++) System.out.print(arr[i+n]+" ");
//            System.out.println();
//            continue;
//        }
        if(k <= n-map.size()){
            int count =0;
            for( int i : map.keySet()){
                if(map.get(i)==2 && count<k) {
                    count++;
                    System.out.print(i + " " + i + " ");
                }
            }
            System.out.println();
            count=0;
            for( int i : set.keySet()){
                if(set.get(i)==2 && count<k) {
                    count++;
                    System.out.print(i + " " + i + " ");
                }
            }
            System.out.println();
        }
        else {
            k -= (n- map.size());
            int[] ele = new int[2*k];
            int j =0;
            for( int key : map.keySet()){
                if(map.get(key)==1 && j<2*k){
                   ele[j++]= key;
                }
            }
            for( int i =0 ; i<2*k ; i++){
                System.out.print(ele[i]+" ");
            }
            for( int key : map.keySet()){
                if(map.get(key)==2){
                    System.out.print(key +" " + key+ " " );
                }
            }
            System.out.println();
            for( int i =0 ; i<2*k ; i++){
                System.out.print(ele[i]+" ");
            }
            for( int key : set.keySet()){
                if(set.get(key)==2){
                    System.out.print(key +" " + key+ " " );
                }
            }
            System.out.println();
        }


        
        
        }
    }
}
// 8 9 9 10 10 1 2 3 4 5
// 1 2 3 4 5 6 6 7 7 8