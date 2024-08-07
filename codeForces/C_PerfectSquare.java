import java.util.Scanner;

public class C_PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        char[][] grid= new char[n][n];
            for (int j =0; j<n; j++){
                grid[j]= sc.next().toCharArray();
            }

            long ans =0;

        for( int i =0; i<n/2; i++){
            int a=i;
            int b = i;
            int c= n-1-i;
            int d =n-i-1;
            for(int j =i; j<n-i-1;j++){
                char u = grid[i][a];
                char v = grid[b][n-i-1];
                char w = grid[n-i-1][c];
                char x = grid[d][i];
                a++;
                b++;
                c--;
                d--;
              char curr =(char) Math.max(u,Math.max(v,Math.max(w,x)));
              ans+= (4*curr - (u+v+w+x));
            }
        }
            System.out.println(ans);

        }
    }
}
