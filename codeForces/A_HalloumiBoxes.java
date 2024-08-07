import java.util.Scanner;

public class A_HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        boolean bl = true;
        for(int i =0; i<n-1; i++){
            if(arr[i]>arr[i+1] && k==1){
                bl = false;
                break;
            }
        }
        if(bl ){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
        }
    }
}
/*
        if(k ==1){
            boolean bl = false;
            for (int i =1; i<n;i++){
                if(arr[i]< arr[i-1]){
                    bl = true;
                    break;
                }
            }
            if (bl ){
                System.out.println("NO");
            }else
                System.out.println("YES");
        }
        else {
            int left =0;
            int right =1;
            boolean bl = false;
//            while (right<n){
//                if(arr[right]>arr[right-1]){
//                  left = right ;
//                  right++;
//                }
//                if(left)
//            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int prevMax=0;

            for(int i=0;i<n; i++){
                if(i<k-1){
                    min = Math.min(min, arr[i]);
                }
                if(i == n-1){
                    if(min<= arr[i] && max>= arr[left] &&prevMax<arr[left]){

                    }
                    else
                        bl = true;
                    break;
                }

                if(arr[i]<arr[i+1] && (i-left+1)<k){
                    max = Math.max(max, arr[i]);
                }
                else{
                     if(prevMax>arr[i] || arr[i]<min )
                }

            }
        }

 */
