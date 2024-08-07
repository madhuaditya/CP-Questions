import java.util.ArrayList;
import java.util.Scanner;

public class FastThreeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            long sum = 0;
            for(int  i = 0; i<n ; i++){
                int a = sc.nextInt();
                list.add(a);
                sum+= a;
            }
            if(sum%3==0){
                System.out.println(0);
            }
            else if((sum+1)%3==0){
                System.out.println(1);
            }
            else{
               int check =0;
               for(int i = 0; i<n; i++){
                   if((sum - list.get(i))%3==0){
                       check=1;
                       break;
                   }
               }
               if(check==1){
                   System.out.println(1);
               }
               else {
                   System.out.println(2);
               }

            }

        }
    }
}
