import java.util.Scanner;

public class C_Chat_Ban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
//        long k = sc.nextLong();
//        long x = sc.nextLong();
//        long total = k*k;
//        if(total<=x){
//            System.out.println((2L *k) -1L);
//            continue;
//        }
////        long half = (k *( 1+k))/2;
////        if(x<=half){
////           long  n = (-1 + (long) Math.sqrt(1+(8*x)))/2;
////           if((long) Math.sqrt(1+(8*x)) != (long ) Math.ceil(Math.sqrt(1+(8*x)))) n+=1;
////                System.out.println(n);
////        }
////        else {
////            x-= half;
////            long sum = (k*(k-1))/2;
////            sum = sum -x;
////            long  n = (-1 + (long) Math.sqrt(1+(8*sum)))/2;
//////            if((long) Math.sqrt(1+(8*x)) != (long ) Math.ceil(Math.sqrt(1+(8*x)))) n+=1;
////
////            System.out.println(2*k -1 -n);
////
//////          long n = ((2*k-1)-((long)Math.ceil((Math.sqrt((2*k-1)*(2*k-1)-(8*x))))))/2;
//////
//////          if((long)Math.ceil((Math.sqrt((2*k-1)*(2*k-1)-(8*x))))!= (long)(Math.sqrt((2*k-1)*(2*k-1)-(8*x)))) n+=1;
//////            System.out.println(k+n);
////        }
//
//           long ans =2*k -1;
//            long l = 1;
//          long r = 2*k-1;
//          while (l<= r){
//              long mid = (l+r)>>1;
//              long curr_sum ;
//              if(mid < k){
//                  curr_sum = (mid*(mid+1))/2;
//              }else {
//                  curr_sum= total-((mid*(mid-1))/2);
//              }
////              if(curr_sum== x){
////                  ans = mid;
////                  break;
////              } else if (curr_sum<x) {
////                  long s ;
////                  if(mid-1 <= k){
////                      s = (mid*(mid-1))/2;
////                  }else {
////                      s= total-(((mid-2)*(mid-1))/2);
////                  }
////                  if(s<=x){
////                      ans = mid;
////                      break;
////                  }
////                  else {
////                      r= mid-1;
////                  }
////              }else
////                  l = mid+1;
//              if(curr_sum>=x){
//                  ans= mid;
//                  r = mid-1;
//              }
//              else l= mid+1;
//          }
//            System.out.println(ans);
            long n=sc.nextLong(),k=sc.nextLong();
            long sum = ((n)*(n+1))/2;
            if(k==sum){
                System.out.println(n);
                continue;
            }
            long ans1=-1;
            if(k<=sum){
                long s=1l,e=n;
                while(s<e){
                    long mid=s+(e-s)/2;
                    long chec_sum=(mid*(mid+1))/2;
                    if(chec_sum==k){
                        s=mid;
                        break;
                    }else if(chec_sum<k){
                        s=mid+1;
                    }else{
                        e=mid;
                    }
                }
                System.out.println(s);
            }else{
                long req = n*(n-1)/2;
                long sum_cal=req+sum-k;
                long s=1L,e=n-1;
                while(s<e){
                    long mid=s+(e-s)/2;
                    long chec_sum=(mid*(mid+1))/2;
                    if(chec_sum==sum_cal){
                        s=mid+1;
                        break;
                    }else if(chec_sum<sum_cal){
                        s=mid+1;
                    }else{
                        e=mid;
                    }
                }
                System.out.println(n+n-1-s+1);
            }


        }
    }
}
