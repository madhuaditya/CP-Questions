import java.util.*;
public class D_Product_of_Binary_Decimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            String str = sc.next();
            int flag=0;
            int j=str.length()-1;
            while(str.charAt(j)=='0'){
                j--;
            }
            if(j>=0){
                if(str.charAt(j)!='1'){
                    System.out.println("NO");
                    continue;
                }
            }
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='0'||str.charAt(i)=='1'){
                    continue;
                }else{
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("YES");
                continue;
            }
            int val=(str.charAt(str.length()-1)-'0');
            for(int i=str.length()-1;i>0;i--){
                val=(((int)(str.charAt(i-1)-'0'))-val);
            }
            if(val!=0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}

