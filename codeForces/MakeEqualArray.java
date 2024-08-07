import java.util.*;
public class MakeEqualArray {


        public static void main(String[] arg){
            Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
            while(t-- > 0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i =0; i<n; i++){
                    arr[i] = sc.nextInt();

                }
                if(arr[0]!= arr[n-1]){
                    //   System.out.println(n-1);
                    int left = 1;
                    int right = 1;
                    for(int i =1; i <n-1; i++){
                        if(arr[i]==arr[i-1]){
                            left++;
                        }
                        else
                            break ;

                    }
                    for(int i = n-2; i>0; i--){
                        if(arr[i]== arr[i+1]){
                            right++;
                        }
                        else
                            break;

                    }
                    System.out.println(n - Math.max(left,right));
                }
                else {
              int left =0;
              int right = n-1;
              int curr = arr[left];
              while(right> 0){
                  if(arr[right]!= curr){
                      break;
                  }
                  right--;
              }
              if(right==0){
                  System.out.println(0);
              }
              else {
                  while (left < n - 1) {
                      if (arr[left] != curr) {
                          break;
                      }
                      left++;
                  }
                  System.out.println(right - left + 1);
              }
                }
            }
        }
    }

//                    int left = 0;
//                    int right = n -1;
//                    int curr = arr[0];
//                    while(arr[left] == curr && left<right){
//                        left++;
//                    }
//                    while(arr[right]== curr&& left <right){
//                        right--;
//                    }
//                    if(right-left ==1)
//                    {
//                        if(arr[left]== curr && arr[right]== curr )
//                        System.out.println(0);
//                        else
//                            System.out.println(right    -left+1);
//                       continue;
//                    }
//                    System.out.println(right-left +1);
//
//