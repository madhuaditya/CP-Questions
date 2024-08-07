import java.util.Scanner;
import java.util.Stack;

public class ShuffleParty {
    static class Info {
        int n;
        String str ;
        Info(int n , String str){
            this.n = n ;
            this.str = str;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        char[][] arr = new char[2][n];
        arr[0]= sc.next().toCharArray();
        arr[1]= sc.next().toCharArray();
            Stack<Info> st = new Stack<>();
          String str = "";
           pathnum(arr, n,0,0, str, st);
            System.out.println(st.peek().str);
            System.out.println(st.peek().n  );

        }
    }
    public static void pathnum(char[][] arr ,int n,int row, int col, String s, Stack<Info>st ){
        if(row>1|| col>=n){
            return;
        }
        if(row == 1 && col== n-1){
            if(st.isEmpty()){
                st.push(new Info( 1, s));

            }
            else {
                if(s.compareTo(st.peek().str)>0){

                }
               else if(s.compareTo(st.peek().str)==0){
                    Info info = st.pop();
                    info.n++;
                    st.push(info);
                }
                else {
                    st.pop();
                    st.push(new Info(1,s));
                }
            }
            return;
        }

        s =s+arr[row][col];
        pathnum(arr,n, row, col+1,s,st);
        s =s+arr[row][col];
        pathnum(arr,n, row+1, col,s,st);

    }
}
