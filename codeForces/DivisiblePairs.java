import java.util.*;

public class DivisiblePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long  x = sc.nextLong(), y = sc.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            HashMap<Long, HashMap<Long, Long>> set = new HashMap<>();
            long count = 0;
            for (int i = 0; i < n; i++) {
              long a = arr[i] % x;
              long b = arr[i ]%y;
              long c = (x-a)%x;
              if(set.containsKey(b)){
                  count+= set.get(b).getOrDefault(c,0l);
              }
              else {
                  set.put(b, new HashMap<>());
              }
              set.get(b).put(a, set.get(b).getOrDefault(a,0l)+1);

            }
            System.out.println(count);
        }
    }
}
/*
//              if(set1.containsKey((x-(arr[i]%x))%x)){
//                  if (set2.containsKey(arr[i]%y)){
//                    ArrayList<Integer> list1 = set1.get((x-(arr[i]%x))%x);
//                      ArrayList<Integer > list = set2.get(arr[i]%y);
//                     if(list.size()<list1.size()){
//                         for(int ele : list){
//                             if(list1.contains(ele)){
//                                 count++;
//                             }
//                         }
//                     }
//                     else {
//                         for(int ele : list1){
//                             if(list.contains(ele)){
//                                 count++;
//                             }
//                         }
//                     }
//                  }
//              }
//              if (set1.containsKey(arr[i]%x)){
//                  ArrayList<Integer> list = set1.get(arr[i]%x);
//                  list.add(i);
//              }
//              else {
//                  ArrayList<Integer> list = new ArrayList<>();
//                  list.add(i);
//                  set1.put(arr[i]%x,list);
//              }
//                if (set2.containsKey(arr[i]%y)){
//                    ArrayList<Integer> list = set2.get(arr[i]%y);
//                    list.add(i);
//                }
//                else {
//                    ArrayList<Integer> list = new ArrayList<>();
//                    list.add(i);
//                    set2.put(arr[i]%y,list);
//                }
//
//
//            }
 */
