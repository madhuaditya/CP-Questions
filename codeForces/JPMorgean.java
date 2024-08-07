import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JPMorgean {
    public static  int pair (List<Integer> a , List<Integer> b){
        Collections.sort(a);
        Collections.sort(b);
        int fist =0;
        int sec = 0;
        int n = a.size();
        int count =0;
        while (fist<n&& sec<n){
            if(a.get(fist)>b.get(sec)){
                count++;
                fist++;
                sec++;
            }
            else if(a.get(fist)<= b.get(sec)){
                fist++;
            }
            else {
                sec++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>(List.of());
        List<Integer> b= new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        b.add(1);
//        b.add(2);
//        b.add(1);
        int cout = pair(a,b);
        System.out.println(cout);
    }
}
