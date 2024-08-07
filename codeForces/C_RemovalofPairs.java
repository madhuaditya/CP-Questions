import java.util.Scanner;

public class C_RemovalofPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc= sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
//            StringBuilder   sb = new StringBuilder(str);
            int[] arr = new int[26];
            for(int i =0; i<n ; i++){
                arr[str.charAt(i)-'a']++;
            }
            int MaxFre=0;
            for(int i =0;i<arr.length; i ++){
                if(arr[i]>MaxFre){
                    MaxFre=arr[i];
                }
            }
            if(MaxFre>=n/2){
                System.out.println(Math.abs(n - (n-MaxFre)*2));
            }
            else {
                System.out.println(n%2);
            }

        }
    }
}
