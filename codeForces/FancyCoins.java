import java.util.Scanner;

public class FancyCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        long m = sc.nextLong();
        long k = sc.nextLong();
        int a1 = sc.nextInt();
        int ak = sc.nextInt();
            long ans = Math.min((m/k) , ak);
            long val = (m - (ans*k));
            ans = 0;
            ans = (val/k + val%k);

            long rem = val%k;

            if(a1 <= rem){
                ans -= a1;
                System.out.println(ans);
                continue;
            }

            a1 -= rem;
            ans  = (val/k);
            ans -= (a1/k);
            ans = Math.max(ans , 0l);

            System.out.println(ans);

        }
    }
}

/*
//        long ans = 0;

//        if(a1==0&& a2 == 0){
//            ans += (m/k) + (m%k);
//
//        }
//          else {
//              if((a1*1)+(a2*k)>= m){
//                  long a = m- (a1*1)+(a2*k);
//
//
//                    if(a <= a1){
//                        ans=0;
//                    }
//                   else {
//                        while ( m - k >=0 && a2-->0){
//                            m -=k;
//                        }
//                        if(m<= a1){
//
//                        }
//                        else {
//                            if(m <= (a1+k)){
//                                if(a1<k){
//                                    m -= a1;
//                                    ans += (m/k) + (m%k);
//                                }
//                                else
//                                    ans ++;
//                            }
//                            else {
//                                m -= a1;
//                                ans += (m/k) + (m%k);
//                            }
//                        }
//
//
//                    }
//
//              }
//              else{
//
//                    m -= k*a2;
//                    if(m <= (a1+k) ){
//                        if(a1<k){
//                            m -= a1;
//                            ans += (m/k) + (m%k);
//                        }
//                        else
//                            ans ++;
//                    }
//                    else {
//                        m -= a1;
//                        ans += (m/k) + (m%k);
//                    }
//              }
//        }
 */
