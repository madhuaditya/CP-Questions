import java.util.HashMap;
import java.util.Scanner;

public class B_M_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr= new int[n];
        for( int i =0; i<n; i++){
            arr[i]= sc.nextInt()%m;
        }
            HashMap<Integer, Integer> map = new HashMap<>();
            for( int i =0; i<n ; i++){
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }
            long ans =0;
//            System.out.println(map);
            for( int i =0; i<n ; i++){
             if( arr[i] ==0){
                 if(map.containsKey(0)){
                     ans+=1;
                     map.remove(0);
                 }
                 continue;
             }
             int t= m-arr[i];
             if(t == arr[i]){
                 if(map.containsKey(t)){
                     ans+=1;
                     map.remove(t);
                 }
             }else{
                 if(map.containsKey(arr[i])) {
                     if (map.containsKey(t)) {
                         int a = map.get(arr[i]);
                         int b = map.get(t);
                         if (a == b || Math.min(a, b) + 1 == Math.max(a, b)) {
                             ans += 1;
                         } else {
                             ans += (Math.max(a, b) - Math.min(a, b) );
                         }
                         map.remove(t);
                         map.remove(arr[i]);
                     }
                 }
             }
            }
            if(!map.isEmpty()){
                for( int i : map.keySet()) ans+= map.get(i);
            }
            System.out.println(ans);

        
        }
    }
}
