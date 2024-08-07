public class QuickSort {
    static void swap (int arr[],int a, int b){
        int c = arr[a];
        arr[a]= arr[b];
        arr[b]=c;
    }
    static int partition(int arr[], int stat, int end ){
        int i =stat;
        while(i<= end){
            if(arr[i]<=arr[end]){
                swap(arr,i, stat);
               stat++;
            }
            i++;
        }
        return stat-1;
    }

    public static void quickSort(int[] arr, int start , int end){
      if(start>end ){
          return;
      }

      int pvit = partition(arr, start, end);
      int en = end;
      quickSort(arr, start, pvit-1);
      quickSort(arr, pvit+1, en);

    }
    public static void main(String[] args) {
     int[] arr = {10,80,30,90,20,15,40,3,5,1998,454,2,56,7};
     quickSort(arr, 0 , arr.length-1);
//        swap(arr,1, 2);
     for (int ele : arr){
         System.out.print(ele+" ");
     }
    }
}
