import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class B_Gardener_and_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
            HashMap<Integer, Integer> map= new HashMap<>();
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for( int i =0; i<n; i++){
            int t = sc.nextInt();
            ArrayList<Integer> ls = new ArrayList<>();
            while (t-- >0){
                int a= sc.nextInt();
                map.put(a, map.getOrDefault(a,0)+1);
                ls.add(a);
            }
            list.add(ls);
        }
           boolean flag1= false;
        for (ArrayList<Integer> lst : list){
            boolean flag = true;
            for( int ele : lst){
                if(map.get(ele)==1){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                flag1 = true;
                break;
            }
        }
        if(flag1) System.out.println("YES");
        else System.out.println("NO");
        
        
        }
    }
}
