import java.util.Scanner;

public class C_Another_Permutation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        long ans =0;
       for( int i =n ; i>=1 ; i--){
           long sum =0;
           long max =0;
           int j = 1;
           for( ; j<=n-i; j++){
               sum += (long) j *j;
               max = Math.max(max, (long) j *j);
           }
           int k = i , m = n;
           while ( k-->0){
               sum+= (long) m * j;
               max = Math.max(max , (long)j*m );
               j++;
               m--;
           }
           ans = Math.max(ans, sum-max);

       }
            System.out.println(ans);
        
        }
    }
}
