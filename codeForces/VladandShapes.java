import java.util.Scanner;

public class VladandShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while (t-- > 0){
            int n = sc.nextInt() ;
            char[][] grid = new char[n][n];
            for(int i =0; i<n; i++){
                   grid[i]= sc.next().toCharArray();
            }
            int first=0;
            for(int i =0; i<n ; i++){
                int a  = 0;
                for(int j = 0; j<n; j++){
                 if(grid[i][j] =='1'){
                     a++;
                 }
                }
                if(a!= 0 && first == 0){
                    first = a;
                }
                else if(a!= 0){
                    if(a== first){
                        System.out.println("SQUARE");
                    }
                    else
                        System.out.println("TRIANGLE");
                    break;
                }
            }
        }
    }
}
