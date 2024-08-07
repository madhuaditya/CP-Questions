import java.util.Scanner;
import java.util.Stack;

public class B_YetnotherrokenKeoard {
//    static class Info{
//        char ch ;
//        int ind;
//        Info(char ch , int ind)
//        {
//            this.ch  = ch;
//            this.ind = ind;
//
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt() ;
        while (tc-- > 0){
            String str = sc.next();
            int n = str.length();
            Stack<Integer> lower = new Stack<>();
            Stack<Integer> upper = new Stack<>();
            StringBuilder sb = new StringBuilder("");
            boolean[] arr = new boolean[n];

            for(int i =0; i<n ; i++){
                char ch = str.charAt(i);
                if(ch =='b'|| ch=='B'){
                    if(ch=='b' && !lower.isEmpty()){
                        arr[lower.pop()]=true;
                    }
                    if(ch =='B' && !upper.isEmpty()){
                        arr[upper.pop()]= true;
                    }

                }
                else  if(ch>='A' && ch<= 'Z'){
                    upper.push(i);
                }
                else{
                   lower.push(i);
                }
            }
            for(int i =0; i<n ;i++){
                if(!arr[i] && str.charAt(i)!='b' && str.charAt(i)!='B'){
                    sb.append(str.charAt(i));
                }
            }
//            ArrayList<Info> lower = new ArrayList<>();
//            ArrayList<Info> upper = new ArrayList<>();
//            for( int i =0; i< n ; i++){
//                if(str.charAt(i)== 'b' || str.charAt(i)=='B') {
//                    if (str.charAt(i) == 'b') {
//                        if (lower.size() > 0) {
//                            lower.remove(lower.size()-1);
//                        }
//                    } else {
//                        if(upper.size()>0){
//                            upper.remove(upper.size()-1);
//                        }
//                    }
//                }
//                else if(str.charAt(i)>='A'&& str.charAt(i)<='Z' ){
//                    upper.add(new Info(str.charAt(i), i));
//                }
//                else {
//                    lower.add(new Info(str.charAt(i), i));
//                }
//            }
//            StringBuilder sb = new StringBuilder("");
//            while(lower.size()>0&& upper.size()>0){
//                if(lower.get(0).ind<upper.get(0).ind){
//                    sb.append(lower.get(0).ch);
//                    lower.remove(0);
//                }
//                else{
//                    sb.append(upper.get(0).ch);
//                    upper.remove(0);
//                }
//            }
//            while (lower.size()>0){
//                sb.append(lower.get(0).ch);
//                lower.remove(0);
//            }
//            while (upper.size()>0){
//                sb.append(upper.get(0).ch);
//                upper.remove(0);
//            }

            System.out.println(sb);
        }
    }
}
