import java.util.*;

public class C_Array_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int k =sc.nextInt();
        long[] arr = new long[n ];
        long Min = Long.MAX_VALUE;
        for( int i =0; i< n ; i++) {
            arr[i] = sc.nextLong();
            Min = Math.min(Min,arr[i]);

        }
//            Arrays.sort(arr);
        if(k>2){
            System.out.println(0);
        }
//        else if(k ==1){
//           min = Math.min(min,minvalue(arr,n));
//            System.out.println(min);
//        }
//        else {
//
//          for( int i =1; i<n; i++){
////              if(i ==0){
////                  long a = arr[1]-arr[0];
////               int b=   lower_bound(arr,a);
////                  if(b==n){
////                      min = Math.min(min, a-arr[n-1]);
////                  }
////                  else if(b ==0){
////                      min =Math.min (min,arr[0]-b);
////                  }
////                  else {
////                      min =Math.min(min, Math.min(Math.abs(arr[b]-a),Math.abs(a-arr[b-1])));
////                  }
////              }
////              else if()
//              min = Math.min(min, arr[i]-arr[i-1]);
//              long df = arr[i] - arr[i-1];
//              int low = lower_bound(arr,df);
//              if(low ==n){
//                  min = Math.min(min, df-arr[n-1]);
//              }
//            else   if(low== 0){
//                  min=Math.min(min,arr[0]-df);
//              }
//              else {
//                  min = Math.min(min, Math.min(arr[low]-df,df-arr[low-1]));
//              }
//
//          }
//            System.out.println(mi
        else {
            TreeSet<Long> set = new TreeSet<>();
            long minElem = Long.MAX_VALUE;
            for (long num : arr) {
                minElem = Math.min(num,minElem);
                set.add(num);
            }
//                out.println(minElem);
            long min = Long.MAX_VALUE, ans = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) continue;
                    long diff = Math.abs(arr[i] - arr[j]);
                    min = Math.min(min, diff); // For k = 1
                    Long h = set.ceiling(diff);
                    Long l = set.floor(diff);
                    if (l != null) ans = Math.min(ans, Math.abs(l - diff));
                    if (h != null) ans = Math.min(ans, Math.abs(h - diff));
                }
            }
            if (k == 1) System.out.println(Math.min(min, minElem));
            else {
                System.out.println(Math.min(min, Math.min(minElem, ans)));
            }
        }
        
        
        }
    }
    public static long minvalue(long[] arr, int n){
        long diff = Long.MAX_VALUE;
        for( int i =0 ; i<n; i++){
            if(i ==0){
                diff=  Math.min(diff,Math.abs(arr[i]-arr[i+1]));
            }
            else if( i ==n-1){
                diff=  Math.min(diff,Math.abs(arr[i]-arr[i-1]));
            }
            else {
                diff=  Math.min(diff,Math.min(Math.abs(arr[i]-arr[i+1]),Math.abs(arr[i]-arr[i-1])));
            }
        }
        return diff;
    }
    static int lower_bound(long array[], long key)
    {
        int low = 0, high = array.length;
        int mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (key <= array[mid]) {
                high = mid;
            }
            else {

                low = mid + 1;
            }
        }
        if (low < array.length && array[low] < key) {
            low++;
        }
        return low;
    }

}


//            ArrayList<Long> list = new ArrayList<>();
//            for( int i=0; i<n; i++){
//                if(i ==0){
//                    list.add(arr[i]);
//                    list.add(Math.abs(arr[i] -arr[i+1]));
//                }
//                else if(i==n-1){
//                    list.add(arr[i]);
//                    list.add(Math.abs(arr[i] -arr[i-1]));
//                }
//                else {
//                    list.add(arr[i]);
//                    list.add(Math.abs(arr[i] -arr[i+1]));
//                    list.add(Math.abs(arr[i] -arr[i-1]));
//                }
//            }
//            Collections.sort(list);
//
//            Long val = Long.MAX_VALUE;
//            int m = list.size();
//            for( int i =0; i<m;i++){
//                if(i==0){
//                    val = Math.min(val,Math.min(list.get(i), list.get(i+1)-list.get(i)));
//                }
//                else if (i ==m-1){
//                    val = Math.min(val,Math.min(list.get(i), list.get(i)-list.get(i-1)));
//                }
//                else {
//                    val = Math.min(val,Math.min(list.get(i), list.get(i+1)-list.get(i)));
//                    val = Math.min(val,Math.min(list.get(i), list.get(i)-list.get(i-1)));
//                }
//            }
//            System.out.println(val);
//            long diff = minvalue(arr,n);
//            if(min<diff){
//                System.out.println(min);
//            }
//            else {
//                System.out.println(diff);
//            }
//            long curr = min ;
/*
int flag = 0;

            HashMap<Long,Integer> map = new HashMap<>();
            for( int i =0; i<n ; i++){
                map.put(arr[i],i+1);
            }
            for( int i =0; i<n-1; i++){
                for( int j =i+1; j<n; j++){
                    if(map.containsKey(Math.abs(arr[i]-arr[j]))){
                        flag=1;
                        break;
                    }

                    min = Math.min(min, Math.abs(arr[i]-arr[j]));
                }
            }
            if(flag!= 0){
                System.out.println(0);
            }
            else System.out.println(min);





    9 2
779547116602436426 578223540024979445 335408917861648772 74859962623690081 252509054433933447 760713016476190629 919845426262703497 585335723211047202 522842184971407775
899214809992477
7112183186067757
 */