import java.util.Scanner;

public class C_RemovingSmallestMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        String str = sc.next();
        boolean[] check = new boolean[n];
        long ans =0;
        for(int i =0; i<n; i++){
            if(str.charAt(i)=='0'){
                for( int j = i+1; j<=n; j+=i+1){
                    if(str.charAt(j-1)=='1') break;
                    if (check[j-1]) continue;
                    check[j-1]= true;
                    ans+= i+1;
                }
            }
        }
            System.out.println(ans);


        }
    }
}
