import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class D_Districts_Connection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        HashMap<Integer,Integer> hm = new HashMap<>();
        long ans=0;
            for(int i=1;i<=n;i++){
                int val = sc.nextInt()-i;
                if(hm.containsKey(val)){
                    ans+=hm.get(val);

                }
                    hm.put(val,hm.getOrDefault(val,0)+1);

            }
            System.out.println(ans);
        }
    }
}
