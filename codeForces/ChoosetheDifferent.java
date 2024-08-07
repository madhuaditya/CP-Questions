import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ChoosetheDifferent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            for (int i =0; i<n; i++){
                set1.add(sc.nextInt());
            }
            for (int i = 0; i<m; i++){
                set2.add(sc.nextInt());
            }
            int left = k/2;
            int right = k/2;
            int common = 0;
            boolean flag = true;
            for(int i = 1; i<= k ; i++){
                boolean s1 = false;
                boolean s2 = false;
                s1=  left>0 ? set1.contains(i):false;
                s2= right>0 ?set2.contains(i):false;

                if(!(s1 || s2)){
                    System.out.println("NO");
                    flag= false;
                    break;
                }
                else if( s1&& s2){
                    common++;
                } else if (s1 == true && s2==false) {
                    left--;
                }else{
                    right--;
                }
            }
        if (flag){
            if (left+right-common == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        }
    }
}
