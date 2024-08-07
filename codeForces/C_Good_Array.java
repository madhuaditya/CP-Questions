import java.util.ArrayList;
import java.util.Scanner;

public class C_Good_Array {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int tc = 1;
     while(tc-- >0){
     // code here 
     int n = sc.nextInt();
      int[] arr = new int[n];
      long sum =0;

      int first =Integer.MIN_VALUE;
      int second = Integer.MAX_VALUE;

      for( int i =0; i<n ; i++){
          arr[i] = sc.nextInt();
          sum+= arr[i] ;
          if(first<= arr[i]){
              second= first;
              first=arr[i];
          }
          else if(second<=arr[i]){
              second= arr[i] ;
          }

      }
         ArrayList<Integer> list = new ArrayList<>();
      for( int i = 0 ; i<n ; i++){
          if( arr[i]==first){
            long curr = sum-first;
            if(curr%second==0&& curr/second==2){

                list.add(i+1);
            }
          }
          else {
              long curr = sum ;
              curr-= arr[i] ;
              if(curr%first ==0 && curr/first==2){
                  list.add(i+1);
              }
          }
      }
         System.out.println(list.size());
      if(list.size()==0){
          System.out.println();
      }
      else {
          for( int i =0;i<list.size(); i++){
              System.out.print(list.get(i)+" ");
          }
          System.out.println();
      }

     
     
     }
    }
}
