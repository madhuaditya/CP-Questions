import java.util.Scanner;

public class C_Inhabitant_of_the_Deep_Sea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        long k = sc.nextLong();
        long sum =0;
        int[] arr = new int[n];
        for( int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];

        }
        if(sum<= k){
            System.out.println(n);
            continue;
        }
        int left =0;
        int right = n-1;
        int count=0;
            while( left<=right){
                if(k<=0) break;
                if(left== right){
                    if(k<arr[left]) break;
                    arr[left]=0;
                    break;
                }
                if(arr[left]<= arr[right]&& k>= (2L *arr[left])){

                    arr[right]-=arr[left];
                    if(arr[right]==0) right--;
                    k-= 2L*arr[left];

                    arr[left]=0;
                    left++;
                }
                else if( arr[left]<=arr[right]){
                    if(k<(arr[left]*2L -1)){
                        break;
                    }
                    arr[left]= 0;
                    break;
                }
                else if(arr[right]<arr[left]){
                    if(k<(arr[right]*2L)){
                        break;
                    }

                    arr[left]-= arr[right];
                    k-=2L*arr[right];
                    arr[right]=0;
                    right--;

                }
                else {
                    break;
                }

            }
            for( int i =0; i<n; i++){
                if(arr[i]==0) count++;
            }
            System.out.println(count);


        }
    }
}
//        int right=n-1;
//        while( left<= right){
//
//            if(left==right){
//                if(k>= arr[left]){
//                    count++;
////                    k-= arr[left];
//
//                }
//                break;
//            }
//            if(arr[left]<= arr[right]){
//                if(k < arr[left]) break;
//                count++;
//                k-=arr[left];
//                left++;
//            }
//            else {
//                if(k < arr[right])break;
//                count++;
//                k-=arr[right];
//                right--;
//            }
//
//        }
//            while(k-->0){
//                if(c%2==0){
//                    c++;
//                    arr[left]-=1;
//                    if(arr[left]==0) left++;
//                }
//                else {
//                    c++;
//                    arr[right] -= 1;
//                    if(arr[right]==0) right--;
//                }
//            }
