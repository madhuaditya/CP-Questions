import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        String[] arr = str.split();
        ArrayList<String> list = new ArrayList<>();
        int left =0;
        for(int i =0 ; i<str.length(); i++){
            if(str.charAt(i)=='+'){
                list.add(str.substring(left, i));
                left = i+1;
            }
        }
        list.add(str.substring(left));
        Collections.sort(list);
//        System.out.println(list);
        StringBuilder sb = new StringBuilder("");
        for(int i =0; i <list.size()-1; i++){
            sb.append(list.get(i)+"+");
        }
        sb.append(list.get(list.size()-1));
        System.out.println(sb.toString());
    }
}
