import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Informatics_inMAC {
    static class Info {
        int l;
        int r;
        Info(int l, int r){
            this.l= l;
            this.r=r;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min =0;
        for(int i =0; i<n ; i++){
            if(arr[i] ==min){
                min++;
            }
            else
                break;
        }





        }
    }
}
