public class InsertionSort {
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void insertionSort(int[] arr){

        int i=0;
        int len = arr.length;
        while (i<len){
            int j = i;
            while (j>0 &&(arr[j]<arr[j-1]) ){
                int curr = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= curr;
                j--;
            }
            i++;
        }

    }


    public static void main(String[] args) {
        int[] arr= {9,8,7,6,5,4,3,2,1};
        insertionSort(arr);
        printArray(arr);
    }
}
