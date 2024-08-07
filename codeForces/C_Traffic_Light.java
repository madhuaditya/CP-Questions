import java.util.Scanner;

public class C_Traffic_Light {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int tc = sc.nextInt();
     while(tc-- >0){
     // code here
     int n = sc.nextInt();
     char ch = sc.next().charAt(0);
     String str = sc.next();
      if(n ==1 || ch=='g'){
          System.out.println(0);
          continue;
      }
      int[] arr = new int[n];
      int a =-1;
      for( int i =0; i<n ; i++){
          if(str.charAt(i)=='g'){
              a= i;
              break;
          }
      }
      for( int i =n-1;i>=0; i--)
      {
          if(str.charAt(i)==ch){
              arr[i] = a;
          }
          if(str.charAt(i)=='g'){
              a= i;
          }

      }
      int ans = Integer.MIN_VALUE;
      for( int i =0; i<n ; i++){
          if(str.charAt(i)==ch){
              if(arr[i]<i){
                  int k = n-i+arr[i];
                  ans=Math.max(ans,k);

              }
              else {
                  int k = arr[i]-i;
                  ans= Math.max(ans,k);
              }
          }
      }
         System.out.println(ans);
     }
    }
}
