import java.util.Scanner;

public class A_Stair_Peak_or_Neither {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        if(a<b&& b<c && a<c){
            System.out.println("STAIR");
        }
        else if(a<b&& b>c){
            System.out.println("PEAK");
        }else{
            System.out.println("NONE");
        }
        
        
        }
    }
}
