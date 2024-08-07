import java.util.*;

public class E_BinaryDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum =0;
        int[] arr = new int[n];
        for( int i =0; i<n; i++) {
            arr[i]=sc.nextInt();
            sum+= arr[i];
        }
        if(k>sum){
            System.out.println(-1);
            continue;
        }
        if(k==sum){
            System.out.println(0);
            continue;
        }
           long[] preFix = new long[n];
        preFix[0]= arr[0];
        for( int i=1;i<n; i++) preFix[i]= preFix[i-1]+arr[i];

            HashMap<Long, Integer> map = new HashMap<>();
            map.put(0l,-1);
            int max =0;
            for( int i =0; i<n; i++){
                if(!map.containsKey(preFix[i])){
                    map.put(preFix[i],i);
                }
                if(preFix[i]-k>=0){
                   max = Math.max(max,i-map.get(preFix[i]-k));
                }

            }
            System.out.println(n-max);

        
        
        }
    }
}
/*
 Deque<Integer> dq = new ArrayDeque<>();
        for( int i =0; i<n; i++){
            if(arr[i]==1){
                dq.add(i);
            }
        }
        int t = sum-k;
        int prevFirst =0;
        int prevLast=n-1;

        while(t-->0&& !dq.isEmpty()){
            if((dq.peekFirst()-prevFirst)<=(prevLast-dq.peekLast())){
                prevFirst= dq.pollFirst()+1;
            }
            else{
                prevLast= dq.pollLast()-1;
            }
        }
            System.out.println((prevFirst)+(n-1-prevLast));

 */