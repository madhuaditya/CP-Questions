import java.util.HashMap;
import java.util.Scanner;

public class A_Stickogon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
            HashMap<Integer , Integer> map = new HashMap<>();

            for(int i =0; i<n; i++){
                int a = sc.nextInt();

                map.put(a , map.getOrDefault(a, 0)+1);

            }
            int count =0;
            for( int key : map.keySet()){
                if(map.get(key)>2){
                    count+= map.get(key)/3;
                }
            }
            System.out.println(count);
        
        
        }
    }
}
