import java.util.HashMap;
import java.util.Scanner;

public class B_Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
            HashMap<Character , Integer> map = new HashMap<>();
            for( int i=0; i<n ; i++ ){
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
            }
            HashMap<Character, Integer> curr = new HashMap<>(map);
                  for( char ch : curr.keySet()){
                      if(k<=0){
                          break;
                      }
                      if(map.get(ch)%2!=0){
                          int a = map.get(ch)-1;
                          if(a==0){
                              k--;
                              map.remove(ch);
                              if(map.size()==0){
                                  break;
                              }

                              continue;
                          }
                          map.put(ch,map.get(ch)-1);
                          k--;
                      }
                  }
                  if( k==0){
                      int flag =0;
                      for (char ch : map.keySet()) {
                          if(map.get(ch)%2!=0){
                              flag++;

                          }
                      }
                      if(flag>1){
                          System.out.println("NO");
                      }
                      else{
                          System.out.println("YES");
                      }
                  }
                  else
                      System.out.println("YEs");



              }

    }
}
/*
if(map.size()==0 && k==0){
                      System.out.println("yes");
                      continue;
                  }
                  if(map.size()==0 && k>0){
                      System.out.println("NO");
                      continue;
                  }
                  if(map.size()==1 && (k==0||k==1)) {
                      System.out.println("Yes");
                      continue;
                  }
                  boolean odd = false ;
                  int count =0;
                  curr= new HashMap<>(map);
                  for( char ch: curr.keySet()){
                      count+= map.get(ch);
                      if(map.get(ch)%2!=0) odd = true;
                  }
                  if(odd) {
                      System.out.println("NO");
                      continue;
                  }
                  if(k%2==0 && k<=count){
                      System.out.println("YES");
                  }
                  else System.out.println("NO");

//                  if(k<=0){
//                      int flag =0;
//                      for (char ch : map.keySet()) {
//                          if(map.get(ch)%2!=0){
//                              flag++;
//                              break;
//                          }
//                      }
//                      if(flag>0){
//                          System.out.println("NO");
//                      }
//                      else{
//                          System.out.println("YES");
//                      }
//                  }
//                  else{
//                      for(char ch :map.keySet()){
//                          if(k<=1){
//                              break;
//                          }
//                          int a = map.get(ch);
//                          if(k-a>=0){
//                              k-=a;
//                          }
//                          else{
//                              if(k)
//                          }
//                      }
//                  }
 */
