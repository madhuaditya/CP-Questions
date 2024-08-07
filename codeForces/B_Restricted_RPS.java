import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class B_Restricted_RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt()    ;
        String str = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            map.put('R',a);
            map.put('P',b);
            map.put('S', c);

            char[] arr = new char[str.length()];
            int count =0;
            for( int i =0; i<n; i++){
                char ch = str.charAt(i);
                if(ch=='R'){
                    int z = map.get('P');
                    if(z>0){
                        arr[i]='P';
                        map.put('P', map.get('P')-1);
                        count++;
                    }
                }
                else if(ch =='P')
                {
                    int z = map.get('S');
                    if(z>0){
                        arr[i]='S';
                        map.put('S', map.get('S')-1);
                        count++;
                    }
                }
                else {
                    int z = map.get('R');
                    if(z>0){
                        arr[i]='R';
                        map.put('R', map.get('R')-1);
                        count++;
                    }
                }
            }
            if(count>= (n+1)/2){
                ArrayList<Integer> list = new ArrayList<>();
                for( int i =0; i<n; i++){
                    if(!((int )arr[i] > 0)){
                        list.add(i);
                    }
                }
                for( int i :list){
                    for( char j : map.keySet()){
                        if(map.get(j)>0){
                            arr[i]= j;
                            map.put(j, map.get(j)-1);
                            break;
                        }
                    }
                }
                System.out.println("YES");
                for( int i =0; i<n; i++){
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
            else {
                System.out.println("NO");
            }
        
        
        }
    }
}
