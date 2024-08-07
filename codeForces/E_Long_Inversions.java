import java.util.PriorityQueue;
import java.util.Scanner;

public class E_Long_Inversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
//        char[] ch = sc.next().toCharArray();
            String s = sc.next();
//        int left =1;
//        int right = n;
//        int ans =1;
//        while (left<= right){
//            int mid = left+(right-left)/2;
//            char[] arr =  new char[n];
//            for( int i = 0; i<n; i++){
//                arr[i] = ch[i];
//            }
//
//            for( int i =0; i<n; i++){
//                if(arr[i] =='0'){
//                    int j = 0;
//                    for( ; j<mid && (i+mid)<=n; j++){
//                        if(arr[i+j]=='1') arr[i+j]='0';
//                        else arr[i+j] = '1';
//                    }
//                }
//            }
//            boolean flag  = false ;
//            for( int i =0; i<n; i++){
//                if(arr[i] =='0') {
//                    flag =true;
//                    break;
//                }
//            }
//            if(flag){
//                right= mid-1;
//            }
//            else {
//                ans = mid;
//                left = mid+1;
//            }
//        }
//        char zero ='0';
//        boolean bl = false ;
//        for( int i =0; i<n; i++){
//            if( ch[i] != zero){
//                bl = true;
//                break;
//            }
//        }
//        if(!bl){
//            System.out.println(n);
//        }else
//            System.out.println(ans);
            int ans = n;
            boolean bl = true;
            while (ans > 1){

                int i = 0;
                final PriorityQueue<Integer> pq = new PriorityQueue<>();
                long count = 0L;

                for( ; i<n; i++){

                    if(count % 2 == 0){
                        if( s.charAt(i) == '1' ) {
                            if(pq.isEmpty()) continue;

                            int top = pq.peek();
                            if( top <= i) {
                                count--;
                                pq.poll();
                            }
                            continue;
                        }
                    }
                    else{
                        if(s.charAt(i) == '0') {
                            if(pq.isEmpty()) continue;
                            int top = pq.peek();
                            if( top <= i) {
                                count--;
                                pq.poll();
                            }
                            continue;
                        }
                    }

                    pq.add( (i+ans-1) );
                    count++;

                    if( (n-i) < ans ) break;

                    int top = pq.peek();
                    if( top <= i) {
                        count--;
                        pq.poll();
                    }
                }

                if( pq.isEmpty() ){
                    System.out.println(ans);
                    bl = false;
                    break;
                }

                ans--;
            }
      if (bl)
            System.out.println(1);


        }
    }
}
