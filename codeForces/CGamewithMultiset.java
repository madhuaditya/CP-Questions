import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CGamewithMultiset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = sc.nextInt();
        while (n-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
//            if( a==1 ){
//                addInList(list,b);
//            }
//            else {
//                HashMap<Long , Integer> map = new HashMap();
//                if (b==0){
//                    System.out.println("YES");
//                }
//              else  if(findSubArray(list, map, b)){
//                    System.out.println("YES");
//                }
//                else {
//                    System.out.println("NO");
//                }
            if(a==1){
                map.put(1<<b,map.getOrDefault(1<<b,0)+1);
            }
            else {
                int maxP =(int) (Math.log(b)/Math.log(2));
                while (b>0 && maxP>=0){
                    int pow=(int) Math.pow(2,maxP);
                    if(map.containsKey(pow)){

                      int x = Math.min(b/pow,map.get(pow));
                      b -= x*pow;
                      maxP--;
                    }
                    else {
                        maxP--;
                    }
                }
                if(b<=0){
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");
            }
        }


    }



}
/*
//    static void addInList(ArrayList<Integer> list , int c ){
//        list.add(1<<c);
//    }
//    static boolean findSubArray(ArrayList<Integer> list , HashMap<Long, Integer> map , long c ){
//        map.put(0l,-1);
//         long find = 0;
//         long key = c;
//                 for(int i =0; i<list.size(); i++){
//                     find+= list.get(i);
//                     long get = find-key;
//                     map.put(find, i);
//                     if(map.containsKey(get)){
//                         return true;
//                     }
//
//                 }
//
//                 return false;
//    }
 */
