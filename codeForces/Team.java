import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[][] arr = new int[n][3];
        for(int i = 0;i < n ; i++){
            int bl1 = 0;
            int bl2 = 0;
            int bl3 = 0;
            arr[i][0]= sc.nextInt();
            arr[i][1]= sc.nextInt();
            arr[i][2]= sc.nextInt();
            if(arr[i][0]==1)
                bl1++;
            if(arr[i][1]==1){
                bl2++;
            }
            if (arr[i][2]==1){
                bl3++;
            }
            if((bl1+bl2+bl3)>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
