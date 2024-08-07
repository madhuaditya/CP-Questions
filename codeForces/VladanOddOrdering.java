import java.util.Scanner;
public class VladanOddOrdering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
                 int shift =0;
            int row =0;
            int j ;
             while (true){

                 int x = (int)Math.pow(2, shift+1);
                j = (n + (x / 2)) / x;
                row+= j;
                if(k<=row)
                    break;

               shift++;
             }
             j = j-(row-k);
            System.out.println((2*j-1)<<shift);
        }
    }
}
