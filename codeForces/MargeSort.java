public class MargeSort {
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void margeSort(int[]  arr, int start , int end){
        if(start>=end){
            return;
        }
        int mid = start +(end-start)/2;
        int en = end ;
        margeSort(arr, start, mid);
        margeSort(arr, mid+1, en);
        marge(arr, start, mid, en);
    }
    static void marge(int[] arr, int start , int mid , int end){
        int l1 = mid-start+1;
        int l2 = end- mid ;
        int[] arr1 = new int[l1];
        int[] arr2 = new int[l2];

        for(int i =0; i<l1; i++){
            arr1[i]= arr[start+i];
        }
        for(int i =0; i<l2; i++){
            arr2[i]= arr[mid+i+1];
        }

        int i =0, j =0;
        int k =start;
        while (i<l1&& j<l2){
            if(arr1[i] <arr2[j]){
                arr[k++]= arr1[i];
                i++;
            }
            else{
                arr[k++]= arr2[j];
                j++;
            }
        }
        while (i<l1){
            arr[k++]= arr1[i++];
        }
        while (j<l2){
            arr[k++]= arr2[j++];
        }
    }
    public static void main(String[] args) {

        int[] arr = {23,4,5,6,2,4,6,75,56,67,78,89,854,534,3,456,66,6877,56,43,3};
        margeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
