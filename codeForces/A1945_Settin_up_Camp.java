import java.util.*;
public class A1945_Settin_up_Camp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
            long ans=a;
            ans+=b/3;
            int left=b%3;
            if(left+c>=3){
                ans++;
                c=c-b%3;
                ans+=c/3;
                ans+=(c%3);
                System.out.println(ans);
            }else{
                System.out.println(-1);
            }
        }
    }
}
