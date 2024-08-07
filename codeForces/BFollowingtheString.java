
import java.util.Scanner;

public class BFollowingtheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder("");
        while(n-- >0){
            int b = sc.nextInt();
            int i =0;
            for( ; i<26; i++){
                if(b == arr[i]){
                    break;
                }
            }
            arr[i]+= 1;
            char ch =(char) ('a'+i);
            sb.append(ch);
        }
            System.out.println(sb);

        }
    }
}
