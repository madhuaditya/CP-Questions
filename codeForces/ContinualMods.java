import java.util.Scanner;

public class ContinualMods {
    static int gcd(int a, int b)
    {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n];
        int one=0;
        int a = 0;
        for(int i =0; i<n; i++){
          arr[i] = sc.nextInt();
        if(arr[i] == 1){
            one++;
        }
        if (a==0){
            a = arr[i];
        }
        else {
            a= gcd(a, arr[i]);
        }
          }
        if(one> 1){
            System.out.println("NO");
            continue;
        }
        if(one ==1){
            System.out.println("YES");
            continue;
        }
        if(a ==1){
            System.out.println("YES");
        }
        else
            System.out.println("NO");

        }
    }
}
