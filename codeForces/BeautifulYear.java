import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int year = sc.nextInt();

        for(int i = year+1; i<=9012;i++){
            int num = i;
            boolean[] bl = new   boolean[10];
            while (num!= 0){

                if(bl[num%10])
                    break;
                bl[num%10]= true;
                num = num/10;
            }
            if(num == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
