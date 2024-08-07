import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class C_ContrastValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int[] arr = new int[n];
        long contra= 0;
        for( int i =0; i<n; i++){
            arr[i]= sc.nextInt();
            if(i>0){
             contra+= Math.abs(arr[i-1]-arr[i]);
            }
        }
        if(contra==0 || n==1){
            System.out.println(1);
            continue;
        }
        if(n==2){
            System.out.println(2);
            continue;
        }

            ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
            for( int i =1; i<n; i ++){
                if(arr[i]!=arr[i-1]){
                    list.add(arr[i]);
                }
            }
            n= list.size();

        boolean[] booleans = new boolean[n];
        booleans[0]=true;
        booleans[n-1]=true;
        int i =1;

        while(i<n-1 ){
            if((list.get(i)>list.get(i-1) && list.get(i)>list.get(i+1))|| (list.get(i)<list.get(i-1) && list.get(i)<list.get(i+1))){
                booleans[i]= true;
            }
            i++;
        }
        int count =0;
        for( int j =0; j<n; j++){
            if(booleans[j]) count++;
        }
            System.out.println(count);



        }

    }
}
