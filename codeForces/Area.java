import java.util.*;
public  class Area{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int[][] pair = new int[4][2];
            for (int i = 0; i<4; i++){
                pair[i][0]= sc.nextInt();
                pair[i][1]= sc.nextInt();
            }

            int a =(int ) Math.sqrt(((pair[0][0]-pair[1][0])*(pair[0][0]-pair[1][0]))+((pair[0][1]-pair[1][1])*(pair[0][1]-pair[1][1])));
            int b=(int ) Math.sqrt(((pair[0][0]-pair[2][0])*(pair[0][0]-pair[2][0]))+((pair[0][1]-pair[2][1])*(pair[0][1]-pair[2][1])));
            b = Math.min(a,b);
            System.out.println(b*b);
        }
    }
}
