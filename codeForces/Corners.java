import java.util.Scanner;

public class Corners {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt(), m = sc.nextInt();
            char[][] arr = new char[n][m];
            for(int i =0; i<n ; i++){
                arr[i] = sc.next().toCharArray();
            }
            int oneCount =0;
            int zeroCount = 0;
            for(int i =0; i<n ; i++){
                for (int j =0; j<m; j++){
                    if(arr[i][j] =='1')
                        oneCount++;
                    else
                        zeroCount++;
                }
            }
            if(oneCount ==0) {
                System.out.println(0);
                continue;
            }
            if(zeroCount == 0 || zeroCount==1){
                if (zeroCount ==0)
                    System.out.println(oneCount-2);
                else
                    System.out.println(oneCount-1);
                continue;
            }
            boolean bl = false;

            for(int i =0; i<n-1 ; i++){
                for (int j =0; j<m-1; j++){

                    int zero =0;
                    for (int k =0; k<=1; k++){
                        for(int l = 0; l <= 1; l++){
                            if (arr[i+k][j+l]=='0')
                                zero++;

                        }
                    }
                    if (zero >1){
                        System.out.println(oneCount);
                        bl= true;
                        break;
                    }
                }
                if(bl )
                    break;
            }
            if(!bl)
                System.out.println(oneCount-1);

        }
    }
}
