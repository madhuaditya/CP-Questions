import java.util.Scanner;

public class A_1_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
            int n = sc.nextInt();
            int min =Integer.MAX_VALUE;

            for (int i =0; i*2<=n; i++){
                for( int j = 0;j*5<=n; j++){
                    if(n>=(i*3 + j*5)){
                        min = Math.min(min, n-(i*3 + j*5));
                    }
                }
            }
            System.out.println(min );



        }
    }
}
