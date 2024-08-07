import java.util.ArrayList;
import java.util.List;

public class SearchIn2D {
   public static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int start =0;
        int last = mat.size()*mat.get(0).size()-1;
        int n = mat.size();
        int m = mat.get(0).size();
        while(start<= last){
            int mid = start + (last-start)/2;
            int row = mid/m;
            int col = mid%m;
            if(mat.get(row).get(col)== target) return true;
            if(mat.get(row).get(col)< target) start = mid+1;
            else last = mid-1;
        }
        return false ;
    }
    public static int[] findPeakGrid(int [][]arr){
        // Write your code here.
        // time complexcity for this code is O(nxLogm);
        // how to solve this code
        int n = arr.length;
        int m = arr[0].length;
        int s =0;
        int e =m-1;
        while(s<=e){
            int mid= s+(e-s)/2;
            int ind = max(arr, n, mid);
            if(mid==0){
                if(arr[ind][mid+1]<arr[ind][mid]){
                    int[] a = {ind , mid};
                    return a;
                }
                else  s = mid+1;
            }
            else     if(mid==m-1){
                if(arr[ind][mid-1]<arr[ind][mid]){
                    int[] a = {ind , mid};
                    return a;
                }
                else  e = mid-1;
            }


            else {
                if(arr[ind][mid+1]<arr[ind][mid]&& arr[ind][mid-1]<arr[ind][mid]) {
                    int[] a = {ind, mid};
                    return a;
                }

                else if(arr[ind][mid+1]>arr[ind][mid] ){
                    s = mid+1;
                }
                else {
                    e=mid-1;
                }
            }
        }
        int[] a = {-1,-1};
        return a;
    }
    public static int max (  int[][] arr, int n , int col){
        int ind = -1;
        int max = Integer.MIN_VALUE;
        for( int i =0; i<n; i++){
            if( arr[i][col] > max){
                ind =i;
                max = arr[i][col];
            }
        }
        return ind;
    }

    public static void main(String[] args) {
//
        int[][] arr = {{1,2,3},
                {4, 5, 6},
                {7, 8, 9} };
        int[] a = findPeakGrid(arr);
        System.out.println(arr[a[0]][a[1]]);
    }
}
