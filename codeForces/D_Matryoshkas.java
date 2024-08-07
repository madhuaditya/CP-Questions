import java.util.Scanner;
import java.util.TreeMap;
public class D_Matryoshkas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map= new TreeMap<>();

        for( int i =0; i<n; i++){
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a,0)+1);
        }
          long ans = 0l;
        int prev=0;
        int currCount =0;
        for( int i : map.keySet()){
            if(prev==0){
                prev= i;
                currCount=map.get(i);
                continue;
            }
            if(prev+1== i){
                if(map.get(prev)<= map.get(i)){
                    currCount= Math.max(currCount, map.get(i));
                }
                else{
                    ans += currCount-map.get(i);
                    currCount= Math.min(currCount,map.get(i));
                }
                prev= i;
            }
            else{
                ans += currCount;
                currCount= map.get(i);
                prev= i;
            }
        }
        ans+= currCount;
            System.out.println(ans);

        
        }
    }
}
/*
//        int[] arr = new int[m];
//        int i =0;
//        int max = Integer.MIN_VALUE;
//        for(int ele: map.keySet()){
//            max = Math.max(map.get(ele),max);
//            arr[i++]= ele;
//        }
//            System.out.println(max);
 */
