 
import java.util.*;
 
public class NumberTheory {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();
 
            String str1 = "map";
            String str2 = "pie";
            String str3 = "mapie";


            int lastIdx1 = 0;
            int lastIdx2 = 0;
            int lasIdx3=0;
            int count3 =0;
            int count1 = 0;
            int count2 = 0;
 
            while(true){
                int curr ;
               curr = s.indexOf(str1,lastIdx1);
  if(curr==-1){
      break;
  }
                if(curr != -1){
                    count1++;
                    lastIdx1 = curr+1;
                }
            }
 
            while(true){
                int curr ;
                curr = s.indexOf(str2,lastIdx2);
       if(curr==-1){
           break;
       }

                    count2++;
                    lastIdx2 =curr+1;

            }

            while(true){
                int curr = s.indexOf(str3, lasIdx3);
                if(curr==-1){
                    break;
                }
                count3++;
                lasIdx3=curr+1;
            }
 
            System.out.println(count2 + count1-count3);
 
        }
    }
}