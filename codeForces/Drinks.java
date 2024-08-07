import java.util.Scanner;

public class Drinks {
    public static void main (String[] args ){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr[] = new int[n];
        double sum =0;
        for (int i =0; i <n; i++){
            arr[i]= sc.nextInt();
            sum = sum+ arr[i];
        }
        System.out.printf("%.12f\n",sum/n);
    }
}
