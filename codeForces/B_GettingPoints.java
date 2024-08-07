import java.util.Scanner;

public class B_GettingPoints {
    static  int getNum(int n){  // O(log(n)/log(7))
        int ans ;
        ans = (n-1)/7 + 1;
        return ans;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int tc = sc.nextInt();
     while(tc-- >0){
         long n, l, t, P;
         n = sc.nextLong();
         P = sc.nextLong();
         l = sc.nextLong();
         t = sc.nextLong();

         long bestDay = 2 * t + l;


         long totalT = (long)Math.ceil(n / 7.0);
         long taskINEven = totalT/2;
         long odd = totalT%2;    //would be one or zero - straight up violation

         long workingDay = 0;
         long tillNowPoints = 0;


         if(taskINEven * bestDay >= P){
             workingDay = (long)Math.ceil((double) P/(bestDay));
             System.out.println(n - workingDay);
             continue;
         }else{
             workingDay += taskINEven;
             tillNowPoints += taskINEven * bestDay;
         }

         tillNowPoints += odd == 1 ? (t+l) : 0;   //incase odd scenario is there, simply add it
         workingDay += odd;
         if(tillNowPoints >= P){
             System.out.println(n - workingDay);
             continue;
         }

         long remainingPoints = P - tillNowPoints;
         workingDay += (long)Math.ceil((double)remainingPoints/ l);

         System.out.println(n - workingDay);
     }
     }

    }
    /*
      // code here
//     int n = sc.nextInt();
//     long p = sc.nextLong();
//     int l = sc.nextInt();
//     int t = sc.nextInt();
//     long ans = 0;
//     int task = getNum( n );
//
////     while (ans<p){ //O(n)
////         ans+= l;
////         if(task>1){
////             ans += 2*t;
////             task-=2;
////         }
////         else if(task==1){
////             ans+=t;
////             task-=1;
////         }
////         n--;
////     }
//         long curr = (long) task *t + (long) ((task + 1) / 2) *l;
//         if(curr<p){
//             p-=curr;
//             long x =(p-1)/l +1l;
//             System.out.println(n-x-((task+1)/2));
//
//         }
//         else{
//             if(curr==p){
//                 System.out.println(n-(task+1)/2);
//                 continue;
//             }
//             else{
//
//                 if(task%2==0){
//                     long x = n - ( (p - 1) / (l + 2L* t) + 1L);
//                     System.out.println(x);
//                 }
//                 else{
//                     long value = (long) (task - 1) *t + (long) (task / 2) *l;
//                     if(value>=p){
//                         long x = n - ( (p - 1) / (l + 2L * t) + 1);
//                         System.out.println(x);
//                     }
//                     else{
//                         System.out.println(n-(task+1)/2);
//                     }
//                 }
//
//             }
//
//         }
////         System.out.println(n);
//
//
//
//     }
     */

