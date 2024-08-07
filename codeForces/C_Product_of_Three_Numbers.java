import java.util.Scanner;

public class C_Product_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();

        int a= Integer.MAX_VALUE;
        int b= Integer.MAX_VALUE;
        int c= Integer.MAX_VALUE;

        for( int i =2 ; i*i <=n; i ++){

            if(n%i ==0){
                int m = n/i;
                for( int j = i+1 ; j*j <=m; j++){
                    if( n%(j*i)==0 && ( n/(j*i) >j) ){
                        a = i;
                        b = j;
                                c = n/(j*i);
                        break;
                    }
                }
            }

        }

        if( a==Integer.MAX_VALUE) System.out.println("NO");
        else  {
            System.out.println("YES");
            System.out.println(a +" " +b+ " " +c);
        }
        }
    }
}
