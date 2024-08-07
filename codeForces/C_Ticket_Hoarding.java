import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C_Ticket_Hoarding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int m  = sc.nextInt();
        int k = sc.nextInt();
        int ln = (int) Math.ceil(((double) k)/ m);
        int[][] arr = new int[n][2];
        for( int i =0; i<n; i++){
            arr[i][0] = i+1;
            arr[i][1]= sc.nextInt();
        }
            Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
        int[][] sort = new int[ln][3];
        for( int i =0; i<ln; i++){
            sort[i][0] = arr[i][0];
            sort[i][1] = arr[i][1];
            sort[i][2]= i+1;
        }
        Arrays.sort(sort, Comparator.comparingDouble(o->o[0]));

        long sum =0;
        if(ln == k/m){
            long curr =0;
            for( int i =0; i<ln; i++){
                sum+= ((long) sort[i][1] *m + (curr*m));
                curr+=m;
            }
        }
        else {
            long curr =0;
            for( int i =0; i<ln; i++){
                 if(sort[i][2]==ln){
                     sum+= ((k%m)*(long)sort[i][1]) +(curr*(k%m));
                     curr+= k%m;
                 }
                 else {
                     sum+= ((m)*(long)sort[i][1]) + (curr*m);
                     curr+= m;
                 }
            }
        }
            System.out.println(sum);


        }
    }
}
