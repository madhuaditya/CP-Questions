
import java.util.Arrays;
import java.util.Scanner;

public class EffectiveApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i =0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr[] = new int[m];
        for (int i =0; i<m; i++){
            arr[i] = sc.nextInt();
        }
        int lin =0;
        int bin =0;
        // for leaner search
        for(int i =0; i<m ; i++){
            int a = arr[i];
            for(int j =0 ; j<n; j++){
                if(arr1[j]== a){
                    lin++;
                    break;
                }
                lin++;
            }
        }
      // for binary search
        Arrays.sort(arr1);
        for (int i =0; i<m ; i++){
            int a = arr[i];
            int mid =0;
            int start =0, end = arr1.length-1;

            while(start<=end){
                mid = (start+end)/2;
                if (arr1[mid]== a){
                    bin++;
                    break;
                } else if (arr1[mid] > a) {
                    end = mid-1;
                }
                else
                    start = mid+1;
                bin++;
            }
        }
        System.out.println(lin+" "+ bin);
    }
}
// unpotimized binary search
//    public static int binarySearch(int[] arr, int key , int start , int end){
//        if (start > end){
//            return 0;
//        }
//        int mid = (start+end)/2;
//        if(arr[mid]== key){
//            return 1;
//        }
//        System.out.println(arr[mid]);
//        int e = end;
//        int left = binarySearch(arr, key, start, mid-1)+1;
//        int right =binarySearch(arr, key, mid+1, e)+1;
//
//        return Math.min(left, right);
