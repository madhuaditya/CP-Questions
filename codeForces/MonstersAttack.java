import java.util.HashMap;
import java.util.Scanner;

public class MonstersAttack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc--  > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            int arr2[] = new int[n];
            for(int i =0 ; i< n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i =0 ; i< n; i++){
                arr2[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i =0; i<n; i++){
                map.put(arr2[i],arr[i]);
            }

            int i =1;
            long goli =0;
            boolean bl = true;
            while (i<= n){
                goli+= k;
                long leftMonsterPower = 0;
                long rightMonsterPower = 0;
                if(map.containsKey(i)){
                    rightMonsterPower = map.get(i);
                }
                if(map.containsKey(-i)){
                    leftMonsterPower = map.get(-i);
                }
                 goli = goli- leftMonsterPower-rightMonsterPower;
                if(goli<0){
                    System.out.println("NO");
                    bl = false;
                   break;
                }
                i++;
            }
            if(bl) {
                System.out.println("YES");
            }

        }
    }
}
