import java.util.Scanner;

public class C_Training_Before_the_Olympiad {
    static long counting(int[] arr, int ind){
        long ans = 0;
        ans += arr[ind]/3;
        if(arr[ind  ] % 3==1){
            ans++;
        }
    return ans;
    }
static void print(long[] arr){
        for (long ele : arr){
            System.out.print(ele +" ");
        }
    System.out.println();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int count =0;
            long[] arr = new long[n];
            int[] add = new int[n];
            for(int i =0; i<n; i++){
                arr[i]= sc.nextLong();
                if(arr[i]%2!=0) {
                    count++;
                }
                add[i]= count;
                if(i>0){
                    arr[i]= arr[i-1]+ arr[i];
                }
            }

           for(int i =1; i<n ; i++){
               arr[i] -= counting(add, i);
           }
           print(arr);

        }
    }
}
