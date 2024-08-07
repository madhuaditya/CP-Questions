import java.util.Scanner;

public class BitPP {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new  String[n];
        int count =0;
        for (int i =0; i<n; i++){
            arr[i]= sc.next();
            for(int j =0; j<3; j++){
                if(arr[i].charAt(j)=='+')
                {
                    count++;
                    break;
                }
                if(arr[i].charAt(j)=='-'){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
