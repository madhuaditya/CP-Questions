import java.util.HashMap;
import java.util.Scanner;

public class B_Two_gram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        String str = sc.next();
        if(n<=1){
            System.out.println(" ");
            continue;
        }
            HashMap<String , Integer> map = new HashMap<>();
            for(int i =0 ; i<n-1 ; i++){
                map.put(str.substring(i, i+2),map.getOrDefault(str.substring(i,i+2),0)+1);
            }
            int max =-1;
            String s = "";
            for( String key :map.keySet()){
                if(map.get(key)>max){
                    s = key;
                    max = map.get(key);
                }
            }
            System.out.println(s);


        }
    }
}
