import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C_AssemblyviaMinimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int m = (n*(n-1))/2;
        int[] arr = new int[m];

        int max = Integer.MIN_VALUE;
        for( int i =0; i<m; i++){
            arr[i]= sc.nextInt();
            max = Math.max(max, arr[i]);
        }
            TreeMap<Integer, Integer> map = new TreeMap<>();

        for( int i =0; i<m; i++)
        {
          map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
            HashMap<Integer, Integer> list = new HashMap<>();
        int count =1;

        for(int ele : map.keySet()){
            int sn = map.get(ele);
            int alfa = ((1+2*(n-count))+(int)Math.sqrt(((1+2*(n-count))*(1+2*(n-count)))-8*sn))/2;
            int beta = ((1+2*(n-count))-(int)Math.sqrt(((1+2*(n-count))*(1+2*(n-count)))-8*sn))/2;
//            if(alfa>0&& alfa<n){
//                list.put(ele,alfa);
//            }
//            else{
//                list.put(ele,beta);
//            }
            list.put(ele, Math.min(alfa,beta));
            count+= Math.min(alfa,beta);
        }
        for ( int ele : list.keySet()){
            for(int i =0; i<list.get(ele); i++){
                System.out.print(ele+" ");
            }
        }
            System.out.println(1000000000);
        
        }
                
    }
}
