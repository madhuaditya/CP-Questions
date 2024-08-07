import java.util.HashSet;
import java.util.Scanner;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        HashSet<Character> list = new HashSet<>();
        for (int i =0 ; i< str.length(); i++){
            list.add(str.charAt(i));
        }
        if(list.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else
            System.out.println("IGNORE HIM!");
    }
}
