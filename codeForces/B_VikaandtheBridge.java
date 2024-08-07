import java.util.HashMap;
import java.util.Scanner;

public class B_VikaandtheBridge {
   static class Pair {
        int firstMax;
        int secondMax ;
        public Pair(int first , int second ){
            this.firstMax= first;
            this.secondMax = second;
        }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for( int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] index = new int[k];
        int[] phla_max = new int[k];
        int[] dushra_max= new int[k];
        for(int i =0; i<=n ; i++){
            if(i ==n ){
                for(int j =0; j<k ; j++){
                    int a = n-index[j];
                    if(a>=phla_max[j]){
                        dushra_max[j]=phla_max[j];
                        phla_max[j]= a;
                    }
                    else{
                        if(a>=dushra_max[j]){
                            dushra_max[j]= a;
                        }
                    }
                }
                continue;
            }
            int prev = index[arr[i]-1];
            int a = (i)-prev;
            if(a>=phla_max[arr[i]-1]){
                dushra_max[arr[i]-1]=phla_max[arr[i]-1];
                phla_max[arr[i]-1]= a;
            }
            else{
                if(a>=dushra_max[arr[i]-1]){
                    dushra_max[arr[i]-1]= a;
                }
            }
            index[arr[i]-1]=i+1;

        }
        int max = n;
        for( int i =0; i<k ; i++){
            max = Math.min (max, Math.max(phla_max[i]/2,dushra_max[i]));
        }
            System.out.println(max);
        }
    }
}
