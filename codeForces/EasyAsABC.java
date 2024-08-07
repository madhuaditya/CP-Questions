import java.util.Scanner;

public class EasyAsABC {
    static String str = "CCC";
    static void lxgSmall (char[][] arr , int row , int col,StringBuilder sb,boolean[][] visit){
        visit[row][col] = true;

        if(sb.length()==3){
          str =   sb.toString().compareTo(str ) <=0 ?  sb.toString():str;
          return;
        }


        for (int i = -1; i <= 1; i++) {
            if(row+i>-1 && row+i<3)
                for (int j = -1; j <= 1; j++) {
                    if(col+j<3 && col+j>-1) {
                        if (!visit[row+i][col+j]) {
                            lxgSmall(arr, row + i, col + j, sb.append(arr[row+i][col+j]), visit);
                            visit[row+i][col+j] = false;
                            sb.delete(sb.length()-1,sb.length());
                        }
                    }
                }

        }

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[3][3];
        arr[0] = sc.next().toCharArray();
        arr[1] = sc.next().toCharArray();
        arr[2] = sc.next().toCharArray();

        for(int i = 0; i<3; i++){
            for(int j =0; j<3; j++){
                StringBuilder sb = new StringBuilder("");
                sb.append(arr[i][j]);
               lxgSmall(arr,i,j,sb,new boolean[3][3]);
            }
        }
//        StringBuilder sb = new StringBuilder("");
//                sb.append(arr[2][2]);
//        lxgSmall(arr,2,2,sb,new boolean[3][3]);
        System.out.println(str);
        }
}
