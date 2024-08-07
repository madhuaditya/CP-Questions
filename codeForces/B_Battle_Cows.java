import java.util.Scanner;

public class B_Battle_Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for( int i =0; i<n; i++) arr[i] = sc.nextInt();
        int id = n;
        for( int i =0; i<n ; i++){
            if(arr[i]>arr[k-1]){
                id = i;
//                int curr = arr[k-1];
//                arr[k-1]= arr[id-1];
//                arr[id-1] = curr;
                break;
            }
        }
//        k = id;
//        int count;
//        if(k==1) count=0;
//        else count=1;
//        for( int i = k; i<n ; i++){
//            if( i ==0) count=0;
//            if(arr[i] >arr[k-1]) break;
//            count++;
//        }
//            System.out.println(count);
            if(id >= k){
                System.out.println(id-1);
            }
            else {
                int curr = id ==0?0:id-1;
                int val = arr[k-1];
                arr[k-1]= arr[id];
                arr[id]= val;
                int sum = id==0?0:1;
                for( int i = id+1; i<n; i++){
                    if(arr[i] > arr[id]){
                        break;

                    }
                    sum ++;
                }
                System.out.println((int ) Math.max(sum, curr));
            }

        }
    }
}
/*
//           int a = arr[k-1];
//        int count =0;
//        for( int i =0; i<n ; i++){
//            if( arr[i] > a){
//                break;
//            }
//            count++;
//        }
//        if(count>=k){
//            count--;
//        }
//            System.out.println(count);
//            int count =0;
//
//            if(k ==1){
//               for( int i =1; i<n; i++){
//                   if(arr[i]>a){
//                       break;
//                   }
//                   count++;
//               }
//
//            }
//            else {
//                int id = k+1;
//                for( int i =0; i<n; i++){
//                    if(arr[i] >a){
//                        id = i+1;
//                        break;
//                    }
//                }
//                if(id>k){
//                    for( int i =k-1;i<n;i++){
//                        if(i ==0 ) continue;
//                        if(arr[i]>arr[k-1]) break;
//                        count++;
//                    }
//                }
//                else {
//                    int curr = arr[id-1];
//                    arr[id-1] = arr[k-1];
//                    arr[k-1]= curr;
//                    k = id;
//                    if(k ==1){
//                        for( int i =1; i<n; i++){
//                            if(arr[i]>a){
//                                break;
//                            }
//                            count++;
//                        }
//                    }
//                    else {
//                        count=1;
//                        for( int i = k ; i<n;i++){
//                            if(arr[i]> arr[k-1]) break;
//                            count++;
//                        }
//                    }
//                }
//            }
//
//            System.out.println(count);
 */