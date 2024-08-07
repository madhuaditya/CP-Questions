import java.util.Scanner;

public class E_QueueSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int[] arr = new int[n];
        int point =-1;
    int min =Integer.MAX_VALUE;
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<min){
                point=i;
                min=arr[i];
            }
        }
        boolean bl=false;
        for(int i =point ; i<n ; i++){
            if(arr[i]>=min){
                min= arr[i];
            }
            else {
                bl =true;
                break;
            }
        }
        if(bl){
            System.out.println(-1);
        }
        else {
            System.out.println(point);
        }

        }
    }
}
